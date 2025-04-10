import java.util.Scanner;

public class PuzzleSet {
    public static int numberSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("🧩 What comes next in the series: 2, 4, 8, 16, ?");
        System.out.print("Your Answer: ");
        int ans = sc.nextInt();
        if (ans == 32) {
            System.out.println("✅ Correct!");
            return 10;
        } else {
            System.out.println("❌ Incorrect! Correct answer is 32.");
            return 0;
        }
    }

    public static int riddle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("🧩 Riddle: What has keys but can't open locks?");
        System.out.print("Your Answer: ");
        String ans = sc.nextLine().toLowerCase();
        if (ans.contains("piano")) {
            System.out.println("✅ Correct!");
            return 10;
        } else {
            System.out.println("❌ Incorrect! Correct answer is 'Piano'.");
            return 0;
        }
    }

    public static int patternPuzzle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("🧩 Find the missing letter: A, C, E, G, ?");
        System.out.print("Your Answer: ");
        String ans = sc.nextLine().toUpperCase();
        if (ans.equals("I")) {
            System.out.println("✅ Correct!");
            return 10;
        } else {
            System.out.println("❌ Incorrect! Correct answer is 'I'.");
            return 0;
        }
    }
}
