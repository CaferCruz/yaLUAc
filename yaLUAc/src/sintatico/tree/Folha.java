/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintatico.tree;
import lexico.Tokens;

/**
 *
 * @author cafer
 */
public class Folha {
    Tokens token;
    String dado;
    
    public Folha(Tokens token, String dado) {
        this.token = token;
        this.dado = dado;
    }
}
