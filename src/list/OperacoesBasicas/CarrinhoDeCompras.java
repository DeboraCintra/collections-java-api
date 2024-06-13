package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;
    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //implementando os metodos
    //adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }
    //removerItem(String nome): Remove um item do carrinho com base no seu nome.
    public void  removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){ //valida se tem algum conteudo na lista e retorna true ou false
            for(Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else
            System.out.println("A lista esta vazia");
    }
    //calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal(){
        double valorTotal =0d;
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
        }else System.out.println("A lista esta vazia");
        return valorTotal;
    }

    //exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens(){
        System.out.println(this.itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    //VALIDAR AS FUNÇÕES CRIADAS!
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //add itens no carrinho
        carrinhoDeCompras.adicionarItem("caneta",2.00,2);
        carrinhoDeCompras.adicionarItem("lapis",1.00,1);
        carrinhoDeCompras.adicionarItem("borracha",0.50,3);
        carrinhoDeCompras.adicionarItem("borracha",0.50,3);

        //listando os itens adicionados
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

        //excluindo
        carrinhoDeCompras.removerItem("borracha");
        
        //listando os itens adicionados
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}
