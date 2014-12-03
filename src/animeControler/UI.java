package animeControler;

import modelAnimeDatabase.*;
import view.*;

public class UI {

	
	private AnimeDatabase model;
	private ViewAnime view;
	
	public UI() {
		super();
	}

	public UI(AnimeDatabase model, ViewAnime view) {
		this.model = model;
		this.view = view;
	}
	
	public String getTitle(){
		return model.getTitle();
	}
	
	public void setAnimeTitle(String title){
		model.setTitle(title);
	}
	
	public String getGenre() {
		return model.getGenre();
	}
	
	public void setGenre(String genre){
		model.setGenre(genre);
	}
	
	public int getEpisodeCountCurrent(){
		return model.getEpisodeCount();
	}
	
	public void setEpisodeCountCurrent(int episodeCount){
		model.setEpisodeCount(episodeCount);
	}
	
	public int getEpisodeCountTotal(){
		return model.getEpisodeTotal();
	}
	
	public void setEpisodeCountTotal(int episodeTotal){
		model.setEpisodeTotal(episodeTotal);
	}
	
	public void showAnimeDetails(){
		view.showAnimeDetails(model.getTitle(), model.getGenre(), model.getEpisodeCount(),
				model.getEpisodeTotal());
	}
	
}
