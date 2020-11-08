public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    public Endereco( ){}
    public Endereco(String pais, String estado, String cidade, String bairro, String rua, int numero){
        setPais(pais);
        setEstado(estado);
        setCidade(cidade);
        setBairro(bairro);
        setRua(rua);
        setNumero(numero);
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRua() {
        return this.rua;
    }
    public String getPais() {
        return this.pais;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getCidade() {
        return this.cidade;
    }
    public String getBairro() {
        return this.bairro;
    }
    public int getNumero() {
        return this.numero;
    }

    public String toString(){
      return String.format("Endereço\nPaís : %s\nEstado : %s\nCidade : %s\nBairro : %s\nRua : %s\nNumero : %d", getPais(), getEstado(), getCidade(), getBairro(), getRua(), getNumero());
   }
}
