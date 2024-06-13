package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    //adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    //ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    //ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAutura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAutura, new ComparetorPorAutura());
        return pessoasPorAutura;
    }


    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoa.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
