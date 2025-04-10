import java.util.Scanner;

public class BrainBlox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("🎮 Welcome to BrainBlox - The Puzzle Game!");

        while (true) {
            System.out.println("\nChoose a Puzzle Type:");
            System.out.println("1. Number Series");
            System.out.println("2. Riddles");
            System.out.println("3. Pattern Matching");
            System.out.println("4. View Score");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    score += PuzzleSet.numberSeries();
                    break;
                case 2:
                    score += PuzzleSet.riddle();
                    break;
                case 3:
                    score += PuzzleSet.patternPuzzle();
                    break;
                case 4:
                    ScoreTracker1.showScore(score);
                    break;
                case 5:
                    System.out.println("🎉 Thanks for playing! Your final score is: " + score);
                    return;
                default:
                    System.out.println("❗ Invalid choice, try again.");
            }
        }
    }
}
