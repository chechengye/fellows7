package com.lovecoding.day09.iterator;

import java.util.Arrays;

/**
 * ArrayList - 具体的容器实现类
 */
public class ConcreteAggregate implements Aggregate{

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elementData;
    private int minCapacity;
    private int count;


    public ConcreteAggregate(){
        elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(Object e) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        ensureExplicitCapacity(minCapacity);

        elementData[count++] = e;
    }

    private void ensureExplicitCapacity(int minCapacity) {
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);

        return elementData[index];
    }

    private void rangeCheck(int index) {
        if(index < 0 || index >= this.count){
            throw new IndexOutOfBoundsException("Index: "+index+", Count: "+count);
        }
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
