package com.sochtech.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev
{
     @Autowired    // field injection
     @Qualifier("laptop")
    private Computer comp;

// You can comment the @Autowired annotation to use the below constructor
// Constructor injection
//    Dev(Laptop laptop)
//    {
//        this.laptop = laptop;
//    }

//    Setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop)
//    {
//        this.laptop = laptop;
//    }

    public void build()
    {
        comp.compile();
        System.out.println("Working on Awesome projects.");
    }
}
