package com.example.raul.lolbuilds;

public class TabOroFragment extends BanListFragment2 {

    @Override
    public void populateList() {
        bans.clear();

        bans.add(new Bans(26, getActivity().getDrawable(R.drawable.ic_ezreal),"Ezreal","52,81%","25,25%","23,35%"));
        bans.add(new Bans(12, getActivity().getDrawable(R.drawable.ic_brand),"Brand","54,95%","12,52%","11,82%"));
        bans.add(new Bans(11, getActivity().getDrawable(R.drawable.ic_blitzcrank),"Blitzcrank","50,78%","32,60%","10,54%"));
        bans.add(new Bans(3, getActivity().getDrawable(R.drawable.ic_alistar),"Alistar","53,89%","08,57%","11,66%"));

    }
}
