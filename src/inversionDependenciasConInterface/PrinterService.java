package inversionDependenciasConInterface;
public class PrinterService {

//	PrintPDF printPDF; AHORA LO HACE EL PROGRAMA PRINCIPAL, EXTENSIBILIDAD
//	PrintNormal printNormal; AHORA LO HACE EL PROGRAMA PRINCIPAL, EXTENSIBILIDAD
	
	public PrinterService() {
//		this.printPDF = new PrintPDF(); AHORA LO HACE EL PROGRAMA PRINCIPAL, EXTENSIBILIDAD
//		this.printNormal = new PrintNormal(); AHORA LO HACE EL PROGRAMA PRINCIPAL, EXTENSIBILIDAD
	}
	
	public void print(AllPrinters printPDF, AllPrinters printNormal) {	//LO RECIBE PARAMETRO
		printPDF.sendPrint();
		printNormal.sendPrint();
	}
}
