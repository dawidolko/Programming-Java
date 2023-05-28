public class ThrowDemo {
    static void metoda() {
        try {
            //Tworzy nowy wyjątek a następnie wyrzuca go:
            throw new NullPointerException("demo");
            //Wyjątek zostaje natychmiast wyłapany:
        } catch(NullPointerException e) {
            System.out.println("Zlapany w metodzie");
            //Obsługa polega na przesłaniu wyjątku dalej:
            throw e;
        }
    }
    //Wyjątek zostaje ponownie wyłapany przez metodę main:
    public static void main(String args[]) {
        try {
            metoda();
        } catch(NullPointerException e) {
            System.out.println("Zlapany ponownie");
        }
    }
}