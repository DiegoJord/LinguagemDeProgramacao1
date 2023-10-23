import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<Pessoa>pessoas = new ArrayList<Pessoa>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("Cadastrado com sucesso!");
    }

    public void listar(){
        for (Pessoa p : pessoas) {
            System.out.println("Nome:" + p.getNome());
            System.out.println("Idade:" + p.getIdade());
        }
    }
}
