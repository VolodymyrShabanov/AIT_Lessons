package lesson_49_2023_11_14;

import java.util.Collection;
import java.util.Set;

public interface InterfaceHashMap<K, V> {
    // положить в карту пару ключ-значение. Если ключ уже существует - обновить значение;
    V put(K key, V value);

    // Взять из карты значение, соответствующее ключу. Если ключ отсутствует - возвращает null;
    V get(Object key);

    V remove(Object key);

    int size();

    boolean isEmpty();
    boolean containsKey(Object key);
    void clear();
    Set<K> keySet();
    Collection<V> values();
    V getOrDefault(Object key, V defaultValue);
}