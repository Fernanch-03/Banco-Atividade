package banco;


public class Cliente extends Pessoa {
    private int codCliente;
    private double credito;
    private Banco banco;
    
    public void setCodCliente(int codCliente){
        this.codCliente = codCliente;
        }
    
    
     public int getCodCliente(){
        return this.codCliente;
    }
    
     public void setCredito(double credito){
        this.credito = credito;
    }
    
    
     public double getCredito(){
        return this.credito;
    }
        
     public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    
     public Banco getBanco(){
        return this.banco;
    }
}
