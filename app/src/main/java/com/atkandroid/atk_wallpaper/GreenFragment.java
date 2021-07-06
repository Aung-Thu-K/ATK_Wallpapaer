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

public class GreenFragment extends Fragment {

    private TabHost th;
    private RecyclerView rvSmoke,rvDark,rvIce;
    private RecyclerViewAdapter rvAdapterSmoke,rvAdapterDark,rvAdapterIce;
    private List<CustomItems> itemsListSmoke,itemsListDark,itemsListIce;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_green,container,false);

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
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/07/15/blur-1868040__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/17/18/52/cannabis-4633206__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/03/10/22/17/mmj-667836__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/16/20/33/cannabis-flower-2756638__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/06/16/26/boy-4456745__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/17/17/14/ivy-4773476__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/06/23/18/58/waterfall-140816__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/09/25/07/17/grass-3701588__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/08/08/29/alien-3138867__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/10/23/15/21/steam-train-1003138__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2012/09/15/02/22/forest-56930__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/09/10/12/40/grass-1659054__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/03/12/18/00/kerala-4051412__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/09/03/19/05/rose-178682__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/07/18/20/27/animal-165104__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/03/04/57/smoke-4597844__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/02/04/20/48/owl-77894__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/10/13/31/woman-4685862__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/03/20/23/20/nature-95363__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/19/02/20/fantasy-2961723__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/08/25/03/50/herbs-906140__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/11/23/05/girl-1134567__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2012/03/07/05/48/ivy-22449__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/09/15/27/cat-1246659__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/22/23/14/adorable-1851108__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/16/22/08/christmas-3023415__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/09/19/29/tree-3385957__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2014/07/29/08/55/cactus-404362__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/04/19/42/apples-1952999__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/11/07/11/20/succulent-1031033__340.jpg"));



        rvAdapterSmoke = new RecyclerViewAdapter(itemsListSmoke,getContext());
        rvSmoke.setAdapter(rvAdapterSmoke);
//Black Smoke

//Black Dark
        rvDark  = view.findViewById(R.id.rvDark);
        rvDark.setHasFixedSize(true);
        rvDark.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListDark = new ArrayList<>();
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/04/24/20/56/meditation-1350599__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/22/13/56/wine-3623692__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2012/02/29/16/04/maple-19364__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/06/27/02/24/buddha-statue-378137__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/11/07/11/28/parrot-1031163__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/10/21/26/food-1898194__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2013/12/23/19/48/yemen-chameleon-233095__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/08/26/22/59/parsley-428720__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/04/23/10/45/child-1347388__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2013/12/09/08/08/fern-225486__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/31/09/29/apples-2023401__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/02/23/13/32/butterfly-4873368__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/11/07/11/01/succulent-1030745__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2011/07/26/06/34/iguana-8366__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/19/13/21/savoy-4637421__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/09/16/01/32/parakeet-447710__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2012/03/04/00/36/baby-21971__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/01/14/07/cobweb-4445324__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/03/14/02/09/parrot-4054102__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/14/04/45/elephant-1822639__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2013/06/07/21/21/dragonfly-122811__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/03/15/18/35/pink-periwinkle-287959__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/13/07/beverage-1869722__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/05/18/13/07/poppy-347046__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/02/14/32/golf-2571830__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/02/14/31/golf-2571826__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/03/26/11/06/flowers-692433__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/18/09/25/waterfall-5312692__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/14/22/14/elsach-767590__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/24/03/54/plants-2004492__340.jpg"));



        rvAdapterDark = new RecyclerViewAdapter(itemsListDark,getContext());
        rvDark.setAdapter(rvAdapterDark);
//Black Dark

//Black Ice
        rvIce  = view.findViewById(R.id.rvIce);
        rvIce.setHasFixedSize(true);
        rvIce.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListIce = new ArrayList<>();
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/03/14/11/37/austria-4054679__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/17/16/06/cat-4701934__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/06/26/20/19/wallpaper-4301176__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/29/00/08/plant-3270955__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/02/23/20/51/ice-cream-4874622__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/24/07/12/winter-4716118__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/01/31/20/40/cold-3967896__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/28/08/33/wine-on-ice-2983080__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/23/16/46/lake-misurina-1927573__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/28/06/13/warren-falls-1935502__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/13/01/25/cocktail-3395101__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/12/01/19/40/garden-3850076__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/02/07/56/frost-4735170__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/31/05/36/diamond-5241356__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/07/12/16/brook-4909574__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/29/19/05/frozen-4981877__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2013/03/12/19/13/winter-93001__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/05/23/06/cocktail-5374799__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/12/17/32/casio-5164157__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/18/14/11/winter-1265060__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/07/31/17/20/green-2559127__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/06/04/37/plants-2588791__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/07/07/14/41/snow-2481632__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/29/12/14/soil-3272102__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/15/05/58/snow-4932529__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/07/12/15/brook-4909568__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/17/13/23/landscape-1913436__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/12/01/19/44/garden-3850083__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/16/20/09/forest-1096492__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/10/24/00/49/flower-2883157__340.jpg"));


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