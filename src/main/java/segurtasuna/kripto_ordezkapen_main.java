package segurtasuna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kripto_ordezkapen_main {
    public kripto_ordezkapen_main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SAR EZAZU ZURE IZENA");
        String iz = sc.nextLine();
        String izen = iz.toUpperCase();

        System.out.println("KAIXO "+izen+", ZER EGIN NAHI DUZU?");
        System.out.println(" ");

        int n = 0;
        do {
            System.out.println("MEZUA ENKRIPTATZEKO 1 SAKATU");
            System.out.println("MEZUA DESENKRIPTATZEKO 2 SAKATU");
            try {
                n = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("SAR EZAZU ZENBAKI BAT MESEDEZ");
                System.out.println(" ");
                sc.next();
            }
        }while(n!=1 && n!=2);

        sc.nextLine();
        System.out.println(" ");

        System.out.println("ZEIN DA ERABILI NAHI DUZUN GAKOA?");
        String gako = sc.nextLine();
        System.out.println(" ");
        System.out.println("ZURE GAKOA HURRENGOA DA:");
        kripto_ordezkapena k = new kripto_ordezkapena(gako);
        System.out.println(k.getGakoa());
        System.out.println(" ");

        String mezua;
        if (n == 1) {
            System.out.println("ZER MEZU ENKRIPTATU NAHI DUZU?");
            mezua = sc.nextLine();
            System.out.println("MEZU ZIFRATUA HURRENGOA DA: "+k.zifratu(mezua));
        } else {
            System.out.println("ZER MEZU DESENKRIPTATU NAHI DUZU?");
            mezua = sc.nextLine();
            System.out.println("MEZU DESZIFRATUA HURRENGOA DA: "+k.deszifratu(mezua));
        }
        System.out.println(" ");

        System.out.println("ESKERRIK ASKO PROGRAMA HAU ERABILTZEAGATIK "+izen);
    }
}
