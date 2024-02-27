public class practice3 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10)+1;
        System.out.println("数字"+num);
        if(num >= 5){
            System.out.println("5以上です");
        }
        int a = (int)(Math.random()*10)+1;
        System.out.println("数字"+a);
        if(a > 1){
            System.out.println("1ではありません");
        }
        int b = (int)(Math.random()*100)+1;
        System.out.println("数字"+b);
        if(b < 50){
            System.out.println("50未満");
        }
        int c = (int)(Math.random()*100)+1;
        System.out.println("数字"+c);
        if(c <= 20 || 80 >= c){
            System.out.println("20以上か80未満");
        }
        int d = (int)(Math.random()*100)+1;
        System.out.println("数字"+d);
        if(d <= 10 || d >= 90){
            System.out.println("10以下か90以上");
        }

    }
}

