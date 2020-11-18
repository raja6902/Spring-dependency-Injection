package housefolder.service;

import housefolder.CleaningTool;
import housefolder.implementations.Broom;
import housefolder.implementations.CleaningServiceImpl;
import housefolder.implementations.VacuumCleaner;


import housefolder.implementations.Broom;
import housefolder.implementations.CleaningServiceImpl;
import housefolder.implementations.VacuumCleaner;
import org.springframework.context.ConfigurableApplicationContext;


public class HouseApp {
    public static void main(String[] args) {
        CleaningTool broom = new Broom();
        CleaningTool vacuum = new VacuumCleaner();

        CleaningServiceImpl jill = new CleaningServiceImpl();
        jill.setCleaningtool(broom);
        CleaningServiceImpl bob = new CleaningServiceImpl();
        bob.setCleaningtool(vacuum);

        jill.clean();
        bob.clean();

    }
}

