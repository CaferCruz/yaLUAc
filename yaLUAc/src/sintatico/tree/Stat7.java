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
public class Stat7 extends Stat{
    Folha t_FOR;
    Folha t_NAME;
    Folha t_ATTRIBUTION;
    Exp exp1;
    Folha t_COMMA;
    Exp exp2;
    OptForExp optforexp;
    Folha t_DO;
    Block block;
    Folha t_END;

    public Stat7(Folha t_FOR, Folha t_NAME, Folha t_ATTRIBUTION, Exp exp1, Folha t_COMMA, Exp exp2, OptForExp optforexp, Folha t_DO, Block block, Folha t_END) {
        this.t_FOR = t_FOR;
        this.t_NAME = t_NAME;
        this.t_ATTRIBUTION = t_ATTRIBUTION;
        this.exp1 = exp1;
        this.t_COMMA = t_COMMA;
        this.exp2 = exp2;
        this.optforexp = optforexp;
        this.t_DO = t_DO;
        this.block = block;
        this.t_END = t_END;
    }
    
    
    
}
