package lucky7;

import java.util.Scanner;
import lucky7.Dice;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int dollars, tries = 0, max;
        int roll = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("How many dollars do you have? ");
        dollars = max = s.nextInt();

        while (true) {
            d1.roll();
            d2.roll();
            int total = d1.getNumber() + d2.getNumber();
            tries +=1;
                      
            if (total == 7) {
                dollars += 4;
            } else {
                dollars -= 1;
            }
            if (dollars > max){
                max = dollars;
                roll = tries;
            }  
            if(dollars==0) break;
        }
        System.out.format("You are broke after %d rolls\n", tries);
        System.out.format("You should have quit after %d rolls and when you had %d\n", roll,max);

    }
}
