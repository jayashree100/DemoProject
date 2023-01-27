package com.bridgelab.acessmodifier;

public class AcessModifier {

	private int a = 10;

	public int b = 20;

	int c = 30;

	protected int d = 40;
	
	public static void main(String[] args) {
		AcessModifier acess = new AcessModifier();
		
		System.out.println(acess.a);
		System.out.println(acess.b);
		System.out.println(acess.c);
		System.out.println(acess.d);
	}
}
