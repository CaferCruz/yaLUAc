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
public class Stat3 extends Stat{
    Folha t_DO;
    Block block;
    Folha t_END;

    public Stat3(Folha t_DO, Block block, Folha t_END) {
        this.t_DO = t_DO;
        this.block = block;
        this.t_END = t_END;
    }
    
    
    
    
}
