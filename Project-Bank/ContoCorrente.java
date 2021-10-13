public class ContoCorrente {
    private double saldo;

    ContoCorrente(double saldo) {
        this.saldo = saldo;
    };

    public double saldo() {
        return this.saldo;
    };

    public void deposito(double importo) {
        saldo += importo;
    };

    public void prelievo(double importo) {
        saldo -= importo;
    };

}
