package me.hoonti06.workingeffectivelywithlegacycode.onionparameter.v1;

import org.junit.jupiter.api.Test;

class SchedulingTaskPaneTest {

    @Test
    void test() {
        // given
        ISchedulingTask task = new DummySchedulingTask();
        SchedulingTaskPane schedulingTaskPane = new SchedulingTaskPane(task);

        // when
        schedulingTaskPane.doSomething();
    }

    static class DummySchedulingTask implements ISchedulingTask {
        @Override
        public void run() {
            System.out.println("DummySchedulingTask run");
        }
    }

}