package com.example.raul.lolbuilds;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TabBronceFragment extends BanListFragment2 {

    @Override
    Query setQuery() {
        searchReference = "bans/bronce";
        return FirebaseDatabase.getInstance().getReference().child("bans/bronce");
    }

}
