import java.util.ArrayList;
public class Song {

    private String title;

    private String artist;


    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    ArrayList<String> compare = new ArrayList<>();
    public int howMany(ArrayList<String> people) {

        int newListen = 0;
        for (int g = 0; g < people.size(); g++) {
            if (!compare.contains(people.get(g).toLowerCase())){
                newListen++;
                compare.add(people.get(g).toLowerCase());
            }
        }
        return newListen;

//Problem: How do I ensure that it doesn't check itself in the first instance?


    }
}
