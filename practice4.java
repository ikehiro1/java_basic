public class practice4 {
    public static void main(String[]args){
        int a = (int)(Math.random()*10)+1;
        System.out.println(a);
        for(int b = 0; b < a; b++){
            System.out.print("◆ ");
        }
        System.out.println();

        int w = (int)(Math.random()*10)+1;
        System.out.println(w);
        int m = 0;
        while( w > m){
            System.out.print("◆ ");
            m++;
        }
        System.out.println();

        int y = (int)(Math.random()*10)+1;
        System.out.println(y);
        int u = 0;
        do{
            System.out.print("◆ ");
            u++;
        }while( y > u);
        System.out.println();

        int b = 0;
        while(b <= 3){
        System.out.println("b="+b+"");
        b++;
        }
        System.out.println();

        for(int l = 0;l<= 3;l++){
            System.out.println("l="+l+"");
        }
        System.out.println();

        int d = 3;
        while(d >= 0){
        System.out.println("b="+d+"");
        d--;
        }
        System.out.println();

        for(int k = 3;k>=0;k--){
            System.out.println("k="+k+"");
        }
        System.out.println();

        while(true){
            int i = (int)(Math.random()*10)+1;
            System.out.println(i);
            if(i == 10){
                break;
            }
        }
        System.out.println("終了");

        while(true){
            int f = (int)(Math.random()*100)+1;
            System.out.println(f);
            if(f%10 == 0){
                break;
            }
        }
        System.out.println("終了");

        int max = 0;
        int min = 100;
        for(int h = 1;h <= 5;h++){
            int r = (int)(Math.random()*100)+1;
            System.out.println(r);
            if(r > max){
                max = r;
            }else if(r < min){
                min = r;
            }
        }
        System.out.println("最大値"+max);
        System.out.println("最大値"+min);


    }

}

