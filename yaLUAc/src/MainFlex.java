/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;


/**
 *
 * @author Cafer&Carrara
 */
public class MainFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String path = "C:/Users/cafer/Documents/yaLUAc/yaLUAc/src/lexico/lexer.flex";
        generateLexer(path);
        
    }

    private static void generateLexer(String path) {
           File file = new File(path);
           jflex.Main.generate(file);
    }
}
