package com.example.raul.lolbuilds.view.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.raul.lolbuilds.model.Bans;
import com.example.raul.lolbuilds.view.viewHolders.BansViewHolder;
import com.example.raul.lolbuilds.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public abstract class BanListFragment2 extends Fragment {

    RecyclerView recyclerView;
    FirebaseRecyclerAdapter mAdapter;
    DatabaseReference mReference;
    String searchReference = "bans/all-champs";

    public BanListFragment2() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ban_list, container, false);

        mReference = FirebaseDatabase.getInstance().getReference();
        setQuery();

        recyclerView = view.findViewById(R.id.bans);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        setAdapter();

        return view;
    }

    void setAdapter(){
        Query bansQuery = mReference.child(searchReference);

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Bans>()
                .setQuery(bansQuery, Bans.class)
                .setLifecycleOwner(this)
                .build();

        mAdapter = new FirebaseRecyclerAdapter<Bans, BansViewHolder>(options) {
            @Override
            protected void onBindViewHolder(final @NonNull BansViewHolder holder, final int position, final @NonNull Bans bans) {

                Glide.with(BanListFragment2.this).load(bans.imageName)
                        .thumbnail(Glide.with(BanListFragment2.this).load(R.drawable.loading))
                        .into(holder.image);
                System.out.println(bans.imageName);
                holder.name2.setText(bans.name);
                holder.victorias.setText(bans.victorias);
                holder.banrate.setText(bans.banrate);
                holder.pickrate.setText(bans.pickrate);
            }

            @Override
            public BansViewHolder onCreateViewHolder(ViewGroup parent, int i) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ban2, parent, false);
                return new BansViewHolder(view);
            }
        };

        recyclerView.setAdapter(mAdapter);
    }

    abstract Query setQuery();
}
