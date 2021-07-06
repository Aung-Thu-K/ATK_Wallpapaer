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

public class MountainFragment extends Fragment {

    private TabHost th;
    private RecyclerView rvSmoke,rvDark,rvIce;
    private RecyclerViewAdapter rvAdapterSmoke,rvAdapterDark,rvAdapterIce;
    private List<CustomItems> itemsListSmoke,itemsListDark,itemsListIce;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mountain,container,false);

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
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/30/04/21/girl-2987578__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/07/18/20/14/mount-st-helens-164847__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/13/17/42/train-4693530__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/04/22/14/39/man-5078453__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/07/19/03/50/deer-1527457__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/27/19/34/sawmill-1110293__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/23/12/35/volcano-4960758__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/06/08/10/mountain-5467293__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/01/21/58/mountain-5361145__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/18/11/43/steam-locomotive-2654664__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/01/22/52/nature-2568434__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/28/19/03/smoke-4800720__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/05/07/38/butts-4453386__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/29/19/15/smoke-4981907__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/04/25/15/39/wikiproject-taiwan-5091358__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/01/23/46/nature-2568732__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/06/10/20/nature-2591005__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/03/09/25/smoking-man-1074308__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/22/10/15/smoking-man-1925122__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/06/11/41/fairy-5137238__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/27/19/33/sawmill-1110290__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/27/19/33/sawmill-1110292__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/03/11/26/sunset-4522994__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/29/07/35/water-3271579__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/07/15/11/49/mountain-846062__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/12/07/01/alps-5481799__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2014/12/15/17/16/night-sky-569319__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/06/05/14/08/nature-4253751__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/10/22/05/mountains-4467436__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/08/00/58/snow-1082229__340.jpg"));

        rvAdapterSmoke = new RecyclerViewAdapter(itemsListSmoke,getContext());
        rvSmoke.setAdapter(rvAdapterSmoke);
//Black Smoke

//Black Dark
        rvDark  = view.findViewById(R.id.rvDark);
        rvDark.setHasFixedSize(true);
        rvDark.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListDark = new ArrayList<>();
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/22/14/14/sunset-4423621__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/23/03/08/valley-4646114__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/19/17/37/snow-mountain-1149794__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/03/26/21/00/climber-299018__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/16/05/37/alpine-4553488__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/11/29/20/01/nature-3846403__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/06/04/16/07/mountains-4251750__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/19/17/22/cliff-1840442__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/27/08/56/water-3354063__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/07/14/35/mountain-2604474__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/09/02/12/36/startrails-918551__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/03/04/13/28/zebra-4034126__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/21/00/05/mountains-4641428__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/09/09/09/mountain-1245648__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/19/17/35/rocky-mountains-1149778__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/26/18/51/mountains-5440390__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/26/18/51/mountains-5440390__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/04/04/05/36/expedition-5000915__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/04/01/05/54/cow-2193018__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/08/00/51/rainbows-1082107__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/24/20/19/mountain-3427481__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/21/09/17/cliff-4420635__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/12/08/33/mountain-5289671__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/21/18/30/korea-4353332__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/19/03/30/landscape-4347888__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/18/18/29/mountain-4635428__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/26/03/04/snow-3261495__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/06/01/00/18/hiking-792800__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/15/10/44/alpine-4551324__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/23/18/24/italy-4961709__340.jpg"));



        rvAdapterDark = new RecyclerViewAdapter(itemsListDark,getContext());
        rvDark.setAdapter(rvAdapterDark);
//Black Dark

//Black Ice
        rvIce  = view.findViewById(R.id.rvIce);
        rvIce.setHasFixedSize(true);
        rvIce.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListIce = new ArrayList<>();
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/26/01/40/mountain-3631349__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/14/15/27/alpine-4549188__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/02/23/09/man-4380804__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/30/04/21/girl-2987578__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/05/31/15/24/mountain-4242391__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/02/08/18/37/grossglockner-3983717__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/09/20/20/24/serpentine-454249__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/29/11/26/road-3359680__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/01/11/57/gaztelugatxe-4377342__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/19/04/19/nature-4347932__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/21/08/05/cow-776730__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/14/15/58/mountain-4765381__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/17/17/49/mountains-4484190__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/16/11/14/plant-4341560__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/10/20/48/iseltwald-4686879__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/27/08/57/waterfall-4972945__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/21/20/29/fantasy-3097474__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/06/19/20/43/mountain-pose-815291__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/09/02/13/35/mountain-5538315__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/02/19/10/21/nature-1209197__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2013/11/28/17/53/forest-220719__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/02/06/22/18/perigord-2044448__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2012/07/06/00/53/lake-louise-51543__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/27/06/56/mountain-stream-5521318__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/07/03/22/people-2599243__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/27/18/05/mountains-5522572__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/02/22/16/50/multnomah-falls-2089902__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/18/21/34/lake-1836976__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/06/52/mountain-1867925__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/23/14/52/cascade-1853341__340.jpg"));



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

