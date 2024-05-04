/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blm22212e_project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class Aksu_Keskin_fileReader {
    
    public static ArrayList<String> ignoreList = null;
    
    public static String readFileAsString(String fileName)
        throws Exception{
         
        String data = "";
        data = new String(
        Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
     
     
    
    public static LinkedList<String> sep_String (String str){
        Pattern pattern = Pattern.compile("[A-Za-z]+", Pattern.CASE_INSENSITIVE);
        LinkedList<String> list = new LinkedList<>();
         
        String temp = "";
        for(int i=0; i < str.length(); i++){
            char chr = str.charAt(i);
            
            if(chr == '\n' || chr == ' '){
                if(temp.length() != 0 && !getIgnoreList().contains(temp) && (pattern.matcher(temp)).matches()){
                    list.add(temp.toLowerCase());
                }
                temp = "";
                continue;
            }
            temp += chr;
        }
        return list;
    }
    
    
    
    public static ArrayList<String> getIgnoreList(){
        
        ArrayList<String> arr = new ArrayList<>();
        String path = "C:\\Users\\Asus\\Desktop\\dersler\\2-2\\data structures\\Project#2\\docs\\ignoreList.txt";
        
        if(ignoreList != null)
            return ignoreList;
        
        File file = new File(path);
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine())
                arr.add(sc.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aksu_Keskin_fileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        ignoreList = arr;
        
        return arr;
    }
}
