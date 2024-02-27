public class Test3 {
    public static void main (String[] args){
        int dice = (int)(Math.random()*7)+1;
        System.out.println("賽の目"+dice);
        if(1 <= dice && dice <= 6){
            if(dice == 2 || dice == 4 || dice == 6){
                System.out.println("丁");
            }else{
                System.out.println("半");
            }
        }else{
            System.out.println("それ以外");
        }
    }
}
