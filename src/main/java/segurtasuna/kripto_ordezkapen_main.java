package segurtasuna;

import java.util.Scanner;

public class kripto_ordezkapen_main {
    public kripto_ordezkapen_main() {
    }

    public static void main(String[] args) {
        kripto_ordezkapen k = new kripto_ordezkapen();
        Scanner sc = new Scanner(System.in);
        System.out.println("ZER EGIN NAHI DUZU?");
        System.out.println("MEZUA ENKRIPTATZEKO 1 SAKATU");
        System.out.println("MEZUA DESENKRIPTATZEKO 2 SAKATU");
        int n = sc.nextInt();
        sc.nextLine();
        String mezua;
        if (n == 1) {
            System.out.println("ZER MEZU ENKRIPTATU NAHI DUZU?");
            mezua = sc.nextLine();
            System.out.println(k.zifratu(mezua));
        } else {
            System.out.println("ZER MEZU DESENKRIPTATU NAHI DUZU?");
            mezua = sc.nextLine();
            System.out.println(k.deszifratu(mezua));
        }

    }
}
