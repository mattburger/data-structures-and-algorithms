package code401Challenges.firstDuplicate;

import code401Challenges.hashtable.Hashtable;

public class FirstDuplicate {

    private String input;
    private Hashtable hashTable;

    public FirstDuplicate(String input) {
        this.input = input;
        hashTable = new Hashtable(input.length() * 2);
    }

    public String findDuplicate() {
        if(this.input == "") {
            throw new IllegalStateException("Cannot find duplicate within empty string");
        }

        if(this.input == null) {
            throw new IllegalStateException("Cannot find duplicate withing null value");
        }

        String tmp = this.input.replaceAll(",", "");
        tmp = tmp.replaceAll("[.]", "");
        tmp = tmp.toLowerCase();
        String[] inputArr = tmp.split("[\\s]");
        String output = "";

        for(int i = 0; i < inputArr.length; i++) {
            if(hashTable.get(inputArr[i]) != null) {

                if(hashTable.get(inputArr[i]).contains(inputArr[i]) ){
                    output = output + inputArr[i];

                    return output;
                } else {
                    hashTable.add(inputArr[i], inputArr[i]);
                }

            } else {
                hashTable.add(inputArr[i], inputArr[i]);
            }
        }
        return "No duplicates";
    }

    public String getValue(String key) {
        return hashTable.get(key);
    }
}
