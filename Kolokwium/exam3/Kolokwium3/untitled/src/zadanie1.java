public class zadanie1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            if (i == 8 || i == 6 || i == 3 || i == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
