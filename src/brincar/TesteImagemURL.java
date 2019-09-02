package brincar;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class TesteImagemURL {

	public static void main(String[] args) {

		URL url = null;
        
        BufferedImage image = null;
         
        try
        {
            url = new URL("https://aventurasnahistoria.uol.com.br/media/_versions/legacy/2018/06/12/futebol-capas-1100594_widelg.png");
        } 
        catch (MalformedURLException e1) 
        {
            e1.printStackTrace();
        }
        
	}

}
