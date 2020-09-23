package segurtasuna;

import java.util.Arrays;

public class OrdezkatzeHiztegia {
    private String emaitza;
    private Character[] alfabetoa = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";//PROBAK EGITEKO ERABILIKO DEN GAKOA

    public OrdezkatzeHiztegia() {}

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
                //GAKO ZERRENDAKO 15.POSIZIOA K DA, ORDUAN 'O' 'K'-REN BITARTEZ ALDATUKO DA
                int indizea = Arrays.asList(alfabetoa).indexOf(mez.charAt(i));
                emaitza = emaitza + Character.toString(gakoa.charAt(indizea));
            }
        }

        return emaitza;
    }

    public String deszifratu(String mezua) {
        emaitza = "";
        String mez = mezua.toUpperCase();
        for(int i = 0; i < mez.length(); ++i) {
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
}
