package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);

        System.out.println(meuProduto.getMarca());

        meuProduto.setNome("Play Station 5");
        meuProduto.setValor(30);
        // meuProduto.setTamanho(Tamanho.PEQUENO);
        meuProduto.setMarca("JL");


        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso); // 0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso); // 1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabos de Energia",2);
        itensInclusos.add(terceiroItemIncluso); // 2

        meuProduto.setItensInclusos(itensInclusos);

        //System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        //System.out.println(meuProduto.getItensInclusos());

        // System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        // System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        // System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        // System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        // System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        //  System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());


        System.out.println("Comecando a apresentar os itens");

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());

        }

        System.out.println("Acabaram-se o itens");


        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO );
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.PEQUENO);
        meuProdutoInternacional.setTaxaInternacional(0.35876);
        System.out.println(meuProdutoInternacional.getTaxaInternacional());
        meuProdutoInternacional.setValor(-25);
    }


}
