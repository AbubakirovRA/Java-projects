package Workshops.WP4;

import Workshops.WP4.ToDoPlanner.Model.ArrayListTaskRepo;
import Workshops.WP4.ToDoPlanner.Model.Task;
import Workshops.WP4.ToDoPlanner.Model.TaskRepo;
import Workshops.WP4.ToDoPlanner.Presenter.Presenter;
import Workshops.WP4.ToDoPlanner.View.ConsoleView;
import Workshops.WP4.ToDoPlanner.View.View;

public class Program {

    public static void main(String[] args) {
        Presenter<TaskRepo<Task>, View> p1 = new Presenter<TaskRepo<Task>, View>(new ArrayListTaskRepo(),
                new ConsoleView());

        p1.start();
    }
}