package com.example.raul.lolbuilds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private MenuItem mSearchAction;
    private boolean isSearchOpened = false;
    private EditText edtSeach;
    RecyclerView recyclerView;
    FirebaseRecyclerAdapter mAdapter;
    DatabaseReference mReference;
    String searchReference = "champs/all-champs";
    String searchTerm = "";

    String preferences_name = "isFirstTime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mReference = FirebaseDatabase.getInstance().getReference();
        firstTime();
    }

    public void onBackPressed() {
        MainActivity.this.finish();
    }

    public void  firstTime() {
        SharedPreferences sharedTime = getSharedPreferences(preferences_name, 0);
        if (sharedTime.getBoolean("firstTime", true)) {

            Intent intent = new Intent(this, SignInActivity.class);
            startActivity(intent);
            MainActivity.this.finish();

            sharedTime.edit().putBoolean("firstTime", false).apply();
        } else {

            setContentView(R.layout.activity_main);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            this.setTitle(getResources().getString(R.string.title_activity_main));

            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            recyclerView = findViewById(R.id.champ_list);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

            setAdapter();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mSearchAction = menu.findItem(R.id.action_search);
        return super.onPrepareOptionsMenu(menu);
    }

    protected void handleMenuSearch(){
        ActionBar action = getSupportActionBar();

        if(isSearchOpened){

            action.setDisplayShowCustomEnabled(false);
            action.setDisplayShowTitleEnabled(true);

            InputMethodManager imm = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);

            View view = this.getCurrentFocus();

            if (view == null) {
                view = new View(this);
            }
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

            searchReference = "champs/all-champs";
            searchTerm = "";
            setAdapter();

            mSearchAction.setIcon(R.drawable.ic_search);

            isSearchOpened = false;
        } else {
            action.setDisplayShowCustomEnabled(true);

            action.setCustomView(R.layout.search);
            action.setDisplayShowTitleEnabled(false);

            edtSeach = action.getCustomView().findViewById(R.id.edtSearch);

            edtSeach.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                        searchTerm = textView.getText().toString().toLowerCase();
                        setAdapter();
                        return true;
                    }
                    return false;
                }

            });

            edtSeach.requestFocus();

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(edtSeach, InputMethodManager.SHOW_IMPLICIT);

            mSearchAction.setIcon(R.drawable.ic_cross);
            isSearchOpened = true;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                handleMenuSearch();
                return true;
            case R.id.general:
                Toast toast = Toast.makeText(getApplicationContext(), "Filtrando por general", Toast.LENGTH_SHORT);
                toast.show();
                searchReference = "champs/all-champs";
                setAdapter();
                return true;
            case R.id.top:
                toast = Toast.makeText(getApplicationContext(), "Filtrando por top", Toast.LENGTH_SHORT);
                toast.show();
                searchReference = "champs/top-champs";
                setAdapter();
                return true;
            case R.id.jungla:
                toast = Toast.makeText(getApplicationContext(), "Filtrando por jungla", Toast.LENGTH_SHORT);
                toast.show();
                searchReference = "champs/jungla-champs";
                setAdapter();
                return true;
            case R.id.mid:
                toast = Toast.makeText(getApplicationContext(), "Filtrando por mid", Toast.LENGTH_SHORT);
                toast.show();
                searchReference = "champs/mid-champs";
                setAdapter();
                return true;
            case R.id.adc:
                toast = Toast.makeText(getApplicationContext(), "Filtrando por adc", Toast.LENGTH_SHORT);
                toast.show();
                searchReference = "champs/adc-champs";
                setAdapter();
                return true;
            case R.id.support:
                toast = Toast.makeText(getApplicationContext(), "Filtrando por support", Toast.LENGTH_SHORT);
                toast.show();
                searchReference = "champs/support-champs";
                setAdapter();
                return true;
            case R.id.favourites:
                Query champsQuery2 = FirebaseDatabase.getInstance().getReference().child("champs/favoritos-champs/" + FirebaseAuth.getInstance().getUid());
                champsQuery2.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.exists()) {
                            Toast toast = Toast.makeText(getApplicationContext(), "Filtrando por favoritos", Toast.LENGTH_SHORT);
                            toast.show();
                            searchReference = "champs/favoritos-champs/" + FirebaseAuth.getInstance().getUid();
                            setAdapter();
                        }
                        else {
                            Toast toast = Toast.makeText(getApplicationContext(), "La lista de favoritos esta vacia", Toast.LENGTH_SHORT);
                            toast.show();
                            searchReference = "champs/all-champs";
                            setAdapter();
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        throw databaseError.toException();
                    }
                });
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bans) {
            Intent intent = new Intent(this, BansActivity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
        else if (id == R.id.nav_videos) {
            Intent intent = new Intent(this, VideoActivity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
        else if (id == R.id.nav_ajustes) {
            Intent intent = new Intent(this, AjustesActivity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
        else if (id == R.id.nav_help) {
            Intent intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
        else if (id == R.id.nav_contacto) {
            Intent intent = new Intent(this, ContactoActivity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
        else if (id == R.id.nav_signout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(MainActivity.this, SignInActivity.class));
            MainActivity.this.finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void setAdapter(){
        Query champsQuery = FirebaseDatabase.getInstance().getReference().child(searchReference);

        if(searchTerm != null && !searchTerm.isEmpty()){
            champsQuery = champsQuery.orderByValue().startAt(searchTerm).endAt(searchTerm + "\uf8ff");
        }

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Champ>()
                .setIndexedQuery(champsQuery, mReference.child("champs/all-champs"), Champ.class)
                .setLifecycleOwner(this)
                .build();

        mAdapter = new FirebaseRecyclerAdapter<Champ, ChampViewHolder>(options) {
            @Override
            protected void onBindViewHolder(final @NonNull ChampViewHolder holder, final int position, final @NonNull Champ champ) {
                final String champKey = getRef(position).getKey();

                holder.name.setText(champ.name);
                Glide.with(MainActivity.this).load(champ.imageName).into(holder.image);

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, BuildActivity.class);
                        intent.putExtra("champKey", champKey);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }
                });

                holder.iconfav.setVisibility(View.GONE);

                mReference.child("champs").child("favoritos-champs").child(FirebaseAuth.getInstance().getUid()).child(champKey).addListenerForSingleValueEvent(new ValueEventListener() {
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String value = dataSnapshot.getValue(String.class);

                        if(value == null) {
                            holder.iconfav.setVisibility(View.GONE);
                        } else {
                            holder.iconfav.setVisibility(View.VISIBLE);
                        }
                    }

                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

                holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {

                        mReference.child("champs").child("favoritos-champs").child(FirebaseAuth.getInstance().getUid()).child(champKey).addListenerForSingleValueEvent(new ValueEventListener() {
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);

                                if(value == null) {
                                    Toast.makeText(getApplicationContext(), "Añadido a favoritos", Toast.LENGTH_LONG).show();
                                    mReference.child("champs").child("favoritos-champs").child(FirebaseAuth.getInstance().getUid()).child(champKey).setValue(champ.name.toLowerCase());
                                    holder.iconfav.setVisibility(View.VISIBLE);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Borrado de favoritos", Toast.LENGTH_LONG).show();
                                    mReference.child("champs").child("favoritos-champs").child(FirebaseAuth.getInstance().getUid()).child(champKey).setValue(null);
                                    holder.iconfav.setVisibility(View.GONE);
                                    Query champsQuery2 = FirebaseDatabase.getInstance().getReference().child("champs/favoritos-champs/" + FirebaseAuth.getInstance().getUid());
                                    champsQuery2.addListenerForSingleValueEvent(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(DataSnapshot dataSnapshot) {
                                            if(!dataSnapshot.exists()) {
                                                Toast toast = Toast.makeText(getApplicationContext(), "La lista de favoritos esta vacia", Toast.LENGTH_SHORT);
                                                toast.show();
                                                searchReference = "champs/all-champs";
                                                setAdapter();
                                            }
                                        }
                                        @Override
                                        public void onCancelled(DatabaseError databaseError) {
                                            throw databaseError.toException();
                                        }
                                    });
                                }
                            }

                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });

                        return true;
                    }
                });
            }

            @Override
            public ChampViewHolder onCreateViewHolder(ViewGroup parent, int i) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_champ, parent, false);
                return new ChampViewHolder(view);
            }

        };

        recyclerView.setAdapter(mAdapter);
    }

}