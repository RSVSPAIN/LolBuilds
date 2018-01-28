package com.example.raul.lolbuilds;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public abstract class BanListFragment extends Fragment {

    List<ChampBans> bans = new ArrayList<>();

    public BanListFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_ban_list, container, false);

        populateList();

        RecyclerView recyclerView = view.findViewById(R.id.bans);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        BansAdapter banAdapter = new BansAdapter(bans);
        recyclerView.setAdapter(banAdapter);

        return view;
    }

    public abstract void populateList();

    class BansAdapter extends RecyclerView.Adapter<BansAdapter.BansViewHolder>{

        List<ChampBans> list;

        BansAdapter(List<ChampBans> list){
            this.list = list;
        }

        public BansViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ban, null, false);
            return new BansViewHolder(view);
        }

        @Override
        public void onBindViewHolder(BansViewHolder holder, int position) {

            final ChampBans bans = list.get(position);

            holder.name.setText(bans.name);
            holder.image.setImageDrawable(bans.image);
            holder.victorias.setText(bans.victorias);
            holder.banrate.setText(bans.banrate);
            holder.pickrate.setText(bans.pickrate);

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class BansViewHolder extends RecyclerView.ViewHolder {
            TextView name;
            ImageView image;
            TextView victorias;
            TextView banrate;
            TextView pickrate;

            public BansViewHolder(View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.ban_name);
                image = itemView.findViewById(R.id.ban_image);
                victorias = itemView.findViewById(R.id.ban_victorias);
                banrate = itemView.findViewById(R.id.ban_banrate);
                pickrate = itemView.findViewById(R.id.ban_pickrate);
            }
        }
    }

}
