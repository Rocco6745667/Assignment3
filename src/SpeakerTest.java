//********************************************************************
//  SpeakerTest.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 10.3
//********************************************************************

public class SpeakerTest
{
    //-----------------------------------------------------------------
    //  Creates and exercises objects that instantiate the Speaker
    //  interface.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {

        // test the Philosopher class
        Speaker philosopher = new Philosopher("Darcy Short", "This is a sample quote");
        philosopher.speak(); // call the speak method
        philosopher.announce("This is a sample announcement by philosopher");
        ((Philosopher)philosopher).pontificate();

        System.out.println();

        // test the Dog class
        Speaker dog = new Dog("Rambo");
        dog.speak();
        dog.announce("This is a sample announcement by Dog");

    }
}

