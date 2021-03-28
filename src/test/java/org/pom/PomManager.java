package org.pom;

public class PomManager {
	
	private static PomManager pm;
	private TimpsonLgnpojo l;
	private CreatAcc ac;
	private DoDpojo d;
	private Zaccesspojo zacc;
	private Zippolightrspojo zipp;
	private CheckoutPage ck;
	
	
	public static PomManager getPm() {
		return (pm==null)? pm=new PomManager():pm;
	}
	public TimpsonLgnpojo getL() {
		return (l==null)? l=new TimpsonLgnpojo():l;
	}
	public CreatAcc getAc() {
		return (ac==null)? ac=new CreatAcc():ac;
	}
	public DoDpojo getD() {
		return (d==null)? d=new DoDpojo():d;
	}
	public Zaccesspojo getZacc() {
		return (zacc==null)? zacc=new Zaccesspojo():zacc;
	}
	public Zippolightrspojo getZipp() {
		return (zipp==null)? zipp=new Zippolightrspojo():zipp;
	}
	public CheckoutPage getCk() {
		return (ck==null)? ck=new CheckoutPage():ck;
		
	}
	
	

}
