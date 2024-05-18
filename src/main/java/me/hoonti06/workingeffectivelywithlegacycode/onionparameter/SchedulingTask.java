package me.hoonti06.workingeffectivelywithlegacycode.onionparameter;

public class SchedulingTask extends SerialTask {
    private final Scheduler scheduler;
    private final MeetingResolver resolver;

    public SchedulingTask(Scheduler scheduler, MeetingResolver resolver) {
        this.scheduler = scheduler;
        this.resolver = resolver;
    }

    // SerialTask의 run() 메서드를 오버라이드하지 않고 그대로 사용
}
