package com.andrewe.taskmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaskListActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.task_list_item);

        final Button deleteButton = findViewById(R.id.delete_task_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });
    }
}
