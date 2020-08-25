import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {


    public static void main(String[] args)  {
            ArrayList<String> words = new ArrayList<>();
            words.add("машина");
            words.add("дом");
            words.add("мотор");
            words.add("дом");
            words.add("машина");
           words.add("дети");
        words.add("мотор");
        words.add("дом");
        words.add("машина");
        words.add("дети");
           words.add("дети");
        words.add("дом");
        words.add("машина");
        words.add("дом");
        words.add("мотор");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            Integer value = map.getOrDefault(words.get(i), 0);
            map.put(words.get(i),value + 1);
        }
        System.out.println(map);
        PhoneContact contactList = new PhoneContact("Папян","89261119990");
        contactList.add("Цыба","89151841770");
        contactList.add("Цыба","89166897511");
        contactList.add("Цыба","89166897511");
        contactList.add("Гасанов","89115555525");
        contactList.info();
        contactList.get("Цыба");
        contactList.get("Гасанов");



    }
 }
