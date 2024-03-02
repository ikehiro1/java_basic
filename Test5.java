public class Test5 {
    public static void main(String[]args){
        double one,two,three;
        double sum,avg;//  合計値、平均値を入れる変数
        one = 1.2;//  変数の代入
        two = 3.7;//  変数の代入
        three = 4.1;//  変数の代入
        System.out.println(one+" "+two+" "+three);
        sum = one+two+three;//  合計値の計算
        avg = sum/3.0; //  平均値の計算
        System.out.println("合計："+sum);
        System.out.println("平均："+avg);

        double d[] = new double[3];//配列変数の宣言
        double s,a;
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        s = 0.0;
        for(int i = 0;i<d.length; i++){//d.length 配列変数の成分の数
            System.out.println(d[i]+" ");
            s += d[i];
        }
        a = s/3.0;
        System.out.println("合計："+s);
        System.out.println("平均："+a);


        int n[] = {5,4,3,2,1,0};
        String p[] = {"abc","def","ghi"};
        int o;
        for(o = 0;o<n.length;o++){
            System.out.println(n[o]+" ");
        }
        System.out.println();
        for(o = 0;o<p.length;o++){
            System.out.println(p[o]+" ");
        }
        System.out.println();
        
        
        int y [][] = new int[3][4];
        int m,l;
        for(m = 0;m<y.length;m++){
            for(l = 0;l<y[m].length;l++){
                y[m][l] = m+l;
            }
        }
        for(m = 0;m<y.length;m++){
            for(l = 0;l<y[m].length;l++){
                System.out.print(y[m][l]+" ");
            }
            System.out.println();
        }

        int c[][] = {{0,1},{2},{3,4,5,6}};
        for(int j = 0;j<c.length;j++){
            for(int h = 0;h<c[j].length;h++){
                System.out.print(c[j][h]+" ");
            }
            System.out.println();
        }
    }
}
