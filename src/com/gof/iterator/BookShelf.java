package com.gof.iterator;

/**
 * 书架
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;

    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public Book getBook(int index) {
        return this.books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    /**
     * 遍历书架
     */
    @Override
    public MyIterator getIterator() {
        return new BookShelfIterator(this);
    }
}
