package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Media;

public class MediaTest extends MediaObjects{
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        mediae.add(cd1);
        mediae.add(dvd2);
        mediae.add(book3);

        for (Media media: mediae)
            System.out.println(media.toString());
    }
}