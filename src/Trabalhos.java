import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Trabalhos {
    private Scanner scan = new Scanner(System.in);
    private List<Integer> valorTrabalho = new ArrayList<>();
    private Carteira minhaCarteira;

    public Trabalhos(Carteira minhaCarteira) {
        this.minhaCarteira = minhaCarteira;
    }


    public ArrayList<Integer> Valortrabalho = new ArrayList<>();

    public void Escolhertrabalho(){
        System.out.println("1- para capinar lote");
        System.out.println("2- para Fazer entrega");
        int esc1 = scan.nextInt();
        switch (esc1){
            case 1:
                capinar_lote();
                break;
            case 2:
                Fazerentragas();
                break;
            default:
                System.out.println("Escolha não existe");
                Escolhertrabalho();
                break;

        }
    }


    public void capinar_lote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voce escolhe capinar qual lote\n1-Lote de 10m\n2- Lote de 20m\n3- Lote de 30m\n Voce ira ganhar 1 real a cada 1m² capinado.  ");
        int Escolha = scanner.nextInt();


        if (Escolha == 1) {
            try {
                System.out.println("Capinando lote de 10m...");
                Thread.sleep(2000);
                System.out.println("Lote capinado Dinheiro Debitado em sua carteira");
                Valortrabalho.add(10);


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (Escolha == 2) {
            try {
                System.out.println("Capinando lote de 20m...");
                Thread.sleep(2000); // Pausa por 5 segundos
                System.out.println("Lote capinado. Dinheiro debitado em sua carteira.");
                Valortrabalho.add(20); // Adiciona 20 ao valor do trabalho
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Lança uma exceção se houver interrupção
            }
        } else if (Escolha == 3) {
            try {
                System.out.println("Capinando lote de 30m...");
                Thread.sleep(2000); // Pausa por 5 segundos
                System.out.println("Lote capinado. Dinheiro debitado em sua carteira.");
                Valortrabalho.add(30);

                LimpardinheiroTrabalho();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void LimpardinheiroTrabalho() {
        long soma = 0; // Mudei para long para corresponder ao tipo da lista
        for (long num : Valortrabalho) { // Certifique-se de que o nome da lista está correto
            soma += num; // Adiciona cada valor da lista à soma
        }
        System.out.println("Valor recebido em relação ao trabalho: " + soma);
        System.out.println("Saldo atual: " + minhaCarteira.getSaldo());
  minhaCarteira.setSaldo(minhaCarteira.getSaldo() + soma);
  minhaCarteira.adicionargastos(soma);
        Valortrabalho.clear();
        }



    public void Fazerentragas() {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int randon = 0;
        int valorganhodetrabalho;
        String trabalho = "";
        System.out.println("Escolha oque voce vai entragar");
        System.out.println("1 - Hambuguer -- Valor de 10 reais");
        System.out.println("2- Bebidas -- Valor de 20 reais ");
        System.out.println("3- Derivados--Valor aleatorio de no maximo 30 reais");
        int entregas = scanner.nextInt();
        for (int i = 0; i < 1; i++) {
            randon = gerador.nextInt(26);
        }
        try {
            switch (entregas) {


                case 1:
                    valorganhodetrabalho = 10;
                    trabalho = "Hambuguer";
                    break;
                case 2:
                    valorganhodetrabalho = 20;
                    trabalho = "Bebidas";
                    break;
                case 3:
                    valorganhodetrabalho = randon;
                    trabalho = " Derivados";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;

            }
            System.out.println("Fazendo entrega de " + trabalho);
            Thread.sleep(3000);
            System.out.println("Entrega feita adicionando o valor a seu saldo");
            Valortrabalho.add(valorganhodetrabalho);
            LimpardinheiroTrabalho();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

