/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

/**
 *
 * @author Pessi
 */
@Component
public class ViitegeneraattoriImpl implements Viitegeneraattori {

    private int seuraava;

    public ViitegeneraattoriImpl() {
        seuraava = 1;
    }

    public int uusi() {
        return seuraava++;
    }
}