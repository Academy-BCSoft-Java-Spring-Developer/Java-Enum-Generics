
package exercise_2;

public class Coppia <T> {

    private T uno;
    private T due;

    public void setCoppia(T uno, T due) {
        this.uno = uno;
        this.due = due;
    }

    public T getUno() {
        return uno;
    }

    public T getDue() {
        return due;
    }
}
