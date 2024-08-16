import com.codedemonbr.NationalBank.Banco;
import com.codedemonbr.NationalBank.Cliente;
import com.codedemonbr.NationalBank.ContaCorrente;
import com.codedemonbr.NationalBank.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente jose = new Cliente("Antonio Silva", "123456789", new ContaPoupanca());
        Cliente pedro = new Cliente("Pedro Souza", "789456123", new ContaCorrente());

        Banco banco = new Banco("National Bank", "7777898999991");

        banco.cadastrarCliente(jose);
        banco.cadastrarCliente(pedro);

        pedro.conta.depositar(100);

        jose.conta.depositar(50);

        pedro.conta.transferir(20, jose.conta);

        System.out.println(banco);

//        System.out.println(pedro);
//        System.out.println(jose);

    }
}