public class CanetaVer3 {
    private String cor;
    private int carga;

    public CanetaVer3() {}

    public CanetaVer3(String cor, int carga) {
        this.cor = cor;
        this.carga = carga;
    }

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
