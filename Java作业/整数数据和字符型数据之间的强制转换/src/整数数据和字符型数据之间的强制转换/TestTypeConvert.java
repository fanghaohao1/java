package �������ݺ��ַ�������֮���ǿ��ת��;

public class TestTypeConvert {
	public static void main(String[] args) {
		int i=65;
		char ch1=(char)i;//��65�����ַ���������Ӧ����A
		char ch2='��';
		System.out.println("ch1="+ch1 );//ch1=A
		System.out.println("ch2="+ch2);//ch2=��
		System.out.println("ch2��unicode���ǣ�"+(int)ch2);//unicode����21016
		double a=99.56;
		int b=(byte)a;//������.56�������99
		System.out.println("b="+b);//b=99
		System.out.println((byte)1000);//����ˣ�ת����׼ȷ�����-24
	}

}
