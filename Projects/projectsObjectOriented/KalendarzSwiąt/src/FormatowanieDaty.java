import java.util.Scanner;

public class FormatowanieDaty {
    private Data pierwszaData;
    private Data drugaData;

    public FormatowanieDaty(Data pierwszaData, Data drugaData) {
        this.pierwszaData = pierwszaData;
        this.drugaData = drugaData;
    }

    public void sformatujDaty() {
        System.out.println("Wybierz format wyświetlania daty:");
        System.out.println("1. dd-MM-yyyy");
        System.out.println("2. yyyy-MM-dd");
        System.out.println("3. MM/dd/yyyy");

        Scanner scanner = new Scanner(System.in);
        int formatWybor = scanner.nextInt();

        String format;
        switch (formatWybor) {
            case 1:
                format = "dd-MM-yyyy";
                break;
            case 2:
                format = "yyyy-MM-dd";
                break;
            case 3:
                format = "MM/dd/yyyy";
                break;
            default:
                format = "dd-MM-yyyy";
                break;
        }

        if (pierwszaData != null) {
            System.out.println("Sformatowana pierwsza data: " + pierwszaData.sformatujDate(format));
        }

        if (drugaData != null) {
            System.out.println("Sformatowana druga data: " + drugaData.sformatujDate(format));
        }
    }
}
