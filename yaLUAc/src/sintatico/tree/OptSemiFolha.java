/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintatico.tree;

import lexico.Tokens;

/**
 *
 * @author cafer
 */
public class OptSemiFolha {
    Folha folha;
    
    OptSemiFolha(Folha folha){
        this.folha = folha;
        this.folha.token = Tokens.t_SEMICOLON;
        this.folha.dado = ";";
    }
    
    
}
