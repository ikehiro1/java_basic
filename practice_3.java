public class practice_3 {
    public static void main(String[]args){
        int num = (int)(Math.random()*6)+1;  
        System.out.println(num);
        if(num > 3)
        System.out.println("3以上");
    
        int n = (int)(Math.random()*10)+1;  
        System.out.println(n);
        if(n > 5){
        System.out.println("5以上");
        }else{
        System.out.println("5未満");
        }

        int a = (int)(Math.random()*10)+1;  
        System.out.println(a);
        if(a == 1){
        System.out.println("1です");
        }else{
        System.out.println("1以外");
        }

        int b = (int)(Math.random()*100)+1;
        System.out.println(b);
        if(b < 50){
            System.out.println("50未満");
        }else{
            System.out.println("50以上");
        }

        int c = (int)(Math.random()*100)+1;
        System.out.println(c);
        if(c <= 10 || c >= 90){
            System.out.println("10以下90以上");
        }else{
            System.out.println("10以上90未満");
        }

        int d = (int)(Math.random()*100)+1;
        System.out.println(d);
        if(d <= 20 || d >= 80){
            System.out.println("20未満80以上");
        }else{
            System.out.println("20以上80未満");
        }

        int e = (int)(Math.random()*21)-10;
        System.out.println(e);
        if(e < 0){
            System.out.println("負");
        }else{
            System.out.println("正");
        }

        int f = (int)(Math.random()*3)+1;
        System.out.println(f);
        if(f == 1){
            System.out.println("グー");
        }else if(f == 2){
            System.out.println("チョキ");
        }else{
            System.out.println("パー");
        }

        int g = (int)(Math.random()*10)+1;
        int h = (int)(Math.random()*10)+1;
        System.out.println("gは"+g);
        System.out.println("hは"+h);
        if(g < h){
            System.out.println("hの勝ち");
        }else if(h < g){
            System.out.println("gの勝ち");
        }else{
            System.out.println("等しい");
        }

        int i = (int)(Math.random()*100)+1;
        System.out.println(i);
        if(i >= 80){
            System.out.println("優");
        }else if(i < 80 && i >70){
        System.out.println("良");
        }else if(i < 70 && i >60){
            System.out.println("可");
        }else{
            System.out.println("不可");
        }

        int j = (int)(Math.random()*100)+1;
        System.out.println(j);
        if(j%2 == 0 && j%3 == 0){
            System.out.println("2と3の公倍数");
        }else if(j%3 == 0){
            System.out.println("3の倍数");
        }else if(j%2 == 0){
            System.out.println("2の倍数");
        }

        int k = (int)(Math.random()*100)+1;
        System.out.println(k);
        if(k < 50 && k%2 == 0){
            System.out.println("50以下偶数");
        }else if(k%2 == 0){
            System.out.println("偶数");
        }else if(k < 50){
            System.out.println("50以下");
        }

        int l = (int)(Math.random()*46)-10;
        System.out.println(l);
        if(l >= 30){
            System.out.println("真夏日");
        }else if(l >= 25 || 30 <= l){
            System.out.println("夏日");
        }else if(0 > l){
            System.out.println("真冬日");

        }

    }

}
