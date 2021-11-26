package 整数数据和字符型数据之间的强制转换;

public class TestTypeConvert {
	public static void main(String[] args) {
		int i=65;
		char ch1=(char)i;//把65当作字符来看，对应的是A
		char ch2='刘';
		System.out.println("ch1="+ch1 );//ch1=A
		System.out.println("ch2="+ch2);//ch2=刘
		System.out.println("ch2的unicode码是："+(int)ch2);//unicode码是21016
		double a=99.56;
		int b=(byte)a;//舍弃了.56，变成了99
		System.out.println("b="+b);//b=99
		System.out.println((byte)1000);//溢出了，转换不准确，变成-24
	}

}
