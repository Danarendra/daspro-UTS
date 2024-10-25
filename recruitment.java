import java.util.Scanner;
public class recruitment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score for Academic Potential Test: ");
        double academicPotentialScore = input.nextDouble();
        System.out.print("Enter score for English Test: ");
        double englishScore = input.nextDouble();
        System.out.print("Enter score for Nationalism Test: ");
        double nationalismScore = input.nextDouble();

        if (academicPotentialScore >= 0 && academicPotentialScore <= 100) {
            if (englishScore >= 0 && englishScore <= 100) {
                if (nationalismScore >= 0 && nationalismScore <= 100) {
                    double averageScore = (academicPotentialScore + englishScore + nationalismScore) / 3;
                    System.out.println("The average score is: " + averageScore);
                } else {
                    System.out.println("Invalid Nationalism Test score. Must be between 0 and 100.");
                }
            } else {
                System.out.println("Invalid English Test score. Must be between 0 and 100.");
            }
        } else {
            System.out.println("Invalid Academic Potential Test score. Must be between 0 and 100.");
        }
        
        input.close();

    }
}