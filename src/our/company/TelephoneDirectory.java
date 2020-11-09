package our.company;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private Map<String, ArrayList<String>> maps = new HashMap<>();

    public TelephoneDirectory() {
    }

    public void adds(String secondName, String telephoneNumber){
        if (maps.containsKey(secondName)){
            ArrayList<String> list = maps.get(secondName);
            list.add(telephoneNumber);
            maps.put(secondName, list);
        } else {
            ArrayList<String> listPhoneNumber = new ArrayList<>();
            listPhoneNumber.add(telephoneNumber);
            maps.put(secondName, listPhoneNumber);
        }
    }

    public void get(String secondName){
        System.out.println(MessageFormat.format("Номера телефона контакта {0}: ", secondName));
        for (String number : maps.get(secondName)){
            System.out.println("\t" + number);
        }
        System.out.println();
    }
}
