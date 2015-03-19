package com.youngbinkim.myapp.Models;

import java.util.Date;

/**
 * Created by Young Bin Kim on 2015-03-19.
 */
public class Task{
    private String taskName;
    private String taskDescription;
    private String taskImportance;
    private Date taskDateTime;
    private Boolean notify;

    public Task (){

    }

    public Task(String name, String desc, String imp, Date time, Boolean notify){
        this.taskName = name;
        this.taskDescription = desc;
        this.taskImportance = imp;
        this.taskDateTime = time;
        this.notify = notify;
    }

    public String getName(){ return this.taskName; }
    public void setName(String name){ this.taskName = name; }

    public String getDescription() { return this.taskDescription; }
    public void setDescription(String desc) { this.taskDescription = desc; }

    public String getImportance() { return this.taskImportance; }
    public void setImportance(String imp) { this.taskImportance = imp; }

    public Date getDateTime() { return this.taskDateTime; }
    public void setTime(Date time) { this.taskDateTime = time; }

    public Boolean shouldNotify() { return this.notify; }
    public void setShouldNotify(Boolean notify) { this.notify = notify; }

}
