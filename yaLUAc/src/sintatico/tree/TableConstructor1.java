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
public class TableConstructor1 extends TableConstructor{
   Folha t_BRACERS_OPEN;
   FieldList fieldlist;
   Folha t_BRACERS_CLOSE;

    public TableConstructor1(Folha t_BRACERS_OPEN, FieldList fieldlist, Folha t_BRACERS_CLOSE) {
        this.t_BRACERS_OPEN = t_BRACERS_OPEN;
        this.fieldlist = fieldlist;
        this.t_BRACERS_CLOSE = t_BRACERS_CLOSE;
    }
   
   
}
