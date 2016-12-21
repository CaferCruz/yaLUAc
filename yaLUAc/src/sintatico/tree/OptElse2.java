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
public class OptElse2 extends OptElse {

    Folha t_ELSEIF;
    Exp exp;
    Folha t_THEN;
    Block block;
    OptElse optelse;

    public OptElse2(Folha t_ELSEIF, Exp exp, Folha t_THEN, Block block, OptElse optelse) {
        this.t_ELSEIF = t_ELSEIF;
        this.exp = exp;
        this.t_THEN = t_THEN;
        this.block = block;
        this.optelse = optelse;
    }
    
    
}
