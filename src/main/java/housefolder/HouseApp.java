package housefolder;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.annotation.Configuration;
import housefolder.implementations.Broom;
import housefolder.implementations.CleaningServiceImpl;
import housefolder.implementations.VacuumCleaner;


public class HouseApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        CleaningService jill = ctx.getBean("jill", CleaningService.class);
        CleaningService bob = ctx.getBean("bob", CleaningService.class);
        CleaningService jane = ctx.getBean("jane", CleaningService.class);

        jill.clean();
        bob.clean();
        jane.clean();
        ctx.close();


    }
}
