/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blm22212e_project2;

import java.util.LinkedList;
import jdk.jfr.Frequency;

/**
 *sağ ve sol
 * @author Asus
 */
public class Aksu_Keskin_BST_node {
    
    Aksu_Keskin_BST_node right;
    Aksu_Keskin_BST_node left;
    String word;
    LinkedList <Aksu_Keskin_fq_object> fq_list = new LinkedList<>();
    
    public Aksu_Keskin_BST_node(String word){
        this.word = word;
    }
    
    
    
    public void incFr(String file){
        if(fq_list.size() == 0){
            fq_list.add(new Aksu_Keskin_fq_object(file));
            return;
        }
        
        if(fq_list.getLast().fileName.equals(file)){
            fq_list.getLast().frequancy++;
            System.out.println(file + " " + fq_list.getLast().frequancy);
            return; 
        }
        fq_list.add(new Aksu_Keskin_fq_object(file));
    }
}
