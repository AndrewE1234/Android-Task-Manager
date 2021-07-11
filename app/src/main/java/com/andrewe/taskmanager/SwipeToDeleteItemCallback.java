package com.andrewe.taskmanager;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public class SwipeToDeleteItemCallback extends ItemTouchHelper.SimpleCallback {
    private TasksRecyclerAdapter taskAdapter;

    public SwipeToDeleteItemCallback(TasksRecyclerAdapter _adapter) {
        super(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        taskAdapter = _adapter;
    }
    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        int position = viewHolder.getAbsoluteAdapterPosition();
        taskAdapter.deleteItem(position);
    }
}
