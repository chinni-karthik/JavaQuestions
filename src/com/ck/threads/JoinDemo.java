package com.ck.threads;

//This is wrong. Fix it...!!!

public class JoinDemo {
	public static void main(String[] args) {
		Thread t=new VenueFixingThread();
		t.start();
		System.out.println("MainThread...!!!");
	}
	
}

class VenueFixingThread extends Thread {
	public void run() {
		InvitationCardsPrintingThread cardsPrintingThread = new InvitationCardsPrintingThread();
		cardsPrintingThread.start();
		System.out.println("VenueFixingThread...!!!");
	}
}

class InvitationCardsPrintingThread extends Thread {
	
	public void run() {
		VenueFixingThread venueFixingThread = new VenueFixingThread();
		try {
			venueFixingThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("InvitationCardsPrintingThread...!!!");
	}
}

class MarriageThread extends Thread {
	public void run() {
		InvitationCardsPrintingThread cardsPrintingThread = new InvitationCardsPrintingThread();
		try {
			cardsPrintingThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MarriageThread");
	}
}