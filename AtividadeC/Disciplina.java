package AtividadeC;

import java.text.MessageFormat;

public class Disciplina {
    private String nome;
    private double presencaDiaria;
    private String prova;
    private Aluno aluno;

    public void lancarPresenca(int qtdeAulaVista, Aluno aluno){
        presencaDiaria = qtdeAulaVista;
        System.out.println(MessageFormat.format("Aluno(a) {0} presente em aula!", aluno.GetNome()));
    }

}
