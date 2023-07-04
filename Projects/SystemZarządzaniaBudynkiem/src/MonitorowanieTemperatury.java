public class MonitorowanieTemperatury {
    private double temperaturyWody;
    private double temperaturyPowietrza;

    public MonitorowanieTemperatury() {
        this.temperaturyWody = 0.0;
        this.temperaturyPowietrza = 0.0;
    }

    public MonitorowanieTemperatury(double temperaturyWody, double temperaturyPowietrza) {
        this.temperaturyWody = temperaturyWody;
        this.temperaturyPowietrza = temperaturyPowietrza;
    }

    // gettery i settery

    public double getTemperaturyWody() {
        return temperaturyWody;
    }

    public void setTemperaturyWody(double temperaturyWody) {
        this.temperaturyWody = temperaturyWody;
    }

    public double getTemperaturyPowietrza() {
        return temperaturyPowietrza;
    }

    public void setTemperaturyPowietrza(double temperaturyPowietrza) {
        this.temperaturyPowietrza = temperaturyPowietrza;
    }
}
