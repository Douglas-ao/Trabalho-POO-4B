package modelo;

/**
 * 
 * @author Douglas Oliveira / André de Souza
 *15) Crie uma classe Relat�rio que possui um m�todo gerarRelat�rio que 
 * receba um objeto imprim�vel e executa o m�todo mostrarDados do objeto.
 */
public class Relatorio {
    public void gerarRelatorio(Imprimivel imp){
        imp.mostrarDados();
    }
}
