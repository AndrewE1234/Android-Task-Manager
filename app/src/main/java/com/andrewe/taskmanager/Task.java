package com.andrewe.taskmanager;

import java.util.Calendar;
import java.util.Date;

public class Task {
    private String description;
    private Date completeDate;
    private boolean completed;

    public Task(String description) {
        this(description, Calendar.getInstance().getTime(), false);
    }

    public Task(String description, Date completeDate, boolean completed) {
        this.description = description;
        this.completeDate = completeDate;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
