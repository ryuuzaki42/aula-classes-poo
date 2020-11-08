public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;

    //Construtores
    public Cliente(){}
    public Cliente(String nome, String sobrenome, String cpf, String rg) {
        setNome (nome);
        setSobrenome (sobrenome);
        setCpf (cpf);
        setRg (rg);
    }

    //Métodos Sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    //Métodos Gets
    public String getNome() {
        return this.nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getRg() {
        return this.rg;
    }

    //Método toString
    public String toString() {
        return String.format ("\nNome: %s\nSobrenome : %s\nCPF: %s\nRG: %s", getNome(), getSobrenome(), getCpf(), getRg());
    }
}
