public class Sample601 {
    public static void main(String[]args){
        SampleClass01 s = new SampleClass01();
        s.n = 100;
        s.s = "hello";
        int ans = s.add(1,2);
        String str = s.add("world");
        System.out.println(ans);
        System.out.println(str);
        s.showNum();
    }
}
