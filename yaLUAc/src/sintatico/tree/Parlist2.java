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
public class Parlist2 {

    NameList namelist;
    Folha t_COMMA;
    Folha t_DOTDOTDOT;

    public Parlist2(NameList namelist, Folha t_COMMA, Folha t_DOTDOTDOT) {
        this.namelist = namelist;
        this.t_COMMA = t_COMMA;
        this.t_DOTDOTDOT = t_DOTDOTDOT;
    }

}
