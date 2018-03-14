package com.example.raul.lolbuilds;

public class Bans {
    Integer id;
    String imageId;
    String name;
    String victorias;
    String banrate;
    String pickrate;

    public Bans (){}

    public Bans(Integer id, String imageId, String name, String victorias, String banrate, String pickrate) {
        this.id = id;
        this.imageId = imageId;
        this.name = name;
        this.victorias = victorias;
        this.banrate = banrate;
        this.pickrate = pickrate;
    }
}