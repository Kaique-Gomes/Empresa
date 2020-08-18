package exemple;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Yuri");
        Pessoa p2 = new Pessoa("Kaique","11-123456");
        Pessoa p3 = new Pessoa("Gustavo","11-987654","Rua");

        Fornecedor f1 = new Fornecedor("Leo");
        f1.setValorCredito(150);
        f1.setValorDivida(100);
        
        Empregado e1 = new Empregado("Hiroshi","11-123789");
        e1.setPorcentoImposto(10);
        e1.setSalarioBase(5000);
        
        Administrador a1 =new Administrador("Maria Lucia","11-11111");
        a1.setPorcentoImposto(15);
        a1.setSalarioBase(6000);
        a1.setAjudaDeCusto(500);
        
        Operario op1 = new Operario("Brian","11-9999999");
        op1.setPorcentoImposto(10);
        op1.setSalarioBase(5000);
        op1.setValorProducao(2000);
        op1.setComissao(5);
        
        Vendedor v1 = new Vendedor("Bruno","11-888888");
        v1.setPorcentoImposto(10);
        v1.setSalarioBase(5000);
        v1.setValorVendas(2000);
        v1.setComissao(10);

        System.out.println(p1.getNome());
        System.out.println(p2.getTelefone());
        System.out.println(p3.getEndereco());
        System.out.println(f1.obterSaldo());
        System.out.println(e1.getNome()+": R$ "+e1.calcularSalario());
        System.out.println(a1.getNome()+": R$ "+a1.calcularSalario());
        System.out.println(op1.getNome()+": R$ "+op1.calcularSalario());
        System.out.println(v1.getNome()+": R$ "+v1.calcularSalario());
        
    }
    
}
