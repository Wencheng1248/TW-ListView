package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<module> {

    private ArrayList<module> modules;
    private Context context;
    private TextView tvModuleName;
    private ImageView ivComputer;

    public ModuleAdapter(Context context, int resource, ArrayList<module> objects){
        super(context, resource, objects);
        // Store the moduleName that is passed to this adapter
        modules = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.rowmodule, parent, false);

        // Get the TextView object
        tvModuleName = (TextView) rowView.findViewById(R.id.tvYear);
        // Get the ImageView object
        ivComputer = (ImageView) rowView.findViewById(R.id.imageView);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        //Infront use class behind use array list to retrieve index
        module currentFood = modules.get(position);
        // Set the TextView to show the food

        tvModuleName.setText(currentFood.getName());
        // Set the image to star or nostar accordingly
        if (currentFood.isProgramming()) {
            ivComputer.setImageResource(R.drawable.prog);
        } else {
            ivComputer.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
