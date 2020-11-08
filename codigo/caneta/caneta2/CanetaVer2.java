public class CanetaVer2 {
    private String cor;
    private int carga;

    //getters
    public String getCor() {
        return this.cor;
    }
    public int getCarga() {
        return this.carga;
    }

    //setters
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
    }
}
