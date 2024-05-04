/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blm22212e_project2;

/**
 *root
 * @author Asus
 */
public class Aksu_Keskin_BST {
    
    public Aksu_Keskin_BST_node root;
    
    
    
    public Aksu_Keskin_BST_node add(String word){
        Aksu_Keskin_BST_node temp = root;
        
        if(root == null){
            root = new Aksu_Keskin_BST_node(word);
            return root;
        }
        
        Aksu_Keskin_BST_node last_temp = temp;
        
        while(temp != null){
            int compare = temp.word.compareTo(word);
            compare = compare == 0 
                ? 0 
                : compare/Math.abs(compare);
            last_temp = temp;
            switch (compare) {
                case 0:
                    return temp;
                case 1:
                    temp = temp.left;
                    break;
                case -1:
                    temp = temp.right;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        int compare = last_temp.word.compareTo(word);
        Aksu_Keskin_BST_node node = new Aksu_Keskin_BST_node(word);
        compare = compare == 0 
                ? 0 
                : compare/Math.abs(compare);
            switch (compare) {
                case 1:
                    last_temp.left = node;
                    break;
                case -1:;
                    last_temp.right = node;
                    break;
                default:
                    throw new AssertionError();
            }
            return node;
    }
    
//------------------------------------------------------------------------------
    
    public Aksu_Keskin_BST_node search(String word){
        Aksu_Keskin_BST_node temp = root;
        
        if(root == null){
            return null;
        }
        
        while(temp != null){
            int compare = temp.word.compareTo(word);
            compare = compare == 0 
                ? 0 
                : compare/Math.abs(compare);
            switch (compare) {
                case 0:
                    return temp;
                case 1:
                    temp = temp.left;
                    break;
                case -1:
                    temp = temp.right;
                    break;
                default:
                    System.out.println(compare);
                    throw new AssertionError();
            }
        }
        return temp;
    }
    
//------------------------------------------------------------------------------   
    
    public String postOr(){
        if(root == null){
            return "";
        }
        return _postOr(root);
    }
    
    private String _postOr(Aksu_Keskin_BST_node root){
        if(root == null){
            return "";
        }
        return _postOr(root.left) + _postOr(root.right) + root.word + ", \n";
    }
    
//------------------------------------------------------------------------------   
    
    public String preOr(){
        if(root == null){
            return "";
        }
        return _preOr(root);
    }
    
    private String _preOr(Aksu_Keskin_BST_node root){
        if(root == null){
            return "";
        }
        return root.word + ", \n" + _preOr(root.left) + _preOr(root.right);
    }
    
//------------------------------------------------------------------------------   
    
    public String inOr(){
        if(root == null){
            return "";
        }
        return _inOr(root);
    }
    
    private String _inOr(Aksu_Keskin_BST_node root){
        if(root == null){
            return "";
        }
        return _inOr(root.left) + root.word + ", \n" + _inOr(root.right);
    }
}
