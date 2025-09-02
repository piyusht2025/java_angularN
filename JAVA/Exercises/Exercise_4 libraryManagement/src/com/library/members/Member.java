package com.library.members;
import com.library.books.Books;

import java.util.ArrayList;

public class Member {
    String name;
    private final int membershipId;
    ArrayList<String> issued = new ArrayList<>();
    static int i=0;
    public Member(String n , int mid){
        name=n;
        membershipId=mid;
    }
    public int getMid(){
        return this.membershipId;
    }
    public String getName(){
        return this.name;
    }
    int a=1+2;
    public void borrowBook(Books b){
        if (b.isAvailable()){
            b.borrowBook();
            issued.add(b.getId());
        }
    }
    public void borrowedBook(){
        //System.out.println("debug checking");
        for (String X:issued){
            System.out.println(X);
        }
    }
    public void returnBook(String s){
        issued.remove(issued.indexOf(s));
    }

}
