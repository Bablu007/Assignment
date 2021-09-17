package lti.com;

public class IndexOutOfBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[4];
		for(int i=0;i<=array.length+1;i++) {
			System.out.println("Welcome"+array[i]);
		}

	}

}
