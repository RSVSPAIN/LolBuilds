package com.example.raul.lolbuilds;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class BansActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bans);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        BansActivity.this.finish();
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_build) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            BansActivity.this.finish();
        }
        else if (id == R.id.nav_ajustes) {
            Intent intent = new Intent(this, AjustesActivity.class);
            startActivity(intent);
            BansActivity.this.finish();
        }
        else if (id == R.id.nav_help) {
            Intent intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
            BansActivity.this.finish();
        }
        else if (id == R.id.nav_contacto) {
            Intent intent = new Intent(this, ContactoActivity.class);
            startActivity(intent);
            BansActivity.this.finish();
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public class TabPagerAdapter extends FragmentStatePagerAdapter {

        String[] tituloTabs = {"General", "Bronce", "Plata", "Oro", "Platino", "Diamante"};

        public TabPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle (int position) {
            return tituloTabs[position];
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    TabGeneralFragment tab1 = new TabGeneralFragment();
                    return tab1;
                case 1:
                    TabBronceFragment tab2 = new TabBronceFragment();
                    return tab2;
                case 2:
                    TabPlataFragment tab3 = new TabPlataFragment();
                    return tab3;
                case 3:
                    TabOroFragment tab4 = new TabOroFragment();
                    return tab4;
                case 4:
                    TabPlatinoFragment tab5 = new TabPlatinoFragment();
                    return tab5;
                case 5:
                    TabDiamanteFragment tab6 = new TabDiamanteFragment();
                    return tab6;
                default:
                    tab1 = new TabGeneralFragment();
                    return tab1;
            }
        }

        @Override
        public int getCount() {
            return 6;
        }

    }
}
