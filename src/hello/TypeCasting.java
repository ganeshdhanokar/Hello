/*Check size of datatypes
 * ex. Size== or left> right but not int convert into byte 
 * 
 */
package hello;
public class TypeCasting {
 public static void main(String[] args) {
	
	float b=2.12f;
	int i=762;
	b=i;
	//b=(byte)i;
	System.out.println("b=" +b);
}
}
