import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private LocalDate data;
    private List<LocalDate> swieta;

    public Data(int rok, int miesiac, int dzien) {
        this.data = LocalDate.of(rok, miesiac, dzien);
        this.swieta = new ArrayList<>();
        odczytajSwietaZPliku("swieta.txt");
    }

    private void odczytajSwietaZPliku(String sciezka) {
        try (BufferedReader br = new BufferedReader(new FileReader(sciezka))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                LocalDate swieto = LocalDate.parse(linia, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                swieta.add(swieto);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    public void przesunDate(int liczbaDni, int liczbaMiesiecy) {
        data = data.plusDays(liczbaDni).plusMonths(liczbaMiesiecy);
    }

    public long roznicaWDniach(Data innaData) {
        return ChronoUnit.DAYS.between(this.data, innaData.data);
    }

    public String sformatujDate(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return data.format(formatter);
    }

    public boolean czySwieto() {
        return swieta.contains(data);
    }

    public LocalDate getData() {
        return data;
    }

    public List<LocalDate> getSwieta() {
        return swieta;
    }
}