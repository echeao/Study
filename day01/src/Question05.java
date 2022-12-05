public class Question05 {
    static int num;//静态变量与全局变量也一样，它们都存储在静态数据区中，因此其变量的值默认也为 0

    public static void main(String[] args) {
        //add(num);
        System.out.println(num);
    }

    public static void add(int num) {
        num = num + 200;
    }
}
