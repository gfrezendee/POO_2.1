public class DVD extends Midia {

    private int nFaixas;

    public DVD() {
    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return "Código: " + this.getCodigo() + "\n" +
                "Preço: R$ " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Número de faixas: " + this.getnFaixas();
    }

    @Override
    public void inserirDados() {
        System.out.println("Digite o código do DVD:");
        this.setCodigo(Integer.parseInt(System.console().readLine()));

        System.out.println("Digite o preço do DVD:");
        this.setPreco(Double.parseDouble(System.console().readLine()));

        System.out.println("Digite o nome do DVD:");
        this.setNome(System.console().readLine());

        System.out.println("Digite o número de faixas do DVD:");
        this.setnFaixas(Integer.parseInt(System.console().readLine()));
    }
}
