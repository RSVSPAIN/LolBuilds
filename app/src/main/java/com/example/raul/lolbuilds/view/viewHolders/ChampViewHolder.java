package com.example.raul.lolbuilds.view.viewHolders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raul.lolbuilds.R;

/**
 * Created by dam2a on 21/02/18.
 */

public class ChampViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public ImageView image;
    public ImageView iconfav;

    public ChampViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.champ_name);
        image = itemView.findViewById(R.id.champ_image);
        iconfav = itemView.findViewById(R.id.icon_like);
    }
}
