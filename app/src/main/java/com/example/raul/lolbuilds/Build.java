package com.example.raul.lolbuilds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Raul on 11/03/2018.
 */

public class Build {

    String porciento;
    String papel;
    String name;
    String año;
    //Map<String, String> imagenes = new HashMap<>();
    List<String> imagenes = new ArrayList<>();
    public Build() {}

    public Build(String porciento, String papel, String año) {
        this.porciento = porciento;
        this.papel = papel;
        this.año = año;
    }
}


