class KartaPlatnicza extends KartaBankomatowa implements KartaElektroniczna {
    public KartaPlatnicza(double saldo, String pin) {
        super(saldo, pin);
    }

    @Override
    public boolean sprawdzPin(String pin) throws PinException {
        return super.sprawdzPin(pin);
    }

    @Override
    public boolean sprawdzSaldo(double kwota) throws SaldoException {
        return super.sprawdzSaldo(kwota);
    }

    @Override
    public String getPin() {
        return super.getPin();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void setPin(String pin) {
        super.setPin(pin);
    }
}
