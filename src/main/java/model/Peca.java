/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author felip
 */
public abstract class Peca {

    private int valor;

    public Peca(int valor) {
        super();
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    public abstract boolean isJogadaValida(int[] posInicial, int[] posFinal);

}
