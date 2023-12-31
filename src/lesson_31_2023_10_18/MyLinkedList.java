package lesson_31_2023_10_18;

public class MyLinkedList<T> {
    private int size;

    private Node<T> first;
    private Node<T> last;


    // метод добавляет элемент в конец списка
    public void add(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = new Node<>(value, first, null);
            first.next = last;
        } else {

            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;

//            System.out.println("add value: " + value);
//            System.out.println("step1 -> last:             " + last);
//            Node<T> temp = last;
//            System.out.println("step2 -> temp = last:      " + temp);
//            last = new Node<>(value, temp, null);
//            System.out.println("step3 -> last new Node<>:  " + last);
//            temp.next = last;
//            System.out.println("step4 -> temp.next = last: " + temp);
//
//            System.out.println("Result add:");
//            System.out.println("first:                     " + first);
//            System.out.println("temp:                      " + temp);
//            System.out.println("last:                      " + last);
        }
        size++;
    }

    // метод добавляет список элементов в конец списка
    public void addAll(T... values) {  // добавил
        for (T value : values) {
            add(value);
        }
    }

    // метод выводит размер (количество элементов) коллекции
    public int size() {
        return this.size;
    }

    public int indexOf(T value) {
        Node<T> tempIndex = this.first;
        for (int i = 0; i < this.size; i++) {
            if (tempIndex.value.equals(value)) {
                return i;
            }
            tempIndex = tempIndex.next;
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        Node<T> tempIndex = this.last;
        for (int i = this.size - 1; i >= 0; i--) {
            if (tempIndex.value.equals(value)) {
                return i;
            }
            tempIndex = tempIndex.next;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[this.size];
        Node<T> tempArray = this.first;
        for (int i = 0; i < this.size; i++) {
            result[i] = tempArray.value;
            tempArray = tempArray.next;
        }
        return result;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public T get(int index) {
        if (index < 0 || index > this.size - 1) return null;
        Node<T> tempValue = this.first;
        int i = 0;
        while (i != index) {
            tempValue = tempValue.next;
            i++;
        }
        return tempValue.value;
    }

    public String toString() {
        if (isEmpty()) return "[]";
        Node<T> tempPint = first;
        // почему-то не получилось через StringBuilder
        System.out.print("[");
        for (int i = 0; i < this.size; i++) {
            System.out.print(tempPint.value + ((i < this.size - 1) ? "; " : "]\n"));
            tempPint = tempPint.next;  // интуитивно понимаю что здесь происходит, но не до конца
        }
        return null;
    }

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value = " + (value != null ? value : "null") +
                    ", previous = " + (previous != null ? previous.value : "null") +
                    ", next = " + (next != null ? next.value : "null") +
                    '}';
        }
    }
}
