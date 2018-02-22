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
import android.support.v7.widget.LinearLayoutManager;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private MenuItem mSearchAction;
    private boolean isSearchOpened = false;
    private EditText edtSeach;
    FirebaseRecyclerAdapter mAdapter;

    String preferences_name = "isFirstTime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        firstTime();

        Query champsQuery = FirebaseDatabase.getInstance().getReference().child("champs/data");

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Champ>()
                .setQuery(champsQuery, Champ.class)   // setIndexedQuery ( donde estan los Ids, donde estan los datos     )
                .setLifecycleOwner(this)
                .build();


        mAdapter = new FirebaseRecyclerAdapter<Champ, ChampViewHolder>(options) {
            @Override
            protected void onBindViewHolder(final @NonNull ChampViewHolder holder, int position, final @NonNull Champ champ) {
                holder.name.setText(champ.name);
                holder.image.setImageDrawable(getDrawable(champ.imageId));

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, BuildActivity.class);
                        intent.putExtra("champId", champ.id);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }
                });

//                if(isFavorite(champ) != null) {
//                    holder.iconfav.setVisibility(View.VISIBLE);
//                } else {
//                    holder.iconfav.setVisibility(View.GONE);
//                }

                holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {

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

//        RecyclerView recyclerView = findViewById(R.id.champ_list);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
//        recyclerView.setAdapter(mAdapter);


    }

    public void onBackPressed() {
        MainActivity.this.finish();
    }


    public void  firstTime() {

        SharedPreferences sharedTime = getSharedPreferences(preferences_name, 0);
        if (sharedTime.getBoolean("firstTime", true)) {

            Intent intent = new Intent(this, FirstTimeActivity.class);
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


            System.out.println("MIERDAAAAAAAAA");
            RecyclerView recyclerView = findViewById(R.id.champ_list);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
            recyclerView.setAdapter(mAdapter);
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

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}