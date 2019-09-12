package banco;


public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    
    public void setNome(String nome){
        if(nome != ""){
           this.nome = nome;
        }
        else{}
    }
    
    public String getNome(){
          return this.nome;
    }
    
    public void setIdade(int idade){
           this.idade = idade;
        }
    
    
     public int getIdade(){
        return this.idade;
    }
         
    public void setCpf(String cpf){
        if(cpf != ""){
           this.cpf = cpf;
        }
        else{}
    }
    
    public String getCpf(){
          return this.cpf;
    }
    
 
    
}
