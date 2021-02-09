package com.rizieq.galleryfoto;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerAdapter adapter;
    private String[] judulArray = {"Alpukat", "Apel", "Ceri", "Durian", "Jambuair", "Manggis", "Strawberry"};
    private String[] keteranganArray = {"Alpukat ini manis", "Apel ini manis", "Ceri ini pahit", "Durian itu busuk", "Jambu air itu manis", "Manggis itu asam", "Strawberry itu pahit"};
    private int[] imgArray = {R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.durian, R.drawable.jambuair, R.drawable.manggis, R.drawable.strawberry};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.vp_main);
        adapter = new ViewPagerAdapter(getApplicationContext(), judulArray, keteranganArray, imgArray);
        viewPager.setAdapter(adapter);


    }
}
