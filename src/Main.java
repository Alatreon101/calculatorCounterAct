import java.util.Date;
import java.util.List;

/*
 *
 */

public class Main {

    public static void main(String[] args) {

        double k = 45;
        double l = 34;

        int d = 78;
        int h = 67;

        double res = Calculator.addition(d, h);
        //int res1 = Calculator.plus(i,j);

        System.out.println(Calculator.division(d, h));

        for (int i = 0; i < 10; i++) {

            Counter cnt = new Counter();
            System.out.println("getCount1: " + cnt.getCount1());
            System.out.println("getCount: " + cnt.getCount());
        }

        Agreement agreement = new Agreement("Agreement", new Date(), 1, List.of("bannana"));
        Act act = Adapter.toAct(agreement);

    }
}
