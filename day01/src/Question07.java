public class Question07 {
    public static void main(String[] args) {
        int num = 5 != 6 && 6 > 7 || 1 < 2 ? 100 : 200;
        //5与6不相等值为ture,6与7计算为false,&&运算符计算结果为false,
        // ||左边整体为false,开始计算1<2,为ture,三元运算符计算结果为100.
        System.out.println(num);
    }


}
