package com.youngbinkim.myapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.youngbinkim.myapp.Fragments.AlarmFragment;
import com.youngbinkim.myapp.Fragments.MyInformationFragment;
import com.youngbinkim.myapp.Fragments.TasksListFragment;

/**
 * Created by Young Bin Kim on 2015-03-18.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new TasksListFragment();
            case 1:
                return new AlarmFragment();
            case 2:
                return new MyInformationFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
