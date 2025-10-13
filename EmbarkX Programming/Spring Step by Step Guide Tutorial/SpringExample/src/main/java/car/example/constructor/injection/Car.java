package car.example.constructor.injection;

public class Car
{

    // Car needs Specification as a dependency
    private final Specification specification;

    public Car(Specification specification)
    {
        this.specification = specification;
    }

    public void displayDetails()
    {
        System.out.println("Car Details: " + specification.toString());
    }

}
