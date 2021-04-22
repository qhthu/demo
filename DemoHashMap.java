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
public class DemoHashMap {

    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        hash.put("quach", "hong thu");
        hash.put("vo thi", "hong nhung");
        hash.put("ha thi", "mai anh");
        hash.put("nguyen", "thanh truc");

        Iterator<Map.Entry<String, String>> iterator = hash.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");

        hash.remove("nguyen");

        hash.replace("ha thi", "minh thuan");

        Iterator<Map.Entry<String, String>> iterator1 = hash.entrySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }

}
