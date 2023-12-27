public interface KartaElektroniczna {
    boolean sprawdzPin(String pin) throws PinException;

    boolean sprawdzSaldo(double kwota) throws SaldoException;

    double getSaldo();
    void setPin(String Pin);
    String getPin();
    void setSaldo(double Saldo);

}
