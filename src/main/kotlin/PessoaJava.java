public class PessoaJava {
    private final String nome;
    private final Integer idade;

    public PessoaJava(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
