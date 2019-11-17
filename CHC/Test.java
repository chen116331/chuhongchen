package CHC;

public class Test {
	public static void main(String args[]) throws A{
	Changhege changhege;
	String b;
	b="不";
	try {
		changhege=new Changhege(b);
		if (b=="") {
			throw new A("不能输入空字符");
		}
		else {
			System.out.print(changhege);
		}
	}
	catch(A r) {
		r.printStackTrace();
	}
	finally {
		System.out.print("程序运行结束");
	}
	
	}
}
