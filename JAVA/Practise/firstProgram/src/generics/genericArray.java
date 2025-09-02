package generics;
class myArray <T>{
    T arr[]=(T[]) new Object[5];
    int length=0;
    void setArr(T i){
        arr[length++]=i;
    }
    void getArr(){
        for (int i=0;i<length;i++){
            System.out.println(arr[i]);
        }

    }
}
public class genericArray {
    public static void main(String[] args) {
        myArray<String> arr=new myArray<>();
        arr.setArr("10");
        arr.setArr("20");
        arr.setArr("30");
        arr.setArr("String");
        arr.getArr();
    }
}
