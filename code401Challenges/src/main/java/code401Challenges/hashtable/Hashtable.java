package code401Challenges.hashtable;

import com.sun.net.httpserver.Authenticator;

import java.rmi.activation.ActivateFailedException;

import static java.lang.Math.abs;

public class Hashtable {

    private HtNode[] map;

    public Hashtable(int size) {
        this.map = new HtNode[size];
    }

    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for(int i = 0; i < letters.length; i++) {
            hashValue = abs(hashValue * 214748363 + letters[i]);
        }

        hashValue = hashValue % map.length;
        return hashValue;
    }

    public void add(String key, String value) {
        int hashKey = hash(key);

        if(this.map[hashKey] == null) {
            this.map[hashKey] = new HtNode(key, value);
        } else {
            HtNode temp = map[hashKey];
            map[hashKey] = new HtNode(key, value);
            map[hashKey].setNext(temp);
        }
    }

    public String get(String key) {
        int hashKey = hash(key);

        if(this.map[hashKey] == null) {
            return null;
        } else if(this.map[hashKey].hasNext()){
            HtNode tmp = this.map[hashKey];
            while(tmp.hasNext()) {

                if(tmp.key.equals(key) ) {
                    return (String) tmp.data;
                }

                tmp = tmp.getNext();

            }
        }

        return (String) this.map[hashKey].data;
    }

    public Boolean contains(String key) {
        int hashKey = hash(key);

        if(this.map[hashKey] == null) {
            return false;
        } else {
            return true;
        }
    }
}
