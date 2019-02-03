/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4.chapter15;
import java.io.FileOutputStream;
import java.io.IOException;
 
import javax.xml.parsers.ParserConfigurationException;
 
import org.xml.sax.SAXException;
 
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.TaggedPdfReaderTool;
 
public class ParseTaggedPdf {
 
    /** The resulting XML file. */
    public static final String SOURCE
        = "Documents\\Circolari_2902_2018-2019.pdf";
    /** The resulting XML file. */
    public static final String RESULT
        = "Documents\\Circolari_2902_2018-2019.xml"; 
    /**
     * Creates a PDF file using a previous example,
     * then parses the document.
     * @param    args    no arguments needed
     */
    public static void main(String[] args)
        throws IOException, DocumentException, SAXException, ParserConfigurationException {
        TaggedPdfReaderTool readertool = new TaggedPdfReaderTool();
        PdfReader reader = new PdfReader(SOURCE);
        readertool.convertToXml(reader, new FileOutputStream(RESULT));
        reader.close();
    }
}
