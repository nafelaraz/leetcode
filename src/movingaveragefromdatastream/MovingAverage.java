package movingaveragefromdatastream;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverage {
    int size;
    int sum = 0;
    Deque<Integer> queue = new ArrayDeque<>();
    public MovingAverage(int size) {
        this.size = size;
    }


    public double next(int val) {
        queue.add(val);
        int minus = queue.size()> size ? queue.poll() : 0;
        sum = sum + val - minus;
        return sum * 1.0/Math.min(queue.size(),size);
    }
}
