import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void addGuest()
    {
        System.out.println("Podaj imie goscia:");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posilek:");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu:");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin? (Y|N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if(isVeganString.equals("Y")) // equals poniewaz == używamy tylko do cyfr i zmiennych prymitywnych.
        {
            isVegan = true;
        }else
        {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
        guests.add(guest);
    }

    public void displayMeals()
    {
        for(String meal : meals)
        {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber()
    {
        System.out.println("Podaj numer telefonu: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);

        guest.disPlayGuestInformation();
    }

    public void displayGuests() //getGuests
    {
        for(Guest guest : guests) // petla foreach
        {
            guest.disPlayGuestInformation();
            System.out.println();
        }
    }
}
