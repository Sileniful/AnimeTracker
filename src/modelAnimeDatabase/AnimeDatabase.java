package modelAnimeDatabase;

public class AnimeDatabase {

	private String title;
	private String genre;
	private int episodeCount;
	private int episodeTotal;

	
	
	public AnimeDatabase() {
		super();
	}



	public AnimeDatabase(String title, String genre, int episodeCount,
			int episodeTotal) {
		super();
		this.title = title;
		this.genre = genre;
		this.episodeCount = episodeCount;
		this.episodeTotal = episodeTotal;
	}



	public String getTitle() {
		return title;
	}


	

	public void setTitle(String title) {
		this.title = title;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getEpisodeCount() {
		return episodeCount;
	}



	public void setEpisodeCount(int episodeCount) {
		this.episodeCount = episodeCount;
	}



	public int getEpisodeTotal() {
		return episodeTotal;
	}



	public void setEpisodeTotal(int episodeTotal) {
		this.episodeTotal = episodeTotal;
	}



	


	
	
	
}
