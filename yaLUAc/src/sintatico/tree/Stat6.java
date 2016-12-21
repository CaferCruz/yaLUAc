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
public class Stat6 extends Stat{
    Folha t_IF;
    Exp exp;
    Folha t_THEN;
    Block block;
    OptElse optelse;
    Folha t_END;

    public Stat6(Folha t_IF, Exp exp, Folha t_THEN, Block block, OptElse optelse, Folha t_END) {
        this.t_IF = t_IF;
        this.exp = exp;
        this.t_THEN = t_THEN;
        this.block = block;
        this.optelse = optelse;
        this.t_END = t_END;
    }
    
    
}
