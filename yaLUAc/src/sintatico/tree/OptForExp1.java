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
public class OptForExp1 extends OptForExp {

    Folha t_COMMA;
    Exp exp;

    public OptForExp1(Folha t_COMMA, Exp exp) {
        this.t_COMMA = t_COMMA;
        this.exp = exp;
    }
}
