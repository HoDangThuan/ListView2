package com.example.lenovo.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBaiHat;
    ArrayList<BaiHat> arrayBaiHat;
    AdapterBaiHat adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter=new AdapterBaiHat(this,R.layout.line_bai_hat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
    }

    private void AnhXa() {
        lvBaiHat = (ListView) findViewById(R.id.listViewBaiHat);
        arrayBaiHat = new ArrayList<>();

        arrayBaiHat.add(new BaiHat(R.drawable.labonita,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "La Isla Bonita", "Alizée Jacotey", "8657", "2654", "126" ));
        arrayBaiHat.add(new BaiHat(R.drawable.chacaidoseve,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Chắc ai đó sẽ về", "Sơn Tùng M-TP", "6245", "687", "365" ));
        arrayBaiHat.add(new BaiHat(R.drawable.congaicoquyendieu,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Con gái có quyền điệu", "Hari Won", "7812", "3542", "268" ));
        arrayBaiHat.add(new BaiHat(R.drawable.conbuomxuan,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Con bướm xuân", "Hồ Quang Hiếu", "5984", "426", "56" ));
        arrayBaiHat.add(new BaiHat(R.drawable.amthambenem,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Âm thầm bên em", "Sơn Tùng M-TP", "2654", "24", "365" ));
        arrayBaiHat.add(new BaiHat(R.drawable.timem,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Tìm em", "Hồ Quang Hiếu", "5684", "1258", "265" ));


        arrayBaiHat.add(new BaiHat(R.drawable.labonita,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "La Isla Bonita", "Alizée Jacotey", "8657", "2654", "126" ));
        arrayBaiHat.add(new BaiHat(R.drawable.chacaidoseve,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Chắc ai đó sẽ về", "Sơn Tùng M-TP", "6245", "687", "365" ));
        arrayBaiHat.add(new BaiHat(R.drawable.congaicoquyendieu,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Con gái có quyền điệu", "Hari Won", "7812", "3542", "268" ));
        arrayBaiHat.add(new BaiHat(R.drawable.conbuomxuan,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Con bướm xuân", "Hồ Quang Hiếu", "5984", "426", "56" ));
        arrayBaiHat.add(new BaiHat(R.drawable.amthambenem,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Âm thầm bên em", "Sơn Tùng M-TP", "2654", "24", "365" ));
        arrayBaiHat.add(new BaiHat(R.drawable.timem,R.drawable.eye,R.drawable.like,R.drawable.dislike,
                "Tìm em", "Hồ Quang Hiếu", "5684", "1258", "265" ));

    }
}
