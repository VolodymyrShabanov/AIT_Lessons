package lesson_32_2023_10_19;

public interface Queue <T> {
    void addLast(T value);      // Done

    void addFirst(T value);     // Done

    T getFirst();               // Done

    T getLast();                // Done

    // Удаляет первый элемент списка
    T remove();                 // Done

    T removeFirst();            // Done

    //Удаляет последний элемент списка
    T removeLast();             // Done
}
