package me.hoonti06.workingeffectivelywithlegacycode.onionparameter.v0;

import me.hoonti06.workingeffectivelywithlegacycode.onionparameter.MeetingResolver;
import me.hoonti06.workingeffectivelywithlegacycode.onionparameter.Scheduler;
import me.hoonti06.workingeffectivelywithlegacycode.onionparameter.SchedulingTask;
import org.junit.jupiter.api.Test;

class SchedulingTaskPaneTest {

    @Test
    void test() {
        // given
        // 생성해야 할 객체들이 많음
        Scheduler scheduler = new Scheduler();
        MeetingResolver resolver = new MeetingResolver();
        SchedulingTask task = new SchedulingTask(scheduler, resolver);

        SchedulingTaskPane schedulingTaskPane = new SchedulingTaskPane(task);

        // when
        schedulingTaskPane.doSomething();
    }

}