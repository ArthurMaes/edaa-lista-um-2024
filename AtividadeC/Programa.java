package AtividadeC;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ellen", 19, "13256910936");
        Professor professor = new Professor("Daniel Paiva", 31, "14141414", "Graduação e Pós Graduação");
        Universidade universidade = new Universidade("UNA", "Rua dos Professores");
        Disciplina disciplina = new Disciplina();
        System.out.println("============================== Programa ==============================");
        System.out.println("\nAluno(a): " + aluno.GetNome());
        System.out.println("\nIdade: " + aluno.GetIdade());
        System.out.println("\nCPF: " + aluno.getCpf());
        System.out.println("\nProfessor: " + professor.getNome());
        System.out.println("\nFormação: " + professor.getFormacao());
        System.out.println("\nUniversidade: " + universidade.getNome());
        System.out.println("\nRua: " + universidade.getRua() + "\n");
        disciplina.lancarPresenca(3, aluno);
        System.out.println("======================================================================");

    
    }
    
}
