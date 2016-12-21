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
public class Block1 extends Block{
 LastStat lastStat;
 StatList statList;

    public Block1(LastStat right, StatList left) {
        this.lastStat = right;
        this.statList = left;
    }

    public LastStat getLastStat() {
        return lastStat;
    }

    public StatList getStatList() {
        return statList;
    }

    
}
