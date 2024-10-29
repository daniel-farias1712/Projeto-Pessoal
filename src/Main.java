import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carteira minhaCarteira = new Carteira(0);
        Trabalhos trabalho = new Trabalhos(minhaCarteira);
        Lojas loja = new Lojas(minhaCarteira);


        Pessoa pessoa = Pessoa.getInstance();
        System.out.println("Digite o nome que sera usado No cadrasto:");
        String nome = scan.nextLine();
        System.out.println("Digite seu pais de origem");
        String pais = scan.nextLine();
        pessoa.setNome(nome);
        pessoa.setpais(pais);
        int escolha;

        do {
            escolha = escolher();

            switch (escolha) {
                case 1:
                   minhaCarteira.mostrarValores();
                    System.out.println(minhaCarteira.getSaldo());
                    trabalho.LimpardinheiroTrabalho();
                    trabalho.Valortrabalho.forEach(v -> System.out.println(v));
                    break;
                case 2:
                    trabalho.Escolhertrabalho();
                    break;
                case 3:
                    loja.escolherloja();
                    //trabalho.LimpardinheiroTrabalho();
                    break;
                case 4:
                    try{

                    System.out.println("Fechando aplicação...");
                    Thread.sleep(2000);
                    System.exit(0);
                   // trabalho.LimpardinheiroTrabalho();
            }catch (InterruptedException e) {
                        System.out.println("Houve um erro ao tentar fechar a plicação");
                    }
                default:
                    throw new IllegalStateException("Unexpected value: " + escolha);
            }


        } while (escolha != 0);

        }
    public static int escolher() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite --1-- para verificar o saldo da sua carteira \n" +
                "digite --2-- Para ver os trabalhos disponíveis\n" +
                "Digite --3-- Para ver as lojas disponíveis\n" +
                "Digite --4-- Para sair");
        return scan.nextInt(); // Retorna a escolha do usuário
    }
    }
