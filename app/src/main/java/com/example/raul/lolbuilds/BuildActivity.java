package com.example.raul.lolbuilds;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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

public class BuildActivity extends AppCompatActivity {

    DatabaseReference mReference;
    String searchReference = "build/aatrox";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mReference = FirebaseDatabase.getInstance().getReference();

        Intent intent = getIntent();
        int champId = intent.getIntExtra("champId", 0);

        if (champId == 0) {
            this.setTitle(R.string.title_aatrox);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            searchReference = "build/aatrox";
            showBuild();
        }
    }

    void showBuild(){
       mReference.child(searchReference).addListenerForSingleValueEvent(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               Build build = dataSnapshot.getValue(Build.class);

               Glide.with(BuildActivity.this).load(build.image1).into((ImageView) findViewById(R.id.build_image1));

               ((TextView) findViewById(R.id.build_porciento)).setText(build.porciento);
               ((TextView) findViewById(R.id.build_papel)).setText(build.papel);
               ((TextView) findViewById(R.id.build_año)).setText(build.año);

               Glide.with(BuildActivity.this).load(build.image2).into((ImageView) findViewById(R.id.build_image2));
               Glide.with(BuildActivity.this).load(build.image3).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image4).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image5).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image6).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image7).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image8).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image9).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image10).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image11).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image12).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image13).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image14).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image15).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image16).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image17).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image18).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image19).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image20).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image21).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image22).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image23).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image24).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image25).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image26).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image27).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image28).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image29).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image30).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image31).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image32).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image33).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image34).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image35).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image36).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image37).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image38).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image39).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image40).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image41).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image42).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image43).into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.image44).into((ImageView) findViewById(R.id.build_image1));

           }

           @Override
           public void onCancelled(DatabaseError databaseError) {

           }
       });

    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        BuildActivity.this.finish();
    }

}
