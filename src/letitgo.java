
public class letitgo {

	public static void main(String[] args) {
		String lyrics1= new String("Let it go! Let it go! Cannot hold it back anymore");
		System.out.println(lyrics1);
		String str1 = lyrics1.replace("it", "\"her\"");
		String str2 = str1.replace("Cannot","Can't");
		System.out.println(str2);
	}

}
