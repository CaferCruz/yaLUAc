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
public class FunctionCall2 extends FunctionCall {

    PrefixExp prefixexp;
    Folha t_COLON;
    Folha t_NAME;
    Args args;

    public FunctionCall2(PrefixExp prefixexp, Folha t_COLON, Folha t_NAME, Args args) {
        this.prefixexp = prefixexp;
        this.t_COLON = t_COLON;
        this.t_NAME = t_NAME;
        this.args = args;
    }

}
