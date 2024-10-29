public class Pessoa {
    String Nome = "";
    String   pais = "";
private static Pessoa instance;
    private Pessoa(){

    }
    public static Pessoa getInstance(){
    if(instance == null){
    instance = new Pessoa();

    }

        return instance;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getpais() {
        return pais;
    }

    public void setpais(String pais) {
        this.pais = pais;
    }
    }
