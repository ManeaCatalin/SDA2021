package Tema1;

import java.io.*;


public class main 
{

	public static void main(String[] args) throws IOException
	{
		int a, b, sum, dif, prod, dist;
		double average;
		
		System.out.println("Insert two integers. ");
		System.out.println("First number: ");
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	
		a = Integer.parseInt(x.readLine());

		System.out.println("Second number: ");
		b = Integer.parseInt(x.readLine());
		
		sum = a + b;
		System.out.println("Sum of two integers: " + sum);
		
		dif = a - b;
		System.out.println("Difference of two integers: " + dif);
		
		prod = a * b;
		System.out.println("Product of two integers: " + prod);
		
		average = (a + b) / 2;
		System.out.println("Average of two integers: " + String.format("%.2f", average));
		
		int max = (a > b) ? a : b;
		int min = (a > b) ? b : a;
		
		dist = max - min;
		
		System.out.println("Distance of two integers: " + dist);
		System.out.println("Max integer: " + max);
		System.out.println("Min integer: " + min);
	}

}
