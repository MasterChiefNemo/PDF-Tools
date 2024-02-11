package pdfprocessing;

import java.io.*;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfConversion{

	public PdfConversion(){}

	public static void readPDF(String inputfile) throws IOException{
		File file = new File(inputfile);
		PDDocument document = Loader.loadPDF(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		String text = pdfStripper.getText(document);

		System.out.println(document.getNumberOfPages());
		System.out.println(document.getVersion());

		document.close();

		System.out.println(pdfStripper.getTextLineMatrix());
		System.out.println(text);
	}

	public static void main(String[] args) throws IOException{
		PdfConversion.readPDF("C:\\Users\\engineering\\Desktop\\employment.pdf");
	}
}