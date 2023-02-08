//********************************************************************
//  Philosopher.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 10.3
//********************************************************************

public class Philosopher implements Speaker
{
    private String name, quote;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this philosopher with the specified data.
    //-----------------------------------------------------------------
    public Philosopher(String nameInit, String quoteInit)
    {
        //your code here.
        name = nameInit;
        quote = quoteInit;
    }

    //-----------------------------------------------------------------
    //  Prints the stored quotation.
    //-----------------------------------------------------------------
    public void speak()
    {
        //your code here.
        System.out.println(quote);
    }

    //-----------------------------------------------------------------
    //  Prints the specified string.
    //-----------------------------------------------------------------
    public void announce(String str)
    {
        //your code here.
        System.out.println(str);
    }

    //-----------------------------------------------------------------
    //  Prints a specific string. This method is not part of the
    //  Speaker interface.
    //-----------------------------------------------------------------
    public void pontificate()
    {
        //your code here.
        System.out.println("Philosopher " + name + " pontificate method");
    }
}
