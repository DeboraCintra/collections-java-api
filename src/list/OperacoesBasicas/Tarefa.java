package list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;
    //alt + insert --> Constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
