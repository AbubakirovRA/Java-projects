package Workshops.WP4.ToDoPlanner.ExportImport;

import java.util.ArrayList;

import Workshops.WP4.ToDoPlanner.Model.Task;

public interface Loader {
    ArrayList<Workshops.WP4.ToDoPlanner.Model.Task> load(String path);
}
