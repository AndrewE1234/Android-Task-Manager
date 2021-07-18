package com.andrewe.taskmanager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TaskFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_form);

        // FOR TESTING ONLY!!
        // REMOVE IN THE FUTURE!!
        EditText dateEditText = findViewById(R.id.date_edit_text);

        Date currentDate = new Date();
        String currentDateString = new SimpleDateFormat("MM/dd/yyyy").format(currentDate);
        dateEditText.setText(currentDateString);
    }
}