public class StudentWithTimer implements Learner {

    private Learner learner;

    public StudentWithTimer(Learner learmer) {
        this.learner = learmer;
    }

    @Override
    public void learn() {
        long start = System.currentTimeMillis();
        learner.learn();
        System.out.printf("Время учёбы: %s ms", System.currentTimeMillis()-start);
    }

}
