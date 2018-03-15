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

    RecyclerView recyclerView;
    FirebaseRecyclerAdapter mAdapter;
    String searchReference = "champs/all-champs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
            setAdapter();

        }
    }

    void setAdapter(){
        Query buildQuery = FirebaseDatabase.getInstance().getReference().child(searchReference);

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Build>()
                .setQuery(buildQuery, Build.class)
                .setLifecycleOwner(this)
                .build();

        mAdapter = new FirebaseRecyclerAdapter<Build, BuildViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull BuildViewHolder holder, int position, @NonNull Build build) {
                final String buildKey = getRef(position).getKey();

                Glide.with(BuildActivity.this).load(build.image1).into(holder.image1);
                holder.porciento.setText(build.porciento);
                holder.papel.setText(build.papel);
                holder.año.setText(build.año);
                Glide.with(BuildActivity.this).load(build.image2).into(holder.image2);
                Glide.with(BuildActivity.this).load(build.image3).into(holder.image3);
                Glide.with(BuildActivity.this).load(build.image4).into(holder.image4);
                Glide.with(BuildActivity.this).load(build.image5).into(holder.image5);
                Glide.with(BuildActivity.this).load(build.image6).into(holder.image6);
                Glide.with(BuildActivity.this).load(build.image7).into(holder.image7);
                Glide.with(BuildActivity.this).load(build.image8).into(holder.image8);
                Glide.with(BuildActivity.this).load(build.image9).into(holder.image9);
                Glide.with(BuildActivity.this).load(build.image10).into(holder.image10);
                Glide.with(BuildActivity.this).load(build.image11).into(holder.image11);
                Glide.with(BuildActivity.this).load(build.image12).into(holder.image12);
                Glide.with(BuildActivity.this).load(build.image13).into(holder.image13);
                Glide.with(BuildActivity.this).load(build.image14).into(holder.image14);
                Glide.with(BuildActivity.this).load(build.image15).into(holder.image15);
                Glide.with(BuildActivity.this).load(build.image16).into(holder.image16);
                Glide.with(BuildActivity.this).load(build.image17).into(holder.image17);
                Glide.with(BuildActivity.this).load(build.image18).into(holder.image18);
                Glide.with(BuildActivity.this).load(build.image19).into(holder.image19);
                Glide.with(BuildActivity.this).load(build.image20).into(holder.image20);
                Glide.with(BuildActivity.this).load(build.image21).into(holder.image21);
                Glide.with(BuildActivity.this).load(build.image22).into(holder.image22);
                Glide.with(BuildActivity.this).load(build.image23).into(holder.image23);
                Glide.with(BuildActivity.this).load(build.image24).into(holder.image24);
                Glide.with(BuildActivity.this).load(build.image25).into(holder.image25);
                Glide.with(BuildActivity.this).load(build.image26).into(holder.image26);
                Glide.with(BuildActivity.this).load(build.image27).into(holder.image27);
                Glide.with(BuildActivity.this).load(build.image28).into(holder.image28);
                Glide.with(BuildActivity.this).load(build.image29).into(holder.image29);
                Glide.with(BuildActivity.this).load(build.image30).into(holder.image30);
                Glide.with(BuildActivity.this).load(build.image31).into(holder.image31);
                Glide.with(BuildActivity.this).load(build.image32).into(holder.image32);
                Glide.with(BuildActivity.this).load(build.image33).into(holder.image33);
                Glide.with(BuildActivity.this).load(build.image34).into(holder.image34);
                Glide.with(BuildActivity.this).load(build.image35).into(holder.image35);
                Glide.with(BuildActivity.this).load(build.image36).into(holder.image36);
                Glide.with(BuildActivity.this).load(build.image37).into(holder.image37);
                Glide.with(BuildActivity.this).load(build.image38).into(holder.image38);
                Glide.with(BuildActivity.this).load(build.image39).into(holder.image39);
                Glide.with(BuildActivity.this).load(build.image40).into(holder.image40);
                Glide.with(BuildActivity.this).load(build.image41).into(holder.image41);
                Glide.with(BuildActivity.this).load(build.image42).into(holder.image42);

            }

            @Override
            public BuildViewHolder onCreateViewHolder(ViewGroup parent, int i) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_champ, parent, false);
                return new BuildViewHolder(view);
            }

        };

        recyclerView.setAdapter(mAdapter);
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        BuildActivity.this.finish();
    }

}
