public class HelloWord {
	
	int atributo;
	static int atributo; //Static está atrelado a classe
	
	char atributo2;
	boolean atributo3;
	double atributo4;
	float atributo5;
	byte atributo6;
	String atributo7;
	HelloWord atributo8;
	
	public static void main(String... args) {
		System.out.println("Hello DB1 Start");
	}
	
	void metodo1(){
		//conteudo do metodo
		
	}
	
	void metodo2(String parametro, int outroParametro){
		//conteudo do metodo usando o parametro
		
	}
	
	String metodo1(){
		//conteudo do metodo
		return "meu retorno";
		
	}	
	public static void main(String... args) {
		System.out.println("Hello DB1 Start");
		System.out.println(atributo);
		HelloWord helloWorld = new HelloWord();
		System.out.println(helloWorld.atributo2);
	}
	
	public static void main(String... args) {
		HelloWord helloWorld = new HelloWord();
		System.out.println(helloWorld.atributo2);
		HelloWord helloWorld2 = new HelloWord();
		HelloWord helloWorld23 = new HelloWord();
		HelloWord mesmaReferencia = helloWorld3;
		//a partir do java11:
		var helloWorld = new HelloWord();
		System.out.println(helloWorld.atributo2);
		var helloWorld2 = new HelloWord();
		var helloWorld23 = new HelloWord();
		var mesmaReferencia = helloWorld3;
		
	}	
	
	void metodo2(String parametro, int outroParametro){
		//conteudo do metodo usando o parametro
		System.out.println(atributo);
		
	}	
	
}