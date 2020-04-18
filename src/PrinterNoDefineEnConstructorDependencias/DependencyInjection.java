package PrinterNoDefineEnConstructorDependencias;
public class DependencyInjection {
	public static void main(String[] args) {
		PrintPDF printPDF = new PrintPDF();
		PrintNormal printNormal = new PrintNormal();
		new PrinterService().print(printPDF, printNormal);
	}
	
}
