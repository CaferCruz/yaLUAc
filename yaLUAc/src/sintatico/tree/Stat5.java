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
public class Stat5 extends Stat{
    Folha t_REPEAT;
    Block block;
    Folha t_UNTIL;
    Exp exp;

    public Stat5(Folha t_REPEAT, Block block, Folha t_UNTIL, Exp exp) {
        this.t_REPEAT = t_REPEAT;
        this.block = block;
        this.t_UNTIL = t_UNTIL;
        this.exp = exp;
    }
    
    
    
}
