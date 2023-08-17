import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String artist;

    private String name;

    private List<Song> songs;


    // D Constructor
    public Album() {
    }

    // P Constructor
    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    // functionalities in the album

    boolean findSong(String name)
    {
        for (Song song :songs)
        {
            if(song.getTittle().equals(name))
            {
                return  true;
            }
        }
        return  false;
    }

    // add song

    public String addSongAlbum(String tittle, double duration)
    {
        if(!findSong(tittle))
        {
            //add it
            Song song = new Song(tittle,duration);
            this.songs.add(song);
            return "Song Has Been Added To The Album";
        }

        return "Song Already Exist";
    }

    //add to playlist from album

    public String addToPlayListAlbum(String tittle, LinkedList<Song> playList)
    {

        //add in the playlist
        for(Song song : this.songs)
        {
            if(song.getTittle().equals(tittle))
            {
                playList.add(song);
                return  "Song Has Been Added To The Your PlayList";
            }
        }
        return "Song Doesn't Exist In Album ";
    }

    public String addToPlayListAlbum(int songNo , LinkedList<Song> playList)
    {
        int index = songNo -1;
        if(index >= 0 && index<songs.size())
        {
            playList.add(songs.get(index));
            return "Song Has Been Added Successfully";

        }
        return "Incorrect Song Number !";

    }

}
