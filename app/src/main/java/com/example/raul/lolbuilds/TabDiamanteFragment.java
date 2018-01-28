package com.example.raul.lolbuilds;

public class TabDiamanteFragment extends BanListFragment2 {

    @Override
    public void populateList() {
        bans.clear();

        bans.add(new ChampBans(26, getActivity().getDrawable(R.drawable.ic_ezreal),"Ezreal","58,76%","25,25%","23,35%"));
        bans.add(new ChampBans(3, getActivity().getDrawable(R.drawable.ic_gangplank),"Gangplank","65,92%","05,76%","10,49%"));
        bans.add(new ChampBans(12, getActivity().getDrawable(R.drawable.ic_brand),"Brand","57,96%","12,52%","11,82%"));
        bans.add(new ChampBans(29, getActivity().getDrawable(R.drawable.ic_evelynn),"Fizz","61,69%","12,59%","07,80%"));

    }
}
