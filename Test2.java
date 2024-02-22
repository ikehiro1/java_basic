public class Test2 {
    public static void main (String[]args){
        System.out.print(5+"+"+2+"=");
        System.out.println(5+2);
        System.out.print(5+"-"+2+"=");
        System.out.println(5-2);
        System.out.print(5+"x"+2+"=");
        System.out.println(5*2);
        System.out.print(5+"/"+2+"=");
        System.out.print(5/2);
        System.out.print("あまり");
        System.out.println(5%2);

        int a;// 変数の宣言
        int b = 3;//  初期化と代入を同時に行う。
        int add,sub;//  複数の変数を同時に宣言
        double avg; //  int以外の変数を宣言
        a = 6;//  代入（最初に値を入れるので、”初期化”と言う。
        add = a + b;//  a,bの和を求める。
        sub = a - b;//  a,bの差を求める。
        avg = (a-b)/2.0;//  a,bの平均値を求める。
        System.out.println(a+"+"+b+"="+ add);
        System.out.println(a+"-"+b+"="+ sub);
        System.out.println(a+"と"+b+"の平均値"+ avg);

        //代入演算子
        int a1=2,b1=2,c1=2,d1=2;//変数の宣言
        int a2=2,b2=2,c2=2,d2=2;//変数の宣言
        //  普通の演算による計算と代入
        a1 = a1+1;
        b1 = b1-1;
        c1 = c1*2;
        d1 = d1/2;
        //  代入演算による計算
        a2 += 1;
        b2 -= 1;
        c2 *= 2;
        d2 /= 2;
        System.out.println("a1="+a1+" b1=" + b1+ " c1="+c1+" d1="+d1);
        System.out.println("a2="+a2+" b2=" + b2+ " c2="+c2+" d2="+d2);

        //キャストとデータの型変換
        int x;
        double y,z,q;
        x = (int)1.23;//  キャストで代入
        y = 1.23;
        z = 10; //  キャストなしで代入
        q = (double)z;//  キャストありで代入
        System.out.println("x=" + x + " y=" + y + " z=" + z + " q=" + q);

        //文字列の変数
        String s1,s2,s3;
        s1 = "ABC";
        s2 = "DEF";
        s3 = s1 + s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 + s2);
        System.out.println(s3);


        //定数
        final int NUMBER = 100;
        final String STRING = "Hoge";
        System.out.println(NUMBER);
        System.out.println(STRING);
        //  finalがついた変数は値を変えられない
        //NUMBER = 100;
        //STRING = "fuga";

        int o = 5,p = 3;
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        System.out.println(o + " + " + p + " = " + (o + p));
        System.out.println("o"+ "-" +"p"+ "=" + (o-p) );
        System.out.println(o+ "*" +p+ "="+(o*p));
        System.out.println(o+ "/" +p+ "="+(o/p));
        System.out.println(o+ "%" +p+ "="+(o%p));
    }
}
