package app;

import produtos.Produto;
import produtos.ProdutoFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Bem vindo! Por favor, cadastre ao menos 1 produto.\n");

        while(true){
            System.out.print("Por favor, digite o nome do produto: ");
            String nome = scan.nextLine();
            System.out.print("Certo, agora digite o valor inicial do produto: ");
            double precoBase = scan.nextDouble();
            System.out.print("Por fim, digite o tipo do produto:\n1. Eletrônico\n2.Alimentício\n3.Cosmético\n> ");
            int tipo = scan.nextInt();
//            Produto produtc = ProdutoFactory.criarProduto(nome, precoBase, tipo);
            produtos.add(ProdutoFactory.criarProduto(nome,precoBase,tipo));
            System.out.print("Produto cadastrado com sucesso! Gostaria de cadastrar outro?\n1. Sim\n2. Não\n > ");
            int continuar = scan.nextInt();
            if (continuar == 1){
                continue;
            } else {
                break;
            }
        }

        for(Produto p: produtos){
            p.calcularPrecoFinal();
            p.exibirResumo();
        }


    }
}
