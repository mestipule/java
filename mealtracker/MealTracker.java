package mealtracker;
import java.util.ArrayList;

public class MealTracker 
{
    private final ArrayList<Meal> mMeals;
    private final User uUser;

    MealTracker(User user) {
        this.mMeals = new ArrayList<Meal>();
        this.uUser = user;
    }

//     `void addMeal`
    void addMeal (Meal meal)
    {
        this.mMeals.add(meal);
    }
// * `void viewMeals`
    void viewMeals ()
    {
        for (Meal meal: this.mMeals)
        {
            System.out.println(meal.getName());
        }
    }
// * `int getMealCount`
    int getMealCount ()
    {
        return this.mMeals.size();
    }
// * `double getAdherence`
    double getAdherence ()
    {
        int count = 0;
        for(Meal meal: this.mMeals)
        {
            if (meal.isComplete())
            {
                count +=1;
            }
        }
        return count / this.mMeals.size() *100; 
    }
// * `boolean isOnTrack
    boolean isOnTrack()
    {
        return this.getAdherence() >= this.uUser.getmTargetAdherence();
    }
    
}