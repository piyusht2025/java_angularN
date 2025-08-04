package com.library.books;

public class Books {
    private String id;
    private String title;
    private String author;
    private int isbn;
    private int flag=0;
    public Books(String id ,String t , String a , int isbn){
        this.id=id;
        title=t;
        author=a;
        this.isbn=isbn;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setFlag(int flag){
        this.flag=flag;
    }
    public boolean isAvailable(){
        if (this.flag==0){
            return true;
        }
        return false;
    }
    public int borrowBook(){
        //System.out.println("Debug 1");
        setFlag(1);
        return isbn;
    }
    public void releaseBook(){
        this.flag=0;
    }

}
