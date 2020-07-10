package com.gof.iterator;

public class BookShelfIterator implements MyIterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.index = 0;
        this.bookShelf = bookShelf;
    }

    /**
     * 判断是否存在下一个元素
     */
    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    /**
     * 获取下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBook(this.index);
        this.index++;
        return book;
    }
}
