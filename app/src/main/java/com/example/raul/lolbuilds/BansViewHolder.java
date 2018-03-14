package com.example.raul.lolbuilds;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raul on 14/03/2018.
 */

public class BansViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name2;
    TextView victorias;
    TextView banrate;
    TextView pickrate;

    public BansViewHolder(View itemView) {
        super(itemView);
        this.image = image;
        this.name2 = name2;
        this.victorias = victorias;
        this.banrate = banrate;
        this.pickrate = pickrate;
    }
}
