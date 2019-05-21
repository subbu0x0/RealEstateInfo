package com.evolet.realestateinfo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    ArrayList<String> items = new ArrayList<>();
    Context c;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<String> objects) {
        super(context, resource, objects);
        items = objects;
        c = context;
    }
    @Override
    public int getCount() {
        return super.getCount();
    }
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_item, null);
        TextView textView = v.findViewById(R.id.pname);
        ImageView iv = v.findViewById(R.id.remove);
        iv.setImageResource(R.drawable.cross);
        textView.setText(items.get(position));
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                items.remove(position);
                notifyDataSetChanged();
            }
        });
        return v;

    }
}

/*.......................*/