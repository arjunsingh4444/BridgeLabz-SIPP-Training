package BridgeLabz_SIPP_Training.Generics;


interface MealPlan {
    void showMeal();
}

class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal: Paneer, Dal, Rice");
    }
}

class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu, Salad, Brown Rice");
    }
}

class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal: Eggs, Avocado, Chicken");
    }
}

class HighProteinMeal implements MealPlan {
    public void showMeal() {
        System.out.println("High Protein Meal: Grilled Chicken, Lentils, Protein Shake");
    }
}

class Meal<T extends MealPlan> {
    T mealType;

    Meal(T mealType) {
        this.mealType = mealType;
    }

    void display() {
        mealType.showMeal();
    }
}

class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(T meal) {
        System.out.println("Generating your personalized meal plan:");
        meal.showMeal();
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal hp = new HighProteinMeal();

        Meal<VegetarianMeal> m1 = new Meal<>(veg);
        Meal<VeganMeal> m2 = new Meal<>(vegan);

        m1.display();
        m2.display();

        MealPlanGenerator.generatePlan(keto);
        MealPlanGenerator.generatePlan(hp);
    }
}
