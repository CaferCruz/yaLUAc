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
public class Var1 extends Var {

    PrefixExp prefixexp;
    Folha t_BRACKET_OPEN;
    Exp exp;
    Folha t_BRACKET_CLOSE;

    public Var1(PrefixExp prefixexp, Folha t_BRACKET_OPEN, Exp exp, Folha t_BRACKET_CLOSE) {
        this.prefixexp = prefixexp;
        this.t_BRACKET_OPEN = t_BRACKET_OPEN;
        this.exp = exp;
        this.t_BRACKET_CLOSE = t_BRACKET_CLOSE;
    }

}
