package com.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	private static Object o1;

	public static void main(String[] args) throws InterruptedException {

		TreeSet<MusicFiles> list = new TreeSet();
		MusicFiles files = new MusicFiles();

		Iterator<MusicFiles> iterator = list.descendingIterator();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);

		String search, ch;
		String cha;
		int id;
		Random random = new Random();

		do {
			System.out
					.println("\nPress\n1. Play Songs\n2.Search a Song\n3. Show all Song \n4. Operate on Song database");

			int a = s.nextInt();

			if (list.isEmpty()) {
				System.out.println("No Song in a list");
				System.out.println("First upload a song in the list");
				a = 4;
			}

			switch (a) {
			case 1:

				System.out.println("\nPress \na. Play all Songs\nb. Play Song randomly\nc. Play a particular Song");
				ch = s1.nextLine();

				switch (ch) {
				case "a":
					Thread t = new Thread();
					for (MusicFiles musicFiles : list) {
						System.out.print("Now Playing  : ");
						System.out.println(musicFiles.getSongTitle());
						t.run();
						t.sleep(3000);

					}

					break;

				case "b":
					int len = list.size() + 1;
					int songId = random.nextInt(len);
					System.out.println(songId);
					for (MusicFiles musicFiles : list) {
						if (musicFiles.getSongId() == songId)
							System.out.println(musicFiles.getSongTitle());
					}
					break;

				case "c":
					
					System.out.println("Enter Song id to play");
					id = s.nextInt();
					for (MusicFiles musicFiles : list) {
						if (musicFiles.getSongId() == id) {
							System.out.print("Now Playing  : ");
							System.out.println(musicFiles.getSongTitle());
						}
					}

					break;

				default:
					System.out.println("Invalid choice");
					break;
				}

				break;

			case 2:
				System.out.println("Enter the Song you want to search");
				search = s1.nextLine();
				for (MusicFiles musicFiles : list) {
					if (search.equals(musicFiles.getSongTitle())) {
						System.out.println("Your Result : " + musicFiles);
					}
				}
				break;

			case 3:
				for (MusicFiles musicFiles : list) {
					System.out.println(musicFiles);
				}
				break;

			case 4:
				System.out.println("Enter \na. Upload a Song\nb. Edit a Song\nc. Delete a Song");

				if (list.isEmpty()) {
					System.out.println("\n\n\nupload now \n");
					ch = new String("a");
				} else {
					ch = s1.nextLine();
				}
				switch (ch) {
				case "a":
					System.out.println("Song id");
					int songId = list.size() + 1;
					System.out.println(songId);
					System.out.println("Enter Song Title");
					String songTitle = s1.nextLine();
					System.out.println("Enter Artist Name ");
					String artistName = s1.nextLine();
					System.out.println("Enter album name");
					String albumName = s1.nextLine();
					System.out.println("Enter Song location");
					String songLocation = s1.nextLine();
					System.out.println("Enter description");
					String description = s1.nextLine();
					System.out.println("====================");
					System.out.println("Song uploaed");
					list.add(new MusicFiles(songId, songTitle, artistName, albumName, songLocation, description));
					break;

				case "b":
					System.out.println("Enter Song you want to edit");
					search = s1.nextLine();
					for (MusicFiles musicFiles : list) {
						if (search.equals(musicFiles.getSongTitle())) {
							System.out.println("Enter Song Title");
							String songTitle1 = s1.nextLine();
							System.out.println("Enter Artist Name ");
							String artistName1 = s1.nextLine();
							System.out.println("Enter album name");
							String albumName1 = s1.nextLine();
							System.out.println("Enter Song location");
							String songLocation1 = s1.nextLine();
							System.out.println("Enter description");
							String description1 = s1.nextLine();
							musicFiles.setSongId(musicFiles.getSongId());
							musicFiles.setSongTitle(songTitle1);
							musicFiles.setArtistName(artistName1);
							musicFiles.setAlbumName(albumName1);
							musicFiles.setSongLocation(songLocation1);
							musicFiles.setDescription(description1);
						}
					}
					break;

				case "c":
					System.out.println("Enter Song you want to delete");
					search = s1.nextLine();
					for (MusicFiles musicFiles : list) {
						if (search.equals(musicFiles.getSongTitle())) {
							list.remove(musicFiles);
							System.out.println("\nSong deleted!");
						}
					}
					break;

				default:
					System.out.println("Enter valid");
					break;
				}
				break;

			default:
				System.out.println("Invalid");
			}

			System.out.println("Do you want to Continue press -- 'y' for  Yes ");
			cha = s1.nextLine();

		} while (cha != "y");
	}
}
