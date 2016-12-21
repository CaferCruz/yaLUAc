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
public class Stat9 extends Stat{
    Folha t_FUNCTION;
    FuncName funcname;
    FuncBody funcbody;

    public Stat9(Folha t_FUNCTION, FuncName funcname, FuncBody funcbody) {
        this.t_FUNCTION = t_FUNCTION;
        this.funcname = funcname;
        this.funcbody = funcbody;
    }
    
    
    
}
