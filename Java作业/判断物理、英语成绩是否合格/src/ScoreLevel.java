import java.util.Scanner;
public class ScoreLevel {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ɼ���");
		int physisc = sc.nextInt();
		System.out.println("������Ӣ��ɼ�: ");
		int english = sc.nextInt();
		if (physisc >=60) { //if�ж�����ж�physics�Ƿ���ڵ���60
			System.out.println("������");
		} else { //if����������
			System.out.println("��������");
		}
		if (english >=60) { //if�ж�����ж�english�Ƿ���ڵ���60
			System.out.println("Ӣ�Ｐ��");
		} else { //if����������
			System.out.println("Ӣ�ﲻ����");
	    }

	}
}
