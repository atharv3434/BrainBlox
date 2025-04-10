public class ScoreTracker1 {
    public static void showScore(int score) {
        System.out.println("🧾 Your Current Score: " + score + " points");
        if (score >= 30) {
            System.out.println("🏆 Excellent brainpower!");
        } else if (score >= 10) {
            System.out.println("🔥 Keep it up!");
        } else {
            System.out.println("📘 Try again to improve!");
        }
    }
}
