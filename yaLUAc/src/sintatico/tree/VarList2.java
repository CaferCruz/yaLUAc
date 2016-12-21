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
public class VarList2 extends VarList {

    Var var;
    Folha t_COMMA;
    VarList varlist;

    public VarList2(Var var, Folha t_COMMA, VarList varlist) {
        this.var = var;
        this.t_COMMA = t_COMMA;
        this.varlist = varlist;
    }

}
