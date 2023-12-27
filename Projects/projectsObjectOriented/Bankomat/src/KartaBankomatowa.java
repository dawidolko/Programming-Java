class KartaBankomatowa implements KartaElektroniczna {
    double saldo;
    String pin;

    public KartaBankomatowa(double saldo, String pin) {
        this.saldo = saldo;
        this.pin = pin;
    }

    public boolean sprawdzPin(String pin) throws PinException {
        if (pin.equals(this.pin)) {
            return true;
        } else {
            throw new PinException("\t\t\tNiepoprawny PIN.");
        }
    }

    public boolean sprawdzSaldo(double kwota) throws SaldoException {
        if (saldo >= kwota) {
            saldo -= kwota;
            return true;
        } else {
            throw new SaldoException("\t\t\tNiewystarczające saldo.");
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}