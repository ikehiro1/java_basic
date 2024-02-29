public class Test4 {
    public static void main(String[]args){
        for(int i = 1;i <= 5;i++){   //初期化処理 ; 条件式 ; 増分処理 
            System.out.println(i+"");
        }
        System.out.println();
    

        for (int q = 1;q <= 2;q++){
            for(int j = 1;j<=3;j++){
                int k = q+j;
                System.out.println(q+"+"+j+"="+k+"");
            }
            System.out.println();
        }
        int w = 0;
        while(w <= 5){
            System.out.print(w+"");
            w++;
        }
        System.out.println();

        int a = 0;
        do{
            System.out.println(a+"");
            a++;
        }while(a<=5);
        System.out.println();

        int e,num;
        num = 1;
        System.out.print("whileで実行:");
        e = 1;
        while(e < num){
            System.out.print("*");
            e++;
        }
        System.out.println();
        System.out.print("do～whileで実行:");
        e = 1;
        do{
            System.out.println("*");
            e++;
        }while(e < num);

        System.out.println("6が出たら終了");
        while(true){
            int dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if(dice == 6){
                break;
            }
        }
    }
}
