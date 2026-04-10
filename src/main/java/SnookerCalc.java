import java.util.Scanner;

public class SnookerCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe czerwonych bil na stole:");
        int reds = input.nextInt();
        TablePoints tablePoints = new TablePoints(reds);
        tablePoints.wyswietlBile();
        tablePoints.wyswietlMozliwePunkty();
        FrameResult frameResult = new FrameResult(0, 0);
        frameResult.displayFrameResult();
        System.out.println(frameResult.determineWinner());
        frameResult.displayFullResult();
    }
}
