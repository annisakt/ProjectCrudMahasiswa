package com.example.annis.crudmhs;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.annis.crudmhs.adapter.MahasiswaAdapter;
import com.example.annis.crudmhs.modal.Mahasiswa;
import com.example.annis.crudmhs.modal.MahasiswiResult;
import com.example.annis.crudmhs.network.ApiClient;
import com.example.annis.crudmhs.network.MahasiswaService;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 1. Menyiapkan sumber data
        // 1. a. Array string 1 dimensi
        //   Load gambar;

        ImageView ivCobaGambar = (ImageView) findViewById(R.id.iv_coba_gambar);
        Picasso.with(this)
                .load("https://picsum.photos/200/300?random")
                .into(ivCobaGambar);

        //String[] user = new String[]{"Annisa", "Kusuma","ning", "tyas"};

        // 1. b POJO

//        Mahasiswa mahasiswa1 = new Mahasiswa();
//        mahasiswa1.setNama("Annisa");
//        mahasiswa1.setNim("2.2.2");
//        mahasiswa1.setEmail("annisa@oke.com");
//        mahasiswa1.setFoto("https://picsum.photos/200/300?random");
//
//        Mahasiswa mahasiswa2 = new Mahasiswa();
//        mahasiswa2.setNama("Ica");
//        mahasiswa2.setNim("2.2.1");
//        mahasiswa2.setEmail("annisa@oke.com");
//        mahasiswa2.setFoto("https://picsum.photos/200/300?random");
//
//        Mahasiswa mahasiswa3 = new Mahasiswa();
//        mahasiswa3.setNama("Ana");
//        mahasiswa3.setNim("5.2.2");
//        mahasiswa3.setEmail("annisa@oke.com");
//        mahasiswa3.setFoto("https://picsum.photos/200/300?random");
//
//        ArrayList<Mahasiswa> user = new ArrayList<>();
//        user.add(mahasiswa1);
//        user.add(mahasiswa2);
//        user.add(mahasiswa3);

        // 1.c. Sumber data API (172.16.136.81)
        // Retrofit
        MahasiswaService mService = ApiClient.getmRetrofit().create(MahasiswaService.class);
        Call<MahasiswiResult> mahasiswis = mService.getMahasiswi();
        mahasiswis.enqueue(new Callback<MahasiswiResult>() {
            @Override
            public void onResponse(Call<MahasiswiResult> call, Response<MahasiswiResult> response) {
//               response.body().getMahasiswi();

                Toast.makeText(getApplicationContext(),
                        "Jumlah Mahasiswa :" + response.body().getMahasiswi().size(),
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<MahasiswiResult> call, Throwable t) {

            }
        });

    }

    private void tampilkan(List<Mahasiswa> mahasiswas){
        // 2. Menyiapkan Adapter

        MahasiswaAdapter userAdapter = new MahasiswaAdapter(this, 0, mahasiswas);


        // 3. Tampilan Aplikasi
        ListView lvUser = (ListView) findViewById(R.id.lv_user);
        lvUser.setAdapter(userAdapter);
    }
}


//
//
//     // 2. Menyiapkan Adapter
//         //  ArrayAdapter<String> userAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, user);
//        MahasiswaAdapter userAdapter = new MahasiswaAdapter(this, 0, mahasiswis);
//
//    // 3. Tampilan Aplikasi
//        //Inisialisasi
//        ListView lvUser = (ListView) findViewById(R.id.lv_user) ;
//        // panggil user adapter
//        lvUser.setAdapter(userAdapter);
//    }
//}
