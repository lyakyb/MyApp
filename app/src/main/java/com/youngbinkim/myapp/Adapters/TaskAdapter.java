package com.youngbinkim.myapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.youngbinkim.myapp.Models.Task;
import com.youngbinkim.myapp.R;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Young Bin Kim on 2015-03-19.
 */
public class TaskAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Task> taskItems;

    public TaskAdapter(Activity activity, List<Task> taskItems){
        this.activity = activity;
        this.taskItems = taskItems;
    }

    @Override
    public int getCount() {
        return taskItems.size();
    }

    @Override
    public Object getItem(int position) {
        return taskItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.task_layout, null);

        Task task = taskItems.get(position);

        TextView taskName = (TextView) convertView.findViewById(R.id.task_name);
        TextView taskDescription = (TextView) convertView.findViewById(R.id.task_description);
        TextView taskDateTime = (TextView) convertView.findViewById(R.id.task_time);
        ImageView taskImportance = (ImageView) convertView.findViewById(R.id.task_importance);

        // region Formatting date type
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String taskDate = dateFormat.format(task.getDateTime());
        // endregion

        taskName.setText(task.getName());
        taskDescription.setText(task.getDescription());
        taskDateTime.setText(taskDate);

        if(task.getImportance() == "Very Important"){
            taskImportance.setBackgroundColor(Color.RED);
        }else if(task.getImportance() == "Important"){
            taskImportance.setBackgroundColor(Color.parseColor("#FF9966"));
        }else{
            taskImportance.setBackgroundColor(Color.parseColor("#00FF00"));
        }

        return convertView;
    }
}
