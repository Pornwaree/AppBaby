package com.example.appbaby.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import com.example.appbaby.R;
import com.example.appbaby.model.app;


public class AppListAdapter extends ArrayAdapter<app> {

    private Context mContext;
    private int mResource;
    private List<app> mAppList;

    public AppListAdapter(@NonNull Context context, int resource, @NonNull List<app> appList) {
        super(context, resource, appList);
        this.mContext = context;
        this.mResource = resource;
        this.mAppList = appList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // ทำการ Inflate layout
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = convertView;
        if (v == null) {
            v = inflater.inflate(mResource, parent, false);
        }

        // เข้าถึงออบเจ็ค app ตาม position ที่ ListView ขอมา
        app app = mAppList.get(position);

        // กำหนดชื่อสถานที่ลงใน TextView (place_name_text_view)
        TextView placeNameTextView = v.findViewById(R.id.category_name_text_view);
        placeNameTextView.setText(app.category);

        // กำหนดชื่ออำเภอลงใน TextView (district_text_view)
        TextView districtTextView = v.findViewById(R.id.description_text_view);
        districtTextView.setText("รายละเอียด".concat(app.district));

        ImageView logoImageView = v.findViewById(R.id.logo_image_view);
        logoImageView.setImageResource(app.imageRes);

        return v;
    }
}








