package com.sochtech;

public class Dev
{
    private Computer comp;
    // private Laptop laptop;

    private int age;

    public Dev()
    {
        System.out.println("Dev Constructor");
    }

    public Dev(int age)
    {
        System.out.println("Dev age Constructor");
        this.age = age;
    }

//    public Dev(Laptop laptop)
//    {
//        System.out.println("Dev laptop Constructor");
//        this.laptop = laptop;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build()
    {
        System.out.println("Working on Awesome Projects");
        comp.compile();
    }
}
