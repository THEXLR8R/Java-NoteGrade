package lecture06.task02;

public class AreEqual {

    static boolean areEqual(int a, int b) {
        return a == b;
    }

    public static void main(String[] args) {
        boolean result1 = areEqual(2, 7);
        boolean result2 = areEqual(6, 6);

        System.out.println(result1);
        System.out.println(result2);
    }

}
