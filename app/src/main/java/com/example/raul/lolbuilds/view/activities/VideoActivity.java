package com.example.raul.lolbuilds.view.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.raul.lolbuilds.R;
import com.google.firebase.auth.FirebaseAuth;

public class VideoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    VideoView videoView1;
    VideoView videoView2;

    TextView videoTitle1;
    TextView videoTitle2;
    TextView textVideoGeneral;

    MediaController mediaController1;
    MediaController mediaController2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        videoView1 = findViewById(R.id.video_video1);
        videoView2 = findViewById(R.id.video_video2);

        videoTitle1 = findViewById(R.id.video_title1);
        videoTitle2 = findViewById(R.id.video_title2);
        textVideoGeneral = findViewById(R.id.title_video_general);

        videoTitle1.setText("Backdoor Xpeke");
        videoTitle2.setText("Zed vs Zed (Faker)");
        textVideoGeneral.setText(R.string.competitiveplays);

        mediaController1 = new MediaController(this);
        mediaController1.setPadding(0,0,0,795);
        mediaController1.setAnchorView(videoView1);

        mediaController2 = new MediaController(this);
        mediaController2.setPadding(0,0,0,50);
        mediaController2.setAnchorView(videoView2);

        Uri video1 = Uri.parse("android.resource://com.example.raul.lolbuilds/" +R.raw.backdoor);
        Uri video2 = Uri.parse("android.resource://com.example.raul.lolbuilds/" +R.raw.fakerzed);

        videoView1.setMediaController(mediaController1);
        videoView1.setVideoURI(video1);
        videoView1.seekTo(2000);

        videoView2.setMediaController(mediaController2);
        videoView2.setVideoURI(video2);
        videoView2.seekTo(500);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        VideoActivity.this.finish();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_build) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            VideoActivity.this.finish();
        }
        else if (id == R.id.nav_bans) {
            Intent intent = new Intent(this, BansActivity.class);
            startActivity(intent);
            VideoActivity.this.finish();
        }
        else if (id == R.id.nav_ajustes) {
            Intent intent = new Intent(this, AjustesActivity.class);
            startActivity(intent);
            VideoActivity.this.finish();
        }
        else if (id == R.id.nav_help) {
            Intent intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
            VideoActivity.this.finish();
        }
        else if (id == R.id.nav_contacto) {
            Intent intent = new Intent(this, ContactoActivity.class);
            startActivity(intent);
            VideoActivity.this.finish();
        }
        else if (id == R.id.nav_signout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(VideoActivity.this, SignInActivity.class));
            VideoActivity.this.finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
