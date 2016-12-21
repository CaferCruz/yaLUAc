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
public class Args2 extends Args {

    Folha t_PARENTHESE_OPEN;
    OptExpList optexplist;
    Folha t_PARENTHESE_CLOSE;

    public Args2(Folha t_PARENTHESE_OPEN, OptExpList optexplist, Folha t_PARENTHESE_CLOSE) {
        this.t_PARENTHESE_OPEN = t_PARENTHESE_OPEN;
        this.optexplist = optexplist;
        this.t_PARENTHESE_CLOSE = t_PARENTHESE_CLOSE;
    }

}
