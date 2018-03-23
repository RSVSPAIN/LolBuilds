package com.example.raul.lolbuilds;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

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

public class VideoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    VideoView videoView1;
    VideoView videoView2;

    TextView videoTitle1;
    TextView videoTitle2;

    MediaController mediaController1;
    MediaController mediaController2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
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

        videoTitle1.setText("Backdoor Xpeke");
        videoTitle2.setText("Zed vs Zed (Faker)");

        mediaController1 = new MediaController(this);
        mediaController1.setPadding(0,0,0,925);
        mediaController1.setAnchorView(videoView1);

        mediaController2 = new MediaController(this);
        mediaController2.setPadding(0,0,0,180);
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
