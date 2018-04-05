package com.example.raul.lolbuilds.view.fragments;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TabPlatinoFragment extends BanListFragment2 {

    @Override
    Query setQuery() {
        searchReference = "bans/platino";
        return FirebaseDatabase.getInstance().getReference().child("bans/platino");
    }
}
