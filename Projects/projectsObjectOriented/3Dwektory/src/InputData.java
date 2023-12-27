import org.apache.poi.ss.usermodel.DataValidation;

import java.util.Scanner;

public class InputData implements DataInterface{
    private Scanner scanner;

    public InputData(){
        scanner = new Scanner(System.in);
    }

    public int getInt(){
        int var=0;
        boolean validInput = false;
        do {
            //System.out.println("-- Podaj liczbe typu calkowitego: \n");
            String inputVar = scanner.nextLine();
            try{
                var = Integer.parseInt(inputVar);
                validInput = true;
            }
            catch (NumberFormatException e){
                System.out.println("-- Bledny format danych.\n-- Sprobuj ponownie.");
            }
        } while(!validInput);

        return var;
    }
    public double getDouble(){
        double var=0;
        boolean validInput = false;
        do {
            //System.out.println("-- Podaj liczbe typu zmiennoprzecinkowego: \n");
            String inputVar = scanner.nextLine();
            try{
                var = Double.parseDouble(inputVar);
                validInput = true;
            }
            catch (NumberFormatException e){
                System.out.println("-- Bledny format danych.\n-- Sprobuj ponownie.");
            }
        } while (!validInput);

        return var;
    }

}
