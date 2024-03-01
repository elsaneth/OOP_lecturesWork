import java.util.List;

public class Interval {
    int startTime;
    int endTime;
    List<String> messages;

    public Interval(int startTime, int endTime, List<String> messages) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.messages = messages;
    }
}
