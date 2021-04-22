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

    private int a;
    private int b;

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {

        Demo d = new Demo(10, 20);
        System.out.println(d.a);
        d.setA(100);
        System.out.println(d.a);

    }

}
