package com.riskayunita.akademikunsri;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class List_dtPribadi extends AppCompatActivity {
    ListView list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        list_view = (ListView) findViewById(R.id.list_view);

        String[][] dataPribadis = new String[][]{
                {"No. Induk Mahasiswa", ":", "09031381722141"},
                {"Nama Mahasiswa", ":", "RiskaYunita"},
                {"Angkatan", ":", "2017"},
                {"Dosen Pembimbing", ":", "Ali Bardadi, S.SI., M.KOM"},
                {"Tempat Lahir", ":", "Palembang"},
                {"Tanggal Lahir", ":", "09 Januari 2000"},
                {"Jenis Kelamin", ":", "Perempuan"},
                {"Agama", ":", "Islam"},
                {"Kewarganegaraan", ":", "WNI"},
                {"Golongan Darah", ":", "O"},
                {"Jumlah Adik(Laki-laki)", ":", "0 Orangg"},
                {"Jumlah Adik(Perempuan) ", ":", "0 Orang"},
                {"Jumlah Kakak(Laki-laki)", ":", "1 Orang"},
                {"Jumlah Kakak(Perempuan)", ":", "2 Orang"},
                {"Pekerjaan", ":", "Belum Bekerja"},
                {"Asal SLTA", ":", "SMA Negeri 19 Palembang"}
        };

        PribadiAdapter adapter = new PribadiAdapter(List_dtPribadi.this, dataPribadis);
        list_view.setAdapter(adapter);
    }
}