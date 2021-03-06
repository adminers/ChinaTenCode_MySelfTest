package study.cto51.hkxq;

public class Array0905 {
	public static void main(String[] args) {
		// 51=
		/*
		 * 一维数组的声明方式： type var[]; 或type[] var;
		 * 
		 * 声明数组时不能指定其长度（数组中元素的个数），
		 * 
		 * Java中使用关键字new创建数组对象，格式为： 数组名 = new 数组元素的类型 [数组元素的个数]
		 * 
		 * 实例：
		 */
		int[] s;
		int i;
		s = new int[5];
		for (i = 0; i < 5; i++) {
			s[i] = i;
		}
		for (i = 4; i >= 0; i--) {
			System.out.println("" + s[i]);
		}
		/**
		 * 初始化：
		 * 
		 * 1.动态初始化：数组定义与为数组分配空间和赋值的操作分开进行； 2.静态初始化：在定义数字的同时就为数组元素分配空间并赋值；
		 * 3.默认初始化：数组是引用类型，它的元素相当于类的成员变量，因此数组分配空间后，每个元素也被按照成员变量的规则被隐士初始化。 实例：
		 */

	}
}
