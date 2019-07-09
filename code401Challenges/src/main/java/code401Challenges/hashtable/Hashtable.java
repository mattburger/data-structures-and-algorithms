package code401Challenges.hashtable;

public class Hashtable {

    private HtNode[] map;

    public Hashtable(int size) {
        this.map = new HtNode[size];
    }

    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for(int i = 0; i < letters.length; i++) {
            hashValue = hashValue * 214748363 + letters[i];
        }

        hashValue = hashValue % map.length;
        return hashValue;
    }

    public void set(String key, String value) {
        int hashKey = hash(key);

        if(this.map[hashKey] == null) {
            this.map[hashKey] = new HtNode(key, value);
        } else {
            HtNode temp = map[hashKey];
            map[hashKey] = new HtNode(key, value);
            map[hashKey].setNext(temp);
        }
    }
}
