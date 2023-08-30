package ru.ibs;

import org.junit.jupiter.api.*;
import javax.sql.DataSource;
import java.io.IOException;


public class SetupTests {
    private static DataSource dataSource;
    protected FoodDatabaseHelper foodDb;

    @BeforeAll
    public static void setUp() throws IOException {
        dataSource = DatabaseConfig.createDataSource();
    }

    @BeforeEach
    public void before() {
        foodDb = new FoodDatabaseHelper(dataSource);
    }

    @AfterEach
    public void after() {
        foodDb = null;
    }

    @AfterAll
    public static void afterAll() {
        dataSource = null;
    }
}
