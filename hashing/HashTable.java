package dsaAssg.hashing;

import java.util.LinkedList;

class HashTable {
    // Define the number of buckets (size of hash table)
    private int bucketCount;
    private LinkedList<Entry>[] table;

    // Constructor
    public HashTable(int size) {
        bucketCount = size;
        table = new LinkedList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Entry class to hold key-value pairs
    static class Entry {
        int key;
        String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash function
    private int hash(int key) {
        return key % bucketCount;
    }

    // Insert key-value pair
    public void insert(int key, String value) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key == key) {
                e.value = value; // Update existing key
                return;
            }
        }
        table[index].add(new Entry(key, value)); // Add new key
    }

    // Get value by key
    public String get(int key) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key == key) {
                return e.value;
            }
        }
        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hash(key);
        table[index].removeIf(e -> e.key == key);
    }

    // Display table content
    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry e : table[i]) {
                System.out.print("[" + e.key + " -> " + e.value + "] ");
            }
            System.out.println();
        }
    }
}

