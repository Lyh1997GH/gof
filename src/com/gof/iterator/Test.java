package com.gof.iterator;

/**
 * 测试入口
 */
public class Test {

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(10);
        shelf.appendBook(new Book("Around world in 80 Days"));
        shelf.appendBook(new Book("Bible"));
        shelf.appendBook(new Book("Cinderella"));
        shelf.appendBook(new Book("Daddy-Long-legs"));
        MyIterator iterator = shelf.getIterator();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
