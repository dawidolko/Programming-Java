import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class RoundedResult {
    public String returnRoundedResult(double[][] var){
        double x = var[0][0];
        double y = var[0][1];
        double z = var[0][2];

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);

        double roundedX = Double.parseDouble(decimalFormat.format(x));
        double roundedY = Double.parseDouble(decimalFormat.format(y));
        double roundedZ = Double.parseDouble(decimalFormat.format(z));

        String finalResult = "X: " + roundedX + " Y: " + roundedY + " Z: " + roundedZ;
        return finalResult;
    }
    public String returnRoundedOneNumber(double var){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);

        double roundedX = Double.parseDouble(decimalFormat.format(var));
        String finalResult = " "+ roundedX;
        return finalResult;
    }
}