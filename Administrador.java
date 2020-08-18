package exemple;
public class Administrador extends Empregado{
    
    private double ajudaDeCusto;
    
    public Administrador(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Administrador(String nome, String telefone) {
        super(nome, telefone);
    }

    public Administrador(String nome) {
        super(nome);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario(){
        double salario = ((1-(this.getPorcentoImposto()/100))*this.getSalarioBase())+this.ajudaDeCusto;
        return salario;
    }
    
}
