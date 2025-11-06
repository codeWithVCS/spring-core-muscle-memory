package topic10_spel.task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("#{5 + 10}")
    private int sum;
    @Value("#{20 - 4}")
    private int difference;
    @Value("#{6 * 7}")
    private int product;
    @Value("#{81 / 9}")
    private int quotient;
    @Value("#{'Spring' + ' Core'}")
    private String combinedString;

    public void printValues() {
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("combinedString = " + combinedString);
    }
}
