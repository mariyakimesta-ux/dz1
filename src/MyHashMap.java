public class MyHashMap {

    private Node[] table = new Node[10];
    private static class Node {
        String name;
        String dish;
        Node next;

        Node(String name, String dish, Node next) {
            this.name = name;
            this.dish = dish;
            this.next = next;
        }
    }

    private int getIndex(String name) {
        char firstLetter = name.charAt(0);  // первая буква, например 'А'
        return firstLetter % 10;            // номер ячейки 0..9
    }

    public void put(String name, String dish) {
        int index = getIndex(name);
        Node current = table[index];

        while (current != null) {
            if (current.name.equals(name)) {
                current.dish = dish;
                return;
            }
            current = current.next;
        }

        table[index] = new Node(name, dish, table[index]);
    }

    public String get(String name) {
        int index = getIndex(name);
        Node current = table[index];

        while (current != null) {
            if (current.name.equals(name)) {
                return current.dish;
            }
            current = current.next;
        }
        return null;
    }

    public String remove(String name) {
        int index = getIndex(name);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.name.equals(name)) {
                String removedDish = current.dish;

                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return removedDish;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }
}