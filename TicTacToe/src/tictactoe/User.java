package tictactoe;
import java.util.*;
public class User 
{
    public int getUserMove()
    {
        System.out.println("Enter 1-9 to place your X or O on the board");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        while (choice > 9 || choice < 1)
        {
            System.out.println("You must enter a number between 1-9");
            choice = scan.nextInt();
        }
        return choice;
        
    }
}
