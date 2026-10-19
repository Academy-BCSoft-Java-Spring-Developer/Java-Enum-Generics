
package exercise_3;

public class TestCoppiaMista {

    public static void main(String[] args) {

        CoppiaMista<String, Integer> coppia = new CoppiaMista<>();

        coppia.setCoppia("Mario", 25);

        System.out.println(coppia.getUno());
        System.out.println(coppia.getDue());

        CoppiaMista<Integer, Boolean> altraCoppia = new CoppiaMista<>();

        altraCoppia.setCoppia(100, true);

        System.out.println(altraCoppia.getUno());
        System.out.println(altraCoppia.getDue());
    }
}
