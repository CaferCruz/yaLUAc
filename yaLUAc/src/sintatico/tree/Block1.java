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
public class Block1 extends Block{
 LastStat right;
 StatList left;

    public Block1(LastStat right, StatList left) {
        this.right = right;
        this.left = left;
    }

    public LastStat getRight() {
        return right;
    }

    public StatList getLeft() {
        return left;
    }

    private static class StatList {

        public StatList() {
        }
    }
}
