package binaryHashTree;


import java.util.ArrayList;
import java.util.List;

public class TableHash {
    private List<Node>[] data;
    private int capacity;

    public TableHash(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList[capacity];
        for (int i = 0; i < capacity; i++) {
            data[i] = new ArrayList<>();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void insert(int key, Object value) {
        int index = hash(key);
        Node newNode = new Node();
        newNode.setKey(key);
        newNode.setValue(value);
        data[index].add(newNode);
    }

    public Object get(int key) {
        int index = hash(key);
        List<Node> nodes = data[index];
        for (Node node : nodes) {
            if (node.getKey() == key) {
                return node.getValue();
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        List<Node> nodes = data[index];
        for (Node node : nodes) {
            if (node.getKey() == key) {
                nodes.remove(node);
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            List<Node> nodes = data[i];
            for (Node node : nodes) {
                System.out.println(node.getKey() + ": " + node.getValue());
            }
        }
    }

    public static void main(String[] args) {
        TableHash tableHash = new TableHash(10);

        tableHash.insert(10, "132");
        tableHash.insert(20, "221");
        tableHash.insert(30, "928");
        tableHash.insert(50, "763");
        tableHash.insert(150, "453");
        tableHash.insert(430, "654");
        tableHash.insert(600, "1294");

        System.out.println("Mostrar 20 e 600");
        System.out.println(tableHash.get(20) + ", " + tableHash.get(600));
        System.out.println("Remover 600");
        tableHash.remove(600);
        System.out.println("Mostrar 20 e 600");
        System.out.println(tableHash.get(20) + ", " + tableHash.get(600));

        System.out.println("Mostrar tableHash");
        tableHash.print();
    }
}