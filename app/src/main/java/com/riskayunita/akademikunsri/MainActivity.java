package com.riskayunita.akademikunsri;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            final int commit = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new home()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new home();
                            break;
                        case R.id.nav_help:
                            selectedFragment = new bantuan();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    public void dtpribadi(View view) {
        Intent intent = new Intent(this, List_dtPribadi.class);
        startActivity(intent);
    }
    public void khs(View view) {
        Intent intent = new Intent(this, KHS.class);
        startActivity(intent);
    }
    public void inkrs(View view) {
        Intent intent = new Intent(this, KRS.class);
        startActivity(intent);
    }
    public void transkrip(View view) {
        Intent intent = new Intent(this, Transkrip.class);
        startActivity(intent);
    }

    public void suliet(View view) {
        Intent intent = new Intent(this, suliet.class);
        startActivity(intent);
    }

    public void kkn(View view) {
        Intent intent = new Intent(this, kkn.class);
        startActivity(intent);
    }
    public void dialPhoneNumber1(View view) {
        String phoneNumber = getString(R.string.telp1);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void dialPhoneNumber2(View view) {
        String phoneNumber = getString(R.string.telp2);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void dialPhoneNumber3(View view) {
        String phoneNumber = getString(R.string.telp3);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void composeEmail(View view) {

        String addresses = getString(R.string.email);
        String nama = getString(R.string.nama);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Kepada "+nama);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public  void web(View view){
        String url = "http://ilkom.unsri.ac.id";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
