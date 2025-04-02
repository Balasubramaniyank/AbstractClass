package AbstractClass;

public class Documents {

	
	public static void main(String...arg) {
		
		
		Document pdf = new Pdf("Adhaar");
		
		 pdf.display();
		 pdf.open();
		 pdf.edit();
		 pdf.close();
		 System.out.println("------------------------------------------------------------------");
		 Document TE = new TextEditer("resume.WordFile");
		 
		 
		 TE.display();
		 TE.open();
		 TE.edit();
		 TE.close();
		 
		
	}
}


abstract class Document{
	
	String name;
	
	Document(String name){
		
		this.name=name;
	}
	
	void display() {
		
		System.out.println("Name "+name);
		System.out.println(this.getClass().getSimpleName());
		
		
	}
	
	abstract void open();
	abstract void edit();
	abstract void close();
	
}
class Pdf extends Document{

	Pdf(String name) {
		super(name);
	
	}

	
	void open() {
		
		System.out.println("Your PDF is Open");
		
	}

	
	void edit() {
		
		System.out.println("Your PDF Edit Sucessfully");
		
	}

	
	void close() {
		
		 System.out.println("Your PDF Close");
	}
	
//	void display() {
//		
//		super.display();
//		
//	}
     
	
}


class TextEditer extends Document{

	TextEditer(String name) {
		super(name);
		
	}


	void open() {
		
		System.out.println("Your TextEditer open ");
		
	}

	
	void edit() {
		
		System.out.println("Your TextEditer Edit Successfully");
		
	}

	
	void close() {
		
		
		System.out.println("Your TextEditer close");
	}
	
	
	
	
}


class Image extends Document{

	Image(String name) {
		super(name);

	}

	
	void open() {
	
		System.out.println("Your Image Is Open");
	}

	void edit() {
		
		System.out.println("Your Image is Edit Successfully");
		
	}


	void close() {
		
		System.out.println("Your Image Is Close");
	}
	
	
}












