package com.gof.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 */
public class BookShelf implements Aggregate{

    private List<Book> books;
    private int last;

    public BookShelf(int capacity) {
        this.books = new ArrayList<>(capacity);
        this.last = this.books.size();
    }

    public Book getBook(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(last++,book);
    }

    public int getLength() {
        return books.size();
    }

    /**
     * 遍历书架
     */
    @Override
    public MyIterator getIterator() {
        return new BookShelfIterator(this);
    }
}
