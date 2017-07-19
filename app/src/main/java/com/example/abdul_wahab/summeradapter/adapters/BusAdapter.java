package com.example.abdul_wahab.summeradapter.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.abdul_wahab.summeradapter.R;
import com.example.abdul_wahab.summeradapter.models.Bus;

import java.util.List;

/**
 * Created by Abdul-Wahab on 7/19/2017.
 */

public class BusAdapter extends ArrayAdapter<Bus> {
    public BusAdapter(Context context, List<Bus> buses) {
        super(context, R.layout.bus_item_list_layout, buses);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // View v = super.getView(position, convertView, parent);
        View v = convertView;
        TextView txt1;
        TextView txt2;


        BusViewHolder busViewHolder;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.bus_item_list_layout, null);
            txt1 = (TextView) v.findViewById(R.id.txtBusId);
            txt2 = (TextView) v.findViewById(R.id.txtModel);
            busViewHolder = new BusViewHolder(txt1,txt2);
            v.setTag(busViewHolder);
        }

        Bus b = getItem(position);

        busViewHolder = (BusViewHolder) v.getTag();


        busViewHolder.txt1.setText("Bus Id => " + b.getId());
        busViewHolder.txt2.setText("Bus Model => " + b.getModelno());


        return v;
    }

    class BusViewHolder {
        TextView txt1;
        TextView txt2;
        RatingBar rb;

        public BusViewHolder(TextView txt1, TextView txt2) {
            this.txt1 = txt1;
            this.txt2 = txt2;
        }
    }

}
