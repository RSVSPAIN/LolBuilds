package com.example.raul.lolbuilds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static List<Champ> champs = new ArrayList<>();
    static List<Champ> busqueda = new ArrayList<>();
    static List<Champ> favoritos = new ArrayList<>();

    static List<Champ> top = new ArrayList<>();
    static List<Champ> jungla = new ArrayList<>();
    static List<Champ> mid = new ArrayList<>();
    static List<Champ> adc = new ArrayList<>();
    static List<Champ> support = new ArrayList<>();

    private MenuItem mSearchAction;
    private boolean isSearchOpened = false;
    private EditText edtSeach;

    String preferences_name = "isFirstTime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        firstTime();
        loadData();
    }

    public void onBackPressed() {
        MainActivity.this.finish();
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        String json = gson.toJson(favoritos);
        editor.putString("favourite list", json);
        editor.apply();
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("favourite list",null);
        Type type = new TypeToken<ArrayList<Champ>>() {}.getType();
        favoritos = gson.fromJson(json, type);

        if (favoritos == null){
            favoritos = new ArrayList<>();
        }

    }

    public  void  firstTime() {

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

            if (champs.size() <= 1) {
                champs.add(new Champ(0, getString(R.string.title_top), R.drawable.ic_aatrox, getString(R.string.title_aatrox)));
                champs.add(new Champ(1, getString(R.string.title_mid), R.drawable.ic_ahri, getString(R.string.title_ahri)));
                champs.add(new Champ(2, getString(R.string.title_mid), R.drawable.ic_akali, getString(R.string.title_akali)));
                champs.add(new Champ(3, getString(R.string.title_support), R.drawable.ic_alistar, getString(R.string.title_alistar)));
                champs.add(new Champ(4, getString(R.string.title_jungla), R.drawable.ic_amumu, getString(R.string.title_amumu)));
                champs.add(new Champ(5, getString(R.string.title_mid), R.drawable.ic_anivia, getString(R.string.title_anivia)));
                champs.add(new Champ(6, getString(R.string.title_mid), R.drawable.ic_annie, getString(R.string.title_annie)));
                champs.add(new Champ(7, getString(R.string.title_adc), R.drawable.ic_ashe, getString(R.string.title_ashe)));
                champs.add(new Champ(8, getString(R.string.title_mid), R.drawable.ic_aurelion_sol, getString(R.string.title_aurelion_sol)));
                champs.add(new Champ(9, getString(R.string.title_mid), R.drawable.ic_azir, getString(R.string.title_azir)));
                champs.add(new Champ(10, getString(R.string.title_support), R.drawable.ic_bardo, getString(R.string.title_bardo)));
                champs.add(new Champ(11, getString(R.string.title_support), R.drawable.ic_blitzcrank, getString(R.string.title_blitzcrank)));
                champs.add(new Champ(12, getString(R.string.title_mid), R.drawable.ic_brand, getString(R.string.title_brand)));
                champs.add(new Champ(13, getString(R.string.title_support), R.drawable.ic_braum, getString(R.string.title_braum)));
                champs.add(new Champ(14, getString(R.string.title_adc), R.drawable.ic_caitlyn, getString(R.string.title_caitlyn)));
                champs.add(new Champ(15, getString(R.string.title_top), R.drawable.ic_camille, getString(R.string.title_camille)));
                champs.add(new Champ(16, getString(R.string.title_mid), R.drawable.ic_cassiopeia, getString(R.string.title_cassiopeia)));
                champs.add(new Champ(17, getString(R.string.title_top), R.drawable.ic_chogath, getString(R.string.title_cho_gath)));
                champs.add(new Champ(18, getString(R.string.title_mid), R.drawable.ic_corki, getString(R.string.title_corki)));
                champs.add(new Champ(19, getString(R.string.title_top), R.drawable.ic_darius, getString(R.string.title_darius)));
                champs.add(new Champ(20, getString(R.string.title_mid), R.drawable.ic_diana, getString(R.string.title_diana)));
                champs.add(new Champ(21, getString(R.string.title_top), R.drawable.ic_dr_mundo, getString(R.string.title_dr_mundo)));
                champs.add(new Champ(22, getString(R.string.title_adc), R.drawable.ic_draven, getString(R.string.title_draven)));
                champs.add(new Champ(23, getString(R.string.title_mid), R.drawable.ic_ekko, getString(R.string.title_ekko)));
                champs.add(new Champ(24, getString(R.string.title_jungla), R.drawable.ic_elise, getString(R.string.title_elise)));
                champs.add(new Champ(25, getString(R.string.title_jungla), R.drawable.ic_evelynn, getString(R.string.title_evelynn)));
                champs.add(new Champ(26, getString(R.string.title_adc), R.drawable.ic_ezreal, getString(R.string.title_ezreal)));
                champs.add(new Champ(27, getString(R.string.title_jungla), R.drawable.ic_fiddlesticks, getString(R.string.title_fiddlesticks)));
                champs.add(new Champ(28, getString(R.string.title_top), R.drawable.ic_fiora, getString(R.string.title_fiora)));
                champs.add(new Champ(29, getString(R.string.title_mid), R.drawable.ic_fizz, getString(R.string.title_fizz)));
                champs.add(new Champ(30, getString(R.string.title_top), R.drawable.ic_galio, getString(R.string.title_galio)));
                champs.add(new Champ(31, getString(R.string.title_top), R.drawable.ic_gangplank, getString(R.string.title_gangplank)));
                champs.add(new Champ(32, getString(R.string.title_top), R.drawable.ic_garen, getString(R.string.title_garen)));
                champs.add(new Champ(33, getString(R.string.title_top), R.drawable.ic_gnar, getString(R.string.title_gnar)));
                champs.add(new Champ(34, getString(R.string.title_jungla), R.drawable.ic_gragas, getString(R.string.title_gragas)));
                champs.add(new Champ(35, getString(R.string.title_jungla), R.drawable.ic_graves, getString(R.string.title_graves)));
                champs.add(new Champ(36, getString(R.string.title_jungla), R.drawable.ic_hecarim, getString(R.string.title_hecarim)));
                champs.add(new Champ(37, getString(R.string.title_mid), R.drawable.ic_heimerdinger, getString(R.string.title_heimerdinger)));
                champs.add(new Champ(38, getString(R.string.title_top), R.drawable.ic_illaoi, getString(R.string.title_illaoi)));
                champs.add(new Champ(39, getString(R.string.title_top), R.drawable.ic_irelia, getString(R.string.title_irelia)));
            }

            RecyclerView recyclerView = findViewById(R.id.champ);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

            ChampAdapter champAdapter = new ChampAdapter(champs);
            recyclerView.setAdapter(champAdapter);
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
                filterGeneral();
                return true;
            case R.id.top:
                top.clear();
                toast = Toast.makeText(getApplicationContext(), "Filtrando por top", Toast.LENGTH_SHORT);
                toast.show();
                filterTop();
                return true;
            case R.id.jungla:
                jungla.clear();
                toast = Toast.makeText(getApplicationContext(), "Filtrando por jungla", Toast.LENGTH_SHORT);
                toast.show();
                filterJungla();
                return true;
            case R.id.mid:
                mid.clear();
                toast = Toast.makeText(getApplicationContext(), "Filtrando por mid", Toast.LENGTH_SHORT);
                toast.show();
                filterMid();
                return true;
            case R.id.adc:
                adc.clear();
                toast = Toast.makeText(getApplicationContext(), "Filtrando por adc", Toast.LENGTH_SHORT);
                toast.show();
                filterAdc();
                return true;
            case R.id.support:
                support.clear();
                toast = Toast.makeText(getApplicationContext(), "Filtrando por support", Toast.LENGTH_SHORT);
                toast.show();
                filterSupport();
                return true;
            case R.id.favourites:
                if (favoritos.isEmpty())
                {
                    toast = Toast.makeText(getApplicationContext(), "La lista de favoritos esta vacia", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    filterFavoritos();
                    toast = Toast.makeText(getApplicationContext(), "Filtrando por favoritos", Toast.LENGTH_SHORT);
                    toast.show();

                }
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void handleMenuSearch(){
        ActionBar action = getSupportActionBar(); //get the actionbar

        if(isSearchOpened){ //test if the search is open

            action.setDisplayShowCustomEnabled(false); //disable a custom view inside the actionbar
            action.setDisplayShowTitleEnabled(true); //show the title in the action bar

            InputMethodManager imm = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
            //Find the currently focused view, so we can grab the correct window token from it.
            View view = this.getCurrentFocus();
            //If no view currently has focus, create a new one, just so we can grab a window token from it
            if (view == null) {
                view = new View(this);
            }
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

            RecyclerView recyclerView = findViewById(R.id.champ);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

            ChampAdapter champAdapter = new ChampAdapter(champs);
            recyclerView.setAdapter(champAdapter);

            //add the search icon in the action bar
            mSearchAction.setIcon(getResources().getDrawable(R.drawable.ic_search));

            isSearchOpened = false;
        } else { //open the search entry

            action.setDisplayShowCustomEnabled(true); //enable it to display a
            // custom view in the action bar.
            action.setCustomView(R.layout.search);//add the custom view
            action.setDisplayShowTitleEnabled(false); //hide the title

            edtSeach = action.getCustomView().findViewById(R.id.edtSearch); //the text editor

            //this is a listener to do a search when the user clicks on search button
            edtSeach.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                        busqueda.clear();
                        doSearch();
                        return true;
                    }
                    return false;
                }

            });

            edtSeach.requestFocus();

            //open the keyboard focused in the edtSearch
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(edtSeach, InputMethodManager.SHOW_IMPLICIT);

            //add the close icon
            mSearchAction.setIcon(getResources().getDrawable(R.drawable.ic_cross));

            isSearchOpened = true;

        }

    }

    public void filterGeneral(){

        RecyclerView recyclerView = findViewById(R.id.champ);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

        ChampAdapter champAdapter = new ChampAdapter(champs);
        recyclerView.setAdapter(champAdapter);

    }

    public void filterTop(){
        for (Champ campeones : champs) {

            if (campeones.getPosicion().equals(getString(R.string.title_top))) {
                top.add(campeones);

                RecyclerView recyclerView = findViewById(R.id.champ);
                recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

                ChampAdapter champAdapter = new ChampAdapter(top);
                recyclerView.setAdapter(champAdapter);

            }
        }
    }

    public void filterJungla(){
        for (Champ campeones : champs) {

            if (campeones.getPosicion().equals(getString(R.string.title_jungla))) {
                jungla.add(campeones);

                RecyclerView recyclerView = findViewById(R.id.champ);
                recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

                ChampAdapter champAdapter = new ChampAdapter(jungla);
                recyclerView.setAdapter(champAdapter);

            }
        }
    }

    public void filterMid(){
        for (Champ campeones : champs) {

            if (campeones.getPosicion().equals(getString(R.string.title_mid))) {
                mid.add(campeones);

                RecyclerView recyclerView = findViewById(R.id.champ);
                recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

                ChampAdapter champAdapter = new ChampAdapter(mid);
                recyclerView.setAdapter(champAdapter);

            }
        }
    }

    public void filterAdc(){
        for (Champ campeones : champs) {

            if (campeones.getPosicion().equals(getString(R.string.title_adc))) {
                adc.add(campeones);

                RecyclerView recyclerView = findViewById(R.id.champ);
                recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

                ChampAdapter champAdapter = new ChampAdapter(adc);
                recyclerView.setAdapter(champAdapter);

            }
        }
    }

    public void filterSupport(){
        for (Champ campeones : champs) {

            if (campeones.getPosicion().equals(getString(R.string.title_support))) {
                support.add(campeones);

                RecyclerView recyclerView = findViewById(R.id.champ);
                recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

                ChampAdapter champAdapter = new ChampAdapter(support);
                recyclerView.setAdapter(champAdapter);

            }
        }
    }

    public void doSearch(){
        for (Champ campeones : champs)
        {
            if (campeones.getName().toLowerCase().contains(edtSeach.getText().toString()) || campeones.getName().contains(edtSeach.getText().toString()))
            {
                busqueda.add(campeones);

                RecyclerView recyclerView = findViewById(R.id.champ);
                recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

                ChampAdapter champAdapter = new ChampAdapter(busqueda);
                recyclerView.setAdapter(champAdapter);

            }
        }
    }

    public void filterFavoritos(){

        RecyclerView recyclerView = findViewById(R.id.champ);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

        ChampAdapter champAdapter = new ChampAdapter(favoritos);
        recyclerView.setAdapter(champAdapter);

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

    class ChampAdapter extends RecyclerView.Adapter<ChampAdapter.ChampViewHolder>{

        List<Champ> list;

        ChampAdapter(List<Champ> list){
            this.list = list;
        }

        @Override
        public ChampViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_champ, null, false);
            return new ChampViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ChampViewHolder holder, final int position) {
            final Champ champ = list.get(position);

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

            if(isFavorite(champ) != null) {
                holder.iconfav.setVisibility(View.VISIBLE);
            } else {
                holder.iconfav.setVisibility(View.GONE);
            }

            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    boolean isFav = false;
                    Champ fav = isFavorite(champ);

                    if(fav != null) {
                        favoritos.remove(fav);
                        if (favoritos.isEmpty()) {
                            filterGeneral();
                        }
                        else {
                            filterFavoritos();
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "Personaje borrado de favoritos", Toast.LENGTH_SHORT);
                        toast.show();
                    } else {
                        favoritos.add(champ);
                        Toast toast = Toast.makeText(getApplicationContext(), "Personaje añadido a favoritos", Toast.LENGTH_SHORT);
                        toast.show();
                        holder.iconfav.setVisibility(View.VISIBLE);
                    }
                    saveData();
                    return true;
                }
            });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class ChampViewHolder extends RecyclerView.ViewHolder {
            TextView name;
            ImageView image;
            ImageView iconfav;

            public ChampViewHolder(View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.champ_name);
                image = itemView.findViewById(R.id.champ_image);
                iconfav = itemView.findViewById(R.id.icon_like);
            }
        }
    }

    Champ isFavorite(Champ champ) {
        for (Champ favchamp : favoritos) {
            if (favchamp.id.equals(champ.id)) {
                return favchamp;
            }
        }
        return null;
    }
}