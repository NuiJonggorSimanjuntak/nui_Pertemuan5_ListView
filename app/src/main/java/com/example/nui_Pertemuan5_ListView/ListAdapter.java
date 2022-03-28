package com.example.nui_Pertemuan5_ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.nui_pertemuan5.R;

public class ListAdapter extends ArrayAdapter<Buah> {
    public ListAdapter(Context context, ArrayList<Buah> buahArrayList) {
        super(context, R.layout.list_item, buahArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {

        Buah buah = getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        ImageView gambar = convertView.findViewById(R.id.gambar_buah);
        TextView nama_Buah = convertView.findViewById(R.id.nama_buah);
        TextView kalori_Buah = convertView.findViewById(R.id.jumlah_kalori);

        gambar.setImageResource(buah.gbrId);
        nama_Buah.setText(buah.namaBuah);
        kalori_Buah.setText(buah.kaloriBuah);

        return convertView;
    }

}
