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
public class StatList2 extends StatList{
    Stat stat;
    OptSemi optSemi;
    StatList statList;

    public StatList2(Stat stat, OptSemi optSemi, StatList statList) {
        this.stat = stat;
        this.optSemi = optSemi;
        this.statList = statList;
    }
}
