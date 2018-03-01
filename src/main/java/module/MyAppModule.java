package module;

import com.google.inject.AbstractModule;
import impl.LogServiceImpl;
import impl.MyApp;
import impl.UserServiceImpl;
import service.Application;
import service.LogService;
import service.UserService;

public class MyAppModule extends AbstractModule {
    /**
     * module 类：在这里绑定具体的实现类
     */
    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        bind(Application.class).to(MyApp.class);
    }
}
