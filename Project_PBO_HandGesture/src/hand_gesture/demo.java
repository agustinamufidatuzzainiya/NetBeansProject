package hand_gesture;

/**
 *
 * @author shafira halmahera
 */
import java.awt.image.BufferedImage;
import java.io.File;
import jimag.Image;
import jimag.ImageRead;
import jimag.ImageShow;

public class demo {

    public static void main(String[] args) {

        //loading file gambar/image open
        BufferedImage image = ImageRead.read(new File
        ("C:\\Users\\siroj\\Pictures\\apasi.jpeg"));

        //convert image ke gray 
        double[][] gray = Image.rgb2gray(ImageRead.getMatrix(image));

        //operasi ekualisasi histogram 
        double[][] gray_image_histeq = Image.histogramEqualization(gray);

        //mencari nilai T dengan teknik Otsu 
        double T = Image.graythresh(gray);

        //operasi BW 
        double[][] bw = Image.blackwhite(gray, false, T);

        //operasi filtering 
        double[][] filt = Image.convolution(gray, Image.KernelSharpening);
        new ImageShow(image, "original").setVisible(true);
        new ImageShow(Image.matrix2image(gray), "gray").setVisible(true);
        new ImageShow(Image.matrix2image(gray_image_histeq), "histeq").setVisible(true);
        new ImageShow(Image.matrix2image(bw), "Nilai T : " + String.valueOf(T)).setVisible(true);
        new ImageShow(Image.matrix2image(filt), "Filtering").setVisible(true);
    }
}
