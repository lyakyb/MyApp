package com.youngbinkim.myapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youngbinkim.myapp.R;

/**
 * Created by Administrator on 2015-03-18.
 */
public class MyInformationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_my_information, container, false);

        return rootView;
    }
}
