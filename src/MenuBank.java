import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuBank {
    List<Conta> Contas = new ArrayList<>();
    public static void main(String[] args) {
    }

    public MenuBank() {
        System.out.println("" +
                "\n\nOlá,\n" +
                "bem vindo ao MyBank! Como anda sua conta hoje?\n");
    }

    public void Menu(){
        boolean flag = true;
        Scanner op = new Scanner(System.in);
        while(flag) {
            System.out.println("" +
                    "\n\n[X] MY BANK MANU [X]\n" +
                    "1 - CRIAR UMA CONTA\n" +
                    "2 - CUNSULTAR CONTA\n" +
                    "0 - PARA SAIR");
            switch (op.nextInt()) {
                case 1:
                    CriarConta();
                    break;
                case 2:
                    System.out.println("option 2\n");
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }

    public void CriarConta(){
        Scanner in = new Scanner(System.in);
        int aux1, aux2, aux4;
        String aux3;
        System.out.println("CRIANDO UMA CONTA:\n" +
                "NOME: ");
        // SEM NEXTLINE A ÚLTIMA LEITURA FEITA SERÁ O \n
        in.nextLine();
        aux3 = new String(in.toString());
        System.out.println("NUMERO DE CONTA: ");
        aux1 = in.nextInt();
        System.out.println("SALDO DA CONTA: ");
        aux2 = in.nextInt();
        System.out.println("TIPO DE CONTA: ");
        aux4 = in.nextInt();
        Contas.add(NewConta(aux3, aux1, aux2, aux4));
        System.out.println("CONTA CRIADA!");

    }

    public Conta NewConta(String nome, int numConta, int saldo, int tipo){
        return new Conta(nome, numConta, saldo, tipo);
    }
}
