package com.rizieq.galleryfoto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter{

    //Deklarasi variable penampung
    Context context;
    String[] judul;
    String[] keterangan;
    int[] gambar;

    // membuat constructor
    public ViewPagerAdapter(Context context, String[] judul,String[] keterangan , int[] gambar){
        //body constructor
        this.context = context;
        this.judul = judul;
        this.keterangan = keterangan;
        this.gambar = gambar;

    }
    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ScrollView) o; // casting dari o atau o mendefinisikan ScrollView
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.galeri_item,container,false);

        // inisialisasi widget yang ada di layout galeri item
        TextView tvJudul = view.findViewById(R.id.tv_judul);
        TextView tvKeterangan = view.findViewById(R.id.tv_keterangan);
        ImageView imgKeterangan = view.findViewById(R.id.img_item);

        tvJudul.setText(judul[position]);
        tvKeterangan.setText(keterangan[position]);
        imgKeterangan.setImageResource(gambar[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ScrollView)object);
    }
}
