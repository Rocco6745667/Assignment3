import java.util.Scanner;
public class ReadStrings {

    public static void main(String[] args) throws StringTooLongException{

        String input;
        final int MAX = 20;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter strings, enter DONE when finished:\n");
        input = scan.nextLine();

        if(input.equalsIgnoreCase("done"))
            System.exit(0); //exit on first startup

        do{
            try
            {
                if(input.length()>MAX)
                    throw new StringTooLongException();
                System.out.println("\nEnter a string, enter DONE when finished:\n");
                input = scan.nextLine();
            }
            catch(StringTooLongException e)
            {
                System.out.println(e.getMessage());
                input = scan.nextLine();
            }
        }while(!input.equalsIgnoreCase("done"));
        scan.close();
    }
}