package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext apx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ArtistService obj = apx.getBean(ArtistService.class);

// here is 5 methods that given in question

		obj.printArtworkMap();

		obj.printArtistList();

		System.out.println(obj.averageAgeOfArtistsWithArtworks(3));

		System.out.println(obj.topArtistsByArtworks(2));

		System.out.println(obj.topArtworksByCreationTime(1));
		
		((ClassPathXmlApplicationContext)apx).close();
		

	}
}
