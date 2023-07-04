import java.util.Scanner;

public class Gui {
    private LoginSystem loginSystem;
    private GradesReader gradesReader;
    private NotesReader notesReader;
    private PresentReader presentReader;

    Scanner scanner = new Scanner(System.in);

    public Gui(LoginSystem loginSystem) {
        this.loginSystem = loginSystem;
        this.gradesReader = new GradesReader(loginSystem);
        this.notesReader = new NotesReader(loginSystem);
        this.notesReader.readNotesFromFile("notes.txt");
        this.presentReader = new PresentReader(loginSystem);
        this.presentReader.readPresentsFromFile("present.txt");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        User currentUser = null;

        while (!loggedIn) {
            System.out.print("Podaj login: ");
            String login = scanner.nextLine();

            currentUser = loginSystem.findUserByLogin(login);

            if (currentUser == null) {
                System.out.println("Niepoprawny login. Spróbuj ponownie.");
                continue;
            }

            System.out.print("Podaj hasło: ");
            String password = scanner.nextLine();

            if (loginSystem.authenticateUser(currentUser, password)) {
                loggedIn = true;
            } else {
                System.out.println("Niepoprawne hasło. Spróbuj ponownie.");
            }
        }

        displayMenu(currentUser);
    }

    public void displayMenu(User user) {
        System.out.println("\nJesteś zalogowany jako: " + user.getFirstName() + " " + user.getLastName() + ".");
        System.out.println("Konto: " + user.getPosition() + ".");

        if (user.getPosition().equals("uczen")) {
            displayStudentMenu(user);
        } else if (user.getPosition().equals("nauczyciel")) {
            displayTeacherMenu();
        } else if (user.getPosition().equals("dyrekcja")) {
            displayAdminMenu();
        }
    }

    private void displayStudentMenu(User user) {
        gradesReader.loadGradesFromFile("grades.txt");

        boolean st = true;
        while (st) {
            System.out.println("\nMenu: ");
            System.out.println("1. Oceny");
            System.out.println("2. Obecności");
            System.out.println("3. Uwagi");
            System.out.println("4. Wyloguj");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nTwoje oceny to: ");
                    gradesReader.displayGradesForUser(user.getId());
                    System.out.println("\nTwoja średnia wynosi: "
                            + gradesReader.calculateAverageGrade(user.getId()) + "\n");
                    break;
                case 2:
                    System.out.println("\nTwoja obecność: ");
                    presentReader.displayPresentInfo(user.getId());
                    break;
                case 3:
                    System.out.println("\nTwoje uwagi: ");
                    notesReader.displayNotesForUser(user.getId());
                    System.out.println();
                    break;
                case 4:
                    st = false;
                    System.out.println("\nPomyślnie wylogowano.");
                    break;
                default:
                    break;
            }
        }
    }

    private void displayTeacherMenu() {
        boolean st = true;
        while (st) {
            System.out.println("\nMenu: ");
            System.out.println("1. Oceny");
            System.out.println("2. Frekwencja");
            System.out.println("3. Uwagi");
            System.out.println("4. Wyloguj");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    gradesReader.loadGradesFromFile("grades.txt");

                    boolean st2 = true;
                    while (st2) {
                        gradesReader.displayAllGrades();

                        System.out.println("\nDostępne operacje: ");
                        System.out.println("1. Dodaj ocenę");
                        System.out.println("2. Usuń ocenę");
                        System.out.println("3. Zapisz wszystkie oceny");
                        System.out.println("4. Oblicz średnią dla ucznia");
                        System.out.println("5. Wróć do panelu nauczyciela");

                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Wybierz ucznia po ID, któremu chcesz dodać ocenę: ");
                                int studId = scanner.nextInt();
                                System.out.println("Podaj ocenę: ");
                                int gr = scanner.nextInt();
                                gradesReader.addGrade(studId, gr);
                                break;
                            case 2:
                                System.out.println("Wybierz ID ucznia, u którego chcesz usunąć ocenę: ");
                                int studId2 = scanner.nextInt();
                                gradesReader.displayGradesForUserWithIndex(studId2);
                                System.out.println("Wybierz indeks oceny którą chcesz usunąć: ");
                                int grd = scanner.nextInt();
                                gradesReader.removeGrade(studId2, grd);
                                System.out.println("\nPomyślnie usunięto ocenę\n");
                                break;
                            case 3:
                                gradesReader.saveGradesToFile();
                                System.out.println("\nPomyślnie zapisano oceny w bazie danych\n");
                                break;
                            case 4:
                                System.out.println("Podaj ID ucznia: ");
                                int studId3 = scanner.nextInt();
                                System.out.println("\nŚrednia ocen wynosi: "
                                        + gradesReader.calculateAverageGrade(studId3) + "\n");
                                break;
                            case 5:
                                System.out.println("\nPomyślnie opuszczono Oceny\n");
                                st2 = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean st4 = true;
                    while (st4) {
                        System.out.println();
                        presentReader.displayAllPresents();

                        System.out.println("\nDostępne operacje: ");
                        System.out.println("1. Dodaj obecność");
                        System.out.println("2. Dodaj nieobecność");
                        System.out.println("3. Zapisz wszystkie obecności");
                        System.out.println("4. Wróć do panelu nauczyciela");

                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Podaj ID ucznia: ");
                                int studId = scanner.nextInt();
                                presentReader.addAttendance(studId);
                                System.out.println("\nPomyślnie dodano obecność.\n");
                                break;
                            case 2:
                                System.out.println("Podaj ID ucznia: ");
                                int studId2 = scanner.nextInt();
                                presentReader.addAbsence(studId2);
                                System.out.println("\nPomyślnie dodano nieoobecność.\n");
                                break;
                            case 3:
                                presentReader.savePresentsToFile("present.txt");
                                System.out.println("\nPomyślnie zapisano obecności w bazie danych\n");
                                break;
                            case 4:
                                System.out.println("\nPomyślnie opuszczono Frekwencję\n");
                                st4 = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean st3 = true;
                    while (st3) {
                        System.out.println();
                        notesReader.displayAllNotes(loginSystem);

                        System.out.println("\nDostępne operacje: ");
                        System.out.println("1. Dodaj uwagę");
                        System.out.println("2. Usuń uwagę");
                        System.out.println("3. Zapisz wszystkie uwagi");
                        System.out.println("4. Wróć do panelu nauczyciela");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Wybierz ucznia po ID, któremu chcesz dodać uwagę: ");
                                int usr = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Treść uwagi: ");
                                String nNote = scanner.nextLine();
                                notesReader.addNoteToList(usr, nNote);
                                break;
                            case 2:
                                System.out.println("Wybierz ucznia po ID, któremu chcesz usunąć uwagę: ");
                                int usr2 = scanner.nextInt();
                                notesReader.displayNotesForUserWithIndex(usr2);
                                System.out.println("Wybierz indeks uwagi którą chcesz usunąć: ");
                                int grd = scanner.nextInt();
                                notesReader.removeNote(usr2, grd);
                                System.out.println("\nPomyślnie usunięto uwagę\n");
                                break;
                            case 3:
                                notesReader.saveNotesToFile("notes.txt");
                                break;
                            case 4:
                                System.out.println("\nPomyślnie opuszczono Uwagi\n");
                                st3 = false;
                                break;
                        }
                    }
                    break;
                case 4:
                    st = false;
                    System.out.println("Pomyślnie wylogowano.");
                    break;
                default:
                    break;
            }
        }
    }

    private void displayAdminMenu() {
        boolean st = true;
        while (st) {
            System.out.println();
            loginSystem.displayAllUsers();
            System.out.println("\nDostępne opcje: ");
            System.out.println("1. Usuń użytkownika");
            System.out.println("2. Dodaj użytkownika");
            System.out.println("3. Wyloguj");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nPodaj ID użytkownika do usunięcia: ");
                    int userId = scanner.nextInt();
                    loginSystem.removeUser(userId);
                    loginSystem.saveUsersToFile("users.txt");
                    break;
                case 2:
                    System.out.println("Podaj id: ");
                    int nId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj imię: ");
                    String nFirstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko: ");
                    String nLastName = scanner.nextLine();
                    System.out.println("Podaj stanowisko: ");
                    String nPosition = scanner.nextLine();
                    System.out.println("Podaj login: ");
                    String nLogin = scanner.nextLine();
                    System.out.println("Podaj hasło: ");
                    String nPassword = scanner.nextLine();
                    loginSystem.createUserAndSaveToFile(nId, nFirstName, nLastName, nPosition, nLogin, nPassword);
                    gradesReader.addGradeToFile(nId);
                    presentReader.addPresentToFile(nId);
                    System.out.println("\nPomyślnie dodano nowego użytkownika.\n");
                    break;
                case 3:
                    st = false;
                    System.out.println("\nPomyślnie wylogowano.\n");
                    break;
                default:
                    break;
            }
        }
    }
}