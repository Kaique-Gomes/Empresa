package exemple;
public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase; //vencimento base
    private double porcentoImposto; //% do imposto em salarios
    
    Empregado(String nome, String telefone, String endereco){
        super(nome, telefone, endereco);
    }
    
    Empregado(String nome, String telefone){
        super(nome, telefone);
    }
    
    Empregado(String nome){
        super(nome);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPorcentoImposto() {
        return porcentoImposto;
    }

    public void setPorcentoImposto(double porcentoImposto) {
        this.porcentoImposto = porcentoImposto;
    }
    
    public double calcularSalario(){
        double salario = (1-(this.getPorcentoImposto()/100))*this.getSalarioBase();
        return salario;
    }
    
}
