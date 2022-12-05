import java.util.ArrayList;

public class Question01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        getList(list);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void getList(ArrayList list){
        list.add("123");
        list = new ArrayList();
        list.add("abc");
        System.out.println(list);
    }
}
