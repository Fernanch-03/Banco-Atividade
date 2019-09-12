package banco;


 
 
public class Principal{

        public static void main(String[] args) {    
        Banco b = new Banco();
        Funcionario f = new Funcionario();
        Cliente c = new Cliente();
        
        c.setBanco(b);
        c.setCodCliente(8765432);
        c.setCpf("XXX-4563-XXX-5445");
        c.setCredito(1000.00);
        c.setIdade(10);
        c.setNome("Borges");
        
        f.setBanco(b);
        f.setCodFuncionario(1099011);
        f.setCpf("YYY-5674-YYY-6556");
        f.setIdade(20);
        f.setNome("Nicolas");
        f.setSetor("Jogador de beisibol");
        
        b.setCliente(c);
        b.setCodBanco(2345678);
        b.setFuncionario(f);
        b.setNome("Santander");
        
       System.out.println(c.getBanco());
       System.out.println(c.getCodCliente());
       System.out.println(c.getCpf());
       System.out.println(c.getCredito());
       System.out.println(c.getIdade());
       System.out.println(c.getNome());
       
       System.out.println(f.getBanco());
       System.out.println(f.getCodFuncionario());
       System.out.println(f.getCpf());
       System.out.println(f.getIdade());
       System.out.println(f.getNome());
       System.out.println(f.getSetor());
       
       System.out.println(b.getCliente());
       System.out.println(b.getCodBanco());
       System.out.println(b.getFuncionario());
       System.out.println(b.getNome());
    }  
}
