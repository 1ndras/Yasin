package com.indra_act.yasin;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import com.indra_act.yasin.tab.Fragment10;
import com.indra_act.yasin.tab.Fragment11;
import com.indra_act.yasin.tab.Fragment12;
import com.indra_act.yasin.tab.Fragment13;
import com.indra_act.yasin.tab.Fragment14;
import com.indra_act.yasin.tab.Fragment15;
import com.indra_act.yasin.tab.Fragment16;
import com.indra_act.yasin.tab.Fragment17;
import com.indra_act.yasin.tab.Fragment18;
import com.indra_act.yasin.tab.Fragment19;
import com.indra_act.yasin.tab.Fragment20;
import com.indra_act.yasin.tab.Fragment21;
import com.indra_act.yasin.tab.Fragment22;
import com.indra_act.yasin.tab.Fragment23;
import com.indra_act.yasin.tab.Fragment24;
import com.indra_act.yasin.tab.Fragment25;
import com.indra_act.yasin.tab.Fragment26;
import com.indra_act.yasin.tab.Fragment27;
import com.indra_act.yasin.tab.Fragment28;
import com.indra_act.yasin.tab.Fragment29;
import com.indra_act.yasin.tab.Fragment30;
import com.indra_act.yasin.tab.Fragment31;
import com.indra_act.yasin.tab.Fragment32;
import com.indra_act.yasin.tab.Fragment33;
import com.indra_act.yasin.tab.Fragment34;
import com.indra_act.yasin.tab.Fragment35;
import com.indra_act.yasin.tab.Fragment36;
import com.indra_act.yasin.tab.Fragment37;
import com.indra_act.yasin.tab.Fragment38;
import com.indra_act.yasin.tab.Fragment39;
import com.indra_act.yasin.tab.Fragment40;
import com.indra_act.yasin.tab.Fragment41;
import com.indra_act.yasin.tab.Fragment42;
import com.indra_act.yasin.tab.Fragment5;
import com.indra_act.yasin.tab.Fragment7;
import com.indra_act.yasin.tab.Fragment8;
import com.indra_act.yasin.tab.Fragment9;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.indra_act.yasin.tab.Fragment1;
import com.indra_act.yasin.tab.Fragment2;
import com.indra_act.yasin.tab.Fragment3;
import com.indra_act.yasin.tab.Fragment4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        SmartTabLayout sTabLayout = (SmartTabLayout) findViewById(R.id.viewPagerTab);
        ViewPager vPager = (ViewPager) findViewById(R.id.viewPager);

        FragmentPagerItems pages = new FragmentPagerItems(this);
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab1), Fragment1.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab2), Fragment2.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab3), Fragment3.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab4), Fragment4.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab5), Fragment5.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab7), Fragment7.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab8), Fragment8.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab9), Fragment9.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab10), Fragment10.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab11), Fragment11.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab12), Fragment12.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab13), Fragment13.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab14), Fragment14.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab15), Fragment15.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab16), Fragment16.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab17), Fragment17.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab18), Fragment18.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab19), Fragment19.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab20), Fragment20.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab21), Fragment21.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab22), Fragment22.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab23), Fragment23.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab24), Fragment24.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab25), Fragment25.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab26), Fragment26.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab27), Fragment27.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab28), Fragment28.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab29), Fragment29.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab30), Fragment30.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab31), Fragment31.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab32), Fragment32.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab33), Fragment33.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab34), Fragment34.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab35), Fragment35.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab36), Fragment36.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab37), Fragment37.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab38), Fragment38.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab39), Fragment39.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab40), Fragment40.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab41), Fragment41.class));
        pages.add(FragmentPagerItem.of(getResources().getString(R.string.Tab42), Fragment42.class));

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(), pages);
        vPager.setAdapter(adapter);
        sTabLayout.setViewPager(vPager);

    }
}
