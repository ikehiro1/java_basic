    //ファイル名と同じ
class Index{
    public static void main(String[] args){
        System.out.println("おはよう");

        //型  //変数名(アルファベット、数字、_、$)
        int kazu = 1;
        int kazu_0 = 2;
        int suuji = 3;

        System.out.println(kazu);
        System.out.println(kazu_0);
        System.out.println(suuji);
        

        //データ型
        //整数
        byte var01 = 2;
        short var_01 = 12345;
        int a001 = 1234567890;
        long a$ = 1234567890000L; //最後尾に「L」

        System.out.println("数字は"+var01);
        System.out.println(var_01);
        System.out.println(a001);
        System.out.println(a$+"です");

        //データ型
        //浮動小数点数
        double var0 = 1.23456789;
        float var00 = 1.234F; //最後尾に「F」

        System.out.println(var0);
        System.out.println(var00);

        //データ型
        //boolean
        int var_a = 10;
        int var_b = 1;
        boolean var_bool;
        var_bool = (var_a > var_b);

        System.out.println(var_bool);

        //データ型
        //文字
        char moji = 'a'; //文字１つ,['']
        String moji_1 = "hello"; //文字２つ以上,[""]

        System.out.println(moji);
        System.out.println(moji_1);


        //配列
        //宣言・代入を分ける
        String[] arr;
        arr = new String[3];

        arr[0]="こんにちわ";
        arr[1]="ありがとう";
        arr[2]="さよなら";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //配列
        //宣言・代入をまとめる
        String[]arr_1 = {"魔法の","言葉で","楽しい"};

        System.out.println(arr_1[0]);
        System.out.println(arr_1[1]);
        System.out.println(arr_1[2]);
        
        String[]arr_2 = {"魔法の","言葉で","楽しい"};

        arr_2[1] = "tanaka";

        System.out.println(arr_2[0]);
        System.out.println(arr_2[1]);
        System.out.println(arr_2[2]);


        //配列
        //多次元配列 宣言・代入を分ける
        String[][] arr_3;
        arr_3 = new String[2][2];

        arr_3[0][0]="砂糖";
        arr_3[1][1]="塩";
        arr_3[1][0]="酢";
        arr_3[1][1]="醤油";

        System.out.println(arr_3[0][0]);
        System.out.println(arr_3[1][1]);
        System.out.println(arr_3[1][0]);
        System.out.println(arr_3[1][1]);

        //配列
        //多次元配列 宣言・代入をまとめる
        String[][] arr_4 = {{"satou","sio"},{"su","syoyu"}};

        System.out.println(arr_4[0][0]);
        System.out.println(arr_4[1][1]);
        System.out.println(arr_4[1][0]);
        System.out.println(arr_4[1][1]);


        //演算子
        int x = 10;
        int y = 2;
        int z = 10;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y); //割り算の余り

        //関係演算子
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y); //xの１０はyの２以上
        System.out.println(x <= y); //xの１０はyの２以下
        System.out.println(x <= z); //xの１０はzの１０以下


        //等価
        System.out.println(x == y); 
        System.out.println(x != y); 


        //論理演算子
        int q = 9;
        int w = 3;

        System.out.println(q >= 5 && w <= 10);
        System.out.println(w >= 5 && w <= 10);
        System.out.println(q == 3 || w == 3);
        System.out.println(q == 1 || w == 1);


        //代入演算子
        //複合代入演算子（代入時に+.-を組み合わせる）
        int g = 8;
        int o = 12;
        int p = 20;

        System.out.println(g += 10);
        System.out.println(p += o);


        //インクリメント（値に１増やす　変数名++）
        //デクリメント（値に１減らす　変数名--）
        int l = 10;
        int m = 10;

        l++;
        m--;

        System.out.println(l);
        System.out.println(m);


        //if分
        int age = 0;
        if (age >= 20){
            System.out.println("adult");
        }else if (age==0){
            System.out.println("bady");
        }else{
            System.out.println("child");
        }


        //for文
        for(int i = 0; i <= 4; i ++){
            System.out.println(i);
        }

        //ブレイク文（条件に当てはまった時停止)
         for(int i = 0; i <= 4; i ++){
             if(i==3){
                 break;
             }
             System.out.println(i);
        }
         
        //continue文（条件に当てはまった値をスキップ）
        for(int i = 0; i <= 4; i ++){
            if(i==3){
                continue;
            }
            System.out.println(i);
       }

       //for文のネスト（あるものの中に同じものが入ってることをネスト）
       for(int i = 0; i <= 2; i ++){
        for(int j = 0; j <= 2; j ++){
            System.out.println(i + "-" + j);
        }
       }

       //カウンタ変数を使用し配列の中身を表示
       int arr000[] = {2,4,6,8,10};
       for(int i = 0; i <= 4; i++ ){
        System.out.println(arr000[i]);
       }

       int arr0001[] = {2,4,6,8,10};
       int sum = 0;

       for(int i = 0; i <= 4; i++ ){
        sum += arr0001[i];
        System.out.println(sum);
       }

    }

}