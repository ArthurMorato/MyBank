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
        Scanner in = new Scanner(System.in);
        while(flag) {
            System.out.println("" +
                    "\n\n[X] MY BANK MANU [X]\n" +
                    "1 - CRIAR UMA CONTA\n" +
                    "2 - CONSULTAR CONTA\n" +
                    "0 - PARA SAIR");
            switch (in.nextInt()) {
                case 1:
                    CriarConta();
                    break;
                case 2:
                    Consultar();
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
        System.out.println("CRIANDO UMA CONTA=>\n" +
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

    public void Consultar(){
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        boolean flag2 = true;
        int aux2, aux3;
        System.out.println("CONSULTAR CONTA=>\n" +
                "NUMERO DA CONTA: ");
        //in.nextLine();
        int aux = in.nextInt();
        for (Conta tempConta : Contas) {
            if(aux == tempConta.getNumConta()){
                while (flag2) {
                    System.out.println("O QUE DESEJA FAZER:\n" +
                            "1 - SAQUE\n" +
                            "2 - DEPOSITO\n" +
                            "3 - SALDO\n" +
                            "4 - TRANSFERIR\n" +
                            "0 - SAIR");
                    switch (in.nextInt()) {
                        case 0:
                            flag2 = false;
                            break;
                        case 1:
                            System.out.println("SAQUE:\n" +
                                    "VALOR: ");
                            tempConta.setSaldo(tempConta.getSaldo()-in.nextInt());
                            break;
                        case 2:
                            System.out.println("DEPOSITO\n" +
                                    "VALOR: ");
                            tempConta.setSaldo(tempConta.getSaldo()+in.nextInt());
                            break;
                        case 3:
                            System.out.println("SALDO:\n" +
                                    "VALOR: " + tempConta.getSaldo() + "\n");
                            break;
                        case 4:
                            System.out.println("TRANSFERÊNCIA:\n" +
                                    "CONTA: ");
                            aux2 = in.nextInt();
                            for (Conta tempConta2 : Contas) {
                                if(aux2 == tempConta2.getNumConta()){
                                    System.out.println("VALOR: ");
                                    aux3 = in.nextInt();
                                    tempConta.setSaldo(tempConta.getSaldo()-aux3);
                                    tempConta2.setSaldo(tempConta2.getSaldo()+aux3);
                                    System.out.println("TRANSFERIDO");
                                }
                            }
                            System.out.println("\n");
                            break;
                    }
                }
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("NÃO ENCONTRADO!");
        }
    }
}
