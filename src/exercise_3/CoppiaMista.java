
package exercise_3;

public class CoppiaMista<T, U> {

    private T uno;
    private U due;

    public void setCoppia(T uno, U due) {
        this.uno = uno;
        this.due = due;
    }

    public T getUno() {
        return uno;
    }

    public U getDue() {
        return due;
    }
}
