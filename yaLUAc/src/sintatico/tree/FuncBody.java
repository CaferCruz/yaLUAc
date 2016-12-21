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
public class FuncBody {

    Folha t_PARENTHESE_OPEN;
    OptParList optparlist;
    Folha t_PARENTHESE_CLOSE;
    Block block;
    Folha t_END;

    public FuncBody(Folha t_PARENTHESE_OPEN, OptParList optparlist, Folha t_PARENTHESE_CLOSE, Block block, Folha t_END) {
        this.t_PARENTHESE_OPEN = t_PARENTHESE_OPEN;
        this.optparlist = optparlist;
        this.t_PARENTHESE_CLOSE = t_PARENTHESE_CLOSE;
        this.block = block;
        this.t_END = t_END;
    }

}
