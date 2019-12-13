package com.riskayunita.akademikunsri;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PribadiAdapter extends BaseAdapter {
    TextView judul, ktr, tnda;
    String[][] data;
    Activity activity;

    public PribadiAdapter(Activity activity, String[][] data) {
        super();
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(activity);
            v = vi.inflate(R.layout.activity_data_pribadi, null);
        }

        Object p = getItem(position);

        if (p != null) {
            judul = (TextView) v.findViewById(R.id.judul);
            tnda = (TextView) v.findViewById(R.id.tnd);
            ktr = (TextView) v.findViewById(R.id.keterangan);

            judul.setText(data[position][0]);
            tnda.setText(data[position][1]);
            ktr.setText(data[position][2]);
        }

        return v;
    }
}