package CHC;

public class Test {
	public static void main(String args[]) throws A{
	Changhege changhege;
	String b;
	b="��";
	try {
		changhege=new Changhege(b);
		if (b=="") {
			throw new A("����������ַ�");
		}
		else {
			System.out.print(changhege);
		}
	}
	catch(A r) {
		r.printStackTrace();
	}
	finally {
		System.out.print("�������н���");
	}
	
	}
}
