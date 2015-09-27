package study.cto51.hkxq;

public class Array906_JTFZ {
	/**
	 * 初始化：
	 * 
	 * 1.动态初始化：数组定义与为数组分配空间和赋值的操作分开进行； 2.静态初始化：在定义数字的同时就为数组元素分配空间并赋值；
	 * 3.默认初始化：数组是引用类型，它的元素相当于类的成员变量，因此数组分配空间后，每个元素也被按照成员变量的规则被隐士初始化。 实例：
	 */
	
	public static void main(String[] args) {
		int a[] = { 0, 1, 2 };
		Time times[] = { new Time(19, 42, 42), new Time(1, 23, 54), new Time(5, 3, 2) };

	}

}

class Time {
	int hour, min, sec;

	Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
}