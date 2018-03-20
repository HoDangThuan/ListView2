package com.example.lenovo.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo on 07-Mar-18.
 */

public class AdapterBaiHat extends BaseAdapter{
    private Context context;
    private int layout;
    private List<BaiHat> listBaiHat;

    public AdapterBaiHat(Context context, int layout, List<BaiHat> listBaiHat) {
        this.context = context;
        this.layout = layout;
        this.listBaiHat = listBaiHat;
    }

    @Override
    public int getCount() {
        return listBaiHat.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);

        // ánh xạ convertView
        ImageView img_Song= (ImageView) convertView.findViewById(R.id.imageViewSong);
        ImageView img_Eye= (ImageView) convertView.findViewById(R.id.imageViewEye);
        ImageView img_Like= (ImageView) convertView.findViewById(R.id.imageViewLike);
        ImageView img_DisLike= (ImageView) convertView.findViewById(R.id.imageViewDisLike);
        TextView txtNameSong= (TextView) convertView.findViewById(R.id.txtViewNameSong);
        TextView txtNameSinger= (TextView) convertView.findViewById(R.id.txtViewNameSinger);
        TextView txtnumberOfView= (TextView) convertView.findViewById(R.id.txtViewNumberOfView);
        TextView txtnumberOfLike= (TextView) convertView.findViewById(R.id.txtViewNumberOfLike);
        TextView txtnumberOfDisLike= (TextView) convertView.findViewById(R.id.txtViewNumberOfDisLike);

        // gán giá trị
        BaiHat baiHat=listBaiHat.get(position);
        img_Song.setImageResource(baiHat.getImgSong());
        img_Eye.setImageResource(baiHat.getImgEye());
        img_Like.setImageResource(baiHat.getImgLike());
        img_DisLike.setImageResource(baiHat.getImgDisLike());
        txtNameSong.setText(baiHat.getNameSong());
        txtNameSinger.setText(baiHat.getNameSinger());
        txtnumberOfView.setText(baiHat.getNumberOfView());
        txtnumberOfLike.setText(baiHat.getNumberOfLike());
        txtnumberOfDisLike.setText(baiHat.getNumberOfDisLike());

        return convertView;
    }
}
