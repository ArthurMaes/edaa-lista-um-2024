package AtividadeC;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ellen", 19, "13256910936");
        Professor professor = new Professor("Daniel Paiva", 31, "14141414", "Graduação e Pós Graduação");
        Universidade universidade = new Universidade("UNA", "Rua dos Professores");
        Disciplina disciplina = new Disciplina();
        universidade.setCNPJ("05.648.257/0001-78");
        universidade.setBairro("Eldorado");
        System.out.println("============================== Programa ==============================");
        System.out.println("\nAluno(a): " + aluno.GetNome());
        System.out.println("\nIdade: " + aluno.GetIdade());
        System.out.println("\nCPF: " + aluno.getCpf());
        System.out.println("\nProfessor: " + professor.getNome());
        System.out.println("\nIdade do professor: " + professor.getIdade());
        System.out.println("\nCPF do professor: " + professor.getCpf());
        System.out.println("\nFormação: " + professor.getFormacao());
        System.out.println("\nUniversidade: " + universidade.getNome());
        System.out.println("\nCNPJ: " + universidade.getCNPJ());
        System.out.println("\nBairro: " + universidade.getBairro());
        System.out.println("\nRua: " + universidade.getRua() + "\n");
        disciplina.lancarPresenca(3, aluno);
        System.out.println("======================================================================");

    
    }
    
}
