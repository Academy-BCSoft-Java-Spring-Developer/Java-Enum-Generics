
package exercise_2;

public class TestCoppia {

    public static void main(String[] args) {

        Coppia<String> coppia = new Coppia<>();

        coppia.setCoppia("Mario", "Luigi");

        System.out.println(coppia.getUno());
        System.out.println(coppia.getDue());

        Coppia<Integer> numeri = new Coppia<>();

        numeri.setCoppia(10, 20);

        System.out.println(numeri.getUno());
        System.out.println(numeri.getDue());
    }
}
