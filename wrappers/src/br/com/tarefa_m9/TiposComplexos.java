package br.com.tarefa_m9;

public class TiposComplexos {

    public static void main(String[] args) {

        int intPrimitivo = 10;
        Integer intWrapper = Integer.valueOf(intPrimitivo);
        System.out.println("int primitivo: " + intPrimitivo);
        System.out.println("int wrapper: " + intWrapper);

        System.out.println("int para double (casting int -> double): " + (double) intPrimitivo);

        double doublePrimitivo = 20.5;
        Double doubleWrapper = Double.valueOf(doublePrimitivo);
        System.out.println("double primitivo: " + doublePrimitivo);
        System.out.println("double wrapper: " + doubleWrapper);

        int doubleParaInt = (int) doublePrimitivo;
        System.out.println("double para int (casting double -> int): " + doubleParaInt);

        byte bytePrimitivo = 100;
        Byte byteWrapper = Byte.valueOf(bytePrimitivo);
        System.out.println("byte primitivo: " + bytePrimitivo);
        System.out.println("byte wrapper: " + byteWrapper);

        System.out.println("byte para int (casting byte -> int): " + (int) bytePrimitivo);

    }
}
