package com.example.raul.lolbuilds;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TabPlataFragment extends BanListFragment2 {

    @Override
    Query setQuery() {
        searchReference = "bans/plata";
        return FirebaseDatabase.getInstance().getReference().child("bans/plata");
    }
}
