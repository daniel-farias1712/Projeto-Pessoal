import java.util.Scanner;

public class Lojas {
    private Carteira minhaCarteira;
    private  Escolha escolha;
    public Lojas(Carteira minhaCarteira) {
        this.minhaCarteira = minhaCarteira;
    }
    public String toString() {
        return "Tabela de preços da mercearia:\n" +
                "1 - Cuscuz -- 2,50\n" +
                "2 - Coca-cola -- 3,00\n" +
                "3 - Leite -- 6,00";
    }
    public String mostrarPrecos() {
        return "Tabela de preços das bebidas:\n" +
                "1 - Expresso -- R$ 3,50\n" +
                "2 - Café do Sigma -- R$ 6,00";
    }

    public void Mercenharia(){
        String produtos="";
        int erro = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\033[32mBem vindo a mercenharia\033[0m");
        System.out.println(toString());
        System.out.println("Escolha o número do produto que você vai comprar:");
        int escolhaProduto = scan.nextInt();


        System.out.println("Quantos itens você irá comprar?");
        int quantidadeItens = scan.nextInt();

        double valortotal = 0;

        switch (escolhaProduto){
            case 1 :
                produtos = "Cuzcuz";
                valortotal=  2.00f;
                break;
            case   2:
                produtos =" Coca - Cola";
                valortotal = 3.00f;
                break;
            case    3:
                produtos = "lEITE";
                valortotal = 6.00f;
                break;
            default:
                System.out.println("Produto inválido.");
                return;
        }
        double valorTotalP =  (quantidadeItens  * valortotal);
        Long transformar = (long) valorTotalP;
        if (valorTotalP > minhaCarteira.getSaldo()){
            System.out.println("Suas compras excedem o seu saldo");
            escolherloja();
        }else {
            minhaCarteira.setSaldo(minhaCarteira.getSaldo() - transformar); // Subtrai o valor da carteira
            System.out.println("Sua compra de " + produtos+ "Custou " + valortotal);
            System.out.println("Com essa compra o seu saldo fica de -- " + minhaCarteira.getSaldo());
            minhaCarteira.adicionargastos(transformar);
        }
        }

    public void Cafeteria(){
            Scanner scan = new Scanner(System.in);
            double valorP = 0;
            String produto ="";
            String Amarelo = "\033[38;5;94m"; // Aproximação de marrom
            String Sublinhado = "\033[4m"; // Sublinhado
            String Restar = "\033[0m"; // Resetar a formatação
            String texto1 = Amarelo + Sublinhado + "Bem vindo à cafeteria" + Restar;

        System.out.println(texto1);
            System.out.println(mostrarPrecos());
            int escolha = scan.nextInt();

            switch (escolha){
                case   1:
                    valorP = 3.00;
                    produto = "Expresso";
                    break;
                case 2:
                    valorP = 6.00;
                    produto = "Café do Sigma";
                    break;
                default:
                    System.out.println("Sua escolha ainda não existe em nossa cafeteria");
                    return;

            }
            if (valorP> minhaCarteira.getSaldo()){
                System.out.println("Suas compras excedem o seu saldo");
                escolherloja();

            }
            long trasnformar1 = (long) valorP;
        System.out.println("Sua compra de "+ produto+"Custou um total de " +valorP);
        minhaCarteira.setSaldo(minhaCarteira.getSaldo() - trasnformar1);
        minhaCarteira.adicionargastos(trasnformar1);



        }
        public void escolherloja() {
            Scanner scan = new Scanner(System.in);
            System.out.println("1- para Mercenaria");
            System.out.println("2- para Cafeteria");
            System.out.println("3- Para retornar ao Menu Inicial");
            int esc1 = scan.nextInt();
            switch (esc1) {
                case 1:
                    Mercenharia();
                    break;
                case 2:
                    Cafeteria();
                    break;
                case 3:
                    Escolha.escolher();
                    break;
                default:
                    System.out.println("Escolha não existe");
                    escolherloja();
                    break;

            }
        }
}






