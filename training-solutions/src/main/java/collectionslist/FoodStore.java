package collectionslist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private List<Food> foods = new LinkedList<>();

    public void addFood(Food newFood) {
        foods.add(newFood);
    }

    public void sellFirst(Food food) {
        if (food.getExpirationDate().isEqual(LocalDate.now())) {
            foods.add(0,food);
        }
    }

    public List<Food> getFoods() {
        return foods;
    }
}
