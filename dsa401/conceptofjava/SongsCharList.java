// Songs Chartlist -21:19:9
// Description

// You have to create a class with the namesong, which contains the following attributes
// String name; // This indicates the name of the song
// int duration; // This indicates the duration of the song
// int popularity; // This gives a rank of how popular the song is starting from 1
// ** 1 indicates the most popular, 2 indicates the second most popular ans so on
// The value of the 3 attributes is passed to the object via the constructor
// You have to create another class with the namechartlist, which contains the following attributes

// int n; // this indicates the size of the song array
// song[] arr // this is an array of song type, as defined by the class above
// Both the values are passed to the object via the constructor

// The class contains the following functions

// String[] top_five()// This gives a string array of song names of the 5 most popular songs
// String leastPopular() // This gives a string, indicating the name of the least popular song
// String mostPopular() // This gives a string, indicating the name of the most popular song
// String longestSong() // This gives a string, indicating the name of the longest song
// String shortestSong() // This gives a string, indicating the name of the shortest song
// There is no need to take the input or the output. Just complete the two classes as mentioned in the problem statement above

// Input
// There is no need to take the input or the output. Just complete the two classes as mentioned in the problem statement above

// Output
// There is no need to take the input or the output. Just complete the two classes as mentioned in the problem statement above

// Sample Input 1 

// NA
// Sample Output 1

// The top five songs are ->
// Excuses
// Tu Aake Dekhle
// Kesariya
// Summer High
// Qaafirana
// The most popular song is ->Excuses
// The least popular song is ->My heart will go on
// The longest song is ->My heart will go on
// The shortest song is->Toxic

package conceptofjava;

import java.util.*;

class song {
    // complete the class as mentioned in the problem statement above

    String name;
    int duration;
    int popularity;

    song(int duration, String name, int popularity) {
        this.name = name;
        this.duration = duration;
        this.popularity = popularity;
    }

}

class chartlist {
    // complete the class as mentioned in the problem statement above
    int n;
    song[] arr;

    public chartlist(int n, song[] arr) {
        this.n = n;
        this.arr = arr;
    }

    String[] top_five() {
        Arrays.sort(arr, (a, b) -> a.popularity - b.popularity);
        song[] topFive = new song[5];

        for (int i = 0; i < 5; i++) {
            topFive[i] = arr[i];
        }

        // alternate
        // Arrays.sort(topFive, new Comparator<song>() {
        // public int compare(song a, song b) {
        // return a.popularity - b.popularity;
        // }
        // });

        String[] topFiveNames = new String[5];
        for (int i = 0; i < 5; i++) {
            topFiveNames[i] = topFive[i].name;
        }
        return topFiveNames;
    }

    String leastPopular() {

        song leastPopular = arr[arr.length - 1];

        return leastPopular.name;

    }

    public String mostPopular() {
        song mostPopular = arr[0];

        return mostPopular.name;
    }

    public String longestSong() {
        song longestSong = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].duration > longestSong.duration) {
                longestSong = arr[i];
            }
        }
        return longestSong.name;
    }

    public String shortestSong() {
        song shortestSong = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].duration < shortestSong.duration) {
                shortestSong = arr[i];
            }
        }
        return shortestSong.name;
    }

}
