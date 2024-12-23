package phoneDirectoryUsingTreemap;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithtreeMap {
    // the treemap that will store the data both kay and value are of type string. the key represents a name and the value represents the associated phone number
    private TreeMap<String, String> data;

    // constructor that initializes an empty treemap
    public PhoneDirectoryWithtreeMap() {
        this.data = new TreeMap<>();
    }

    // finds the phone number, if any for a given name, if there is no entry for the name, then null is returned
    public String getNumber(String name) {
        return this.data.get(name);
    }

    // associates a given name with a given phone number , if the name already exists in the directory then the new number replaces the old one. otherwise a new name/ number hair is added. both name and number should be not null and an illegalArgumentException is thrown if either is null
    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("Name or number cannot be null");
        this.data.put(name, number);
    }

    // write the contents of the phone directory to the console
    public void print() {
        for (Map.Entry<String, String> entry : this.data.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

    }


}
