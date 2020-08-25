import java.util.HashMap;
import java.util.Map;

public  class PhoneContact {
      private String surname;
      private   String phone;
      Map<String,String> contact = new HashMap<>();

    public PhoneContact(String surname, String phone) {
        this.surname = surname;
        this.phone = phone;

        contact.put(surname, phone);
    }
    public void add (String surname, String phone) {
        if (contact.containsKey(surname)) {
            contact.replace(surname, contact.get(surname),  contact.get(surname) + "/" + phone);
        } else {
            contact.put(surname, phone);
        }
    }
    public void info () {
        System.out.println(contact);
    }
    public void get (String surname) {
        System.out.println(surname + " = " + contact.get(surname));
    }

}
