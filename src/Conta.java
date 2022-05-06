import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conta {
    private Usuario dono = new Usuario("NUNO SILVA", 1);
    private int saldo;
    private List<String> tipos = List.of("comum","gerente","caixa"); //índices 0, 1 e 2.
    private int tipo;

    public Conta(String nome, int numConta, int saldo, int tipo) {
        this.dono.setNome(nome);
        this.dono.setNumConta(numConta);
        this.saldo = saldo;
        if(tipo == 0) {
            this.tipo = tipos.indexOf(0);
        } else if(tipo == 1){
            this.tipo = tipos.indexOf(1);
        } else {
            this.tipo = tipos.indexOf(2);
        }
    }
}
