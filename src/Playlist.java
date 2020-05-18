import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Read My Mind - The Killers");
        desertIslandPlaylist.add("Runnin' Outta Luck - Alex Cameron");
        desertIslandPlaylist.add("After the Party - The Menzingers");
        desertIslandPlaylist.add("Magazines - The Hold Steady");
        desertIslandPlaylist.add("Left of the Dial - The Replacements");
        desertIslandPlaylist.add("Lonely Town - Brandon Flowers");
        // System.out.println(desertIslandPlaylist);
        // System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove("Lonely Town - Brandon Flowers");
        System.out.println(desertIslandPlaylist);
        // System.out.println(desertIslandPlaylist.size());

        int indexA = desertIslandPlaylist.indexOf("Magazines - The Hold Steady");
        int indexB = desertIslandPlaylist.indexOf("After the Party - The Menzingers");
        System.out.println("Hold steady: " + indexA);
        System.out.println("Menzingers: " + indexB);
        String tempA = "Magazines - The Hold Steady";
        String tempB = "After the Party - The Menzingers";
        desertIslandPlaylist.set(indexA, "After the Party - The Menzingers");
        desertIslandPlaylist.set(indexB, "Magazines - The Hold Steady");
        System.out.println(desertIslandPlaylist);
    }

}