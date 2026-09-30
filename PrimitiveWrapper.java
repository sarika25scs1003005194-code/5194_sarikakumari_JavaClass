class PrimitiveWrapper {
    public static void main(String[] args) {
        byte byteValue = 10;
        Byte byteWrapper = 10;

        short shortValue = 20;
        Short shortWrapper = 20;

        int intValue = 30;
        Integer intWrapper = 30;

        long longValue = 40L;
        Long longWrapper = 40L;

        float floatValue = 50.5f;
        Float floatWrapper = 50.5f;

        double doubleValue = 60.5;
        Double doubleWrapper = 60.5;

        char charValue = 'A';
        Character charWrapper = 'A';

        boolean booleanValue = true;
        Boolean booleanWrapper = true;

        System.out.println("byte: " + byteValue + " -> " + byteWrapper);
        System.out.println("short: " + shortValue + " -> " + shortWrapper);
        System.out.println("int: " + intValue + " -> " + intWrapper);
        System.out.println("long: " + longValue + " -> " + longWrapper);
        System.out.println("float: " + floatValue + " -> " + floatWrapper);
        System.out.println("double: " + doubleValue + " -> " + doubleWrapper);
        System.out.println("char: " + charValue + " -> " + charWrapper);
        System.out.println("boolean: " + booleanValue + " -> " + booleanWrapper);
    }
}