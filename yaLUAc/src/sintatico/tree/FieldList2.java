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
public class FieldList2 extends FieldList{
    Field field;
    FieldSepFolha fieldsep;
    FieldList fieldlist ;

    public FieldList2(Field field, FieldSepFolha fieldsep, FieldList fieldlist) {
        this.field = field;
        this.fieldsep = fieldsep;
        this.fieldlist = fieldlist;
    }
    
    
}
