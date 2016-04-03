import java.util.Random;


public class BirthdayCount {
	
	
	public int birthdayParadox(){
		Random rand = new Random();
	    boolean[] bool = new boolean[356];
	    int count = 0;
	    while(true){
	    	int random = rand.nextInt(356);
	        count++;
	        if(bool[random]){
	            break;
	        }
		    bool[random] = true;
	    }
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BirthdayCount count = new BirthdayCount();
		System.out.println(count.birthdayParadox());
	}

}
