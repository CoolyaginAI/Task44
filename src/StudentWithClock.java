import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentWithClock implements Learner {

    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        SimpleDateFormat myFormatDate = new SimpleDateFormat("HH:mm:ss");
        learner.learn();
        String myDate = myFormatDate.format(new Date());
        System.out.println("Текущее время: " + myDate);
    }
}
