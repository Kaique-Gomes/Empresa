package exemple;
public class Vendedor extends Empregado{

    private double valorVendas;
    private double comissao;
    
    public Vendedor(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Vendedor(String nome, String telefone) {
        super(nome, telefone);
    }

    public Vendedor(String nome) {
        super(nome);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
     public double calcularSalario(){
        double salario = (1-(this.getPorcentoImposto()/100))*(this.getSalarioBase()+(this.getValorVendas()*(this.getComissao()/100)));
        return salario;
    }
    
}
