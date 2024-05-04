/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blm22212e_project2;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * System.out.println(Aksu_Keskin_fileReader.getIgnoreList());
 * 
 * System.out.println(Aksu_Keskin_fileReader.sep_String(data));
 *
 * @author Asus
 */
public class BLM22212E_project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String data = "";
        
        try {
            data = Aksu_Keskin_fileReader.readFileAsString("C:\\Users\\Asus\\Desktop\\dersler\\2-2\\data structures\\Project#2\\docs\\cse22510.html");
        } catch (Exception ex) {
            Logger.getLogger(BLM22212E_project2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LinkedList<String> ll = Aksu_Keskin_fileReader.sep_String(data);
        Aksu_Keskin_BST bst = new Aksu_Keskin_BST();
        
        for(int i = 0; i < ll.size(); i++){
            String temp = ll.get(i);
            bst.add(temp).incFr("cse22510.html");
        }
        
        System.out.println(bst.preOr());
        System.out.println("");
        System.out.println(bst.inOr());
    }
}
