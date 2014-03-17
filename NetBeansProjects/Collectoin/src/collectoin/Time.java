/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectoin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Александр
 */
public class Time {
    public Time(ArrayList<String> list1,ArrayList<String> list2){
      for(int i=0;i<25000;i++){
       String rand1 = Double.toString(Math.random() * 1000);
       String rand2 = Double.toString(Math.random() * 1000);
       list1.add(rand1);
       list2.add(rand2);       
   }
      long time=System.currentTimeMillis();
      list1.retainAll(list2);
      long delta=System.currentTimeMillis()-time;
      System.out.print("Time ArrayList = " + delta);
    }
    
     public Time(HashSet<String> hash1,HashSet<String> hash2){
      for(int i=0;i<25000;i++){
       String rand1 = Double.toString(Math.random() * 1000);
       String rand2 = Double.toString(Math.random() * 1000);
       hash1.add(rand1);
       hash2.add(rand2);       
   }
      long time=System.currentTimeMillis();
      hash1.retainAll(hash2);
      long delta=System.currentTimeMillis()-time;
      System.out.print("Time HashSet = " + delta);
    }
     
      public Time(TreeSet<String> tree1,TreeSet<String> tree2){
      for(int i=0;i<25000;i++){
       String rand1 = Double.toString(Math.random() * 1000);
       String rand2 = Double.toString(Math.random() * 1000);
       tree1.add(rand1);
       tree2.add(rand2);       
   }
      long time=System.currentTimeMillis();
      tree1.retainAll(tree2);
      long delta=System.currentTimeMillis()-time;
      System.out.print("Time HashSet = " + delta);
    } 
}
