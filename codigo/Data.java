public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Construtores
    public Data() {}
    public Data(int dia, int mes, int ano) {
        setDia (dia);
        setMes (mes);
        setAno (ano);
    }

    //Métodos Sets
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //Métodos Gets
    public int getDia() {
        return this.dia;
    }
    public int getAno() {
        return this.ano;
    }
    public int getMes() {
        return this.mes;
    }

    //Método toString
    public String toString() {
        return String.format ("%d/%d/%d", getDia(), getMes(), getAno());
    }
}
