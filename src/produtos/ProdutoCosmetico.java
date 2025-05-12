package produtos;

public class ProdutoCosmetico extends Produto{

    private final double imposto = 1.12;

    public ProdutoCosmetico(String nome, double precoBase){
        super(nome, precoBase);
//        this.nome = nome;
//        this.precoBase = precoBase;
//        this.imposto = imposto;
    }

    @Override
    public void cadastrar() {

        Produto produto = new ProdutoCosmetico(nome, precoBase);
        System.out.printf("Novo produto: %s cadastrado com sucesso!", nome);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * imposto;
    }
}
