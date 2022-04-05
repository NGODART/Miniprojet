package ch.makery.address;

import javafx.beans.property.SimpleStringProperty;

/**
 * Classe modèle pour un Stage.
 *
 * @author Nathan Godart
 */
public class Stage {


    private final String entreprise;
    private final String sujet;
    private final String debut;
    private final Integer duree;
    private final String promo;

    /**
     * Constructor with some initial data.
     *
     * @param entreprise
     * @param sujet
     */


    /**
     * Constructor with some initial data.
     **/
    public Stage(String entreprise, String sujet, String debut, Integer duree, String promo) {
        this.entreprise = entreprise;
        this.sujet =sujet;
        this.debut = debut;
        this.duree = duree;
        this.promo = promo;

    }

    public String getEntreprise() {
        return entreprise;
    }

    public String getSujet() {
        return sujet;
    }

    public String getDebut() {
        return debut;
    }

    public Integer getDuree() {
        return duree;
    }

    public String getPromo() {
        return promo;
    }
}