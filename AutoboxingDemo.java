class AutoboxingDemo {
    public static void main(String[] args) {
        int number = 100;
        Integer intObj = number;

        double decimal = 25.5;
        Double doubleObj = decimal;

        char letter = 'A';
        Character charObj = letter;

        boolean status = true;
        Boolean booleanObj = status;

        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + booleanObj);
    }
}