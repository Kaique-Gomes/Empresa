package exemple;

public class Fornecedor extends Pessoa{
    private double valorCredito; //crédito máximo atribuído ao fornecedor
    private double valorDivida; //montante da dívida para com o fornecedor

    public Fornecedor(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Fornecedor(String nome, String telefone) {
        super(nome, telefone);
    }

    public Fornecedor(String nome) {
        super(nome);
    }

    public double getValorCredito(){
        return this.valorCredito;
    }

    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }

    public double getValorDivida(){
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        double saldo = this.valorCredito - this.valorDivida;
        return saldo;
    }
	
}
