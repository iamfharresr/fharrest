package fharrest;

import java.util.Scanner;

public class activity1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter marks in Science: ");
        int scienceMarks = scanner.nextInt();
        
        System.out.print("Enter marks in History: ");
        int historyMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Math: ");
        int mathMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Soc: ");
        int socMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Arts: ");
        int artsMarks = scanner.nextInt();
        
        int totalMarks = scienceMarks + historyMarks + mathMarks + socMarks + artsMarks;
        double percentage = (totalMarks / 5.0);
        
        String remarks;
        
       
        if (percentage < 70) {
            remarks = "Fail";
            System.out.println("Try Again");
        } else if (percentage >= 71 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }
        
       
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
        
        if (remarks.equals("Excellent") || remarks.equals("Very Good") || remarks.equals("Good") || remarks.equals("Fair")) {
            System.out.println("Congrats " + name + " you Passed.");
        }
        
   
        scanner.close();
    }
}
