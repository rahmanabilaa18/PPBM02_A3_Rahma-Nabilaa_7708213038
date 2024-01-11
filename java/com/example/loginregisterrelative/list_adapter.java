package com.example.loginregisterrelative;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class list_adapter extends ArrayAdapter<list_data> {
    public list_adapter(@NonNull Context context, ArrayList<list_data> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);



    }
}
