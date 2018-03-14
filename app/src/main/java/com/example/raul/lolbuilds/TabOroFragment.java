package com.example.raul.lolbuilds;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TabOroFragment extends BanListFragment2 {

    @Override
    Query setQuery() {
        searchReference = "bans/oro";
        return FirebaseDatabase.getInstance().getReference().child("bans/oro");
    }
}
