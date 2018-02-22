package com.example.raul.lolbuilds;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dam2a on 21/02/18.
 */

public class ChampViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    ImageView image;
    ImageView iconfav;

    public ChampViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.champ_name);
        image = itemView.findViewById(R.id.champ_image);
        iconfav = itemView.findViewById(R.id.icon_like);
    }
}
