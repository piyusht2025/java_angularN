package generics;
class myarray{
    Object arr[]=new Object[5];
    int length=0;
    void setArr(Object i){
        arr[length++]=i;
    }
    void getArr(){
        for (Object i:arr){
            System.out.println(i);
        }
    }

}
public class test1 {
    public static void main(String[] args) {
        myarray arr= new myarray();
        arr.setArr("abc");
        arr.setArr(10);
        arr.setArr(20);
        arr.setArr(30);
        arr.setArr("xyz");
        arr.getArr();
    }
}
