package immutableThing;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private final LinkedHashMap<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // Set accessOrder to true for LRU behavior
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                // Remove the eldest entry when the size exceeds capacity
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public String toString() {
        return cache.toString();
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        System.out.println("Cache after adding 3 items: " + lruCache);

        lruCache.get(2); // Access key 2
        System.out.println("Cache after accessing key 2: " + lruCache);

        lruCache.put(4, "D"); // Add key 4, evicts key 1
        System.out.println("Cache after adding key 4: " + lruCache);

        lruCache.get(1); // Try accessing evicted key 1
        System.out.println("Cache after trying to access key 1: " + lruCache);

        lruCache.put(5, "E"); // Add key 5, evicts key 3
        System.out.println("Cache after adding key 5: " + lruCache);
    }
}
