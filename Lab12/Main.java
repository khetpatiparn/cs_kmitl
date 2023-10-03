public class Main {
    public static void main(String[] args) {
        // demo_1_instantiation(); // clear
        demo2_hit();
        demo3_overloaded_hit();
        
    }
    static void demo3_overloaded_hit() {
        System.out.println("-demo overloaded method (from demo2)");
        Coin c1 = new Coin("Burgandy");
        Coin c2 = new Coin("Cabala");
        Coin c3 = new Coin("Danube");
        c1.hit(c2, c3);
    }
    static void demo2_hit() {
        System.out.println("-demo object interaction--");
        Coin c1 = new Coin("Burgandy"); // head
        Coin c2 = new Coin("Cabala"); 
        Coin c3 = new Coin("Danube");
        c1.hit(c2); // c2 => tail but c1 head                          
        c1.hit(c3); // c3 => tail but c1 head
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    static void demo_1_instantiation() {
        System.out.println("-demo instantiation and call object method--");
        Coin c1 = new Coin("Burgandy");
        Coin c2 = new Coin("Cabala");
        Coin c3 = new Coin("Danube");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c2.flip();
        System.out.println(c2);
    }        
}
