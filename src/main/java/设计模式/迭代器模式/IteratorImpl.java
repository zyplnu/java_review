package 设计模式.迭代器模式;

import java.util.List;

public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;
    private int cursor;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置：" + cursor + ":");
        E e = list.get(cursor);
        cursor++;
        return e;
    }

    @Override
    public boolean hasNext() {
        if(cursor > list.size()-1){
            return false;
        }
        return true;
    }
}
