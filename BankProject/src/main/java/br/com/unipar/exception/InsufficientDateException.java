package br.com.unipar.exception;

/**
 *
 * @author andre
 */
public class InsufficientDateException extends RuntimeException {
    
    public InsufficientDateException() {
        super ("N�o � poss�vel obter resultado com a data nula!");
    }
}
