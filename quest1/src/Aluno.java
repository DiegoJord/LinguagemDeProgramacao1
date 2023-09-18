public class Aluno {
    private String nome;
    private int idade;
    private int matricula;

    public Aluno(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void MostrarDetalhes(){
        System.out.println("ALUNO: ");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Matricula: "+getMatricula());
    }
}
