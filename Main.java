package dia_mes_ano;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data(15);
        Data data3 = new Data(10, 5);
        Data data4 = new Data(29, 2, 2020);
        
        System.out.println("Formato 1:");
        System.out.println(data1.format1());
        System.out.println(data2.format1());
        System.out.println(data3.format1());
        System.out.println(data4.format1());
        
        System.out.println("Formato 2:");
        System.out.println(data1.format2());
        System.out.println(data2.format2());
        System.out.println(data3.format2());
        System.out.println(data4.format2());
        
        System.out.println("Formato 3:");
        System.out.println(data1.format3());
        System.out.println(data2.format3());
        System.out.println(data3.format3());
        System.out.println(data4.format3());
    }
}
