/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityqapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: PriorityQApp.
 */
class PriorityQ {

    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        if (nItems == maxSize) {
            System.out.println("Queue is full. Cannot insert " + item);
            return;
        }
        queArray[nItems++] = item; // Insert the item at the rear
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void displayQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println("");
    }
}
