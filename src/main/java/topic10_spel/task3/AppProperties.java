package topic10_spel.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("#{10 > 5}")
    private boolean isGreaterThanFive;
    @Value("#{(8 < 15) && (3 == 3)}")
    private boolean logicAnd;
    @Value("#{(20 < 10) || (5 < 10)}")
    private boolean logicOr;
    @Value("#{!(5 == 10)}")
    private boolean notEqual;
    @Value("#{5 > 10 ? 'Five is Greater' : 'Ten is Greater'}")
    private String ternaryResult;

    public void printValues() {
        System.out.println("isGreaterThanFive: " + isGreaterThanFive);
        System.out.println("logicAnd: " + logicAnd);
        System.out.println("logicOr: " + logicOr);
        System.out.println("notEqual: " + notEqual);
        System.out.println("ternaryResult: " + ternaryResult);
    }
}
