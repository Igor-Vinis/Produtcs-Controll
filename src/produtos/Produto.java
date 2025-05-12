package produtos;

public abstract  class Produto implements Cadastravel{

    protected String nome;
    protected double precoBase;


    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;

    }

    public abstract double calcularPrecoFinal();

    public void exibirResumo(){
        System.out.printf("Produto: %s | Preço final: R$ %.2f",nome,precoBase);
    }
}
