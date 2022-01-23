package synthetic.placeholderutil.utils;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;
import synthetic.placeholderutil.PlaceholderUtil;

public class CounterUtil {

    public int state = 0;
    public int max, increment, delay;

    private BukkitTask task;

    public CounterUtil(int max, int increment, int delay) {
        this.max = max;
        this.increment = increment;
        this.delay = delay;
    }

    public BukkitTask startTask() {
        return Bukkit.getScheduler().runTaskTimerAsynchronously(PlaceholderUtil.getInstance(), () -> {
            if(state >= max) {
                state = 0;
            } else {
                state += increment;
            }
        }, 0, delay);
    }

    public void stopTimer() {
        if(task != null) {
            if(!task.isCancelled())task.cancel();
            task = null;
        }
    }

    public int getStateOffset(int offset, int multiplier) {
        int offsetstate = state + (offset * increment * multiplier);
        return shortOffset(offsetstate);
    }

    public int shortOffset(int offset) {
        if(offset > max) return shortOffset(offset - max);
        return offset;
    }

    public void resetTimer() {
        state = 0;
        if(task != null) {
            if(!task.isCancelled())task.cancel();
            task = null;
        }
    }

    public void startTimer() {
        if(task == null) {
            task = startTask();
        }
    }

    public static CounterUtil fast;
    public static CounterUtil slow;
    public static CounterUtil rapid;

    public static void startDefaultTimers() {
        fast = new CounterUtil(600,1,1);
        fast.startTimer();
        slow = new CounterUtil(600,1,5);
        slow.startTimer();
        rapid = new CounterUtil(600,5,1);
        rapid.startTimer();
    }
}
