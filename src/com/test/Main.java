package com.test;

import com.test.builder.Book;
import com.test.builder.MyComputer;

import java.util.Date;

import static com.test.builder.Computer.Component.KEYBOARD;
import static com.test.builder.Computer.Component.MOUSE;
import static com.test.builder.MyComputer.Brand.ASUS;

public class Main {
    public static void main(String[] args){
        Book book = new Book.Builder().author("John")
                .description("Description")
                .publicationDate(new Date())
                .publisher("Publisher")
                .title("Title Title")
                .build();

        MyComputer myComputer = new MyComputer.Builder(ASUS)
                .addComponent(MOUSE).addComponent(KEYBOARD).build();
    }
}
