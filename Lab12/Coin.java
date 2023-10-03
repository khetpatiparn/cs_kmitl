public class Coin {
    String tailColor;
    boolean isHead;
    
    // Constructor
    Coin (String color){
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

    void hit(Coin c){
        if (!this.equals(c)){

        }else{
            
        }
    }
    
    // Overloading
    void hit(Coin c1, Coin c2){

    }
}
