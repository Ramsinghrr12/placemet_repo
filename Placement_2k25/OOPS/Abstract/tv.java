abstract class tv{
    abstract void on();
    abstract void off();
}
class tvremote extends tv{
    void on(){
        System.out.println("tv is on");
    }
    void off(){
        System.out.println("tv is offed");
    }
    public static void main(String[] args) {
        tv remote=new tvremote();
        remote.on();
        remote.off();
    }
}