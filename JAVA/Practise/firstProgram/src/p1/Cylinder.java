package p1;

import org.w3c.dom.ls.LSOutput;

class cylinder {
    private double height;
    private double radius;
    public void setHeight(){
        height =10;
    }
    public void setRadius(){
        radius=2;
    }
    public double getHeight(){
        return height;
    }public double getRadius(){
        return radius;
    }
}
public class Cylinder {
    public static void main(String[] args){
    cylinder c1=new cylinder();
    c1.setHeight();
    System.out.println(c1.getHeight());

}}
