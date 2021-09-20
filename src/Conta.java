public class Conta {

    //Atributos
    double numeroDaConta;
    String nomeDoTitular;
    double saldo = 0;

    //Método construtor
    public Conta(double numeroDaConta, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    //Métodos

    public void saque(double valorDoSaque){
        this.saldo -= valorDoSaque;
    }

    double valorDoDeposito = 0;
    public void deposita(double valorDoDeposito){
        this.saldo += valorDoDeposito;
    }

    public String extrato(){
        return nomeDoTitular
                + " "
                + numeroDaConta
                + " "
                + saldo;
    }


}
