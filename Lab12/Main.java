public class Main {
    public static void main(String[] args) {
        demo_1_instantiation(); // clear
        demo2_hit();
        demo3_overloaded_hit();
        
    }
    static void demo3_overloaded_hit() {
        System.out.println("-demo overloaded method (from demo2)");
        Coin_660253 c1 = new Coin_660253("Burgandy");
        Coin_660253 c2 = new Coin_660253("Cabala");
        Coin_660253 c3 = new Coin_660253("Danube");
        c1.hit(c2, c3);
    }
    static void demo2_hit() {
        System.out.println("-demo object interaction--");
        Coin_660253 c1 = new Coin_660253("Burgandy"); // head
        Coin_660253 c2 = new Coin_660253("Cabala"); 
        Coin_660253 c3 = new Coin_660253("Danube");
        c1.hit(c2); // c2 => tail but c1 head                          
        c1.hit(c3); // c3 => tail but c1 head
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    static void demo_1_instantiation() {
        System.out.println("-demo instantiation and call object method--");
        Coin_660253 c1 = new Coin_660253("Burgandy");
        Coin_660253 c2 = new Coin_660253("Cabala");
        Coin_660253 c3 = new Coin_660253("Danube");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c2.flip();
        System.out.println(c2);
    }        
}
