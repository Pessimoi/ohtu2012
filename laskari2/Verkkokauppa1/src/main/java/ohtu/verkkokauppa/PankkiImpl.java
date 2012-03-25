package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PankkiImpl implements Pankki {

    private Kirjanpito kirjanpito;

    @Autowired
    public PankkiImpl(Kirjanpito kirjanpito) {
        this.kirjanpito = kirjanpito;
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille + " viite " + viitenumero + " summa " + summa + "e");
        return true;
    }
}