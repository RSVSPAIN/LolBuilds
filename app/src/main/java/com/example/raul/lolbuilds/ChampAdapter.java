package com.example.raul.lolbuilds;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class ChampAdapter extends FirebaseRecyclerAdapter<Champ, ChampViewHolder> {

    Context context;

    public ChampAdapter(Context context, @NonNull FirebaseRecyclerOptions<Champ> options) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(final @NonNull ChampViewHolder holder, int position, final @NonNull Champ champ) {
        holder.name.setText(champ.name);
        //holder.image.setImageDrawable(getDrawable(champ.imageId));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BuildActivity.class);
                intent.putExtra("champId", champ.id);
                context.startActivity(intent);
                //MainActivity.this.finish();
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

    public ChampViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_champ, parent, false);
        return new ChampViewHolder(view);
    }

}