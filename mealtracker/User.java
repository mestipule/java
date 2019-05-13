package mealtracker;

public class User
{
    public final String fFirstName;
    public final String lLastName;
    public final String eEmail;
    public final double mTargetAdherence;

    User(String firstName, String lastName, String email, double target)
    {
        this.fFirstName = firstName;
        this.lLastName = lastName;
        this.eEmail = email;
        this.mTargetAdherence = target;
    }

    String getFirtName()
    {
        return this.fFirstName;
    }
    String getLastName()
    {
        return this.lLastName;
    }
    String getEmail()
    {
        return this.eEmail;
    }
    double getmTargetAdherence()
    {
        return this.mTargetAdherence;
    }
}