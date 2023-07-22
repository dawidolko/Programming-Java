import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantityInStock;
    private int quantityInCart;

    public Product(String name, double price, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.quantityInCart = 0;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getQuantityInCart() {
        return quantityInCart;
    }

    public void setQuantityInCart(int quantityInCart) {
        this.quantityInCart = quantityInCart;
    }

    public void updateQuantityInStock(int quantity) {
        quantityInStock -= quantity;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private int verificationCode;
    private boolean isWholesaleCustomer;
    private boolean isRegularCustomer;
    private double walletAmount;

    public Customer(String firstName, String lastName, int verificationCode, boolean isWholesaleCustomer, boolean isRegularCustomer, double walletAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.verificationCode = verificationCode;
        this.isWholesaleCustomer = isWholesaleCustomer;
        this.isRegularCustomer = isRegularCustomer;
        this.walletAmount = walletAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getVerificationCode() {
        return verificationCode;
    }

    public boolean isWholesaleCustomer() {
        return isWholesaleCustomer;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    public double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(double walletAmount) {
        this.walletAmount = walletAmount;
    }
}

public class Main {
    private static void addProductToDatabase(String filename, ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ID produktu: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj nazwę produktu: ");
        String productName = scanner.nextLine();

        System.out.print("Podaj cenę produktu: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj ilość w magazynie: ");
        int quantityInStock = scanner.nextInt();
        scanner.nextLine();

        Product newProduct = new Product(productName, price, quantityInStock);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String productData = productId + "," + productName + "," + price + "," + quantityInStock;
            writer.write(productData);
            writer.newLine();
            writer.flush();

            System.out.println("Produkt został dodany do bazy danych.");

            products.add(newProduct);  // Dodaj nowy produkt do listy dostępnych produktów

        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku.");
        }
    }
    private static void updateProductQuantityInStock(String filename, ArrayList<Product> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product product : products) {
                int productId = product.getId();
                String productName = product.getName();
                double price = product.getPrice();
                int quantityInStock = product.getQuantityInStock();

                String productData = productId + "," + productName + "," + price + "," + quantityInStock;
                writer.write(productData);
                writer.newLine();
            }
            writer.flush();

            System.out.println("Aktualizacja bazy danych zakończona.");

        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku.");
        }
    }
    public static void main(String[] args) {
        ArrayList<Product> products = loadProductsFromFile("magazyn.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jesteś klientem detalicznym? (Tak/Nie): ");
        String retailChoice = scanner.nextLine();
        boolean isRetailCustomer = retailChoice.equalsIgnoreCase("Tak");

        if (isRetailCustomer) {
            System.out.print("Podaj ilość pieniędzy w portfelu: ");
            double walletAmount = scanner.nextDouble();
            scanner.nextLine();
            Customer customer = new Customer("", "", 0, false, false, walletAmount);
            processOrder(customer, products);

        } else {
            System.out.println("Czy jesteś stałym klientem? Wpisz rejestracja jeżeli nie jesteś stałym klientem, a chciałbyś się zarejestrować (Tak/Nie/Rejestracja): ");
            String regularChoice = scanner.nextLine();

            if (regularChoice.equalsIgnoreCase("Rejestracja")) {
                System.out.print("Podaj imię: ");
                String firstName = scanner.nextLine();
                System.out.print("Podaj nazwisko: ");
                String lastName = scanner.nextLine();
                System.out.print("Podaj 5-cyfrowy kod: ");
                int verificationCode = scanner.nextInt();
                scanner.nextLine();

                registerNewCustomer(firstName, lastName, verificationCode);
            }


            System.out.print("Czy jesteś klientem hurtowym? (Tak/Nie): ");
            String wholesaleChoice = scanner.nextLine();

            boolean isRegularCustomer = regularChoice.equalsIgnoreCase("Tak");
            boolean isWholesaleCustomer = wholesaleChoice.equalsIgnoreCase("Tak");

            if (isRegularCustomer && isWholesaleCustomer) {
                System.out.print("Podaj imię: ");
                String firstName = scanner.nextLine();
                System.out.print("Podaj nazwisko: ");
                String lastName = scanner.nextLine();
                System.out.print("Podaj 5-cyfrowy kod: ");
                int verificationCode = scanner.nextInt();
                scanner.nextLine();

                boolean isRegistered = checkCustomerRegistration(firstName, lastName, verificationCode);
                if (isRegistered) {
                    System.out.print("Podaj ilość pieniędzy w portfelu: ");
                    double walletAmount = scanner.nextDouble();
                    scanner.nextLine();

                    Customer customer = new Customer(firstName, lastName, verificationCode, true, true, walletAmount);
                    System.out.println("Zalogowano jako stały klient hurtowy.");
                    processOrder(customer, products);
                } else {
                    System.out.println("Niepoprawne dane logowania.");
                }
            }  else if (isWholesaleCustomer) {
                System.out.print("Podaj ilość pieniędzy w portfelu: ");
                double walletAmount = scanner.nextDouble();
                scanner.nextLine();

                Customer customer = new Customer("", "", 0, true, false, walletAmount);
                System.out.println("Zalogowano jako klient hurtowy.");
                processOrder(customer, products);
            } else {
                System.out.println("Niepoprawne dane logowania.");
            }
        }



    }
    private static ArrayList<Product> loadProductsFromFile(String filename) {
        ArrayList<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    int productId = Integer.parseInt(data[0]);
                    String productName = data[1];
                    double price = Double.parseDouble(data[2]);
                    int quantityInStock = Integer.parseInt(data[3]);
                    Product product = new Product(productName, price, quantityInStock);
                    products.add(product);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku.");
        }
        return products;
    }

    private static boolean checkCustomerRegistration(String firstName, String lastName, int verificationCode) {
        try (BufferedReader reader = new BufferedReader(new FileReader("baza.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String storedFirstName = data[0];
                    String storedLastName = data[1];
                    int storedVerificationCode = Integer.parseInt(data[2]);
                    if (storedFirstName.equalsIgnoreCase(firstName)
                            && storedLastName.equalsIgnoreCase(lastName)
                            && storedVerificationCode == verificationCode) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku baza.txt.");
        }
        return false;
    }
    private static void registerNewCustomer(String firstName, String lastName, int verificationCode) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt", true))) {
            String customerData = firstName + "," + lastName + "," + verificationCode;
            writer.write(customerData);
            writer.newLine();
            writer.flush();

            System.out.println("Rejestracja klienta została zakończona.");


        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku baza.txt.");
        }
    }

    private static void processOrder(Customer customer, ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            System.out.println("\nLista dostępnych produktów:");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println((i+1)+ ". " + product.getName() + " - Cena: " + product.getPrice() + " zł - Ilość dostępna: " + product.getQuantityInStock());
            }

            System.out.print("Czy chcesz dodać nowy produkt do bazy danych? (Tak/Nie): ");
            String addProductChoice = scanner.nextLine();

            if (addProductChoice.equalsIgnoreCase("Tak")) {
                addProductToDatabase("magazyn.txt", products);
            }


            System.out.println("\n Lista dostępnych produktów:");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println((i+1) + ". " + product.getName() + " - Cena: " + product.getPrice() + " zł - Ilość dostępna: " + product.getQuantityInStock());
            }
            System.out.print("\nPodaj numer produktu, który chcesz dodać do koszyka (lub '0' aby zakończyć): ");
            choice = scanner.nextLine();

            if (!choice.equals("0")) {
                int productIndex = Integer.parseInt(choice) - 1;

                if (productIndex >= 0 && productIndex < products.size()) {
                    Product selectedProduct = products.get(productIndex);

                    System.out.print("Podaj ilość sztuk: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    if (selectedProduct.getQuantityInStock() >= quantity) {
                        selectedProduct.setQuantityInCart(quantity);
                        System.out.println("Produkt dodany do koszyka.");
                        selectedProduct.updateQuantityInStock(quantity);

                        // Wyświetlanie wartości bieżącego koszyka
                        double currentCartValue = 0;
                        for (Product product : products) {
                            currentCartValue += product.getPrice() * product.getQuantityInCart();
                        }
                        System.out.println("Wartość bieżącego koszyka: " + currentCartValue + " zł");
                    } else {
                        System.out.println("Niewystarczająca ilość produktu.");
                    }
                } else {
                    System.out.println("Nieprawidłowy numer produktu.");
                }
            }
        } while (!choice.equals("0"));

        double totalPrice = 0;

        System.out.println("\nZawartość koszyka:");
        for (Product product : products) {
            if (product.getQuantityInCart() > 0) {
                System.out.println("- " + product.getName() + " - Cena: " + product.getPrice() + " zł - Ilość: " + product.getQuantityInCart());
                totalPrice += product.getPrice() * product.getQuantityInCart();
            }
        }

        System.out.println("\nŁączna cena zamówienia: " + totalPrice + " zł");

        if (customer.isWholesaleCustomer() && customer.isRegularCustomer()) {
            double discount = totalPrice * 0.2;
            double finalPrice = totalPrice - discount;
            System.out.println("Rabat dla stałego klienta hurtowego (20%): " + discount + " zł");
            System.out.println("Cena do zapłaty (po rabacie): " + finalPrice + " zł");

            // Aktualizacja portfela klienta
            double remainingAmount = customer.getWalletAmount() - finalPrice;
            if (remainingAmount >= 0) {
                customer.setWalletAmount(remainingAmount);
                System.out.println("Zamówienie zostało przyjęte.");
                System.out.println("Pozostała kwota w portfelu: " + remainingAmount + " zł");
            } else {
                System.out.println("Brak wystarczających środków w portfelu.");
            }
        } else if (customer.isWholesaleCustomer()) {
            double discount = totalPrice * 0.1;
            double finalPrice = totalPrice - discount;
            System.out.println("Rabat dla klienta hurtowego (10%): " + discount + " zł");
            System.out.println("Cena do zapłaty (po rabacie): " + finalPrice + " zł");

            // Aktualizacja portfela klienta
            double remainingAmount = customer.getWalletAmount() - finalPrice;
            if (remainingAmount >= 0) {
                customer.setWalletAmount(remainingAmount);
                System.out.println("Zamówienie zostało przyjęte.");
                System.out.println("Pozostała kwota w portfelu: " + remainingAmount + " zł");
            } else {
                System.out.println("Brak wystarczających środków w portfelu.");
            }
        } else {
            double finalPrice = totalPrice;
            System.out.println("Cena do zapłaty: " + finalPrice + " zł");

            // Aktualizacja portfela klienta
            double remainingAmount = customer.getWalletAmount() - finalPrice;
            if (remainingAmount >= 0) {
                customer.setWalletAmount(remainingAmount);
                System.out.println("Zamówienie zostało przyjęte.");
                System.out.println("Pozostała kwota w portfelu: " + remainingAmount + " zł");
            } else {
                System.out.println("Brak wystarczających środków w portfelu.");
            }
        }
        updateProductQuantityInStock("magazyn.txt", products);}
}

