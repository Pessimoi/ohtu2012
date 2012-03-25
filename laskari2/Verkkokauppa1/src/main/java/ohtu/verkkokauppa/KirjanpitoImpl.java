/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

import java.util.ArrayList;
import org.springframework.stereotype.Component;
@Component
public class KirjanpitoImpl implements Kirjanpito {

    private ArrayList<String> tapahtumat;

    public KirjanpitoImpl() {
        tapahtumat = new ArrayList<String>();
    }

    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
}