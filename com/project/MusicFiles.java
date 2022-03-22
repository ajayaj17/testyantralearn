package com.project;

public class MusicFiles implements Runnable, Comparable {
	private int songId;
	private String songTitle;
	private String artistName;
	private String albumName;
	private String songLocation;
	private String description;

	public MusicFiles() {
		super();
	}

	public MusicFiles(int songId, String songTitle, String artistName, String albumName, String songLocation,
			String description) {
		super();
		this.songId = songId;
		this.songTitle = songTitle;
		this.artistName = artistName;
		this.albumName = albumName;
		this.songLocation = songLocation;
		this.description = description;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getSongLocation() {
		return songLocation;
	}

	public void setSongLocation(String songLocation2) {
		this.songLocation = songLocation2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "[songId=" + songId + ", songTitle=" + songTitle + ", artistName=" + artistName
				+ ", albumName=" + albumName + ", songLocation=" + songLocation + ", description=" + description + "]";
	}

	@Override
	public void run() {
		System.out.println();
	}

	@Override
	public int compareTo(Object o) {
		MusicFiles m= (MusicFiles) o;
		if(this.songId>m.songId)
			return 1;
		else if(this.songId<m.songId)
			return -1;
		return 0;
	}

}
