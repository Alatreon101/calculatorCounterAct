/*
 *
 */

public class Adapter {

    public static Act toAct(Agreement agreement) {

        return new Act(agreement.getDescription(), agreement.getRegDate(), agreement.getNumber(), agreement.getCheckProducts());

    }
}
