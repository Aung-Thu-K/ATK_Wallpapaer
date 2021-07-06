package com.atkandroid.atk_wallpaper;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.atkandroid.atk_wallpaper.adapter.RecyclerViewAdapter;
import com.atkandroid.atk_wallpaper.model.CustomItems;

import java.util.ArrayList;
import java.util.List;

public class ShadowFragment extends Fragment {

    private TabHost th;
    private RecyclerView rvSmoke,rvDark,rvIce;
    private RecyclerViewAdapter rvAdapterSmoke,rvAdapterDark,rvAdapterIce;
    private List<CustomItems> itemsListSmoke,itemsListDark,itemsListIce;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shadow,container,false);

        th = view.findViewById(R.id.tabHost);
        th.setup();

        TabHost.TabSpec spec = th.newTabSpec("One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Smoke");
        th.addTab(spec);

        spec = th.newTabSpec("Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Dark");
        th.addTab(spec);

        spec = th.newTabSpec("Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Ice");
        th.addTab(spec);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(String.valueOf(new MainActivity()));

// Black Smoke
        rvSmoke  = view.findViewById(R.id.rvSmoke);
        rvSmoke.setHasFixedSize(true);
        rvSmoke.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListSmoke = new ArrayList<>();
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/22/12/18/thinking-5205211__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/02/09/52/joker-4596014__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/01/08/48/man-1071805__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/23/12/35/volcano-4960758__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/01/27/15/21/parents-613884__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/10/02/04/52/joker-3717891__340.png"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/20/05/19/woman-4639123__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/06/46/adult-1867887__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/08/19/36/couple-4325416__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/08/17/48/man-3592777__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/21/20/18/amsterdam-4353567__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/09/18/15/09/black-and-white-1678414__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/21/14/28/fashion-3096701__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/27/15/18/art-2179341__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/30/17/05/sun-4590041__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/05/11/15/03/spirit-2304469__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/06/06/14/46/eye-117043__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/28/07/11/princess-2449970__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/06/17/17/06/saturn-1463606__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/08/10/11/surreal-3005472__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/05/13/18/little-boy-4904432__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/27/23/55/girl-2793938__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/22/00/56/child-2667485__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/19/06/56/arrow-2418321__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/20/23/14/owl-1996169__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/11/28/10/04/skull-220019__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/19/09/59/dark-1838402__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/02/22/54/fantasy-2912873__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/12/13/26/alone-2395558__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/27/14/41/art-2179122__340.jpg"));


        rvAdapterSmoke = new RecyclerViewAdapter(itemsListSmoke,getContext());
        rvSmoke.setAdapter(rvAdapterSmoke);
//Black Smoke

//Black Dark
        rvDark  = view.findViewById(R.id.rvDark);
        rvDark.setHasFixedSize(true);
        rvDark.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListDark = new ArrayList<>();
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/14/00/23/horse-1139138__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/26/22/38/sun-2445465__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/01/02/16/dark-2562873__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/06/24/15/00/knife-376381__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/05/03/00/57/pedicure-336677__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2012/11/07/17/32/church-65183__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/18/19/17/silhouette-5499140__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/16/16/24/forest-1745661__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/11/03/22/14/crime-515923__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/08/28/21/58/wall-light-1626966__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/09/29/13/47/girl-466131__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/08/12/23/18/woman-1589954__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/04/12/05/12/fairytale-2223671__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/06/24/15/00/knife-376383__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/17/12/02/horse-2411993__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/07/06/51/man-4390019__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/08/25/07/23/statue-1618913__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/09/08/17/47/man-3662939__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/13/04/55/woman-4761634__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/06/18/46/man-4606902__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/12/11/16/shadow-5482386__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/02/27/18/34/east-1226038__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/07/21/14/mountains-1126573__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/08/10/38/a-couple-of-sunset-2126416__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/01/05/22/31/lane-3916078__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/01/13/39/road-2565503__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/05/11/39/people-2582824__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/22/18/25/woman-5509103__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/07/12/21/00/light-842447__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/09/07/22/29/sunset-929252__340.jpg"));



        rvAdapterDark = new RecyclerViewAdapter(itemsListDark,getContext());
        rvDark.setAdapter(rvAdapterDark);
//Black Dark

//Black Ice
        rvIce  = view.findViewById(R.id.rvIce);
        rvIce.setHasFixedSize(true);
        rvIce.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListIce = new ArrayList<>();
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2012/03/04/00/45/halloween-22055__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/24/08/25/womens-2437011__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/05/36/adult-1867574__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/22/08/49/skeleton-4784806__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/18/19/33/tourism-1916633__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2013/11/28/10/04/skull-220017__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/03/15/05/mens-3127801__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/04/28/10/31/girl-2268056__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/02/20/18/38/forest-1212566__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/22/08/34/park-4495453__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/05/02/18/33/cigarette-336211__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/22/18/28/woman-5509126__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/04/27/05/04/sunset-2264478__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/09/23/12/28/skeleton-457598__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/07/05/02/22/hispanic-384477__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/12/01/10/45/mens-3849286__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/07/23/36/portrait-3591061__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/22/07/23/portrait-4956082__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/14/07/17/girl-4694342__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/08/08/27/girl-3138852__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/27/13/55/action-2178885__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/22/08/15/woman-4644364__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/02/25/16/14/landscape-4019960__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/07/06/20/05/tree-385805__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2013/11/28/10/04/skull-220018__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/31/12/24/man-5532334__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/09/13/18/35/cat-938545__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/31/14/54/jeans-792030__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/22/18/26/woman-5509104__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/11/22/19/man-3391887__340.jpg"));


        rvAdapterIce = new RecyclerViewAdapter(itemsListIce,getContext());
        rvIce.setAdapter(rvAdapterIce);
//Black Ice

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(String.valueOf(new MainActivity()));
        transaction.commit();
    }

}