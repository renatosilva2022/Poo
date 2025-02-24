import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private List<Emprestimo> historicoEmprestimos;

    // Construtor
    public Usuario(String nome, int idade) {
        super(nome, idade);
        this.historicoEmprestimos = new ArrayList<>();
    }

    // Método para adicionar um empréstimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }

    // Getter para histórico de empréstimos
    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}