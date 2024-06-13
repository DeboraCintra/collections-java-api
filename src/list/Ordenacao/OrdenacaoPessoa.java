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
}
