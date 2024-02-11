package imageprocessing;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageReader{

	public static void main(String[] args){
		Tesseract tesseract = new Tesseract();
		try{
			tesseract.setDatapath("C:\\Users\\engineering\\Desktop\\Test\\");
			String text = tesseract.doOCR(new File("C:\\Users\\engineering\\Desktop\\Test\\a.png"));
			System.out.print(text);
        }
		catch(TesseractException e){
			e.printStackTrace();
		}
	}
}