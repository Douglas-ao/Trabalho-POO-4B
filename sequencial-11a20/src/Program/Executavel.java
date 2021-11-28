package Program;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Relatorio;

/**
 * 
 * @author Douglas Oliveira / André de Souza
 * Execute o m�todo gerar relat�rio para cada conta criada. 
 */
public class Executavel {
   
    
    public static void main(String[] args) {
        operacoes();
    }
    public static void operacoes(){
        ContaCorrente  cc= new ContaCorrente();
        ContaPoupanca  cp= new ContaPoupanca();
        
        cc.setNumeroDeConta(1234);
        //cc.depositar(1200);
        
        cp.setNumeroDeConta(5678);
        cp.depositar(1200);
        
       // cc.sacar(200);
        cp.sacar(1250);
        
        Relatorio r = new Relatorio();
        
        //r.gerarRelatorio(cc);
        r.gerarRelatorio(cp);
    }
    
    
}
