public class PessoaComum extends Pessoa{

    @Override
    public String toString() {
        return super.toString() + "\nPaciente não prioritário " +
        "\n ---------------------";
    }
}