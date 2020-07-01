/*
 *
 */

public class Counter {

    static int count;
    int count1;

    public Counter() {
        count1++;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int getCount1() {
        return count1;
    }
}
