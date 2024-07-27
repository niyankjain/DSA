/*
<<<<--------------Bit Manipulation-------------->>>>

Function:
get
set
clear
update

Get function: 
Que: To find 3rd position of digig from no 5.
*/

public class BitManipulation {
	public static void main(String[] args) {
		int number = 3;
		int pos = 2;
		int bitMask = 1 << pos;
		if((number & bitMask) == 0) {
			System.out.println("Bit is Zero");
		} else {
			System.out.println("Bit is One");
		}


		//Set one on 3rd digit 
		int numbers = number | bitMask ;
		System.out.println(numbers);


		int nextpos=1;
		bitMask = 1 << nextpos;
		int bitNo = ~(bitMask);
		System.out.println(bitNo & numbers);

	}
}