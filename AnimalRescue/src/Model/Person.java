package Model;

public class Person
{
    private String gender;
    private String role;

    public Person(String gender, String role)
    {
        this.gender = gender;
        this.role = role;
    }


    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "I am a person, " + this.role + " " + this.gender + "\n";
    }
}
