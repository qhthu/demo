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

    private int numA;
    private int numB;

    public Demo(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public static void main(String[] args) {

        Demo d = new Demo(10, 20);
        System.out.println(d.numA);
        d.setNumA(100);
        System.out.println(d.numA);

    }

}
