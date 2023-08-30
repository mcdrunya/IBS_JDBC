package ru.ibs;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;

public class FoodTest extends SetupTests {

    @Test
    public void testAddFood() throws SQLException {
        assertTrue(foodDb.isTableExists(), "Таблицы FOOD не существует");

        foodDb.addFood("Apple", "Fruit", false);
        assertTrue(foodDb.isFoodExists("Apple", "Fruit", false), "Продукт с тестовыми данными не найден в таблице");

        foodDb.deleteFood("Apple", "Fruit", false);
        assertFalse(foodDb.isFoodExists("Apple", "Fruit", false), "Продукт с тестовыми данными не был удален");
    }
}
