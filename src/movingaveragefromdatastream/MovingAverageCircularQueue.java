package movingaveragefromdatastream;

public class MovingAverageCircularQueue {

    int[] array;
    int count = 0;
    int sum = 0;
    public MovingAverageCircularQueue(int size) {
        array = new int[size];
    }


    public double next(int val) {
        int head = count % array.length;
        sum = sum + val - array[head];
        array[head] = val;
        count++;
        return sum * 1.0 / Math.min(count,array.length);
    }
}
