import java.util.*;

public class PhoneList {
    private HashMap<String, HashSet<Phone>> phoneMap;

    public PhoneList() {
        phoneMap = new HashMap<>();
    }

    public HashSet<Phone> addPhone(String name, Phone phone) throws Exception {

        for (String key : phoneMap.keySet()) {
            if (!key.equals(name)) {
                HashSet<Phone> phones = phoneMap.get(key);
                if (phones.contains(phone)) {
                    throw new Exception("Phone already belongs to another person");
                }
            }
        }


        if (phoneMap.containsKey(name)) {
            HashSet<Phone> phones = phoneMap.get(name);

            if (phones.contains(phone)) {
                throw new Exception("Phone already exists for this person");
            }

            phones.add(phone);
            return phones;
        } else {
            // New person
            HashSet<Phone> phones = new HashSet<>();
            phones.add(phone);
            phoneMap.put(name, phones);
            return phones;
        }
    }

    // Find phones
    public HashSet<Phone> isFind(String name) {
        return phoneMap.getOrDefault(name, null);
    }
}
