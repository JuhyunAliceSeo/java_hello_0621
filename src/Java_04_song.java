class Song{
	String title;
	String artist;
	int year;
	String country;
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
}
public class Java_04_song {

    public Java_04_song() {
        Song sing = new Song("Dancing Queen", "스웨덴", 1978, " ABBA");
        sing.show();
    }

    public static void main(String[] args) {
        new Java_04_song();
    }
}
