interface  shape{
    void area();
}
class Rectangle implements  shape{
    int l,b;

     Rectangle(int l,int b) {
        l=l;
        b=b;
    }
    public void area(){
        System.out.println(l*b);
    }
    
}
class  square implements  shape{
    int side;

     square(int s) {
        side=s;

    }

public void area(){
    System.out.println(side*side);
}   
}
public class TestShape {
    public static void main(String[] args) {
        shape r=new Rectangle(10,10);
        shape s=new square(10);
            

        
    }
    
}
