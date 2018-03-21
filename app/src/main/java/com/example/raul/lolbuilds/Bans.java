package com.example.raul.lolbuilds;

public class Bans {
    Integer id;
    String imageName;
    String name;
    String victorias;
    String banrate;
    String pickrate;

    public Bans (){}

    public Bans(Integer id, String imageName, String name, String victorias, String banrate, String pickrate) {
        this.id = id;
        this.imageName = imageName;
        this.name = name;
        this.victorias = victorias;
        this.banrate = banrate;
        this.pickrate = pickrate;
    }
}