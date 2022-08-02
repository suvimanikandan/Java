public class Chocalate {
    static int countRec(int chocalate,int wrap){
        if(chocalate<wrap)
        return 0;
        int newchocalate=chocalate/wrap;
        return newchocalate+ countRec(newchocalate+chocalate%wrap,wrap);
       
    }
    static int countMaxChocalate(int money,int price,int wrap){
        int chocalate=money/price;
        return chocalate +countRec(chocalate,wrap);

    }
    public static void main(String[] args) {
        int money=16;
        int price=2;
        int wrap=2;
        System.out.println(countMaxChocalate(money,price,wrap));
    }
}
