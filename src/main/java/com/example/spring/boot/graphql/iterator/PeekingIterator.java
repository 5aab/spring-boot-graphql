package com.example.spring.boot.graphql.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class PeekingIterator<T> implements Iterator<T> {

    private T[] t;
    private int position = 0;
    private int size = 0;


    public PeekingIterator() {
        this(8);
    }

    public PeekingIterator(int size) {
        t = (T[]) new Object[size];
    }

    @Override
    public T next() {
        return t[position];
    }

    @Override
    public boolean hasNext() {
        return position < t.length;
    }

    public T peek() {
        return t[position + 1];
    }

    public void add(T element) {
        t[size] = element;
        size++;
        if (size >= position) {
            t = Arrays.copyOf(t, size * 2);
        }
    }


}