package com.example.raul.lolbuilds.view.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.raul.lolbuilds.R;
import com.google.firebase.auth.FirebaseAuth;

public class HelpActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    // AYUDA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle(R.string.title_activity_ayuda);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_build) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            HelpActivity.this.finish();
        } else if (id == R.id.nav_bans) {
            Intent intent = new Intent(this, BansActivity.class);
            startActivity(intent);
            HelpActivity.this.finish();
        }
        else if (id == R.id.nav_videos) {
            Intent intent = new Intent(this, VideoActivity.class);
            startActivity(intent);
            HelpActivity.this.finish();
        }
        else if (id == R.id.nav_ajustes) {
            Intent intent = new Intent(this, AjustesActivity.class);
            startActivity(intent);
            HelpActivity.this.finish();
        }
        else if (id == R.id.nav_contacto) {
            Intent intent = new Intent(this, ContactoActivity.class);
            startActivity(intent);
            HelpActivity.this.finish();
        }
        else if (id == R.id.nav_signout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(HelpActivity.this, SignInActivity.class));
            HelpActivity.this.finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
