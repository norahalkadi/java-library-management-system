/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author admin
 */
public class LinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
 // Create a LinkedList to store Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add FIVE strings/names to the linkedList using AddFirst and AddLast
        linkedList.addFirst("Noura");  
        linkedList.addLast("Sara");    // Adding at the end
        linkedList.addLast("Lama");  
        linkedList.addFirst("Hala");    // Adding at the beginning
        linkedList.addLast("Jana"); 

        // 3. Traverse the linkedList with a simple for loop
        System.out.println("Traverse with For Loop:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // 4. Traverse the linkedList with a for-each loop
        System.out.println("\nTraverse with For-Each Loop:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        // 5. Add a new name/string to the linkedList in the middle
        int middleIndex = linkedList.size() / 2;
        linkedList.add(middleIndex, "Deem"); // Insert "Eve" in the middle

        // 6. Traverse the linkedList with an Iterator
        System.out.println("\nTraverse with Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Search for a particular name/string in the linkedList
        String searchName = "Lama";
        boolean found = linkedList.contains(searchName);
        System.out.println("\nIs " + searchName + " in the list? " + found);

        // 8. Remove a particular name/String from the linkedList
        String removeName = "Sara";
        linkedList.remove(removeName);  // Removes the first occurrence of "Bob"
        System.out.println("\nRemoving: " + removeName);

        // Traverse the list again after removal
        System.out.println("\nTraverse after removal:");
        for (String name : linkedList) {
            System.out.println(name);
        }
    }
}