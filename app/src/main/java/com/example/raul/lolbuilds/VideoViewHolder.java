package com.example.raul.lolbuilds;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by Raul on 21/03/2018.
 */

public class VideoViewHolder extends RecyclerView.ViewHolder{

    TextView titulo;
    VideoView video;

    public VideoViewHolder(View itemView) {
        super(itemView);
        this.titulo = itemView.findViewById(R.id.video_title);
        this.video = itemView.findViewById(R.id.video_video);
    }

}
