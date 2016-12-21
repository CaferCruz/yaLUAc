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
public class Stat11 extends Stat{
    Folha t_LOCAL;
    NameList namelist;
    OptAsmExpList  optasmexplist;

    public Stat11(Folha t_LOCAL, NameList namelist, OptAsmExpList optasmexplist) {
        this.t_LOCAL = t_LOCAL;
        this.namelist = namelist;
        this.optasmexplist = optasmexplist;
    }
    
    
}
