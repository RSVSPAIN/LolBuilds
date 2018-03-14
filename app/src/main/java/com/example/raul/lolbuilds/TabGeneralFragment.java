package com.example.raul.lolbuilds;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TabGeneralFragment extends BanListFragment {

    @Override
    Query setQuery() {
        searchReference = "bans/all-champs";
        return FirebaseDatabase.getInstance().getReference().child("bans/all-champs");
    }
}
