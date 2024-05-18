package me.hoonti06.workingeffectivelywithlegacycode.onionparameter.v0;

import me.hoonti06.workingeffectivelywithlegacycode.onionparameter.SchedulerPane;
import me.hoonti06.workingeffectivelywithlegacycode.onionparameter.SchedulingTask;

public class SchedulingTaskPane extends SchedulerPane {
    private final SchedulingTask task;
    public SchedulingTaskPane(SchedulingTask task) {
        this.task = task;
    }

    public void doSomething() {
        task.run();
    }
}
