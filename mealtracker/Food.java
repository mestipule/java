package mealtracker;
import java.util.ArrayList;


    public class Food
    {
        private final String nName;
        private final FoodType cCategory;
        private final double cCalories;
        private final double cCarbohydrates;
        private final double fFat;
        private final double pProtien;

        private final ArrayList<FoodType> cCategories = new ArrayList<FoodType>();
        
        Food(String name, double carbs, double fat, double protien, FoodType category)
        {
            this.nName = name;
            this.cCarbohydrates = carbs;
            this.fFat = fat;
            this.pProtien = protien;
            this.cCategory = category;
            this.cCalories = calculateCalories(carbs, fat, protien);
        }

        // * `double getCalories`
        double getCalories()
        {
            return this.cCalories;
        }

        private static double calculateCalories(double carbs, double fat, double protien)
        {
            return 4*protien + 9*fat + 4*carbs;
        }
        // * `double getFat`
        double getFat()
        {
            return this.fFat;
        }
        // * `double getCarbohydrates`
        double getCarbohydrates()
        {
            return this.cCarbohydrates;
        }
        // * `double getProtein`
        double getProtein()
        {
            return this.pProtien;
        }
        // * `double getName` ---this should be changed to string since name is set to string
        String getName()
        {
            return this.nName;
        }
        // * `ArrayList<Category> getCategories`
        ArrayList<FoodType>  getCategories()
        {
            return this.cCategories;
        }
        // * sweets
        
        // * `void addCategory`
        void addCategory(FoodType category)
        {   
            this.cCategories.add(category);
        }
    }

