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
class ListName<K, V> {

    private K key;
    private V value;

    public ListName(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

class List extends ListName<String, String> {

    public List(String key, String value) {
        super(key, value);
    }

}

class ListItem<K, V, A> extends ListName<K, V> {

    private A age;

    public ListItem(A age, K key, V value) {
        super(key, value);
        this.age = age;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }

}

public class DemoGenerics {

    public static void main(String[] args) {

//        ListName<String, String> name = new ListName<>("Quach", "Hong Thu");
//        System.out.println("Ho: " + name.getKey());
//        System.out.println("Ten: " + name.getValue());
        List list = new List("quach", "hong thu");

        System.out.println("Ho: " + list.getKey());
        System.out.println("Ten: " + list.getValue());

        ListItem<String, String, Integer> item = new ListItem<>(20, "Quach", "Hong Thu");
        System.out.println("Ho: " + item.getKey());
        System.out.println("Ten: " + item.getValue());
        System.out.println("Tuoi: " + item.getAge());
    }

}
