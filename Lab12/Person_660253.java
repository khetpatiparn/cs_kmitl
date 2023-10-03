class Person_660253 {
    String name;
    int saving;

    // Constructor
    Person_660253 (String n, int amount){
        name = n;
        saving = amount;
    }
    // Method
    void introduce_self(){
        System.out.println("Hi, My name is " + name);
    }

    @Override
    public String toString(){
        return "I am " + name + ". My savings amount is " + saving;
    }
    
    boolean isWealthier(Person_660253 p){
        if (saving > p.saving){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object theOther) {
        if (this == theOther)
            return true;
        if (theOther == null)
            return false;
        if (getClass() != theOther.getClass())
            return false;
        Person_660253 other = (Person_660253) theOther;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (saving != other.saving)
            return false;
        return true;
    }

    void reward(Person_660253 p, int amount){ // p is poo dai rub
        if (saving >= 0)
            saving = saving - amount;
            p.saving = p.saving + amount;
    }
}



