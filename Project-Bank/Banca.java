class Banca {

  public static void main (String[] args){
    //  CREO DUE ISTANZE DELLA CLASSE ContoCorrente
    ContoCorrente conto1 = new ContoCorrente(10000);
    ContoCorrente conto2 = new ContoCorrente(20000);

    //ORA ESEGUO UN DEPOSITO E IN PRELIEVO PER IL conto1

    conto1.deposito(8000);
    conto1.prelievo(1000);

    conto2.deposito(2000);
    conto2.prelievo(500);

    double saldo1 = conto1.saldo();
    double saldo2 = conto2.saldo();

    System.out.println("Il Saldo del Conto 1 = " + saldo1);
    System.out.println("Il Saldo del Conto 2 = " + saldo2);
  }
}
