/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintatico.tree;

/**
 *
 * @author Carrara
 */
public class PrefixExp3 {
    Folha t_PARENTHESE_OPEN;
    Exp exp;
    Folha t_PARENTHESE_CLOSE;

    public PrefixExp3(Folha t_PARENTHESE_OPEN, Exp exp, Folha t_PARENTHESE_CLOSE) {
        this.t_PARENTHESE_OPEN = t_PARENTHESE_OPEN;
        this.exp = exp;
        this.t_PARENTHESE_CLOSE = t_PARENTHESE_CLOSE;
    }
    
    
    
}
