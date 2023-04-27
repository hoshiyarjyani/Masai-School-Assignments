package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ArtistService {

	// Hint: Make use of Setter Injection to inject ArtworkMap and artistList.

	private Map<Artist, Artwork> artworkMap; // inject 4 entries with valid details

	private List<Artist> artistList; // inject List of 6 Artist object

	public void setArtworkMap(Map<Artist, Artwork> artworkMap) {
		this.artworkMap = artworkMap;
	}

	public void setArtistList(List<Artist> artistList) {
		this.artistList = artistList;
	}

	public void printArtworkMap() {
		// print all the artists and their artwork details from the artworkMap
		System.out.println("========Artwork=======");
		for (Map.Entry<Artist, Artwork> entry : artworkMap.entrySet()) {
			System.out.println("Artist - " + entry.getKey().getName() + " ArtWork - " + entry.getValue().getName()
					+ " Creation Time - " + entry.getValue().getCreationTime() + " Days");
		}

	}

	public void printArtistList() {
		Collections.sort(artistList, new Comparator<Artist>() {

			@Override
			public int compare(Artist a1, Artist a2) {
				if (a1.getNoOfArtworksCreated() == a2.getNoOfArtworksCreated()) {
					return a2.getAge() - a1.getAge();
				} else {
					return a2.getNoOfArtworksCreated() - a1.getNoOfArtworksCreated();
				}

			}
		});

		System.out.println("==================Sorted List================");
		for (Artist art : artistList) {
			System.out.println(art);
		}
	}

	public double averageAgeOfArtistsWithArtworks(int minArtworks) {
		// Calculate the average age of the artists who have created more than
		// 'minArtworks' artworks
		int count = 0;
		int totalAge = 0;
		for (Artist art : artistList) {
			if (art.getNoOfArtworksCreated() > minArtworks) {
				count++;
				totalAge += art.getAge();
			}
		}
		return (double) totalAge / count;
	}

	public List<Artist> topArtistsByArtworks(int n) {
		// Find the top 'n' artists based on the number of artworks created, and sort
		// them by age in case of a tie
		Collections.sort(artistList, new Comparator<Artist>() {

			@Override
			public int compare(Artist a1, Artist a2) {
				if (a1.getNoOfArtworksCreated() == a2.getNoOfArtworksCreated()) {
					return a2.getAge() - a1.getAge();
				} else {
					return a2.getNoOfArtworksCreated() - a1.getNoOfArtworksCreated();
				}

			}
		});
		List<Artist> top = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			top.add(artistList.get(i));
		}
		return top;
	}

	public List<Artwork> topArtworksByCreationTime(int n) {
		// Find the top 'n' artworks based on creation time, and return the artwork
		// information as a Map
		List<Artwork> artwork = new ArrayList<>(artworkMap.values());
		Collections.sort(artwork, new Comparator<Artwork>() {

			@Override
			public int compare(Artwork o1, Artwork o2) {
				return o2.getCreationTime() - o1.getCreationTime();
			}
		});
		List<Artwork> topArtwork = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			topArtwork.add(artwork.get(i));
		}
		return topArtwork;
	}
}