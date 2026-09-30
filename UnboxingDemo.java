class UnboxingDemo {
    public static void main(String[] args) {
        Integer intObj = 100;
        int number = intObj;

        Double doubleObj = 25.5;
        double decimal = doubleObj;

        Character charObj = 'A';
        char letter = charObj;

        Boolean booleanObj = true;
        boolean status = booleanObj;

        System.out.println("Integer to int: " + number);
        System.out.println("Double to double: " + decimal);
        System.out.println("Character to char: " + letter);
        System.out.println("Boolean to boolean: " + status);
    }
}