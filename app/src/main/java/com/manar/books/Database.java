package com.manar.books;

import java.util.ArrayList;
import java.util.List;

public class Database {
     ArrayList<Book>books=new ArrayList<>();

    public Database() {
       books.add(new Book("Android","john","Programming"));
       books.add(new Book("HTML 5","Masri","Web"));
       books.add(new Book("Python","Mark","Programming"));
       books.add(new Book("Sql","Bassem","Database"));
    }
    public List<Book> getBooks (String cat){
        ArrayList<Book>result=new ArrayList<>();
        for(Book b:books){
            if(b.getCategory().equals(cat)){
                result.add(b);
            }
        }
        return result;
    }

}
