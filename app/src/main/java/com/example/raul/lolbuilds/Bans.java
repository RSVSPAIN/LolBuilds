package com.example.raul.lolbuilds;

import android.graphics.drawable.Drawable;

public class Bans {
    Integer id;
    Drawable image;
    String name;
    String victorias;
    String banrate;
    String pickrate;

    public Bans(Integer id, Drawable image, String name, String victorias, String banrate, String pickrate) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.victorias = victorias;
        this.banrate = banrate;
        this.pickrate = pickrate;
    }
}