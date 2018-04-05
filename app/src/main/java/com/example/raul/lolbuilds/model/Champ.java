package com.example.raul.lolbuilds.model;

public class Champ {
    public Integer id;
    public String posicion;
    public String name;
    public String imageName;

    public Champ(){}

    public Champ(Integer id, String posicion, String name, String imageName) {
        this.id = id;
        this.posicion = posicion;
        this.name = name;
        this.imageName = imageName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}