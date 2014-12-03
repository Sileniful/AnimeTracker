package startup;

import view.*;
import modelAnimeDatabase.*;
import animeControler.*;

public class Starter {
		static private AnimeDatabase retriveAnimeFromDAO(){
		AnimeDatabase anime = new AnimeDatabase();
		anime.setTitle("Shakugan no Shana ");
		anime.setGenre("Battle shounen ");
		anime.setEpisodeCount(12);
		anime.setEpisodeTotal(24);
		return anime;
	}
		
	public static void main(String[] args) {
		AnimeDatabase model = retriveAnimeFromDAO();
		ViewAnime view = new ViewAnime();
		UI controler = new UI(model, view);
		controler.showAnimeDetails();
	}
	

	

}
