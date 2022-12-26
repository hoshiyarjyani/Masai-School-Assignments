package conceptofjava;

public class ConstructorClass {
    // complete the class as mentioned in the description above
    int length;
    String language;
    int index;

    ConstructorClass(int index, int length, String language) {
        this.length = length;
        this.language = language;
        this.index = index;
    }

    int length() {
        return length;
    }

    String language() {
        return language;
    }

    String category() {
        String a;
        if (index == 1) {
            a = "Classical";
        } else if (index == 2) {
            a = "Hip Hop";
        } else if (index == 3) {
            a = "R&B";
        } else if (index == 4) {
            a = "Bollywood";
        } else if (index == 5) {
            a = "EDM";
        } else {
            a = "Originals";
        }
        return a;
    }

    public static void main(String[] args) {
        ConstructorClass z = new ConstructorClass(3, 37, "Punjabi");

        System.out.println("The language of the song is " + z.language());
        System.out.println("The duration of the song is " + z.length);
        System.out.println("The cateogory of the song is " + z.category());

    }
}
// Music Player Ended
// Description

// You are designing the backend system for a music player, hence you have to
// write an class for the music player

// The class will contain the following attributes

// int length;
// String language;
// int index
// The class contains the following functions (The description of each function
// is also given)
// - int length() - This function returns an integer denoting the length of the
// song
// - String language() - This function returns a string denoting the language of
// the song
// - String category() - This function returns one of the following values based
// on the value of index
// {
// 1 -> Classical
// 2 -> Hip Hop
// 3 -> R&B
// 4 -> Bollywood
// 5 -> EDM
// }
// For any other value, the return value should be "Original"

// The value of the attributes is passed to this function with the help of the
// constructor while creating the object

// You have to implement the above class, as described above

// There is no need to take the input, just complete the class as mentioned
// above

// Input
// There is no need to take the input, just complete the class as mentioned
// above

// Output
// There is no need to take the input, just complete the class as mentioned
// above

// Sample Input 1

// NA
// Sample Output 1

// The language of the song is English
// The duration of the song is 120
// The cateogory of the song is Classical
// --------------------------------
// The language of the song is Hindi
// The duration of the song is 50
// The cateogory of the song is Hip Hop
// --------------------------------
// The language of the song is Punjabi
// The duration of the song is 10
// The cateogory of the song is R&B
// --------------------------------
// The language of the song is Spanish
// The duration of the song is 5
// The cateogory of the song is Bollywood...