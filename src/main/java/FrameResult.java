import java.util.Scanner;

public class FrameResult {
    int player1Points;
    int player2Points;
    public FrameResult(int player1Points, int player2Points) {
        this.player1Points = player1Points;
        this.player2Points = player2Points;
    }

    /**
     * The function `displayFrameResult` takes input for the number of balls potted by two players in a
     * snooker frame, calculates their points based on ball colors, and displays the result.
     */
    public void displayFrameResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość czerwonych bil wbitych przez gracza 1:");
        int player1Reds= sc.nextInt();
        System.out.println("Podaj ilość czerwonych bil wbitych przez gracza 2:");
        int player2Reds= sc.nextInt();
        System.out.println("Podaj ilość wbić żółtej bili w wykonaniu gracza 1:");
        int player1Yellow = sc.nextInt();
        System.out.println("Podaj ilość wbić żółtej bili w wykonaniu gracza 2:");
        int player2Yellow = sc.nextInt();
        System.out.println("Podaj ilość wbić zielonej bili w wykonaniu gracza 1:");
        int player1Green = sc.nextInt();
        System.out.println("Podaj ilość wbić zielonej bili w wykonaniu gracza 2:");
        int player2Green = sc.nextInt();
        System.out.println("Podaj ilość wbić brązowej bili w wykonaniu gracza 1:");
        int player1Brown = sc.nextInt();
        System.out.println("Podaj ilość wbić brązowej bili w wykonaniu gracza 2:");
        int player2Brown = sc.nextInt();
        System.out.println("Podaj ilość wbić niebieskiej bili w wykonaniu gracza 1:");
        int player1Blue = sc.nextInt();
        System.out.println("Podaj ilość wbić niebieskiej bili w wykonaniu gracza 2:");
        int player2Blue = sc.nextInt();
        System.out.println("Podaj ilość wbić różowej bili w wykonaniu gracza 1:");
        int player1Pink = sc.nextInt();
        System.out.println("Podaj ilość wbić różowej bili w wykonaniu gracza 2:");
        int player2Pink = sc.nextInt();
        System.out.println("Podaj ilość wbić czarnej bili w wykonaniu gracza 1:");
        int player1Black = sc.nextInt();
        System.out.println("Podaj ilość wbić czarnej bili w wykonaniu gracza 2:");
        int player2Black = sc.nextInt();

        player1Points = player1Reds * 1 + player1Yellow * 2 + player1Green * 3 + player1Brown * 4 + player1Blue * 5 + player1Pink * 6 + player1Black * 7;
        player2Points = player2Reds * 1 + player2Yellow * 2 + player2Green * 3 + player2Brown * 4 + player2Blue * 5 + player2Pink * 6 + player2Black * 7;

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
    
    public void displayFullResult() {
        displayFrameResult();
        displayWinner();
    }
}
