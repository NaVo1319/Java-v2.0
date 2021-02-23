package ru.mirea.naz.pr3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Map_<K,V> implements Map {
    HashMap<K,V> map=new HashMap<>();
    private static final Lock lock = new ReentrantLock();
    @Override
    public int size() {
        lock.lock();
        int x=map.size();
        lock.unlock();
        return x;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean x=map.isEmpty();
        lock.unlock();
        return x;
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        boolean x=map.containsKey(key);
        lock.unlock();
        return x;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        boolean x=map.containsValue(value);
        lock.unlock();
        return x;
    }

    @Override
    public Object get(Object key) {
        lock.lock();
        Object x=map.get(key);
        lock.unlock();
        return x;
    }

    @Override
    public Object put(Object key, Object value) {
        lock.lock();
        Object x=map.put((K)key,(V)value);
        lock.unlock();
        return x;
    }

    @Override
    public Object remove(Object key) {
        lock.lock();
        Object x=map.remove(key);
        lock.unlock();
        return x;
    }

    @Override
    public void putAll(Map m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set keySet() {
        lock.lock();
        Set<K> x=map.keySet();
        lock.unlock();
        return x;
    }

    @Override
    public Collection values() {
        lock.lock();
        Collection x=map.values();
        lock.unlock();
        return x;
    }

    @Override
    public Set<Entry> entrySet() {
        lock.lock();
        map.entrySet();
        lock.unlock();
        return null;
    }
}
