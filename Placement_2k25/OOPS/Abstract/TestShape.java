

abstract class  shape{
    abstract  void area();
}

class Rectangle extends  shape{
    int len,bred;

     Rectangle(int l,int b) {
        len=l;
        bred=b;
    }
    void area(){
        int a=len*bred;
        System.err.println(a);
    }
    

}
class  square extends  shape{
    int side;

    public square(int s) {
        side=s;
    }
    void  area(){
        int a=side*side;
        System.err.println("area of square" +a);
    }

    
}

public class TestShape {
    public static void main(String[] args) {
        shape rect=new Rectangle(5,5);
        shape sq=new square(4);
          rect.area();
          sq.area();
            
        }
    }
    

