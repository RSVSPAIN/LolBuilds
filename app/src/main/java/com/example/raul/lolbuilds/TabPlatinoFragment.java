package com.example.raul.lolbuilds;

public class TabPlatinoFragment extends BanListFragment2 {

    @Override
    public void populateList() {
        bans.clear();

        bans.add(new ChampBans(26, getActivity().getDrawable(R.drawable.ic_ezreal),"Ezreal","52,85%","25,25%","23,35%"));
        bans.add(new ChampBans(25, getActivity().getDrawable(R.drawable.ic_evelynn),"Evelynn","54,31%","36,30%","08,16%"));
        bans.add(new ChampBans(3, getActivity().getDrawable(R.drawable.ic_gangplank),"Gangplank","53,97%","05,76%","10,49%"));
        bans.add(new ChampBans(3, getActivity().getDrawable(R.drawable.ic_alistar),"Alistar","52,71%","08,57%","11,66%"));

    }
}
