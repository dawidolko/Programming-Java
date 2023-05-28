public class WyjatekPodKlasy {
    public static void main(String args[]) {
        try {
            int operacjaDzielenia = 224 / 0;
        }
        catch(Exception e) {
            System.out.println("Wyjatek generyczny");
        }
            System.out.println("Nieosiagalny");
        }
    }