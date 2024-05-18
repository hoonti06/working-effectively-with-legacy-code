package me.hoonti06.workingeffectivelywithlegacycode.onionparameter.v1;

// 필드 타입 - SchedulingTask -> ISchedulingTask
public class SchedulingTaskPane {
    private final ISchedulingTask task;
    public SchedulingTaskPane(ISchedulingTask task) {
        this.task = task;
    }

    public void doSomething() {
        task.run();
    }
}
