import java.util.*;

public class PhoneList {
    private HashMap<String, ArrayList<Phone>> phoneMap;

    public PhoneList() {
        phoneMap = new HashMap<>();
    }


    public void addPhone(String name, Phone phone) {

        if (phoneMap.containsKey(name)) {
            phoneMap.get(name).add(phone);
        } else {

            ArrayList<Phone> phones = new ArrayList<>();
            phones.add(phone);
            phoneMap.put(name, phones);
        }
    }

    public ArrayList<Phone> isFind(String name) {
        if (phoneMap.containsKey(name)) {
            return phoneMap.get(name);
        }
        return null;
    }
}
