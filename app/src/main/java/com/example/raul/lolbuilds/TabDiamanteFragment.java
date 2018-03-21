package com.example.raul.lolbuilds;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TabDiamanteFragment extends BanListFragment2 {

    @Override
    Query setQuery() {
        searchReference = "bans/diamante";
        return FirebaseDatabase.getInstance().getReference().child("bans/diamante");
    }
}
