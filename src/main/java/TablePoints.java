import java.util.Scanner;

public class TablePoints {
    int reds;
    int availablePoints;
    public TablePoints(int myReds) {
       reds = myReds;
    }
    // The `wyswietlBile()` method in the `TablePoints` class is responsible for displaying the number
    // of red balls on the table. It achieves this by printing out a message that includes the value of
    // the `reds` instance variable, which represents the number of red balls. The message is printed
    // in the format "Ilość czerwonych bil na stole: [reds]".
    public void wyswietlBile() {
        System.out.println("Ilość czerwonych bil na stole:"+reds);
    }
    /**
     * The function calculates and displays the possible points that can be scored in a snooker game
     * based on the number of red balls and colored balls on the table.
     */
    public void wyswietlMozliwePunkty() {
        Scanner sc = new Scanner(System.in);
        if (reds == 15){
            availablePoints=147;
        }else if (reds < 15 & reds >=1){
            System.out.println("Czy była wbita ostatnio czerwona bila?");
            char wbita = sc.next().charAt(0);
            if (wbita == 'T' || wbita == 't'){
                availablePoints=reds*8+34;
            }else if (wbita == 'N' || wbita == 'n'){
                availablePoints=reds*8+27;
            }else{
                System.out.println("Niewłaściwa wartość!");
            }
        }else if (reds == 0){
            char wbita = sc.next().charAt(0);
            if (wbita == 'T' || wbita == 't'){
                availablePoints=34;
            }else if (wbita == 'N' || wbita == 'n'){
                System.out.println("Podaj ilość kolorowych bil na stole:");
                int colors = sc.nextInt();
                switch (colors){
                    case 0:
                        availablePoints=0;
                        break;
                    case 1:
                        availablePoints=7;
                        break;
                    case 2:
                        availablePoints=13;
                        break;
                    case 3:
                        availablePoints=18;
                        break;
                    case 4:
                        availablePoints=22;
                        break;
                    case 5:
                        availablePoints=25;
                        break;
                    case 6:
                        availablePoints=27;
                        break;
                    default:
                        System.out.println("Nieprawidłowa wartość!");
                        break;
                }
            }else{
                System.out.println("Nieprawidłowa wartość!");
            }
        }
        System.out.println("Ilość możliwych do zdobycia punktów wynosi:"+availablePoints);
    }
}
