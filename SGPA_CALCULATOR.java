package DSA;


import java.util.Scanner;

public class SGPA_CALCULATOR {
	 
 		 
		 
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter total number of subjects: ");
		        int n = sc.nextInt();

		        int[] credits = new int[n];
		        int[] gradePoints = new int[n];

		        int totalCredits = 0;
		        int weightedSum = 0;

		        for (int i = 0; i < n; i++) {
		            System.out.println("Subject " + (i + 1) + ":");

		            System.out.print("  Enter credits: ");
		            credits[i] = sc.nextInt();

		            System.out.print("  Enter grade point (0-10): ");
		            gradePoints[i] = sc.nextInt();

		            weightedSum += credits[i] * gradePoints[i];
		            totalCredits += credits[i];
		        }

		        double sgpa = (double) weightedSum / totalCredits;

		        System.out.printf("Your SGPA is: %.2f\n", sgpa);
		       
		    }
		}





