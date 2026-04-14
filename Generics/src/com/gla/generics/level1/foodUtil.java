package com.gla.generics;

interface MealPlan {
    String getMeal();
}

class VegetarianMeal implements MealPlan {
    public String getMeal() { return "Vegetarian Meal"; }
}

class VeganMeal implements MealPlan {
    public String getMeal() { return "Vegan Meal"; }
}

class KetoMeal implements MealPlan {
    public String getMeal() { return "Keto Meal"; }
}

class Meal<T extends MealPlan> {
    private T meal;

    public void setMeal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

class MealUtil {

    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated: " + meal.getMeal());
    }
}

// Test
class FoodUtil {
    public static void main(String[] args) {

        MealUtil.generateMeal(new VegetarianMeal());
        MealUtil.generateMeal(new KetoMeal());
    }
}
