import java.util.Scanner;
public class recruitmentmodified {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score for Academic Potential Test: ");
        double academicPotentialScore = input.nextDouble();
        System.out.print("Enter score for English Test: ");
        double englishScore = input.nextDouble();
        System.out.print("Enter score for Nationalism Test: ");
        double nationalismScore = input.nextDouble();

        if (academicPotentialScore >= 0 && academicPotentialScore <= 100 &&
            englishScore >= 0 && englishScore <= 100 &&
            nationalismScore >= 0 && nationalismScore <= 100) {

            
            double averageScore = (academicPotentialScore + englishScore + nationalismScore) / 3;
            System.out.println("The average score is: " + averageScore);
            if (averageScore >= 78 && academicPotentialScore >= 75 && englishScore >= 75 && nationalismScore >= 75) {
                System.out.println("Congratulations! You passed the test selection stage.");
                
              
                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();
                System.out.print("Do you have a Physical Health Certificate? (yes/no): ");
                String physicalHealth = input.next();
                System.out.print("Do you have a Spiritual Health Certificate? (yes/no): ");
                String spiritualHealth = input.next();
                
                
                if (gpa >= 3.25 && physicalHealth.equalsIgnoreCase("yes") && spiritualHealth.equalsIgnoreCase("yes")) {
                    System.out.println("Congratulations! You have passed all stages and are accepted.");
                } else {
                    System.out.println("Unfortunately, you did not pass the file suitability selection.");
                }
                
            } else {
                System.out.println("Unfortunately, you did not pass the test selection stage.");
            }
            
        } else {
            System.out.println("Invalid test scores. Each score must be between 0 and 100.");
        }
        
        input.close();
    
    }
}
