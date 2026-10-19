
package exercise_1;

public enum Cardinal {

    N, NNE, NE, ENE, E, ESE, SE, SSE,
    S, SSW, SW, WSW, W, WNW, NW, NNW;

    public boolean isOpposite(Cardinal x) {
        return Math.abs(this.ordinal() - x.ordinal()) == 8;
    }

    public static Cardinal mix(Cardinal x, Cardinal y) {
        int a = x.ordinal();
        int b = y.ordinal();

        int difference = Math.abs(a - b);

        // Se le direzioni sono opposte, non possiamo calcolare il punto intermedio.
        if (difference == 8) {
            throw new IllegalArgumentException("Le direzioni non devono essere opposte");
        }

        // Se attraversiamo il confine tra NNW e N, correggiamo la distanza.
        if (difference > 8) {
            if (a > b) {
                b += 16;
            } else {
                a += 16;
            }
        }

        // Calcoliamo l'indice medio.
        int middle = (a + b) / 2;

        // Riportiamo l'indice nell'intervallo da 0 a 15.
        middle = middle % 16;

        return Cardinal.values()[middle];
    }
}
