#褚洪辰 计182 2018310617

一、实验目的
1、掌握字符串String及其方法的应用。
2、提供用户查询诗歌中特殊字出现次数的功能。
3、掌握未输入内容时可以抛出异常。
二、实验要求
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。” 2.允许提供输入参数，统计古诗中某个字或词出现的次数 3.考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行 输出： 汉皇重色思倾国，御宇多年求不得。 杨家有女初长成，养在深闺人未识。 天生丽质难自弃，一朝选在君王侧。 回眸一笑百媚生，六宫粉黛无颜色。 春寒赐浴华清池，温泉水滑洗凝脂。 侍儿扶起娇无力，始是新承恩泽时。 云鬓花颜金步摇，芙蓉帐暖度春宵。 春宵苦短日高起，从此君王不早朝。
三、实验过程
1、创建Changhege类，用于引入诗篇，每七个字加一个逗号，每十四个字加一个句号。并且对首尾两个字的顺序加一。
2、创建A类，用于在为输入文字时抛出异常。
3、创建Test类，用于测试调用上述两类的效果。
四、流程图
https://github.com/chen116331/chuhongchen/blob/master/%E6%B5%81%E7%A8%8B%E5%9B%BE.png
五、核心代码和注释
int last = s.length();//调用方法计算诗歌长度
for(int i = last - 7; i > 0; i-=7) 
		{
			if(i%14==0)
			{
				s.insert(i,'。');
				s.insert(i+1,'\n');
			}
			else s.insert(i,'，');
			}//运用for函数每隔7字加，每隔十四字加。
 StringTokenizer a = new StringTokenizer(d,j);
		int number = a.countTokens();
		while(a.hasMoreTokens()) 
		{
			String k = a.nextToken();//用于查询字出现的次数
      public class A extends Exception {
	public A(){
	}
	public A(String str) {
		super (str);
	}
}//用于反应异常
try {
		changhege=new Changhege(b);
		if (b=="") {
			throw new A("不能输入空字符");//抛出异常提示
		}
		else {
			System.out.print(changhege);
		}
	}
	catch(A r) {
		r.printStackTrace();//捕获并打印系统异常
  六、运行截图
  输入生查询：https://github.com/chen116331/chuhongchen/blob/master/%E7%94%9F.png
  空字符查询：https://github.com/chen116331/chuhongchen/blob/master/%E7%A9%BA%E5%AD%97%E7%AC%A6.png
  七、编程感想
  这次编程加深我熟练运用字符串String方法的技巧，复习了循环分隔句子的for方法，了解了查寻某个字并记录其出现次数的方法，掌握了当系统出现异常将其抛出的报错方法。加深了我对java编程的认识，增进了我对语言学习的兴趣。
