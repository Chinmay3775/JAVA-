class A {
    public A() { 
        //super();
        System.out.println("in A");
    }

    public A (int a){
        super();
        //this();
        System.out.println("in A int");
    }
}
class B extends A{
    
    public B(){
        //super(a);
        System.out.println("in B");
    }
    
    public B(int a){
        
        
        this();
        
        System.out.println("in B int");
    }
}
public class super_this {
    public static void main(String[] args) {
        B obj= new B(5);
        
    }
    

}
