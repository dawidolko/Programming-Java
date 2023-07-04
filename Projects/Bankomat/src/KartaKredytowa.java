class KartaKredytowa extends KartaBankomatowa implements KartaElektroniczna {
    public KartaKredytowa(double saldo, String pin) {
        super(saldo, pin);
    }
    @Override
    public boolean sprawdzPin(String pin) throws PinException {
        return super.sprawdzPin(pin);
    }
    @Override
    public boolean sprawdzSaldo(double kwota) {
        if (saldo >= kwota) {
            saldo -= kwota;
            return true;
        } else {
            if (saldo == 0) {
                System.out.println("\t\t\tKwota zadłużenia : " + kwota + "zł");
                return true;
            } else {
                System.out.println("\t\t\tKwota zadłużenia : " + Math.abs(saldo - kwota) + "zł");
                return true;
            }
        }
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }
    @Override
    public String getPin() {
        return super.getPin();
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
