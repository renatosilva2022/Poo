public class Main {
    public static void main(String[] args) {
        // Criando um autor
        Autor autor = new Autor("Jessica Felix", 35);

        // Criando um livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Criando um usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Verificando disponibilidade do livro
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }

        // Realizando um empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario);

        // Exibindo informações
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}