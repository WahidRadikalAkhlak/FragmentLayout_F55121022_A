package com.wahid.fragmentlayout_f55121022;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class explore_fragment extends Fragment {
View view;
public explore_fragment(){
}
@Nullable
    @Override
public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
    view = inflater.inflate(R.layout.activity_explore_fragment,container,false);
    return view;
}
}