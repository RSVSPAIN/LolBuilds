package com.example.raul.lolbuilds;

public class TabBronceFragment extends BanListFragment2 {

    @Override
    public void populateList() {
        bans.clear();

        bans.add(new ChampBans(12, getActivity().getDrawable(R.drawable.ic_brand),"Brand","53,97%","12,52%","11,82%"));
        bans.add(new ChampBans(38, getActivity().getDrawable(R.drawable.ic_illaoi),"Illaoi","52,48%","25,94%","08,79%"));
        bans.add(new ChampBans(3, getActivity().getDrawable(R.drawable.ic_alistar),"Alistar","52,24%","08,57%","11,66%"));
        bans.add(new ChampBans(32, getActivity().getDrawable(R.drawable.ic_garen),"Garen","52,03%","03,67%","09,09%"));
    }

    //@Override
    //void setQuery(){
    //   return mReference.child(""
    //}

}
