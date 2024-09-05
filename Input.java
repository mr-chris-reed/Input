import java.util.Scanner;

public class Input
{
    public static void main (String [] args)
    {
        System.out.print("Please enter an integer my buddy: ");
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();

        System.out.println("My integer is " + myInt);
    }
}
