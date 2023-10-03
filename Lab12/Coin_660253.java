public class Coin_660253 {
    String tailColor;
    boolean isHead;
    
    // Constructor
    Coin_660253 (String color){
        tailColor = color;
        isHead = true;
    }

    @Override
    public String toString() {
        return "I am a coin object with tailColor = " + tailColor + ". My isHead is " + isHead;
    }

    void flip(){
        if (isHead){
            System.out.println("From flip() -> I am head my color is SILVER (my tailColor is " + tailColor + ")");
        }else {
            System.out.println("From flip() -> My face color is " + tailColor);
        }
        isHead = !isHead;
    }
    void hit(Coin_660253 c){
        //can't hit itself
        if(!this.equals(c)){
            this.flip();
            c.flip();
        }else{
            System.out.println("you can't hit itself");
        }
    }
    // Overloading
    void hit(Coin_660253 c1, Coin_660253 c2){
        if (!(this.equals(c1) || this.equals(c2)) && (!(c1.equals(c2)))){
            System.out.println("Coin with tailColor = " + tailColor + " hits me.");
            c1.flip();
            System.out.println("Coin with tailColor = " + tailColor + " hits me.");
            c2.flip();
            this.flip();
        }else{
            System.out.println("you can't hit itself");
        }
    }
}
