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

public class ThreeDFragment extends Fragment {

    private TabHost th;
    private RecyclerView rvSmoke,rvDark,rvIce;
    private RecyclerViewAdapter rvAdapterSmoke,rvAdapterDark,rvAdapterIce;
    private List<CustomItems> itemsListSmoke,itemsListDark,itemsListIce;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three_d,container,false);

        th = view.findViewById(R.id.tabHost);
        th.setup();

        TabHost.TabSpec spec = th.newTabSpec("One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Joker");
        th.addTab(spec);

        spec = th.newTabSpec("Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Sexy");
        th.addTab(spec);

        spec = th.newTabSpec("Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Hero");
        th.addTab(spec);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(String.valueOf(new MainActivity()));

// Black Smoke
        rvSmoke  = view.findViewById(R.id.rvSmoke);
        rvSmoke.setHasFixedSize(true);
        rvSmoke.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListSmoke = new ArrayList<>();
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/13/22/47/joker-1822273__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/23/12/03/clown-4787558__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/19/23/01/woman-3166499__340.png"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/09/21/12/sci-fi-3142476__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/08/20/54/woman-3070287__340.png"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/28/20/17/man-5350603__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/06/23/17/toys-2378839__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/23/11/36/visuals-3625780__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/07/20/53/man-4680107__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/22/16/56/art-2431529__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/24/11/15/abstract-4963688__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/11/22/48/sphere-5288533__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/05/14/30/mosaic-4743307__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/24/11/15/abstract-4963689__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/06/02/12/59/letter-a-1431090__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/24/11/15/abstract-4963682__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/24/22/16/woman-3179371__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/20/10/44/joker-4491449__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/15/03/34/joker-5300203__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/28/20/18/woman-5350607__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/12/03/14/57/lamp-3853585__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/25/10/40/love-4966820__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2014/04/05/11/30/kids-316027__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/14/14/18/horse-1979572__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/03/16/41/don-quixote-2711075__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/02/23/11/23/fox-4873069__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/08/16/30/marilyn-monroe-2384020__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/17/13/03/caricature-1831516__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/21/19/30/woman-5202278__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/02/22/12/02/young-4013411__340.jpg"));



        rvAdapterSmoke = new RecyclerViewAdapter(itemsListSmoke,getContext());
        rvSmoke.setAdapter(rvAdapterSmoke);
//Black Smoke

//Black Dark
        rvDark  = view.findViewById(R.id.rvDark);
        rvDark.setHasFixedSize(true);
        rvDark.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListDark = new ArrayList<>();
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/12/24/02/05/woman-1928264__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/07/11/00/28/model-1508864__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/12/23/10/ragged-dress-1736266__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/09/02/11/01/sexy-918268__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/10/05/59/girl-1968411__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/27/08/12/woman-786095__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/04/08/05/16/sports-2212523__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/26/01/29/model-3039461__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/12/23/57/sports-1736400__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/02/25/06/39/girl-2097002__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/01/18/03/sports-1708051__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/09/01/adult-1868574__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/20/08/36/woman-1754895__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/17/10/15/model-2411750__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/26/23/07/person-1281777__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/29/09/32/pole-dance-1287822__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/01/03/23/38/glamor-238302__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/30/08/57/people-3049562__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/26/17/46/lady-2789481__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/27/13/43/adult-2178816__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/24/18/06/girl-2677777__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/08/27/15/15/model-429242__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/19/18/52/underwear-2157358__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2013/04/03/06/51/lingerie-99761__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/07/30/20/37/woman-2555564__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/01/10/21/02/girl-1970238__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/10/02/07/12/woman-2808070__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/31/17/06/woman-3052777__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/11/27/20/52/tron-1066397__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/25/03/08/photo-session-in-the-body-1767770__340.jpg"));


        rvAdapterDark = new RecyclerViewAdapter(itemsListDark,getContext());
        rvDark.setAdapter(rvAdapterDark);
//Black Dark

//Black Ice
        rvIce  = view.findViewById(R.id.rvIce);
        rvIce.setHasFixedSize(true);
        rvIce.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListIce = new ArrayList<>();
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/05/16/16/50/man-4207514__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/15/16/42/batman-5174224__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/06/26/00/05/sentinel-377523__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/11/14/22/00/spiderman-1043735__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/09/11/31/man-4683311__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/05/03/46/woman-3291814__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/19/07/28/batman-4946610__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/31/12/24/man-5532334__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/08/11/21/29/michael-jackson-885230__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/15/18/09/ninja-2753004__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2014/10/20/13/18/statue-495270__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/29/16/19/victorian-5448351__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/08/23/09/bat-girl-2730558__340.png"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/17/04/03/woman-3407770__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/28/00/02/daredevil-2688078__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/11/14/21/31/ironman-1043700__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/16/06/43/cosplay-4553587__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/05/19/04/portrait-3293849__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/25/22/28/wonder-woman-2442192__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/29/16/18/victorian-5448349__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/31/07/37/cosmos-4807356__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/16/21/19/mens-4555477__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/29/23/51/wolf-5449078__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/04/09/19/52/superhero-715020__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/28/03/36/fire-2982778__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/07/24/08/51/door-4359548__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/06/09/08/44/superhero-5277616__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/18/08/37/woman-5185214__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/27/13/12/leaves-3042644__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/06/13/05/spiderman-3378544__340.jpg"));



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