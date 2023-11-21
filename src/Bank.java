abstract class Bank {
    abstract int interesRate();
}
class BOC extends Bank {
    int interesRate(){
         return 8;
    }
}
class HNB extends Bank{
    int interesRate(){
        return 10;
    }
}
class Test1 {
    public static void main(String[] args) {

        Bank b;
        b = new BOC();
        System.out.println("Rate of Interest : "+b.interesRate() + "%");
        b = new HNB();
        System.out.println("Rate of Interest : "+b.interesRate() + "%");
    }
}