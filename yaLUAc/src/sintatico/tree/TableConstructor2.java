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
public class TableConstructor2 extends TableConstructor {

    Folha t_BRACERS_OPEN;
    Folha t_BRACERS_CLOSE;

    public TableConstructor2(Folha t_BRACERS_OPEN, Folha t_BRACERS_CLOSE) {
        this.t_BRACERS_OPEN = t_BRACERS_OPEN;
        this.t_BRACERS_CLOSE = t_BRACERS_CLOSE;
    }

}
