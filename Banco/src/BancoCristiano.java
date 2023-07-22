public class BancoCristiano implements Banco {
    private Conta contaBancoCristiano;

    public BancoCristiano() {
        this.contaBancoCristiano = new Conta();
        this.contaBancoCristiano.setNomeProprietario("Banco Cristiano");
        this.contaBancoCristiano.setNumero(0);
        this.contaBancoCristiano.setSaldo(0d);
    }
    public void manutencaoConta(Conta conta) {
        double novoSaldo = conta.getSaldo() - 0.01;
        conta.setSaldo(novoSaldo);

        double saldoBanco = this.contaBancoCristiano.getSaldo() + 0.01;
        this.contaBancoCristiano.setSaldo(saldoBanco);
    }
    public boolean saque(Conta conta, double valor) {
        if(conta.getSaldo() >= valor) {
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo( novoValor );
            System.out.println("Saque efetuado!!!");

            manutencaoConta(conta);
            return true;
        } else {
            System.out.println("Não conseguiu fazer o saque!!!");
            extrato(conta);
            return false;
        }
    }
    public boolean deposito(Conta conta, double valor) {
        double novoValor = conta.getSaldo() + valor;
        conta.setSaldo(novoValor);
        System.out.println("Deposito efetuado!!!");

        manutencaoConta(conta);

        return true;
    }
    public void extrato(Conta conta) {
        System.out.println("\n -- BANCO CRISTIANO -- \n");
        System.out.println("-> EXTRATO CONTA\n");
        System.out.println("Nome: " + conta.getNomeProprietario());
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("\n---------------------\n");
    }
}