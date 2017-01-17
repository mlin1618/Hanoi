/**
 * Created by ml996 on 1/17/17.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        TowersOfHanoi T = new TowersOfHanoi(number);
        T.solve(number, 1, 3);
    }
}
