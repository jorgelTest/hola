package bateaux;


import interfaceBateaux.BateauGenerique;
import static interfaceBateaux.TAILLES.PORTAVION;

public class Porteavions extends BateauGenerique {

    public Porteavions(boolean direction) {
        super(direction);
        this.setTaille(PORTAVION.getTaille());
    }
}

