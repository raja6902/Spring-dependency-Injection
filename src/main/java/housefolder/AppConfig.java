package housefolder;

import housefolder.implementations.Broom;
import housefolder.implementations.CleaningServiceImpl;
import housefolder.implementations.Sponge;
import housefolder.implementations.VacuumCleaner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CleaningTool broom() {
        return new Broom();
    }
    @Bean
    public CleaningTool vacuum(){
        return new VacuumCleaner();
    }
    @Bean
    public CleaningTool sponge(){
        return new Sponge();
    }
    @Bean
    public CleaningService jill(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningtool(broom());
        return cs;
    }
    @Bean
    public CleaningService bob(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningtool(vacuum());
        return cs;
    }
    @Bean
    public CleaningService jane(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningtool(sponge());
        return cs;
    }
}
