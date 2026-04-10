public class FrameResult {
    int player1Points;
    int player2Points;
    public FrameResult(int player1Points, int player2Points) {
        this.player1Points = player1Points;
        this.player2Points = player2Points;
    }
    public void displayFrameResult() {
        System.out.println("Wynik frejma:");
        System.out.println("Gracz 1: " + player1Points + " punktów");
        System.out.println("Gracz 2: " + player2Points + " punktów");
    }
    public String determineWinner() {
        if (player1Points > player2Points) {
            return "Gracz 1 wygrywa!";
        } else if (player2Points > player1Points) {
            return "Gracz 2 wygrywa!";
        } else {
            return "Remis!";
        }
    }
    public void displayWinner() {
        String winner = determineWinner();
        System.out.println(winner);
    }
    public void dispayHighestBreak() {
        int highestBreak = Math.max(player1Points, player2Points);
        System.out.println("Najwyższy break: " + highestBreak + " punktów");
    }
    public void displayFullResult() {
        displayFrameResult();
        displayWinner();
        dispayHighestBreak();
    }
}
