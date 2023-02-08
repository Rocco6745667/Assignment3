//********************************************************************
//  Dog.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 10.3
//********************************************************************

public class Dog implements Speaker
{
    private String name;

    //-----------------------------------------------------------------
    //  Constructor: sets this dog's name.
    //-----------------------------------------------------------------
    public Dog(String nameInit)
    {
        //your code here.
        name = nameInit;
    }

    //-----------------------------------------------------------------
    //  Prints a specific string.
    //-----------------------------------------------------------------
    public void speak()
    {
        //your code here.
        System.out.println(name + " says woof woof");
    }

    //-----------------------------------------------------------------
    //  Prints the specified string.
    //-----------------------------------------------------------------
    public void announce(String str)
    {
        //your code here.
        System.out.println(name);
    }
}
