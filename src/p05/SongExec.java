package p05;

public class SongExec {
	
	public static void main(String[] args) {
		
		Song[] songs = new Song[5];
		
		songs[0] = new Song();
		songs[0].name = "몽키매직";
		songs[0].singer = "이박사";
		songs[0].rank = 1;
		
		songs[1] = new Song();
		songs[1].name = "응급실";
		songs[1].singer = "IZI";
		songs[1].rank = 2;
		
		songs[2] = new Song();
		songs[2].name = "눈의꽃";
		songs[2].singer = "박효신";
		songs[2].rank = 3;
		
		songs[3] = new Song();
		songs[3].name = "비망록";
		songs[3].singer = "버즈";
		songs[3].rank = 4;
		
		songs[4] = new Song();
		songs[4].name = "호랑나비";
		songs[4].singer = "김흥국";
		songs[4].rank = 5;
		
		Song fsong = songs[0];
		Song lsong = songs[0];
		
		
		for(int i = 0; i < songs.length; i++) {
			if(fsong.rank < songs[i].rank) {
				fsong = songs[i];
			}
			if(lsong.rank > songs[i].rank) {
				lsong = songs[i];
			}
		}
		System.out.println("1등 " + fsong.singer + "의 노래 - " + fsong.name);
		System.out.println("꼴등 " + lsong.singer + "의 노래 - " + lsong.name);
		
		
	}
}
