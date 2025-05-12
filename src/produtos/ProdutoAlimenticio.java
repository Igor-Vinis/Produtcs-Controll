package produtos;

public class ProdutoAlimenticio extends Produto{

    private final double imposto = 1;

    public ProdutoAlimenticio(String nome, double precoBase){
        super(nome, precoBase);
//        this.nome = nome;
//        this.precoBase = precoBase;
//        this.imposto = imposto;
    }

    @Override
    public void cadastrar() {

        Produto produto = new ProdutoAlimenticio(nome, precoBase);
        System.out.printf("Novo produto: %s cadastrado com sucesso!", nome);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * imposto;
    }
}
