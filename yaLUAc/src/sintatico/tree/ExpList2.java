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
public class ExpList2 extends ExpList{
    Exp exp;
    Folha t_COMMA;
    ExpList explist;

    public ExpList2(Exp exp, Folha t_COMMA, ExpList explist) {
        this.exp = exp;
        this.t_COMMA = t_COMMA;
        this.explist = explist;
    }
    
    
}
