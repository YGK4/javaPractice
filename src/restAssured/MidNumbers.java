package restAssured;

import java.util.ArrayList;

public class MidNumbers {
	
	ArrayList<Float> arrayList = new ArrayList<Float>();

	public void midNumbers(int startNum,int endNum)
	{
		
		for(float i=startNum;i<=endNum;i++)
		{
//			System.out.println(i);
			arrayList.add(i);
		}
		int size=arrayList.size();
		int midNumber=size/2;
		System.out.println(midNumber);
		System.out.println(arrayList.get(midNumber));
	}
	
	
	public static void main(String[] args) {
MidNumbers midNumbers = new MidNumbers();
midNumbers.midNumbers(4,24);
	}

}
