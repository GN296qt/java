package oops.inheritance.operator;

public class thiskeyword {
    public void show(){
        System.out.println("show method invoked");
    }
    public void callshow(){
        this.show();
    }
    public static void main(String[] args) {
        thiskeyword t = new thiskeyword();
        t.callshow();
    }

}
