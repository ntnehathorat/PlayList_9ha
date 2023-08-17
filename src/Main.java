import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static void main(String[] args) {

            Album arjitAlbum = new Album("Arjit Singh" , "Arjit Album");
            Album bpraakAlbum = new Album("B Praak" , " B Praak Album");

            arjitAlbum.addSongAlbum("Tere Hawaale ",5.31);
            arjitAlbum.addSongAlbum("Jaan Nisaar", 3.10);
            arjitAlbum.addSongAlbum("Tum Khy Mile", 3.22);

            bpraakAlbum.addSongAlbum("Dholna" , 4.22);
            bpraakAlbum.addSongAlbum("Mann Bharrya", 4.36);
            bpraakAlbum.addSongAlbum("Yaar Ka Sataya Hua Hai", 5.21);


            LinkedList<Song> myPlayList = new LinkedList<>();

            System.out.println(arjitAlbum.addToPlayListAlbum("Jaan Nisaar",myPlayList));
            System.out.println( arjitAlbum.addToPlayListAlbum(3,myPlayList));
            System.out.println( arjitAlbum.addToPlayListAlbum(5,myPlayList)); //wrong song

            System.out.println( bpraakAlbum.addToPlayListAlbum("Dholna",myPlayList));
            System.out.println( bpraakAlbum.addToPlayListAlbum(3,myPlayList));

            play(myPlayList);
        }

        private static void play(LinkedList<Song> myPlayList){


            if(myPlayList.size() ==0)
            {
                System.out.println("your List IS Empty");
                return;
            }
            ListIterator<Song> itr = myPlayList.listIterator();
            System.out.println("Now Playing:"+ itr.next());


            Scanner sc = new Scanner(System.in);
            printMenu();

            boolean quit = false;
            while (!quit)
            {
                System.out.println("Please enter your choice");
                int choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        printMenu();
                        break;
                    case 2:
                        if(!itr.hasNext())
                        {
                            System.out.println("You have reached the end of the playList");
                        }
                        else
                        {
                            System.out.println("Currently Playing:"+ itr.next());
                        }
                        break;
                    case 3:
                        if(!itr.hasPrevious())
                        {
                            System.out.println("You are the start of the PlayList:" + itr.previous());
                        }
                        else
                        {
                            System.out.println("Currently Playing"+ itr.previous());
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        printSongs(myPlayList);
                        break;
                    case 7 :
                        quit = true;
                        break;
                    default:
                        System.out.println("Wrong Choice. Please select again");
                }
            }
            return;
        }

        private static void printSongs(LinkedList<Song> myPlayList) {
            for (Song song : myPlayList)
            {
                System.out.println(song);
            }
            return;
        }

        private  static  void  printMenu()
        {
            System.out.println("1. Show the menu again");
            System.out.println("2. Play next Song");
            System.out.println("3. Play previous Song");
            System.out.println("4. Play current song again");
            System.out.println("5. Delete current song from playlist ");
            System.out.println("6. Print all the song in playlist ");
            System.out.println("7. Quit application ");


        }
    }
