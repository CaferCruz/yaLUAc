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
public class Var2 extends Var {

    PrefixExp prefixexp;
    Folha t_DOT;
    Folha t_NAME;

    public Var2(PrefixExp prefixexp, Folha t_DOT, Folha t_NAME) {
        this.prefixexp = prefixexp;
        this.t_DOT = t_DOT;
        this.t_NAME = t_NAME;
    }

}
