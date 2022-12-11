package Workshops.WP4.ToDoPlanner.ExportImport;

import java.util.ArrayList;

import Workshops.WP4.ToDoPlanner.Model.Task;

public interface Saver {
    boolean save(ArrayList<Task> data, String path);
}
