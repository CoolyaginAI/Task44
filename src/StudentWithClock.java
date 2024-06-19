import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.stream.IntStream;

public class StudentWithClock implements Learner {

    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        SimpleDateFormat myFormatDate = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Я учусь. .zZ");
        System.out.println("Я закончил учится");
        String myDate = myFormatDate.format(new Date());
        System.out.println("Текущее время: " + myDate);
    }
}
