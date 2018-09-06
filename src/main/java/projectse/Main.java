package projectse;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        paygain nutmoney = new paygain("nutthapol", "achirasawad", 19);
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------"+nutmoney.getName()+" Account"+"-------------------------------------------");

        System.out.println(nutmoney.toString());
        System.out.println("press 0 to exit");


        while (true) {
            System.out.println("Your income: ");
             int r = sc.nextInt();
            if ( r == 0 ){
                break;
            }
            paygain pay = new paygain(r);


            System.out.println("income " + pay.getMoney(r) + " my first balance " + pay.income(r));
            System.out.println("Your expense: ");
            r = sc.nextInt();
            if ( r == 0 ){
                break;
            }
            System.out.println("expense " + pay.getMoney(r) + " my second balance " + pay.expense(r));


        }

    }
}
