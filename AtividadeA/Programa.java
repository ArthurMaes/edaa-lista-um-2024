public class Programa{
    public static void main(String[] args) {
        Livro livro = new Livro();

        System.out.println("================== Livro ==================");

        livro.setTitulo("E não sobrou nenhum");
        System.out.println("\nTitulo: "+ livro.getTitulo());

        livro.setAutor("Agatha Christie");
        System.out.println("\nAutor(a): "+ livro.getAutor());

        livro.setSinopse("Na ilha do Soldado, antiga propriedade de um milionário norte-americano,\ndez pessoas sem nenhuma ligação aparente são confrontadas por uma voz misteriosa com fatos\nmarcantes de seus passados.");
        System.out.println("\nSinopse: "+ livro.getSinopse());

        livro.setPaginas("400 páginas");
        System.out.println("\nNúmero de páginas: "+ livro.getPaginas());

    }
}
