package mealtracker;
import java.util.ArrayList;

public class Meal
{
    private final ArrayList<Food> fFoods = new ArrayList<Food>();
    private final String nName;
    
    public Meal (String name) {
        this.nName = name;
    }
//     * `double getCalories`
    double getCalories()
    {
        double calories = 0;
        for (Food food: this.fFoods)
        {
            calories += food.getCalories();
        }
        return calories;
    }
// * `double getFat`
    double getFat()
    {
        double fat = 0;
        for (Food food: this.fFoods)
        {
            fat += food.getFat();
        }
        return fat;
    }
// * `double getCarbohydrates`
    double getCarbohydrates()
    {
        double carbohydrates = 0;
        for (Food food: this.fFoods)
        {
            carbohydrates += food.getCarbohydrates();
        }
        return carbohydrates;
    }
// * `double getProtein`
    double getProtein()
    {
        double protien = 0;
        for (Food food: this.fFoods)
        {
            protien += food.getProtein();
        }
        return protien;
    }
// * `String getName`
    String getName()
    {
        return this.nName;
    }
// * `DateTime getMealTime`
   /* DateTime getMealTime()
    {
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    String date = simpleDateFormat.format(new Date());
    System.out.println(date);
    }*/


// * `void viewFoods`
    void viewFoods()
    {
        for (Food food: this.fFoods)
        {
            System.out.println(food.getName());
        }
    }
    boolean isComplete()
    {
        boolean protien = false;
        boolean fat = false;
        boolean fruits = false;
        boolean vegetables = false;

        for (Food food: this.fFoods)
        {
            if (food.getCategories().equals(this.getProtein()))
            {
                protien = true;
            }
            else if (food.getCategories().equals(this.getFat()))
            {
                fat = true;
            }
            else if (food.getCategories().equals(this.getName()))
            {
                fruits = true;
            }
            else 
            {
                vegetables = true;
            }
            // switch(food.getCategory())
            // {
            //     case protien:
            //         protien = true;
            //         break;
            //     case fat:
            //         fat = true;
            //         break;
            //     case fruits:
            //         fruits = true;
            //         break;
            //     case vegetables:
            //         vegetables = true;
            //         break;
            // }
        }
        return fat && protien && vegetables && fruits;
    }
}