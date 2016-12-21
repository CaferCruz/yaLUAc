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
public class Field1 extends Field{
    Folha t_BRACKET_OPEN;
    Exp exp1;
    Folha t_BRACKET_CLOSE;
    Folha t_ATTRIBUTION;
    Exp exp2;

    public Field1(Folha t_BRACKET_OPEN, Exp exp1, Folha t_BRACKET_CLOSE, Folha t_ATTRIBUTION, Exp exp2) {
        this.t_BRACKET_OPEN = t_BRACKET_OPEN;
        this.exp1 = exp1;
        this.t_BRACKET_CLOSE = t_BRACKET_CLOSE;
        this.t_ATTRIBUTION = t_ATTRIBUTION;
        this.exp2 = exp2;
    }
    
    
}
