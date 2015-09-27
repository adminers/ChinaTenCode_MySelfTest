package study.cto51.hkxq;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;


public class Anarray {
	public static void main(String[] args) {
		
		String[] clockTypes={"a","b","c"};
		for (int i = 0; i < clockTypes.length; i++) {
			
			//System.out.println(clockTypes[i]);
		}
		//数组反转
		int[] inArray={1,2,3,4,5};
		ArrayUtils.reverse(inArray);
		System.out.println("数组反转"+Arrays.toString(inArray));
		//从数组中移除一个元素
		int[] remoed = ArrayUtils.removeElement(inArray, 2);//create a new array
		System.out.println("从数组中移除一个元素"+Arrays.toString(remoed));
		//将数组中的元素以字符串的形式输出
		//同样利用StringUtils中的join方法，可以将数组中的元素以一个字符串的形式输出。
		//containing the provided list of elements 
		//Apache common lang
		String j = org.apache.commons.lang3.StringUtils.join(new String[]{"a","b","c"});
		System.out.println("将数组中的元素以字符串的形式输出"+j);
		
		
	}
}
