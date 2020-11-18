package housefolder.implementations;

import housefolder.CleaningService;
import housefolder.CleaningTool;

public class CleaningServiceImpl  implements CleaningService {
   private CleaningTool cleaningtool;

    public CleaningTool getCleaningtool() {
        return cleaningtool;
    }

    public CleaningServiceImpl setCleaningtool(CleaningTool cleaningtool) {
        this.cleaningtool = cleaningtool;
        return this;
    }

    public void clean() {
        cleaningtool.doCleanJob();
    }
}
