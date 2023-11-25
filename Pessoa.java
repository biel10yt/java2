public class Pessoa{
    private String nome, telefone;
    private int id, idade, cpf;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nNúmero de telefone: " + telefone + "\nPosição na fila: " + id;
    }
}