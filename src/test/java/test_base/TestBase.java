package test_base;

import driver_manager.DriverManager;
import io.cucumber.java.*;


public class TestBase {

    @Before
    public static void initialize() {
        DriverManager.initialize("chrome");
    }


    @After
    public static void teardown() {
        DriverManager.tearDown();
    }
}
