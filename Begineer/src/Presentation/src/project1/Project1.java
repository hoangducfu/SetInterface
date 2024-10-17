/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author hoangduc
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        set1.add("Hieu");
        set1.add("Duc");
        set1.add("Ly");
        set1.add("Huyen");
        set1.add("Hieu");
//        System.out.println(set1);

        list1.add("Hieu");
        list1.add("Duc");
        list1.add("Ly");
        list1.add("Huyen");
        list1.add("Hieu");
//        System.out.println(list1);

//        System.out.println(list1.get(0));
//        for (String name : set1) {
//            System.out.println(name);
//        }
//        Iterator<String> iter = set1.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        set1.forEach(item -> System.out.println(item));
        list2.add("Duc");
        list2.add(null);
        list2.add("Hieu");
        list2.add(null);
//        System.out.println(list2);
        set2.add("Duc1");
        set2.add(null);
        set2.add("Duc2");
        set2.add(null);
//        System.out.println(list2);
        
    }

}
