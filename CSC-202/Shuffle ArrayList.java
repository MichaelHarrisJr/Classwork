/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michael.harris.shufflearraylist;

import java.util.ArrayList;



/**
 *
 * @author Michael Harris Jr
 */
public class MichaelHarrisShuffleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
      
ArrayList<Number> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
MichaelHarrisShuffleArrayList.shuffle(list);
for (int i = 0; i < list.size(); i++) 
    
    System.out.print(list.get(i) + " ");
    System.out.println();
    }
    public static void shuffle (ArrayList<Number> list) {
        for ( int i = 0; i < list.size(); i++)
            
        {
            int num1 = (int)(Math.random() * list.size());
            int num2 = (int) list.get(i);
            list.set(i, list.get(num1));
            list.set(num1, num2);
        }
    }
    
}
