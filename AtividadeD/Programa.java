package AtividadeD;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.getHabitat();
        cachorro.setId(1);
        cachorro.setNome("Luna");
        cachorro.setIdade(7);
        cachorro.setRaca("Lhasa apso");
        cachorro.setTipo("Doméstico");
        cachorro.setHabitat("Casas, apartamentos etc.");
        System.out.println("=========================== Ficha ===========================");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("\nNome: " + cachorro.getNome());
        System.out.println("\nIdade: " + cachorro.getIdade() + " anos");
        System.out.println("\nRaca: " + cachorro.getRaca());
        System.out.println("\nTipo: " + cachorro.getTipo());
        System.out.println("\nHabitat: " + cachorro.getHabitat() + "\n");
        cachorro.latir();
        System.out.println("=============================================================");

    }
}
