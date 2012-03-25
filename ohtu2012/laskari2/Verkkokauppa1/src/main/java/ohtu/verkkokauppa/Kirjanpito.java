package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 * * * @author Pessi
 */
public interface Kirjanpito {

    public void lisaaTapahtuma(String tapahtuma);

    public ArrayList<String> getTapahtumat();
}