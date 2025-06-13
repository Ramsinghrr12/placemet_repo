class animal{
    void eat(){
        System.out.println("iam eating");
    }
}
class dog extends animal{

     
}
public class ani{
    public static void main(String a[]){
        dog d=new dog();
        d.eat();
    }
}
