package segurtasuna;

import java.util.Arrays;
import java.util.HashSet;

public class kripto_ordezkapena {
        private String emaitza;
        private Character[] alfabetoa = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        private String gakoa;

        public kripto_ordezkapena(String gako) {
            gakoa = sortuGakoa(gako);//MAIN PROGRAMA EXEKUTATZEAN, GAKO BAT SORTUKO DA SARTU DEN HITZAREN ARABERA
        }

        public String zifratu(String mezua) {
            emaitza = "";
            String mez = mezua.toUpperCase();
            //LETRA MAYUS ETA MINUS-EN ARTEKO GATAZKARIK EZ EGOTEKO, GUZTIAK MAYUS BEZALA JARRIKO DIRA
            for(int i = 0; i < mez.length(); i++) {
                //HUTUSUNE BAT BALEGO, EMAITZAN ERE HUTSUNEA EGONGO LEGOKE
                if (mez.charAt(i) == ' ') {
                    emaitza = emaitza + " ";
                } else {
                    //MEZUAREN KARAKTEREEN INDIZEAK HARTUKO DITUGU ETA GAKOAN ORDEZKATUKO DITUGU
                    //ADIBIDEZ
                    //MEZUA ORDENAGAILUA BADA
                    //O KARAKTEREA ALFABETO ZERRENDAN 15. INDIZEA DU
                    //GAKO ZERRENDAKO 15.POSIZIOA K IZANGO BALITZ, ORDUAN 'O' 'K'-REN BITARTEZ ALDATUKO LITZATEKE
                    int indizea = Arrays.asList(alfabetoa).indexOf(mez.charAt(i));
                    emaitza = emaitza + Character.toString(gakoa.charAt(indizea));
                }
            }

            return emaitza;
        }

        public String deszifratu(String mezua) {
            //ZIFRATU METODOAN EGIN DEN BEZALA, BAINA KASU HONETAN, MEZUA HARTU BEHARREAN PARAMETRO BEZALA,
            //KRIPTOGRAMA HARTUKO DA
            emaitza = "";
            String mez = mezua.toUpperCase();
            for(int i = 0; i < mez.length(); i++) {
                if (mez.charAt(i) == ' ') {
                    emaitza = emaitza + " ";
                } else {
                    //ZIFRAKETAREN BERDINA, BAINA ALDERANTZIZKO PAUSUAK EMANDA
                    int indizea = gakoa.indexOf(mez.charAt(i));
                    emaitza = emaitza + Character.toString(alfabetoa[indizea]);
                }
            }

            return emaitza;
        }

        private String sortuGakoa(String gako){
            //HITZ BAT EMANDA, GAKO BAT SORTUKO DUGU ALFABETOAREN LETRAK EDUKIZ
            String g = "";
            String ga = gako.toUpperCase();
            //LEHEN BEZALA, GUZTIA MAYUS JARRIKO DUGU ARAZORIK EZ EDUKITZEKO
            HashSet<Character> lista = new HashSet<Character>();
            //HASHSET-AREN BITARTEZ, ALFABETOAREN KARAKTEREAK SARTUKO DITUGU ETA
            //CONTAINS METODOA ERABILITA BI KARAKTERE EZ ERREPIKATZEA SAIATUKO GARA
            for(int i = 0; i < ga.length(); i++){
                if(!lista.contains(ga.charAt(i))){
                    lista.add(ga.charAt(i));
                    g = g + Character.toString(ga.charAt(i));
                }
            }
            //ASCII kodearen bitartez falta diren karaktereak sartuko ditugu String-ean
            //A karakterearen ASCII kodea = 65
            //Z karakterearen ASCII kodea = 90
            //ORAIN, ALFABETO GUZTIA ZEHARKATUKO DUGU, ETA HASIERAKO GAKO HITZEAN EZ ZUEDEN
            //KARAKTEREAK SARTUKO DITUGU
            //ADIBIDEZ, HITZA = URDUNA BADA,
            //GAKOA = URDNABCEFG...XYZ IZANGO DA
            Character c;
            for(int i = 65; i < 91; i++){
                c = (char)i;
                if(!lista.contains(c)){
                    lista.add(c);
                    g = g + Character.toString(c);
                }
            }
            return g;
        }

        public String getGakoa(){
            return gakoa;
        }
    }