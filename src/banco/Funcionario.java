package banco;


public class Funcionario extends Pessoa {
    private int codFuncionario;
    private String setor;
    private Banco banco;
    
    public void setCodFuncionario(int codFuncionario){
        this.codFuncionario = codFuncionario;
    }
    
    
     public int getCodFuncionario(){
        return this.codFuncionario;
    }
    
     public void setSetor(String setor){
         if(setor != ""){
        this.setor = setor;
         }
         else{}
    }
    
    
     public String getSetor(){
        return this.setor;
    }
        
     public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    
     public Banco getBanco(){
        return this.banco;
    }
}
