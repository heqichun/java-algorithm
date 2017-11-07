package test;

public class Hello {

	public static void main(String[] args) {
		
		String str = "http://zcm.bulidnet.cn/wxpr/#/subscription-list/project/true";
		System.out.println(str.substring(str.indexOf("/wxpr/#/")+8));
	}

}
