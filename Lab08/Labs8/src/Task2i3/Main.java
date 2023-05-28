package Task2i3;

public class Main {
    public static void main(String[] args) {
        // ZADANIE 2

//        //Książka
//        Product book = new Book("tytul ksiązki", 30.99, "opis", "author", 499);
//        book.buy();
//        book.showInfo();
//
//        //Dżem
//        Product jam = new Jam("nazwa",9.99, "opis", "smak");
//        jam.buy();
//        jam.showInfo();
//
//        //Polopiryna
//        Product painkiller = new Painkiller("nazwa",14.99, "opis", 3);
//        painkiller.buy();
//        painkiller.showInfo();
//
//        //Długopis
//        Product pen = new Pen("Rodzaj długopisu", 1.99, "Opis długopisu","kolor");
//        pen.buy();
//        pen.showInfo();
//
//        //Czekolada
//        Product chocolate = new Chocolate("Rodzaj czekolady", 2.99, "Opis czekolady", "typ");
//        chocolate.buy();
//        chocolate.showInfo();

        // ZADANIE 3
        Product[] products = new Product[10];
        products[0] = new Book("tytul", 30, "opis", "autor", 432);
        products[1] = new Chocolate("rodzaj", 2, "opis", "typ");
        products[2] = new Book("title", 30, "desc", "autor", 232);
        products[3] = new Pen("rodzaj", 1.2, "opis", "black");
        products[4] = new Jam("name", 12, "opis", "smak");
        products[5] = new Painkiller("nazwaa", 15, "opis", 3);
        products[6] = new Jam("Nazwa", 15, "opis", "smak");
        products[7] = new Chocolate("rodzaj", 2, "opis", "typ");
        products[8] = new Pen("rodzaj", 1.2, "opis", "black");
        products[9] = new Book("tytul", 30, "desc", "autor", 221);
        //products[10] = new Tractor("nazwa",123,"opis"); // TU NIE MA NIC BO TABLICA JEST 10 ELEMENTOWA

        for(Product productt : products)
        {
            System.out.println(productt);
        }

        for (Product product : products) {
            product.buy();
            product.showInfo();
        }

    }
}

