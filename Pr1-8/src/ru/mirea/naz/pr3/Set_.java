package ru.mirea.naz.pr3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_<E> implements Set {
    HashSet<E> main=new HashSet<>();
    @Override
    synchronized public int size() {
        return main.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return main.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return main.contains(o);
    }

    @Override
    synchronized public Iterator iterator() {
        return main.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return main.toArray();
    }

    @Override
    synchronized public boolean add(Object o) {
        return main.add((E) o);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return main.remove(o);
    }

    @Override
    synchronized public boolean addAll(Collection c) {
        return main.addAll(c);
    }

    @Override
    synchronized public void clear() {
        main.clear();
    }

    @Override
    synchronized public boolean removeAll(Collection c) {
        return main.removeAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection c) {
        return main.retainAll(c);
    }

    @Override
    synchronized public boolean containsAll(Collection c) {
        return main.containsAll(c);
    }

    @Override
    synchronized public Object[] toArray(Object[] a) {
        return main.toArray(a);
    }
}
