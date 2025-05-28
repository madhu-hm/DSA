package dsaAssg.hashing;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(5); // create a hash table with 5 buckets

        ht.insert(1, "Apple");
        ht.insert(6, "Banana"); // collision with key 1 (1 % 5 == 1 and 6 % 5 == 1)
        ht.insert(11, "Orange");

        ht.display();

        System.out.println("Value for key 6: " + ht.get(6));

        ht.remove(6);
        ht.display();
    }
}
