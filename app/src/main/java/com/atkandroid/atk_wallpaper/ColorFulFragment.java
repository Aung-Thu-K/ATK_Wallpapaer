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

public class ColorFulFragment extends Fragment {

    private TabHost th;
    private RecyclerView rvSmoke,rvDark,rvIce;
    private RecyclerViewAdapter rvAdapterSmoke,rvAdapterDark,rvAdapterIce;
    private List<CustomItems> itemsListSmoke,itemsListDark,itemsListIce;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color_ful,container,false);

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
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/04/16/17/06/color-4132228__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/22/18/08/coffee-5509061__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/09/01/22/49/wallpaper-3647834__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2013/02/08/21/40/rocket-79468__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/02/22/19/02/smoke-2090319__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2010/12/16/14/45/fireworks-3597__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/29/22/41/woman-5236950__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/20/16/29/person-5423552__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/03/28/09/53/fireworks-1285265__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/06/15/34/halloween-4677617__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/10/22/20/hookah-1730049__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/06/04/15/smoke-3202522__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/04/26/18/16/floral-5096532__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/06/15/33/halloween-4677612__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/06/15/34/halloween-4677615__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/09/18/22/smoke-2130452__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/12/12/12/50/portrait-3870764__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/09/18/22/smoke-2130453__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/22/21/07/leaves-779812__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2015/05/22/21/08/pods-779816__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/23/14/33/fireworks-5209888__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/09/22/21/24/pop-art-2777104__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/09/18/22/smoke-2130454__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/10/12/03/14/man-3741356__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2020/02/20/05/34/smoke-4863970__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2016/08/08/22/10/fire-1579410__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/11/03/04/57/smoke-4597844__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/29/09/39/smoke-4512729__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2018/02/12/13/05/train-3148286__340.jpg"));
        itemsListSmoke.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/09/18/22/smoke-2130455__340.jpg"));


        rvAdapterSmoke = new RecyclerViewAdapter(itemsListSmoke,getContext());
        rvSmoke.setAdapter(rvAdapterSmoke);
//Black Smoke

//Black Dark
        rvDark  = view.findViewById(R.id.rvDark);
        rvDark.setHasFixedSize(true);
        rvDark.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListDark = new ArrayList<>();
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/21/20/22/background-3339415__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/04/10/19/07/flame-3308418__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/13/11/49/fire-4403243__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/06/28/00/17/umbrella-4303278__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/06/16/30/plants-5377557__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/28/07/11/princess-2449970__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/07/28/15/26/road-403752__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2016/11/29/06/33/beautiful-1867821__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/03/28/11/58/abstract-2181884__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/11/26/21/48/apple-2980040__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/12/10/09/26/silence-3009481__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2014/10/26/17/27/pumpkins-504120__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/09/24/23/06/european-starling-956454__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/03/19/13/colorful-2577956__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2015/10/03/22/02/dish-970448__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/08/22/16/28/man-5508814__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/15/11/34/woman-3607840__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/25/17/41/peacock-feather-4792997__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/05/16/21/18/clown-3407105__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/23/19/15/nature-3254638__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/14/07/17/girl-4694342__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/01/18/09/15/wallpaper-3089859__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2018/03/17/14/30/portrait-3234191__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/23/19/38/magical-4572646__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/22/09/58/magic-4495623__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/02/17/13/skull-4736348__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/20/16/29/person-5423552__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2020/04/05/14/45/yellow-5006436__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/06/10/48/colorful-2591200__340.jpg"));
        itemsListDark.add(new CustomItems("https://cdn.pixabay.com/photo/2017/07/12/18/55/forest-2497867__340.jpg"));



        rvAdapterDark = new RecyclerViewAdapter(itemsListDark,getContext());
        rvDark.setAdapter(rvAdapterDark);
//Black Dark

//Black Ice
        rvIce  = view.findViewById(R.id.rvIce);
        rvIce.setHasFixedSize(true);
        rvIce.setLayoutManager(new GridLayoutManager(getContext(),2));

        itemsListIce = new ArrayList<>();
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/07/28/13/44/avocado-5445123__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/24/08/26/orange-4716192__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/20/21/05/flower-2424805__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/01/20/22/33/aurora-4781587__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/08/19/02/corneille-4535828__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2018/08/16/13/25/young-3610431__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2012/07/09/12/04/colorful-52106__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/12/19/20/34/love-1100261__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/21/06/12/neon-4709756__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/02/08/19/18/light-1187306__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/15/16/47/night-1142025__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2015/01/09/17/36/balloon-594628__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/21/06/13/neon-4709764__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/05/28/15/21/portrait-5231509__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2013/07/26/17/31/lathyrus-tuberosus-167900__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/25/17/39/night-photograph-4577519__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/09/07/18/23/way-4459455__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/10/07/00/58/autumn-1720437__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/08/21/02/32/light-4419996__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2016/01/18/13/57/fungus-1146588__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/04/15/11/35/abstract-5046285__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/12/21/06/12/neon-4709761__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/06/09/21/32/stormtrooper-2388295__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/20/18/02/the-dark-4951491__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/20/17/27/the-dark-4951360__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/24/17/14/nature-4964740__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/10/17/03/07/sunset-2859371__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2019/10/23/10/50/silhouette-4571213__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2020/03/20/17/22/the-dark-4951339__340.jpg"));
        itemsListIce.add(new CustomItems("https://cdn.pixabay.com/photo/2017/08/06/08/04/night-2590110__340.jpg"));



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