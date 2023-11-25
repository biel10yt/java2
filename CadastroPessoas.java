import java.util.ArrayList;
public class CadastroPessoas{
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listar() {
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}