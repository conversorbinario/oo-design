package composite_package;

import java.util.ArrayList;

import composite_package.IComponent;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void play() {
		System.out.print("Playing playlist" + this.getName());
		for (IComponent component : this.playlist) {
			component.play();
		}
	}

	public void setPlaybackSpeed(float speed) {
		for (IComponent component : this.playlist) {
			component.setPlaybackSpeed(speed);
		}

	}

	public void add(IComponent component) {
		this.playlist.add(component);

	}

	public void remove(IComponent component) {
		this.playlist.remove(component);
	}

	public String getName() {
		return this.playlistName;
	}

}