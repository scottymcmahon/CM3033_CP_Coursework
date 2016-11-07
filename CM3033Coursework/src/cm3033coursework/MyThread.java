/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm3033coursework;

/**
 *
 * @author 1404436
 */
public class MyThread extends Thread{
    public MyThread(String name) {
    super(name) ; // call Thread super-class constructor, passing thread name
    }
    // override inherited Thread method run()
    // the method name run() is important here; whenever a thread starts
    // it expects to call a method with the signature public void run()
    @Override
    public void run() {
    /* put code to be executed when this thread starts in the run() method.
    * This code prints the thread name and how many times it has done so. */
    String tname = Thread.currentThread().getName() ;
    int count = 0;
       for (;;) {
       System.out.println("Thread name: " + tname + " count: " + count++) ;
       }
    }
}
