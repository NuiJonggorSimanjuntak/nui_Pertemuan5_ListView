package com.example.nui_Pertemuan5_ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.nui_pertemuan5.R;
import com.example.nui_pertemuan5.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] gbrId = {R.drawable.jeruk, R.drawable.cherry, R.drawable.banana, R.drawable.apple, R.drawable.kiwi, R.drawable.pear, R.drawable.strawberry, R.drawable.lemon, R.drawable.peach, R.drawable.apricot, R.drawable.mango};

        String[] namaBuah = {"Orange", "Cherry", "Banana", "Apple", "Kiwi", "Pear", "Strawberry", "Lemon", "Peach", "Apricot", "Mango"};

        String[] kaloriBuah = {"47 Calories", "50 Calories", "89 Calories", "52 Calories", "61 Calories", "57 Calories", "33 Calories", "29 Calories", "39 Calories", "48 Calories", "60 Calories"};

        String[] kandunganBuah = {
                        "Kandungan vitamin C dan anti oksidan, yang meningkatkan sistem kekebalan tubuh dan membantu melawan infeksi dan flu",
                        "Kandungan Buah ini banyak mengandung nutrisi, seperti vitamin C, kalium, serat, vitamin B, vitamin K, dan magnesium. Selain itu, buah ceri juga kaya akan senyawa aktif yang bersifat antioksidan dan antiradang",
                        "Kandungan Vitamin A, C, dan B6 yang terdapat pada buah pisang berfungsi untuk meningkatkan kekebalan tubuh dalam melawan infeksi",
                        "Kandungan tinggi vitamin C yang merupakan sumber antioksidan alami untuk menjaga daya tahan tubuh. Antioksidan ini mampu mencegah kerusakan sel akibat radikal bebas. Selain itu, vitamin C dalam buah apel juga berguna untuk meningkatkan daya tahan tubuh dalam melawan infeksi, baik dari bakteri maupun virus",
                        "Kandungan Vitamin C pada buah kiwi juga bisa menjadi antioksidan yang berkhasiat untuk tubuh. Adapun kandungan lain pada buah ini, yaitu serat, vitamin A, vitamin K, kalsium, asam amino, dan folat",
                        "Kandungan banyak niacin dan folat yang berguna untuk meningkatkan energi tubuh. Buah pir juga mengandung banyak antioksidan yang berguna untuk melawan radikal bebas dalam tubuh",
                        "Kandungan Karbohidrat, Serat, Protein, Kalsium, Folat, Vitamin C, Vitamin B6",
                        "Kandungan Karbohidrat, protein, gula, serat, kalium, kalsium, dan berbagai vitamin seperti A, B6, C",
                        "Kandungan Kalori, Air, Serat, Kalsium, Fosfor, Magnesium, Kalium, dan Folat",
                        "Kandungan Protein, serat, Karbohidrat, magnesium, fosfor, zat besi",
                        "Kandungan Kalori, protein, karbohidrat, lemak, serat makanan, vitamin c, tembaga, dan folat"
                        };

        String[] manfaatBuah = {
                        "1. Melancarkan Pencernaan\n2. Mengatur Tekanan Darah Tinggi\n3. Mencegah Kanker\n4. Mencegah Penyakit Jantung\n5. Meningkatkan Kekebalan Tubuh\ndll",
                        "1. Melindungi tubuh dari radikal bebas\n2. Meningkatkan fungsi sistem kekebalan tubuh\n3. Mengurangi risiko hipertensi dan stroke\n4. Menjaga berat badan dan mengurangi risiko diabetes\n5. Melindungi tubuh dari peradangan\ndll",
                        "1. Membantu Atasi Hipertensi\n2. Pisang Perlancar Metabolisme\n3. Meningkatkan Kekebalan Tubuh\n4. Melancarkan Aliran Oksigen ke Otak\n5. Mengatasi Anemia\ndll",
                        "1. Melindungi Fungsi Jantung\n2. Menjaga Kesehatan Otak\n4. Perawatan Kulit yang Bagus\n3. Sifat Antiinflamasi\ndll",
                        "1. Meredakan asma\n2. Menjaga kesehatan pencernaan\n3. Meningkatkan daya tahan tubuh\ndll",
                        "1. Mencegah sembelit\n2. Berpotensi menurunkan risiko diabetes\n3. Membantu menjaga kesehatan tulang\ndll",
                        "1. Menjaga kesehatan mata\n2. Meningkatkan kekebalan tubuh\n3. Mencegah Kanker\ndll",
                        "1. Membantu melancarkan pencernaan\n2. Menjaga sistem imun\n3. Memelihara kesehatan jantung\ndll",
                        "1. Mengatasi dan mencegah berbagai penyakit kronis\n2. Menjaga kesehatan mata\n3. Meningkatkan daya tahan tubuh\ndll",
                        "1. Mencegah penyakit kronis\n2. Meningkatkan kesehatan mata\n3. Menguatkan tulang\ndll",
                        "1. Menurunkan risiko penyakit jantung\n2. Mencegah efek buruk radikal bebas\n3. Menjaga daya tahan tubuh\ndll"
                        };

        ArrayList<Buah> buahArrayList = new ArrayList<>();

        for (int i=0; i<gbrId.length; i++) {
            Buah buah = new Buah(namaBuah[i], kaloriBuah[i], kandunganBuah[i], manfaatBuah[i], gbrId[i]);
            buahArrayList.add(buah);
        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, buahArrayList);

        binding.listView.setAdapter(listAdapter);
        binding.listView.setClickable(true);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, BuahActivity.class);
                i.putExtra("nama_buah", namaBuah[position]);
                i.putExtra("kandungan", kandunganBuah[position]);
                i.putExtra("manfaat", manfaatBuah[position]);
                i.putExtra("gbrid", gbrId[position]);
                startActivity(i);

            }
        });

    }
}