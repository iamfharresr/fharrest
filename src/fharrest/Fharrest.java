
package fharrest;
import static java.time.Clock.system;
import java.util.Scanner;
public class Fharrest {

   
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name;
        int age;
        
        
        System.out.println("Enter Your Name: ");
        name = sc.nextLine(); 
        System.out.println("Enter your Age: "); 
        age = sc.nextInt(); 
        
        System.out.println("\nHello " + name + ", your age is " + age); 
        
        if (age >= 18) {
            System.out.println("Votable");
        } else {
            System.out.println("Minority");
        }
    }
    
}