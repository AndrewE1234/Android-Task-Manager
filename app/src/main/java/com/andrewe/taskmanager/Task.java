package com.andrewe.taskmanager;

import java.util.Calendar;
import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date completeDate;
    private boolean completed;

    public Task(String name) {
        this(name, "", Calendar.getInstance().getTime(), false);
    }

    public Task(String name, String description, Date completeDate, boolean completed) {
        this.name = name;
        this.description = description;
        this.completeDate = completeDate;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public boolean getCompleted() {
        return completed;
    }

    public String showCompleteDate() {
        return completeDate.toString();
    }
}
