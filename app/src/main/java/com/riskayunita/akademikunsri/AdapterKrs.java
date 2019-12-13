package com.riskayunita.akademikunsri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.riskayunita.akademikunsri.response.KrsItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

class AdapterKrs extends RecyclerView.Adapter<AdapterKrs.KrsHolder>{

        List<KrsItem> KrsItemList;
        Context mContext;

    public AdapterKrs(Context context, List<KrsItem> krsList){
            this.mContext = context;
            KrsItemList = krsList;
            }

    @Override
    public KrsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_krsitem, parent, false);
            return new KrsHolder(itemView);
            }

    @Override
    public void onBindViewHolder(KrsHolder holder, int position) {
        final KrsItem krsItem = KrsItemList.get(position);
            holder.no.setText(krsItem.getNo());
            holder.kode_mk.setText(krsItem.getKode());
            holder.matakuliah.setText(krsItem.getMatakuliah());
            holder.sks.setText(krsItem.getSks());
    }

    @Override
    public int getItemCount() { return KrsItemList.size(); }

    public class KrsHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.no)
        TextView no;
        @BindView(R.id.kode_mk)
        TextView kode_mk;
        @BindView(R.id.matakuliah)
        TextView matakuliah;
        @BindView(R.id.sks)
        TextView sks;

        public KrsHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}