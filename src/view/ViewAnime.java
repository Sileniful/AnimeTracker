package view;



public class ViewAnime {

	
	
	
	public void showAnimeDetails(String title, String genre, int episodeCountCurrent, 
			int episodeCountTotal){
		
		System.out.printf("Anime title: " + title);
		System.out.printf("Genre: " + genre);
		System.out.printf("Episode: " + episodeCountCurrent + "/" + episodeCountTotal);
		
	}
	
}
