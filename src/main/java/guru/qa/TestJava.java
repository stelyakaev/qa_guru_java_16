package guru.qa;

public class TestJava {
    public static void main(String[] args) {
        byte varByte = 127;
        int varInt = - 2147483648;
        int varInt0 = 2147483647;
        double varDouble = 100.6d;
        float varFloat = 953.42f;

        //Переполнение
        System.out.println((byte) varByte * 100);
        System.out.println(varInt - varInt0);

        //Вычисление разных типов
        System.out.println(varInt + varByte);
        System.out.println(127 + varDouble);
    }
}