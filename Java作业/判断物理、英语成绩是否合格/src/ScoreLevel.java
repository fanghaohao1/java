import java.util.Scanner;
public class ScoreLevel {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入物理成绩：");
		int physisc = sc.nextInt();
		System.out.println("请输入英语成绩: ");
		int english = sc.nextInt();
		if (physisc >=60) { //if判断语句判断physics是否大于等于60
			System.out.println("物理及格");
		} else { //if条件不成立
			System.out.println("物理不及格");
		}
		if (english >=60) { //if判断语句判断english是否大于等于60
			System.out.println("英语及格");
		} else { //if条件不成立
			System.out.println("英语不及格");
	    }

	}
}
