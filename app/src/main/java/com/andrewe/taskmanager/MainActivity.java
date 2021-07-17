package com.andrewe.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.TaskManager.MESSAGE";

    private String[] taskNames = {"This task", "That task", "Say hello"};
    private List<Task> taskList = new ArrayList<>();
    private RecyclerView taskRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taskRecyclerView = findViewById(R.id.task_recycler_view);
        taskRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        prepareTaskList();

        TasksRecyclerAdapter adapter = new TasksRecyclerAdapter(taskList);
        taskRecyclerView.setAdapter(adapter);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new SwipeToDeleteItemCallback(adapter));
        itemTouchHelper.attachToRecyclerView(taskRecyclerView);

        FloatingActionButton fab = findViewById(R.id.addTaskFloatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // taskList.add(new Task("New Task!"));
                // adapter.notifyItemInserted(taskList.size() - 1);

                Intent intent = new Intent(MainActivity.this, TaskFormActivity.class);
                String message = "New Task Entry";
                intent.putExtra(EXTRA_MESSAGE, message;
                startActivity(intent);
            }
        });
    }

    private void prepareTaskList() {
        for (String taskName : taskNames) {
            Task task = new Task(taskName);
            taskList.add(task);
        }
    }
}