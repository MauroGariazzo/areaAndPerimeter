package areaAndPerimeterCalculate;
import java.util.Scanner;

public class Calculate {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int userChoice = -1;
		while(userChoice != 0)
		{
			userChoice = choice();
			calculateAreaAndPerimeter(userChoice);
		}
	}
	
	private static int choice() {
				
		while(true){
			
			int userChoice = -1;
			
			System.out.println("1. Quadrato\r\n"
						+ "2. Rettangolo\r\n"
						+ "3. Cerchio\r\n"
						+ "4. Triangolo Equilatero\r\n"
						+ "5. Triangolo Rettangolo\r\n"
						+ "6. Trapezio\r\n"
						+ "7. Rombo\r\n"
						+ "8. Parallelogramma\r\n"
						+ "9. Pentagono Regolare\r\n"
						+ "10. Esagono Regolare\r\n"
						+ "0. Esci");
							
			if(scanner.hasNextInt()) {
				userChoice = scanner.nextInt();
					
				if(userChoice >= 0 && userChoice <= 10){
					return userChoice;
				}
				
				else{
					System.out.println("inserisci un numero compreso tra 0 e 10");
				}
			}
				
			else{
				scanner.next();
				System.out.println("inserisci un numero");
			}
		}
			
	}
	
	static private void calculateAreaAndPerimeter(int userChoice)
	{
		double side;
		double base;
		double height;
		double radius;
		double majorBase;
		double minorBase;
		
		switch(userChoice) {
		
			//quadrato
		case 1:
			side = insertValue("lato");
			System.out.println("l'area del quadrato è: " + calculateSquareArea(side));
			System.out.println("il perimetro del quadrato è: " + calculateSquarePerimeter(side));
			System.out.println();
			break;
			
			//rettangolo
		case 2:
			base = insertValue("base");
			height = insertValue("altezza");
			System.out.println("l'area del rettangolo è: " + calculateRectangleArea(base,height));
			System.out.println("il perimetro del rettangolo è: " + calculateRectanglePerimeter(base,height) + "\n");
			System.out.println();
			break;
			
			//cerchio
		case 3:
			radius = insertValue("raggio");
			System.out.println("l'area del cerchio è: " + calculateCircleArea(radius));
			System.out.println("il perimetro del cerchio è: " + calculateCirclePerimeter(radius)+ "\n");
			break;
			
			//triangolo equilatero
		case 4:
			side = insertValue("lato");
			System.out.println("l'area del triangolo equilatero è: " + calculateEquilaterTriangleArea(side));
			System.out.println("il perimetro del triangolo equilatero è: " + calculateEquilaterTrianglePerimeter(side)+ "\n");
			break;
			
			//triangolo rettangolo
		case 5:
			base = insertValue("base");
			height = insertValue("altezza");
			System.out.println("l'area del triangolo rettangolo è: " + calculateRightTriangleArea(base, height));
			System.out.println("il perimetro del triangolo rettangolo è: " + calculateRightTrianglePerimeter(base, height)+ "\n");
			break;
			
			//trapezio
		case 6:
			majorBase = insertValue("base maggiore");
			minorBase = insertValue("base minore");
			height = insertValue("altezza");
			System.out.println("l'area del trapezio è: " + calculateTrapezoidArea(majorBase, minorBase, height));
			System.out.println("il perimetro del trapezio è: " + calculateTrapezoidPerimeter(majorBase, minorBase, height)+ "\n");
			break;
			
			//rombo
		case 7:
			side = insertValue("lato");
			height = insertValue("altezza");
			System.out.println("l'area del rombo è: " + calculateRhombusArea(side,height));
			System.out.println("il perimetro del rombo è: " + calculateRhombusPerimeter(side)+ "\n");
			break;
			
			//parallelogramma
		case 8:
			base = insertValue("base");
			height = insertValue("altezza");
			side = insertValue("lato");
			System.out.println("l'area del parallelogramma è: " + calculateParallelogramArea(base, height));
			System.out.println("il perimetro del parallelogramma è: " + calculateParallelogramPerimeter(base, side)+ "\n");
			break;
			
			//pentagono regolare
		case 9:
			side = insertValue("lato");
			System.out.println("l'area del pentagono regolare è: " + calculateRegularPentagonArea(side));
			System.out.println("il perimetro del pentagono regolare è: " + calculateRegularPentagonPerimeter(side)+ "\n");
			break;
			
			//esagono
		case 10:
			side = insertValue("lato");
			System.out.println("l'area dell' esagono regolare è: " + calculateRegularHexagonArea(side));
			System.out.println("il perimetro dell' esagono regolare è: " + calculateRegularHexagonPerimeter(side)+ "\n");
			break;
			
		default:
			System.out.println("sei uscito");
			break;
		}
	}
	
	private static double insertValue(String typeOfInput){
		double value;
		
		while(true) {
			System.out.print("inserisci " + typeOfInput + ": ");
			
			if(scanner.hasNextDouble()) {
				value = scanner.nextDouble();
				
				if(value >= 0){
					return value;
				}
				
				else {
					System.out.print("puoi inserire solo valori superiori a 0");
				}
			}
			
			else {
				scanner.next();
				System.out.println("puoi inserire solo valori numerici");
			}
		}		
	}
		
	
	private static double calculateSquareArea(double side) {
		double area = Math.pow(side, 2);
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateSquarePerimeter(double side) {
		double perimeter = side*4;
		return Math.round(perimeter);
	}
	
	private static double calculateRectangleArea(double base, double height) {
		double area = base*height;
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateRectanglePerimeter(double base, double height) {
		double perimeter = 2*(base*height);
		return Math.round(perimeter);
	}
	
	private static double calculateCircleArea(double radius) {
		double area = Math.PI * (Math.pow(radius, 2));
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateCirclePerimeter(double radius) {
		double perimeter = ((2 * Math.PI) * (radius));
		return Math.round(perimeter * 100.0) / 100.0;
	}
	
	private static double calculateEquilaterTriangleArea(double side) {
		double area = (Math.pow(side, 2) * (Math.sqrt(3)) / 4);
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateEquilaterTrianglePerimeter(double side) {
		double perimeter = 3 * side;
		return Math.round(perimeter * 100.0) / 100.0;
	}
		
	
	private static double calculateRightTriangleArea(double base, double height) {
		double area = 0.5 * (base * height);
		return Math.round(area * 100.0) / 100.0;
	}
	

	private static double calculateRightTrianglePerimeter(double base, double height) {
		double baseSquare = Math.pow(base, 2);
		double heightSquare = Math.pow(height, 2);
		double temp = Math.sqrt(baseSquare+heightSquare);
		double perimeter = (base + height) + temp;
		
		return Math.round(perimeter * 100.0) / 100.0;
	}
	
	private static double calculateTrapezoidArea(double majorBase, double minorBase, double height) {
		double area = ((minorBase + majorBase) * height) / 2;
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateTrapezoidPerimeter(double majorBase, double minorBase, double height) {
		double temp = (majorBase - minorBase) / 2;
        double obliqueSide = Math.sqrt((temp * temp) + (height * height));        
        double perimeter = majorBase + minorBase + (2 * obliqueSide); 
        		
        return Math.round(perimeter * 100.0) / 100.0;
	}
	
	private static double calculateRhombusArea(double side, double height) {
		double area = side * height;
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateRhombusPerimeter(double side) {   
        double perimeter = 4*side;         		
        return Math.round(perimeter * 100.0) / 100.0;
	}
	
	private static double calculateParallelogramArea(double side, double height) {
		double area = side * height;
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateParallelogramPerimeter(double base, double side) {   
        double perimeter = 2*(base+side);         		
        return Math.round(perimeter * 100.0) / 100.0;
	}
	
	private static double calculateRegularPentagonArea(double side) {
		double area = (6.881 * (Math.pow(side, 2))/4);
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateRegularPentagonPerimeter(double side) {   
        double perimeter = 5*(side);         		
        return Math.round(perimeter * 100.0) / 100.0;
	}
	
	private static double calculateRegularHexagonArea(double side) {
		double temp = 3 * Math.pow(side, 2);
		temp *= Math.sqrt(3);
		double area = temp / 2;
		return Math.round(area * 100.0) / 100.0;
	}
	
	private static double calculateRegularHexagonPerimeter(double side) {   
        double perimeter = 6*(side);         		
        return Math.round(perimeter * 100.0) / 100.0;
	}
}
