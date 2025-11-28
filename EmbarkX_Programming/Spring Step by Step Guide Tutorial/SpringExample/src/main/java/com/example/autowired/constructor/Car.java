package com.example.autowired.constructor;

public class Car
{

    // Car needs Specification as a dependency
    private Specification specification;

    public Car(Specification specification)
    {
        this.specification = specification;
    }

//    public void setSpecification(Specification specification)
//    {
//        this.specification = specification;
//    }

    public void displayDetails()
    {
        System.out.println("Car Details: " + specification.toString());
    }

}
