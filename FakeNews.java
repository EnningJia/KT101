
import java.util.Scanner;

/**

 * 3.2PP Fake News Writer

 *

 * @author Enning

 */

public class FakeNews {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name; //person's name

        int age;     //person's age

        String country;

        int turnsScore;

        int airScore;

        int total;

      

        System.out.println("The Fake News");

        System.out.println();

        System.out.print("Enter the person's name: ");

        name = sc.nextLine();

        System.out.print("Enter the person's country");

        country = sc.nextLine();

        System.out.print("How old is the person? ");

        age = sc.nextInt();

        System.out.print("Enter the turnsScore? ");

        turnsScore = sc.nextInt();

        System.out.print("Enter the airScore? ");

        airScore = sc.nextInt();
        
        total = turnsScore + airScore;
        
        System.out.println("The total score is " + total);
        
        System.out.println(name + " of " + country + " has won gold in Mogul Skiing!");
        
        System.out.println(name + "'s score of " + total + " points eclipsed all other competitors.");
        
        System.out.println("At " + age + " years of age, " + name + " is one of the oldest athletes to win this event. ");

        

    }

}




