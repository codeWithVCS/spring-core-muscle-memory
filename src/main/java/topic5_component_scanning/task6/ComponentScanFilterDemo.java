package topic5_component_scanning.task6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanFilterDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            context.getBean(AlphaComponent.class);
        } catch (Exception e) {
            System.out.println("AlphaComponent not found as expected");
        }

        try {
            context.getBean(BetaComponent.class);
        } catch (Exception e) {
            System.out.println("BetaComponent not found as expected");
        }

        GammaService gammaService = context.getBean(GammaService.class);
        System.out.println("Retrieved: " + gammaService.getClass().getSimpleName());
    }
}
