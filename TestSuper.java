class Father {
	private int i;
	Father(){
		System.out.println("Father1");
		}
		Father(int i){
			//this.i = i;
			System.out.println("Father1("+i+")");
			
			}
	
	}
class Sun extends Father{
	private int i;
	Sun(){
		//super(100);
		System.out.println("Sun1");
		}
	Sun(int i){
		super();
		System.out.println("Sun("+ i +")");
		
		}
	
	}
public class TestSuper{
	public static void main(String[] args){
		Sun s = new Sun();
		Sun s1 = new Sun(100);
		
		}
	
	
	}	