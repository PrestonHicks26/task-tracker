public class Tally {
    int goal;
    int current;

    public Tally(int goal) {
        goal = goal;
        current = 0;
    }
    public void increase() {
        current++;
    }
    public void decrease() {
        current--;
    }
}
