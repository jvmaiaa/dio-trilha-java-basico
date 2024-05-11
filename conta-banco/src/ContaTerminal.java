import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        Integer numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine().trim();
        System.out.println("Por favor, digite o seu Nome ! ");
        String nomeCliente = scan.nextLine().trim();
        System.out.println("Por favor, digite o Saldo que você quer inserir na conta ! ");
        BigDecimal saldo = scan.nextBigDecimal();
        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e o seu saldo " + conta.getSaldo() + " já está disponível para saque.");
        scan.close();
    }

    static class ContaBancaria {
        private Integer numero;
        private String agencia;
        private String nomeCliente;
        private BigDecimal saldo;

        public ContaBancaria(){
        }

        public ContaBancaria(Integer numero, String agencia, String nomeCliente, BigDecimal saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }

        public ContaBancaria(String agencia, String nomeCliente, BigDecimal saldo) {
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
            this.numero = 1021;
        }

        public Integer getNumero() {
            return numero;
        }
        public void setNumero(Integer numero) {
            this.numero = numero;
        }
        public String getAgencia() {
            return agencia;
        }
        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }
        public String getNomeCliente() {
            return nomeCliente;
        }
        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }
        public BigDecimal getSaldo() {
            return saldo;
        }
        public void setSaldo(BigDecimal saldo) {
            this.saldo = saldo;
        }

        
    }
}
