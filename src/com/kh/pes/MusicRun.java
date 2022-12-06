package com.kh.pes;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		
		ESCAPE :
		while(true) {
			int choice = mFunc.printMenu();
			switch(choice) {
				case 1 :
					mFunc.inputMoney();
					break;
				case 2 :
					mFunc.MusicPurchase();
					break;				
				case 3 :
					mFunc.printCharge();
					break;
				case 4 :
					mFunc.printPlayList();
					break;
				case 5 :
					mFunc.printExit();
					break ESCAPE;
				default :
					break;
					
					
			}
		}
	}
}

