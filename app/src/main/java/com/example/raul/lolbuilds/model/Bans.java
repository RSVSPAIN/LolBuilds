package com.example.raul.lolbuilds.model;

public class Bans {
    public Integer id;
    public String imageName;
    public String name;
    public String victorias;
    public String banrate;
    public String pickrate;

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