package com.example.nui_Pertemuan5_ListView;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nui_pertemuan5.R;
import com.example.nui_pertemuan5.databinding.ActivityBuahBinding;

public class BuahActivity extends AppCompatActivity {

    ActivityBuahBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBuahBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null) {
            String nama_buah = intent.getStringExtra("nama_buah");
            String kandungan = intent.getStringExtra("kandungan");
            String manfaat = intent.getStringExtra("manfaat");
            int gbrid = intent.getIntExtra("gbrid", R.drawable.jeruk);

            binding.namaBuah.setText(nama_buah);
            binding.kandungan.setText(kandungan);
            binding.manfaat.setText(manfaat);
            binding.profileImage.setImageResource(gbrid);

        }

    }

}
