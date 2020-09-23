package segurtasuna;

import java.util.Arrays;


import java.util.Arrays;

    public class kripto_ordezkapena {
        private String emaitza;
        private Character[] alfabetoa = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        private String gakoa = " ";

        public kripto_ordezkapena(String gako) {
            gakoa = sortuGakoa(gako);
        }

        public String zifratu(String mezua) {
            this.emaitza = "";
            for(int i = 0; i < mezua.length(); ++i) {
                if (mezua.charAt(i) == ' ') {
                    this.emaitza = this.emaitza + " ";
                } else {
                    int indizea = Arrays.asList(this.alfabetoa).indexOf(mezua.charAt(i));
                    String var10001 = this.emaitza;
                    this.emaitza = var10001 + Character.toString(this.gakoa.charAt(indizea));
                }
            }

            return this.emaitza;
        }

        public String deszifratu(String mezua) {
            this.emaitza = "";
            for(int i = 0; i < mezua.length(); ++i) {
                if (mezua.charAt(i) == ' ') {
                    this.emaitza = this.emaitza + " ";
                } else {
                    int indizea = this.gakoa.indexOf(mezua.charAt(i));
                    String var10001 = this.emaitza;
                    this.emaitza = var10001 + Character.toString(this.alfabetoa[indizea]);
                }
            }

            return this.emaitza;
        }

        private String sortuGakoa(String gako){
            String g = " ";

            return g;
        }
    }