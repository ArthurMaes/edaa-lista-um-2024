package AtividadeC;

public class Aluno {
    private String nome;
    private int idade;
    private String cpf;

    public Aluno(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String GetNome(){
        return nome;
    }

    public int GetIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}
