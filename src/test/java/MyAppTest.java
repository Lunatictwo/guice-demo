import com.google.inject.Guice;
import com.google.inject.Injector;
import module.MyAppModule;
import org.junit.BeforeClass;
import org.junit.Test;
import service.Application;

public class MyAppTest {
    private static Injector injector;

    @BeforeClass
    public static void init() {
        injector = Guice.createInjector(new MyAppModule());
    }

    @Test
    public void testMyApp() {
        Application myApp = injector.getInstance(Application.class);
        myApp.work();
    }

}
