package exemple;
public class Operario extends Empregado{

    private double valorProducao;
    private double comissao;
    
    public Operario(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Operario(String nome, String telefone) {
        super(nome, telefone);
    }

    public Operario(String nome) {
        super(nome);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        double salario = ((1-(this.getPorcentoImposto()/100))*(this.getSalarioBase()+(this.valorProducao*(this.comissao/100))));                            
        return salario;
    }
    
        
}
