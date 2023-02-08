//********************************************************************
//  StringTooLongException.java       Author: Lewis/Loftus
//
//  Solution to Programming Projects 11.1 and 11.2
//********************************************************************

public class StringTooLongException extends Exception
{
    //-----------------------------------------------------------------
    //  Sets up the exception object with a particular message.
    //-----------------------------------------------------------------
    public StringTooLongException()
    {
        super("String has too many characters");
    }
}
