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
public class Function {

    Folha t_FUNCTION;
    FuncBody funcbody;

    public Function(Folha t_FUNCTION, FuncBody funcbody) {
        this.t_FUNCTION = t_FUNCTION;
        this.funcbody = funcbody;
    }

    
}
