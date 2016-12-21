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
public class NameList2 extends NameList {

    NameList namelist;
    Folha t_COMMA;
    Folha t_NAME;

    public NameList2(NameList namelist, Folha t_COMMA, Folha t_NAME) {
        this.namelist = namelist;
        this.t_COMMA = t_COMMA;
        this.t_NAME = t_NAME;
    }

}
