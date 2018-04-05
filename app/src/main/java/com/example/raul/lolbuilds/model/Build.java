package com.example.raul.lolbuilds.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raul on 11/03/2018.
 */

public class Build {

    public String porciento;
    public String papel;
    public String name;
    public String año;
    public List<String> imagenes = new ArrayList<>();

    public Build() {}

    public Build(String porciento, String papel, String año) {
        this.porciento = porciento;
        this.papel = papel;
        this.año = año;
    }
}


