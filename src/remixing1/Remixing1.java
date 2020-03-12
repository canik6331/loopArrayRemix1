/*
12/03/20
cam nikolasevic
this program promts the user to enter
in 20 integers, adds them all together
and then prints out the sum to the console
 */

package remixing1;
import java.util.Scanner;

/**
 *
 * @author canik6331
 */
public class Remixing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //allows user to input data
        Scanner keyboard = new Scanner(System.in);
        
        //initializes the array called number to store 20 integers 
        int [] numbers = new int [20];
        //declares total as 0
        int total = 0;
        
        //promts user to enter 20 integers
        System.out.println("Enter 20 integers and they will be added together");
        
        //loops 20 times
        for(int i = 0; i<= 19; i++)
        {
            //stores an input value from the keyboard every loop
            numbers[i] = keyboard.nextInt();
        }
        
        //loops 20 times
        for(int i = 0; i <= 19; i++)
        {
            //adds the value of index of the array to the total every loop
            total = total + numbers[i];
        }
        
        //tells the user what the sum is
        System.out.println("the sum of those numbers is:");
        System.out.println(total);
    }
    
}
