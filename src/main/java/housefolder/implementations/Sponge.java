package housefolder.implementations;

import housefolder.CleaningTool;

public class Sponge implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("cleaning with sponge");
    }
}