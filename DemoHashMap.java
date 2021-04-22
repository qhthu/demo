/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author quach
 */
class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

public class DemoHashMap {

    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        HashMap<Integer, Name> hashObj = new HashMap<>();
        Name name = new Name("", "");
        name.setFirstName("Quach");
        name.setLastName("Hong Thu");
        hashObj.put(1, name);

        Name name1 = new Name("", "");
        name1.setFirstName("Ha Thi");
        name1.setLastName("Mai Anh");
        hashObj.put(2, name1);

        Name name2 = new Name("", "");
        name2.setFirstName("Vo Thi");
        name2.setLastName("Hong Nhung");
        hashObj.put(3, name2);

        hashObj.remove(3);

        hashObj.replace(1, name1);

        Iterator<Map.Entry<Integer, Name>> iterator = hashObj.entrySet().iterator();

        while (iterator.hasNext()) {
            Name n = (Name) iterator.next().getValue();
            System.out.println(n.getFirstName()+ " " + n.getLastName());
        }

    }

}
