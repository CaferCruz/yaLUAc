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
public class NameList1 extends NameList {

    NameList namelist;
    Folha t_COMMA;
    Folha t_NAME;

    public NameList1(Folha t_NAME , Folha t_COMMA, NameList namelist ) {
        this.t_NAME = t_NAME;
        this.t_COMMA = t_COMMA;
        this.namelist = namelist;
    }

}
