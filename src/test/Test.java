package test;

//利用递归求出5！，实现5*4*3*2*1。请按注释补充recursion方法中的代码：
public class Test{ 
	public static void main(String[] args) { 
		int i = 5;
		Test rec = new Test(); 
		System.out.println(rec.recursion(i)); 
	}
	
	public long recursion(int n) { 
		long value = 0;
		  if(n ==1 ) {
		   value = 1;
		  } else  {
		   value = n * recursion(n-1);
		  }
		  return value;
	}
	
 }
