import java.util.Scanner;
import java.util.Scanner;
//Master-Test
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别：");
        String gender = sc.next();
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();

        if (score<10){
            if(gender.equals("男")){
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }

        }else{
            System.out.println("淘汰");
        }

    }


}
