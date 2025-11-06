package topic10_spel.task2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("#{T(java.lang.Math).sqrt(81)}")
    private double squareRoot;
    @Value("#{T(java.lang.Math).max(15, 42)}")
    private double maxValue;
    @Value("#{T(java.lang.Math).PI}")
    private double pi;
    @Value("#{T(java.lang.String).valueOf('spring core').toUpperCase()}")
    private String upperCaseValue;
    @Value("#{systemProperties['os.name']}")
    private String operatingSystem;

    public void printValues() {
        System.out.println("squareRoot: " + squareRoot);
        System.out.println("maxValue: " + maxValue);
        System.out.println("pi: " + pi);
        System.out.println("upperCaseValue: " + upperCaseValue);
        System.out.println("operatingSystem: " + operatingSystem);
    }
}
