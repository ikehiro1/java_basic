public class Sample701 {
    public static void main(String[]args){
        SampleClass02 s = new SampleClass02();
        //  method1()は、privateなので、外部からはアクセスできない。
        //s.method1();
        s.method2();
        s.method3();
        //numは、privateフィールドなので、外部からはアクセスできない。
        //s.num = 1;
    }
}
