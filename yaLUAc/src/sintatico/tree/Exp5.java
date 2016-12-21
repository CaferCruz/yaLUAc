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
public class Exp5 extends Exp {

    UnOpFolha unop;
    Exp exp;

    public Exp5(UnOpFolha unop, Exp exp) {
        this.unop = unop;
        this.exp = exp;
    }

}
