package com.riskayunita.akademikunsri;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.riskayunita.akademikunsri.network.ApiServices;
import com.riskayunita.akademikunsri.network.UtilsApi;
import com.riskayunita.akademikunsri.response.KrsItem;
import com.riskayunita.akademikunsri.response.ResponseKrs;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class List_krs extends AppCompatActivity {

    @BindView(R.id.listKrs)
    RecyclerView listKrs;
    ProgressDialog loading;

    Context mContext;
    List<KrsItem> KrsItemList= new ArrayList<>();
    AdapterKrs adapterKrs;
    ApiServices mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listrecycle);

        getSupportActionBar().setTitle("KRS");

        ButterKnife.bind(this);
        mContext = this;
        mApiService = UtilsApi.getAPIService();

        adapterKrs = new AdapterKrs(this, KrsItemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        listKrs.setLayoutManager(mLayoutManager);
        listKrs.setItemAnimator(new DefaultItemAnimator());

        getResultListKrs();
    }

    private void getResultListKrs(){
        loading = ProgressDialog.show(this, null, "Harap Tunggu...", true, false);

        mApiService.getKrs().enqueue(new Callback<ResponseKrs>() {
            @Override
            public void onResponse(Call<ResponseKrs> call, Response<ResponseKrs> response) {
                if (response.isSuccessful()){
                    loading.dismiss();

                    final List<KrsItem> krsItems = response.body().getKrs();

                    listKrs.setAdapter(new AdapterKrs(mContext, krsItems));
                    adapterKrs.notifyDataSetChanged();
                } else {
                    loading.dismiss();
                    Toast.makeText(mContext, "Gagal mengambil data krs", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseKrs> call, Throwable t) {
                loading.dismiss();
                Toast.makeText(mContext, "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}