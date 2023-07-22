public class BancoSakurai implements Banco{
    private Conta contaBancoSakurai;

    public BancoSakurai(){
        this.contaBancoSakurai = new Conta();
        this.contaBancoSakurai.setNomeProprietario("Banco Sakurai");
        this.contaBancoSakurai.setNumero(0);
        this.contaBancoSakurai.setSaldo(0d);
    }
    public void manutencaoConta(Conta conta){
        boolean temSaldo = conta.getSaldo() >= 0.25;

        if (temSaldo){
            double novoSaldo = conta.getSaldo() - 25;
            conta.setSaldo(novoSaldo);

            deposito(this.contaBancoSakurai, 0.25);
        }else {
            System.out.println("Não conseguiu cobrar a manutenção da conta" + conta.getNumero() + "!!!");
        }
    }

    public boolean saque(Conta conta, double valor){
        if (conta.getSaldo() >= valor){
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo( novoValor );
            System.out.println("Saque efetuado!!!");

            manutencaoConta(conta);
            return true;
        }else {
            System.out.println("Não conseguiu fazer o saque!!!");
            extrato(conta);
            return false;
        }
    }
    public boolean deposito(Conta conta, double valor) {
        double novoValor = conta.getSaldo() + valor;
        conta.setSaldo(novoValor);
        System.out.println("Deposito efetuado!!!");
        return true;
    }
    public void extrato(Conta conta) {
        System.out.println("\n -- BANCO SAKURAI -- \n");
        System.out.println("-> EXTRATO CONTA\n");
        System.out.println("Nome: " + conta.getNomeProprietario());
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("\n---------------------\n");
    }
    public boolean transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        boolean fezSaque = saque(contaOrigem, valor);
        if(fezSaque) {
            deposito(contaDestino, valor);
            System.out.println("Transferencia efetuada.");
            return true;
        } else {
            System.out.println("Não conseguiu fazer a transferencia.");
            return false;
        }
    }
}
