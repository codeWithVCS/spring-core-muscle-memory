package topic2_ioc_di.task4.controller;

import org.springframework.stereotype.Controller;
import topic2_ioc_di.task4.PaymentProcessor;

@Controller
public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("StripePaymentProcessor: processed payment of " + amount);
    }
}
