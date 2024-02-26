package AtividadeC;

public class Universidade {
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;
    private String UF;
    private String CNPJ;

    public Universidade(String nome, String rua) {
        this.nome = nome;
        this.rua = rua;
    }

    public String getNome(){
        return nome;
    }

    public String getRua() {
        return rua;
    }
    
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade(String novaCidade) {
        cidade = novaCidade;
        return cidade;
    }

    public String getUF() {
        return UF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}
