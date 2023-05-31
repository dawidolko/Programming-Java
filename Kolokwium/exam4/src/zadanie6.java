public class zadanie6 {
        public static void main(String[] args) {
            for (int i = 200; i >= 0; i--) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
}
