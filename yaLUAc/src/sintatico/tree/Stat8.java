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
public class Stat8 extends Stat{
    Folha t_FOR;
    NameList namelist;
    Folha t_IN;
    ExpList explist;
    Folha t_DO;
    Block block;
    Folha t_END;

    public Stat8(Folha t_FOR, NameList namelist, Folha t_IN, ExpList explist, Folha t_DO, Block block, Folha t_END) {
        this.t_FOR = t_FOR;
        this.namelist = namelist;
        this.t_IN = t_IN;
        this.explist = explist;
        this.t_DO = t_DO;
        this.block = block;
        this.t_END = t_END;
    }
    
    
    
}
