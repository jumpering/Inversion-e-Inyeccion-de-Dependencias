public class PrinterService {

	PrintPDF printPDF;
	PrintNormal printNormal;
	
	public PrinterService() {
		this.printPDF = new PrintPDF();
		this.printNormal = new PrintNormal();	
	}
	
	public void print() {	
		printPDF.sendPrint();
		printNormal.sendPrint();
	}
}
