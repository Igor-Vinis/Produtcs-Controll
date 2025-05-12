package produtos;

public class ProdutoFactory {

    public static Produto criarProduto(String nome, double precoBase, int tipo){

        if (tipo == 1){
            return new ProdutoEletronico(nome, precoBase);
        } else if (tipo == 2) {
            return new ProdutoAlimenticio(nome, precoBase);
        } else if (tipo == 3) {
            return new ProdutoCosmetico(nome, precoBase);
        } else{
            System.out.println("Algo de errado não está certo.. Veja esse tipo de produto novamente.");
        }
        return null;
    }
}
