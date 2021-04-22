/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author quach
 */
public class Demo {
    private final int numA;
    private final int numB;

    public Demo(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public int getNumB() {
        return numB;
    }

    public static void main(String[] args) {

        Demo d = new Demo(10, 20);
        System.out.println(d.numA);
       
    }

}
