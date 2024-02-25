package AccessModifier;

class B { // this class is being used in same Package hence no need to specifiy it as public
    private int A = 67;

    // default access Modifier is private protected in which the variable and method can be accessed within same Package

    public int getA(){
        return A;
    }
}
