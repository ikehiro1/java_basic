public class practice5 {
    public static void main(String[]args){
        int [] a = new int[7];
        for(int b = 0;b<a.length;b++){
            a[b] = (int)(Math.random()*10)+1;
            System.out.println(a[b]+"");
        }

        double [] c = {0.2,-5.1,3.2,1.8};

        for(int d = 0;d<c.length;d++){
            System.out.println(c[d]);
        }

        int [] e = new int [10];
        for(int f = 0;f<e.length;f++){
            e[f] = (int)(Math.random()*100)+1;
            System.out.println(e[f]);
            if(e[f]%2 == 0){
                System.out.println("偶数");
            }else{
                System.out.println("奇数");
            }
        }

        int []g = new int [10];
        for(int h = 0;h<g.length;h++){
            g[h] =(int)(Math.random()*100)+1;
            System.out.println(g[h]);
            if(g[h] < 50){
                System.out.println("50以下");
            }else{
                System.out.println("50以上");
            }
        }

        int []i = new int [10];
        for(int j = 0;j<i.length;j++){
            i[j] = (int)(Math.random()*10)+1;
            System.out.println(i[j]);
            if(i[j]%3 == 0){
                System.out.println("3倍数");
            }else{
                System.out.println("それ以外");
            }
        }

        int max = 0;
        int min = 10;
        int []k = new int[10];
        for(int l = 0;l<k.length;l++){
            k[l] = (int)(Math.random()*10)+1;
            System.out.println(k[l]);
            if(k[l]>max){
                max = k[l];
            }else if(k[l]<min){
                min = k[l];
            }
            System.out.println("最大値"+max);
            System.out.println("最小値"+min);

        }
    }
}
