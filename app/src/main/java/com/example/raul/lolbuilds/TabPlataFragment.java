package com.example.raul.lolbuilds;

public class TabPlataFragment extends BanListFragment2 {

    @Override
    public void populateList() {
        bans.clear();

        bans.add(new Bans(12, getActivity().getDrawable(R.drawable.ic_brand),"Brand","55,34%","12,52%","11,82%"));
        bans.add(new Bans(11, getActivity().getDrawable(R.drawable.ic_blitzcrank),"Blitzcrank","53,36%","32,60%","10,54%"));
        bans.add(new Bans(38, getActivity().getDrawable(R.drawable.ic_illaoi),"Illaoi","54,47%","25,90%","08,79%"));
        bans.add(new Bans(3, getActivity().getDrawable(R.drawable.ic_alistar),"Alistar","52,49%","08,57%","11,66%"));

    }
}
