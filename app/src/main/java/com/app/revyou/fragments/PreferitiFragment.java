package com.app.revyou.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.revyou.R;
import com.app.revyou.adapter.GridPreferitiAdapter;
import com.app.revyou.adapter.PreferitiAdapter;
import com.app.revyou.utils.MyGridView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PreferitiFragment extends androidx.fragment.app.Fragment {


    @BindView(R.id.grid_view)
    MyGridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_preferiti, container, false);
        ButterKnife.bind(this,view);



        gridView.setAdapter(new GridPreferitiAdapter(getContext(), 10));

        return view;

    }
}
