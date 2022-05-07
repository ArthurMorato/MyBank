import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conta extends Usuario{
    private Usuario dono;
    private int saldo;
    private List<String> tipos = List.of("comum","gerente","caixa"); //índices 0, 1 e 2.
    private String tipo;

    public Conta(String nome, int numConta, int saldo, int tipo) {
        super(nome,numConta);
        this.saldo = saldo;
        if(tipo == 0) {
            this.tipo = new String(tipos.get(0));
        } else if(tipo == 1){
            this.tipo = new String(tipos.get(1));
        } else {
            this.tipo = new String(tipos.get(2));
        }
    }



    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
