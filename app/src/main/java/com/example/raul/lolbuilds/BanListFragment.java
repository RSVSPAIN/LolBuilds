package com.example.raul.lolbuilds;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;
import java.util.List;

public abstract class BanListFragment extends Fragment {

    List<Bans> bans = new ArrayList<>();

    public BanListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_ban_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.bans);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        return view;
    }

    class BansAdapter extends FirebaseRecyclerAdapter<Bans, BansViewHolder> {

        Context context;

        public BansAdapter(Context context, @NonNull FirebaseRecyclerOptions<Bans> options) {
            super(options);
            this.context = context;
        }

        @Override
        protected void onBindViewHolder(final @NonNull BansViewHolder holder, int position, final @NonNull Bans bans) {
            Glide.with(context).load(bans.image).into(holder.image);
            holder.name2.setText(bans.name);
            holder.victorias.setText(bans.victorias);
            holder.banrate.setText(bans.banrate);
            holder.pickrate.setText(bans.pickrate);

        }

        public BansViewHolder onCreateViewHolder(ViewGroup parent, int i) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ban, parent, false);
            return new BansViewHolder(view);
        }
    }

}
