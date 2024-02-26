package AtividadeC;

public class Professor {
    private String nome;
    private int idade;
    private String cpf;
    private String formacao;

    public Professor(String nome, int idade, String cpf, String formacao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getFormacao() {
        return formacao;
    }
}
