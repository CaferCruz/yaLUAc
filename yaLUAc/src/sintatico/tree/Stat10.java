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
public class Stat10 extends Stat{
    Folha t_LOCAL;
    Folha t_FUNCTION;
    Folha t_NAME;
    FuncBody funcbody;

    public Stat10(Folha t_LOCAL, Folha t_FUNCTION, Folha t_NAME, FuncBody funcbody) {
        this.t_LOCAL = t_LOCAL;
        this.t_FUNCTION = t_FUNCTION;
        this.t_NAME = t_NAME;
        this.funcbody = funcbody;
    }
    
    
}
