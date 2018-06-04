package com.example.annis.crudmhs.adapter;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.annis.crudmhs.R;
import com.example.annis.crudmhs.modal.Mahasiswa;
import com.example.annis.crudmhs.modal.MahasiswiResult;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

/**
 * Created by annis on 21/05/2018.
 */

    public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {
    Context context;
        public MahasiswaAdapter(@NonNull Context context,
                                int resource,
                                @NonNull List<Mahasiswa> objects) {
            super(context, resource, objects);
        }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_mahasiswa, parent, false);
        }
        Mahasiswa user = getItem(position);

        TextView tvNama = convertView.findViewById(R.id.tv_nama);
        tvNama.setText(user.getNama());

        TextView tvNim = convertView.findViewById(R.id.tv_nim);
        tvNim.setText(user.getNim());

        TextView tvEmail = convertView.findViewById(R.id.tv_email);
        tvEmail.setText(user.getEmail());

        ImageView iv = convertView.findViewById(R.id.iv_foto);
        Picasso.with(context).load(user.getFoto()).resize(100, 100).placeholder(R.mipmap.ic_launcher).into(iv);

        return convertView;
    }
}
