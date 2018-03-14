package com.example.raul.lolbuilds;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

/**
 * Created by Raul on 14/03/2018.
 */

public class BansAdapter extends FirebaseRecyclerAdapter<Bans, BansViewHolder> {

    Context context;

    public BansAdapter(Context context, @NonNull FirebaseRecyclerOptions<Bans> options) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(final @NonNull BansViewHolder holder, int position, final @NonNull Bans bans) {
        Glide.with(context).load(bans.image).into(holder.image);
        holder.name2.setText(bans.name);
        holder.victorias.setText(bans.victorias);
        holder.banrate.setText(bans.banrate);
        holder.pickrate.setText(bans.pickrate);

    }

    public BansViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ban, parent, false);
        return new BansViewHolder(view);
    }

}
