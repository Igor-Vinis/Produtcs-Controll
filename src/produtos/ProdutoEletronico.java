package produtos;

public class ProdutoEletronico extends Produto{

    private final double imposto = 1.2;

    public ProdutoEletronico(String nome, double precoBase){
        super(nome, precoBase);
//        this.nome = nome;
//        this.precoBase = precoBase;
//        this.imposto = imposto;
    }

    @Override
    public void cadastrar() {

        Produto produto = new ProdutoEletronico(nome, precoBase);
        System.out.printf("Novo produto: %s cadastrado com sucesso!", nome);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * imposto;
    }
}
