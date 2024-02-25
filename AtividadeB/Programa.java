package AtividadeB;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println("================= Ficha Pessoa =================");

        pessoa.nome = "Arthur Maestri";
        System.out.println("\nNome da pessoa: "+ pessoa.nome);

        pessoa.cpf = "123.456.789-01";
        System.out.println("\nCPF: "+ pessoa.cpf);

        pessoa.idade = 19;
        System.out.println("\nIdade: "+ pessoa.idade +" anos");

        pessoa.altura = 1.79;
        System.out.println("\nAltura: "+ pessoa.altura);

        pessoa.peso = 92.6;
        System.out.println("\nPeso: "+ pessoa.peso +"Kg");

        System.out.println("\n==================================================");


    }
}
