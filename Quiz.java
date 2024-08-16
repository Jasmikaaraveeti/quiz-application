import java.util.Scanner;

class Quiz {
    public static void main(String[] args) {
        
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            
        };

        String[] options = {
            "A) Paris   B) London   C) Berlin   D) Madrid",
            "A) Venus   B) Mars     C) Jupiter  D) Saturn",
            
        };

        char[] correctAnswers = {'A', 'B'}; 

        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
