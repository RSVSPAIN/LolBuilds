package com.example.raul.lolbuilds.view.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raul.lolbuilds.R;

/**
 * Created by Raul on 14/03/2018.
 */

public class BansViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView name2;
    public TextView victorias;
    public TextView banrate;
    public TextView pickrate;

    public BansViewHolder(View itemView) {
        super(itemView);
        this.image = itemView.findViewById(R.id.ban_image);
        this.name2 = itemView.findViewById(R.id.ban_name);
        this.victorias = itemView.findViewById(R.id.ban_victorias);
        this.banrate = itemView.findViewById(R.id.ban_banrate);
        this.pickrate = itemView.findViewById(R.id.ban_pickrate);
    }
}
