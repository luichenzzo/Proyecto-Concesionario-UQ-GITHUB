package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerarReporte {


	public static void generarPDFConOperaciones(ArrayList<Operacion> arrayOperaciones) {
	  
	    try {
	    	 Document document = new Document();
	        // Crea un objeto PdfWriter para escribir en el documento
	        PdfWriter.getInstance(document, new FileOutputStream("C:/Users/Luich/Downloads/PruebaReportes2/PruebaReportes2/src/varios/Doc1.pdf"));

	        // Abre el documento
	        document.open();

	        // Agrega un encabezado al documento
	        document.add(new Paragraph("Lista de Operaciones"));

	        // Recorre la lista de operaciones y agrega cada una al documento
	        for (Operacion operacion : arrayOperaciones) {
	            document.add(new Paragraph(operacion.toString()));
	        }

	        // Cierra el documento
	        document.close();

	        System.out.println("PDF generado exitosamente.");
	    } catch (DocumentException e) {
	        e.printStackTrace();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static String GenerarReporteString(ArrayList<Operacion> arrayList){
		String reporte = "";

		for(Operacion operacion : arrayList){
			reporte += operacion.toString() + "\n";
		}
		return reporte;
	}

}