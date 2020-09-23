package segurtasuna;

import java.util.Arrays;
import java.util.HashSet;

public class kripto_ordezkapena {
        private String emaitza;
        private Character[] alfabetoa = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        private String gakoa;

        public kripto_ordezkapena(String gako) {
            gakoa = sortuGakoa(gako);
        }

        public String zifratu(String mezua) {
            emaitza = "";
            String mez = mezua.toUpperCase();
            for(int i = 0; i < mez.length(); i++) {
                if (mez.charAt(i) == ' ') {
                    emaitza = emaitza + " ";
                } else {
                    int indizea = Arrays.asList(alfabetoa).indexOf(mez.charAt(i));
                    emaitza = emaitza + Character.toString(gakoa.charAt(indizea));
                }
            }

            return emaitza;
        }

        public String deszifratu(String mezua) {
            emaitza = "";
            String mez = mezua.toUpperCase();
            for(int i = 0; i < mez.length(); i++) {
                if (mez.charAt(i) == ' ') {
                    emaitza = emaitza + " ";
                } else {
                    int indizea = gakoa.indexOf(mez.charAt(i));
                    emaitza = emaitza + Character.toString(alfabetoa[indizea]);
                }
            }

            return emaitza;
        }

        private String sortuGakoa(String gako){
            String g = "";
            String ga = gako.toUpperCase();
            HashSet<Character> lista = new HashSet<Character>();
            for(int i = 0; i < ga.length(); i++){
                if(!lista.contains(ga.charAt(i))){
                    lista.add(ga.charAt(i));
                    g = g + Character.toString(ga.charAt(i));
                }
            }
            //ASCII kodearen bitartez falta diren karaktereak sartuko ditugu String-ean
            //A karakterearen ASCII kodea = 65
            //Z karakterearen ASCII kodea = 90
            Character c;
            for(int i = 65; i < 91; i++){
                c = (char)i;
                if(!lista.contains(c)){
                    lista.add(c);
                    g = g + Character.toString(c);
                }
            }
            System.out.println(g);
            return g;
        }
    }