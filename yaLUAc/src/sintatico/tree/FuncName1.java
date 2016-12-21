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
public class FuncName1 extends FuncName{
    Folha t_NAME;
    Folha t_DOT;
    FuncName funcname;

    public FuncName1(Folha t_NAME, Folha t_DOT, FuncName funcname) {
        this.t_NAME = t_NAME;
        this.t_DOT = t_DOT;
        this.funcname = funcname;
    }
    
    
}
