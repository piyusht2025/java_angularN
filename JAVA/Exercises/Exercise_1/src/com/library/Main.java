package com.library;
import com.library.members.Member;
import com.library.books.Books;
import com.library.transactions.Transaction;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Books b1=new Books("B1","Title 1","Author 1" , 001);
        Books b2=new Books("B2","Title 2","Author 2" , 002);
        Books b3=new Books("B3","Title 3","Author 3" , 003);
        Books b4=new Books("B4","Title 4","Author 4" , 004);
        Books B[]=new Books[4];
        B[0]=b1;
        B[1]=b2;
        B[2]=b3;
        B[3]=b4;
        Member m1 =new Member("m1",100);
        Member m2 =new Member("m2",200);
        Member m3 =new Member("m3",300);
        Member M[]=new Member[3];
        M[0]=m1;
        M[1]=m2;
        M[2]=m3;
        class Helper{
            Books getRefBook(String id){
                for (Books x:B) {
                    if (x.getId().equals(id)) {
                        return x;
                    }
                }
                return null;
            }
            Member getRefMember(int id){
                for (Member x:M) {
                    if ((x.getMid())==id) {
                        return x;
                    }
                }
                return null;
            }
            void availableBooks(){
                for (Books x:B){
                    if (x.isAvailable()){
                        System.out.print(x.getId()+" ");
                    }
                }
            }
            void availableMembers(){
                for ( Member x:M){
                    System.out.println(x.getMid());
                }
            }
        }
        Helper helper=new Helper();
        Transaction t =new Transaction();
        Scanner sc=new Scanner(System.in);
        int memid;
        int start;
        Member memref;
        String s;
        Books taken;
        String id;
        do {
            System.out.println("Do you want to perform transaction press 1 :");
            start = sc.nextInt();
            //prints all the members
            System.out.println("Available Employees");
            helper.availableMembers();
            System.out.println("Enter Employee id ");
            memid = sc.nextInt();

             memref = helper.getRefMember(memid);

            System.out.println("Press 1 for Borrow Press 0 for deposit ");
            int select = sc.nextInt();

            if (select == 1) {
                helper.availableBooks();
                //System.out.println("Enter ");
                System.out.println("\nEnter a Book");
                 s = sc.next();
                taken = helper.getRefBook(s);
                memref.borrowBook(taken);
                t.borrowedBook(memref, taken);
            } else {
                System.out.println("\n Member " + memref.getName() + " borrowed: ");

                memref.borrowedBook();
                System.out.println("Enter Book You want to return");
                 id = sc.next();

                memref.returnBook(id);
                t.returnedBook(memref, helper.getRefBook(id));
            }
        }while(start==1);
    }
}
