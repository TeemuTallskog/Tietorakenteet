package Suunnittelumallit.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        List<Image> imageList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            imageList.add(new ProxyImage("Image" + i));
        }

        imageList.forEach(Image::showData);
        imageList.forEach(Image::displayImage);

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }
}
