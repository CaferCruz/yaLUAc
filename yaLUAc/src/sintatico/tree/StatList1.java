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
public class StatList1 extends StatList {
    Stat stat;
    OptSemi optsemi;

    public StatList1(Stat stat, OptSemi optsemi) {
        this.stat = stat;
        this.optsemi = optsemi;
    }
}
