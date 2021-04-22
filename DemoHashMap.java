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
class Name {

    private String ho;
    private String ten;

    public Name(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}

public class DemoHashMap {

    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        HashMap<Integer, Name> hashObj = new HashMap<>();
        Name name = new Name("", "");
        name.setHo("Quach");
        name.setTen("Hong Thu");
        hashObj.put(1, name);

        Name name1 = new Name("", "");
        name1.setHo("Ha Thi");
        name1.setTen("Mai Anh");
        hashObj.put(2, name1);
        
                Name name2 = new Name("", "");
        name2.setHo("Vo Thi");
        name2.setTen("Hong Nhung");
        hashObj.put(3, name2);
        
        
        hashObj.remove(3);
        
        
        hashObj.replace(1, name1);
        
        Iterator<Map.Entry<Integer, Name>> iterator = hashObj.entrySet().iterator();

        while (iterator.hasNext()) {
            Name n = (Name) iterator.next().getValue();
            System.out.println(n.getHo() + " " + n.getTen());
        }

    }

}