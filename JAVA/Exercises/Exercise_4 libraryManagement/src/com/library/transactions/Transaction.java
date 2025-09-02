package com.library.transactions;

import com.library.books.Books;
import com.library.members.Member;
public class Transaction {
    public void borrowedBook(Member m,Books b ){
        System.out.println("Member "+m.getName() + " Borrowed "+b.getId());
    }
    public void returnedBook(Member m,Books b  ){
        System.out.println("Member "+m.getName() + " Returned "+b.getId());
    }
}
