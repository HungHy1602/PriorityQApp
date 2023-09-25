/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: PriorityQApp.
 */
public class PriorityQApp {

    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        thePQ.displayQueue(); // Display the queue

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " "); // 30, 50, 10, 40, 20
        }

        System.out.println("");
    }
}
