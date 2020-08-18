package exemple;

public class Pessoa {
    private String endereco, nome, telefone;
	
    Pessoa(String nome, String telefone, String endereco){
        this(nome, telefone);
        this.endereco = endereco;
    }

    Pessoa(String nome, String telefone){
        this(nome);
        this.telefone = telefone;
    }

    Pessoa(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
