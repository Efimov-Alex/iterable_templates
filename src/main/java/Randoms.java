import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int minInteger;
    protected int maxInteger;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.minInteger = min;
        this.maxInteger = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            public boolean hasNext() {
                return true;
            }

            public Integer next() {
                return random.nextInt(minInteger, maxInteger + 1);
            }
        };

    }
}
