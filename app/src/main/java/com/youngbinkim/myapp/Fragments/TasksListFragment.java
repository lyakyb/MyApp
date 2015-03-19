package com.youngbinkim.myapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.youngbinkim.myapp.Adapters.TaskAdapter;
import com.youngbinkim.myapp.Models.Task;
import com.youngbinkim.myapp.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Young Bin Kim on 2015-03-18.
 */
public class TasksListFragment extends ListFragment {

    private List<Task> myTasks = new ArrayList<Task>();

    public TasksListFragment(){
        myTasks.add(new Task("Catch Flight", "Flight to Waterloo on Thurs", "Very Important", new Date(2015, 03, 19, 12, 40), true));
        myTasks.add(new Task("PD 20 Finals", "Finish PD20 Finals and Don't fail", "Very Important", new Date(2015, 03, 23, 13, 0), true));
        myTasks.add(new Task("Start Unity", "Continue on Udemy", "Not Important", new Date(2015, 03, 28, 12, 0), false));
        myTasks.add(new Task("Book Flights", "Both Toronto and St Louis", "Important", new Date(2015, 04, 02, 12, 0), true));
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TaskAdapter listAdapter = new TaskAdapter(this.getActivity(), myTasks);
        setListAdapter(listAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tasklist_fragment, container, false);
    }

    @Override
    public void onListItemClick(ListView list, View v, int position, long id){
        Toast.makeText(getActivity(), getListView().getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
    }
}

