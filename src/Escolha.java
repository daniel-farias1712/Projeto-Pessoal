import java.util.Scanner;

public class Escolha {

    public static int escolher() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite --1-- para verificar o saldo da sua carteira \n" +
                "digite --2-- Para ver os trabalhos disponíveis\n" +
                "Digite --3-- Para ver as lojas disponíveis\n" +
                "Digite --4-- Para sair");
        return scan.nextInt(); // Retorna a escolha do usuário
    }
}



