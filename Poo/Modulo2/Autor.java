import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> obrasPublicadas;

    // Construtor
    public Autor(String nome, int idade) {
        super(nome, idade);
        this.obrasPublicadas = new ArrayList<>();
    }

    // Método para adicionar uma obra
    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    // Getter para obras publicadas
    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }
}