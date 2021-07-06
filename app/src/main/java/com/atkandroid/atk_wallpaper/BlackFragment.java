package com.atkandroid.atk_wallpaper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.atkandroid.atk_wallpaper.adapter.RecyclerViewAdapter;
import com.atkandroid.atk_wallpaper.model.CustomItems;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BlackFragment extends Fragment{

    private TabHost th;
    private RecyclerView rvSmoke,rvDark,rvIce;
    private RecyclerViewAdapter rvAdapterSmoke,rvAdapterDark,rvAdapterIce;
    private List<CustomItems> itemsListSmoke,itemsListDark,itemsListIce;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_black,container,false);

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



// Black Smoke
        rvSmoke  = view.findViewById(R.id.rvSmoke);
        rvSmoke.setHasFixedSize(true);
        rvSmoke.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListSmoke = new ArrayList<>();
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/15/08/14/body-painting-4696539__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/12/05/34/afro-4689826__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/15/08/14/body-painting-4696541__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/15/08/14/body-painting-4696543__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/24/11/49/addiction-4574124__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/01/08/48/man-1071805__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/08/00/43/people-3300101__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/11/30/09/05/fire-221423__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/04/20/29/fantasy-5130664__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/07/21/32/woman-2608067__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/13/22/54/man-1139066__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/25/20/56/portrait-4430290__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/23/15/27/adult-1853510__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/16/10/00/fantasy-4341466__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/07/11/10/smoke-3003615__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/09/00/52/escape-3210332__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/29/03/14/buddha-1287429__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/05/08/11/07/magic-2295100__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/07/06/52/body-painting-4746902__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/02/16/03/31/bees-4852515__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/01/09/05/street-photography-2563767__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/15/06/26/suit-4932571__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/06/02/23/46/smoke-and-mirrors-4247808__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/30/03/37/train-1871819__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/03/17/15/31/smoke-677919__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/13/11/19/tramp-4927670__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/06/17/06/retro-3065384__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/11/17/37/flame-3217481__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2012/12/21/10/07/abstract-71603__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2012/12/21/10/07/abstract-71601__340.jpg"));

        rvAdapterSmoke = new RecyclerViewAdapter(itemsListSmoke,getContext());
        rvSmoke.setAdapter(rvAdapterSmoke);
//Black Smoke

//Black Dark
        rvDark  = view.findViewById(R.id.rvDark);
        rvDark.setHasFixedSize(true);
        rvDark.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListDark = new ArrayList<>();
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/26/21/17/woman-2979961__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/12/06/19/46/girl-559307__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/21/17/33/body-1846668__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/12/11/18/05/girl-564460__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/03/09/17/30/horse-4044547__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/01/28/09/50/death-614644__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/07/10/14/04/coffee-839233__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/12/05/15/33/lamp-558122__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/22/07/31/portrait-3098319__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/13/00/adorable-1869685__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/04/10/17/09/woman-716592__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/08/06/13/43/spiral-staircase-877834__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/13/13/53/skull-765477__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/27/15/18/art-2179341__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/19/06/26/model-1838137__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/09/18/15/09/black-and-white-1678414__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/05/04/20/46/full-moon-1372783__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/06/21/18/38/witch-4290114__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/28/11/58/abstract-2181884__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/26/14/43/young-1280694__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/01/10/15/ballet-2564266__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/04/14/18/horse-2116163__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/19/09/59/dark-1838402__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/29/03/55/gothic-3115166__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/19/16/54/tomcat-3092804__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/02/08/17/36/mysterious-4830751__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/05/44/art-1867607__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/06/08/01/ghost-5265642__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2013/05/10/10/31/comic-110216__340.jpg"));

        rvAdapterDark = new RecyclerViewAdapter(itemsListDark,getContext());
        rvDark.setAdapter(rvAdapterDark);
//Black Dark

//Black Ice
        rvIce  = view.findViewById(R.id.rvIce);
        rvIce.setHasFixedSize(true);
        rvIce.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListIce = new ArrayList<>();
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/05/13/18/45/winter-343565__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/15/21/11/school-start-2753595__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/09/10/46/snow-1246059__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/08/11/08/54/ice-cream-415385__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/10/03/22/02/dish-970448__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/04/08/17/15/chef-713100__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2012/10/10/10/48/antarctica-60598__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/09/28/18/51/oman-1701152__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/02/17/35/human-3056669__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/08/19/14/23/grapes-896065__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/07/26/16/44/drink-1543251__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/01/11/11/25/ice-596126__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/08/19/14/24/grapes-896066__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/15/13/02/gin-and-ginger-ale-4478226__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/16/23/37/breakfast-2410709__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/12/04/20/winter-2741215__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2011/03/18/19/29/road-5526__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/23/20/59/cocktail-4499719__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/04/21/03/51/icicle-328930__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/10/27/12/26/glass-1008901__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2013/02/04/19/09/chicago-77881__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/08/21/26/tree-4751305__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/17/13/26/ice-cream-5495391__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/04/08/17/07/soda-jerk-713089__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/07/31/12/30/whisky-2557814__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/11/23/56/icebergs-4758962__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/03/14/12/34/ice-673131__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/02/15/29/brno-czech-republic-1947071__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/12/05/41/leaf-4620098__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/03/30/13/11/winter-698856__340.jpg"));

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