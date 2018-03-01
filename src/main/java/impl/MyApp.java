package impl;

import com.google.inject.Inject;
import service.Application;
import service.LogService;
import service.UserService;

public class MyApp implements Application {
    private UserService userService;
    private LogService logService;

    @Inject
    public MyApp(UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    @Override
    public void work() {
        userService.process();
        logService.log("System running...");
    }
}
