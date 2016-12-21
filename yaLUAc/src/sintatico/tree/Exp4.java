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
public class Exp4 extends Exp {

    Exp exp1;
    BinOpFolha binop;
    Exp exp2;

    public Exp4(Exp exp1, BinOpFolha binop, Exp exp2) {
        this.exp1 = exp1;
        this.binop = binop;
        this.exp2 = exp2;
    }

}
