import java.util.ArrayList;
import java.util.List;

public class Carteira {


    private long saldo = 0 ;

    private List<Long> qntGastou;



    public Carteira(long saldo) {
        this.saldo = saldo;
        this.qntGastou = new ArrayList<>();
    }


    public long getSaldo() {
        return saldo;
    }


    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public void adicionargastos(long valorGasto){
        qntGastou.add(valorGasto);
    }
    public List<Long> getGastos() {
        return qntGastou;
    }

    public void mostrarValores() {
        System.out.println("Valores gastos:");
        for (Long valor : qntGastou) {
            System.out.println(valor);
        }
}


}
