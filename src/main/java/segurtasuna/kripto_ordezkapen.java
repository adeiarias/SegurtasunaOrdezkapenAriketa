package segurtasuna;

import java.util.Arrays;

public class kripto_ordezkapen {
    private String emaitza;
    private Character[] alfabetoa = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";

    public kripto_ordezkapen() {
    }

    public String zifratu(String mezua) {
        emaitza = "";

        for(int i = 0; i < mezua.length(); ++i) {
            if (mezua.charAt(i) == ' ') {
                emaitza = emaitza + " ";
            } else {
                int indizea = Arrays.asList(alfabetoa).indexOf(mezua.charAt(i));
                emaitza = emaitza + Character.toString(gakoa.charAt(indizea));
            }
        }

        return emaitza;
    }

    public String deszifratu(String mezua) {
        emaitza = "";

        for(int i = 0; i < mezua.length(); ++i) {
            if (mezua.charAt(i) == ' ') {
                emaitza = emaitza + " ";
            } else {
                int indizea = gakoa.indexOf(mezua.charAt(i));
                emaitza = emaitza + Character.toString(alfabetoa[indizea]);
            }
        }

        return emaitza;
    }
}
