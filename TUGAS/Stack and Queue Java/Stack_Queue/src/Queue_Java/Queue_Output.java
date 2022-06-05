/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue_Java;
import Queue_Java.Queue;
/**
 *
 * @author marif
 */
public class Queue_Output {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
    }
}
