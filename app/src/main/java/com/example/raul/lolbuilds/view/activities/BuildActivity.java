package com.example.raul.lolbuilds.view.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.raul.lolbuilds.model.Build;
import com.example.raul.lolbuilds.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BuildActivity extends AppCompatActivity {

    DatabaseReference mReference;
    String searchReference = "";
    String champKey;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mReference = FirebaseDatabase.getInstance().getReference();

        this.setTitle("");

        Intent intent = getIntent();
        champKey = intent.getStringExtra("champKey");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                BuildActivity.this.finish();
            }
        });

        searchReference = "build";
        showBuild();

    }

    void showBuild(){
        mReference.child(searchReference).child(champKey).addListenerForSingleValueEvent(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               Build build = dataSnapshot.getValue(Build.class);

               ImageView imageView10 = findViewById(R.id.build_image10);
               ImageView imageView11 = findViewById(R.id.build_image11);
               ImageView imageView12 = findViewById(R.id.build_image12);
               ImageView imageView13 = findViewById(R.id.build_image13);

               ((TextView) findViewById(R.id.build_porciento)).setText(build.porciento);
               ((TextView) findViewById(R.id.build_papel)).setText(build.papel);
               ((TextView) findViewById(R.id.build_año)).setText(build.año);
               BuildActivity.this.setTitle(build.name);

               Glide.with(BuildActivity.this).load(build.imagenes.get(0))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image1));
               Glide.with(BuildActivity.this).load(build.imagenes.get(1))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image2));
               Glide.with(BuildActivity.this).load(build.imagenes.get(2))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image3));
               Glide.with(BuildActivity.this).load(build.imagenes.get(3))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image4));
               Glide.with(BuildActivity.this).load(build.imagenes.get(4))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image5));
               Glide.with(BuildActivity.this).load(build.imagenes.get(5))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image6));
               Glide.with(BuildActivity.this).load(build.imagenes.get(6))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image7));
               Glide.with(BuildActivity.this).load(build.imagenes.get(7))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image8));
               Glide.with(BuildActivity.this).load(build.imagenes.get(8))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image9));

               if (build.imagenes.get(9) == null){
                   imageView10.setPadding(0,0,0,0);
               }
               else{
                   Glide.with(BuildActivity.this).load(build.imagenes.get(9))
                           .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                           .into((ImageView) findViewById(R.id.build_image10));
               }

               if (build.imagenes.get(10) == null){
                   imageView11.setPadding(0,0,0,0);
               }
               else{
                   Glide.with(BuildActivity.this).load(build.imagenes.get(10))
                           .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                           .into((ImageView) findViewById(R.id.build_image11));
               }

               if (build.imagenes.get(11) == null){
                   imageView12.setPadding(0,0,0,0);
               }
               else{
                   Glide.with(BuildActivity.this).load(build.imagenes.get(11))
                           .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                           .into((ImageView) findViewById(R.id.build_image12));
               }

               if (build.imagenes.get(12) == null){
                   imageView13.setPadding(0,0,0,0);
               }
               else{
                   Glide.with(BuildActivity.this).load(build.imagenes.get(12))
                           .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                           .into((ImageView) findViewById(R.id.build_image13));
               }

               Glide.with(BuildActivity.this)
                       .load(build.imagenes.get(13))
                       .apply(new RequestOptions().override(Target.SIZE_ORIGINAL))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image14));

               Glide.with(BuildActivity.this).load(build.imagenes.get(14))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image15));
               Glide.with(BuildActivity.this).load(build.imagenes.get(15))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image16));
               Glide.with(BuildActivity.this).load(build.imagenes.get(16))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image17));
               Glide.with(BuildActivity.this).load(build.imagenes.get(17))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image18));
               Glide.with(BuildActivity.this).load(build.imagenes.get(18))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image19));
               Glide.with(BuildActivity.this).load(build.imagenes.get(19))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image20));
               Glide.with(BuildActivity.this).load(build.imagenes.get(20))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image21));
               Glide.with(BuildActivity.this).load(build.imagenes.get(21))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image22));
               Glide.with(BuildActivity.this).load(build.imagenes.get(22))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image23));
               Glide.with(BuildActivity.this).load(build.imagenes.get(23))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image24));
               Glide.with(BuildActivity.this).load(build.imagenes.get(24))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image25));
               Glide.with(BuildActivity.this).load(build.imagenes.get(25))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image26));
               Glide.with(BuildActivity.this).load(build.imagenes.get(26))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image27));
               Glide.with(BuildActivity.this).load(build.imagenes.get(27))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image28));
               Glide.with(BuildActivity.this).load(build.imagenes.get(28))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image29));
               Glide.with(BuildActivity.this).load(build.imagenes.get(29))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image30));
               Glide.with(BuildActivity.this).load(build.imagenes.get(30))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image31));
               Glide.with(BuildActivity.this).load(build.imagenes.get(31))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image32));
               Glide.with(BuildActivity.this).load(build.imagenes.get(32))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image33));
               Glide.with(BuildActivity.this).load(build.imagenes.get(33))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image34));
               Glide.with(BuildActivity.this).load(build.imagenes.get(34))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image35));
               Glide.with(BuildActivity.this).load(build.imagenes.get(35))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image36));
               Glide.with(BuildActivity.this).load(build.imagenes.get(36))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image37));
               Glide.with(BuildActivity.this).load(build.imagenes.get(37))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image38));
               Glide.with(BuildActivity.this).load(build.imagenes.get(38))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image39));
               Glide.with(BuildActivity.this).load(build.imagenes.get(39))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image40));
               Glide.with(BuildActivity.this).load(build.imagenes.get(40))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image41));
               Glide.with(BuildActivity.this).load(build.imagenes.get(41))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image42));
               Glide.with(BuildActivity.this).load(build.imagenes.get(42))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image43));
               Glide.with(BuildActivity.this).load(build.imagenes.get(43))
                       .thumbnail(Glide.with(BuildActivity.this).load(R.drawable.loading))
                       .into((ImageView) findViewById(R.id.build_image44));
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
