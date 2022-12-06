package com.kh.pes;

import java.util.Scanner;


class Play {
	String title, singer;
	
	public Play(String title, String singer) {
		this.title = title;
	}
}

public class MusicFunction {
	Music [] musics;

	Play [] play = new Play[1];
	
	// 초기화
	int money = 0;		// 충전금액
	int purchase = 0;	// 음원구매금액
	int pay = 0;		// 결제금액
	int charge = 0;		// 잔액
	
	public MusicFunction() {
		musics = new Music[1];	// 초기화 (메뉴 반복 횟수)

	}
	
	// 메소드들 입력.
	
	// 기본화면 (메뉴 출력)
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("====== [★ MUSIC IS MY LIFE, 음원 구매 프로그램 ★] ======");
		System.out.println("1. 캐시충전");
		System.out.println("2. 음원구매");
		System.out.println("3. 캐시잔액 확인");
		System.out.println("4. 내 플레이리스트 확인");
		System.out.println("5. 프로그램 종료\n");
		System.out.print("▶ 메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	// 1번 선택 (캐시 충전 메소드)
	public void inputMoney() {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i< musics.length; i++) {
			
			System.out.println("================= 1. 캐시 충전 =====================================");
			System.out.print("충전할 금액을 입력해주세요 (※ 1회 충전금액은 1,000원 이상 가능합니다.)\n");
			System.out.print(" : ");
			int money = sc.nextInt();

			if (money >= 1000) {
				musics[i] = new Music();
				musics[i].setMoney(money);
				System.out.println();
				System.out.println("*^^* 캐시 " + money + "원이 충전되었습니다 *^^* \n");
				
			} else {
				System.out.println("※ 1회 충전금액은 1,000원 이상 가능합니다.\n");
				i--;
				
			}
		}
	}
	
	
	// 2번 선택(음원 리스트 및 구매)
	public void MusicPurchase() {
		
		Scanner sc = new Scanner(System.in);
		purchase = 700;
		
		System.out.println("================= 2. 음원구매 =================================================");
		System.out.println("[---------------------------------- Music List ------------------- -------------]");
		System.out.println(" ▶ 사건의 지평선 - 윤하     ▶ Hype boy - NewJeans(뉴진스)   ▶ 새삥 - 지코(ZICO)");
		System.out.println(" ▶ After LIKE - IVE(아이브)  ▶ Nxde - (여자)아이들          ▶ 그라데이션 - 10CM");
		System.out.println(" ▶ Pink Venom - BLACPINK    ▶ Attention - NewJeans(뉴진스)   ▶ Rush Hour - Crush");
		System.out.println(" ▶ Antifragile - LE SSERAFIM(르세라핌)    ▶ LOVE DIVE - IVE(아이브)");
		System.out.println("[-------------------------------------------------- ----------------------------]\n");

		
		System.out.println("▷ 구매할 음악을 입력해주세요");
		System.out.print("제목 >> ");
		String title = sc.nextLine();
		System.out.print("가수 >> ");
		String singer = sc.nextLine();
		System.out.println();

		for(int i = 0; i < play.length; i++) {
			
			play[i] = new Play(title, singer);
			
		}
		
		for(int i = 0; i < play.length; i++) {

			System.out.println("'"+play[i].singer+"'" + "의 " + "'"+play[i].title+"'" + "을 선택하셨습니다.");
			pay = purchase*(i+1);
			
		}
		System.out.println("▶ 결제 금액은 " + pay + "원입니다.\n");
		
		System.out.println("결");
		System.out.println("제");
		System.out.println("중");
		System.out.println(".");
		System.out.println(".");
		System.out.println("결제가 완료되었습니다.\n");
	}
	
	
	// 3번 선택 (잔액 확인)
	public void printCharge() {
		for(int i = 0; i < musics.length; i++) {
			
			System.out.println("======= 3. 캐시잔액 확인 =======");
			charge = musics[i].getMoney() - (700*(i+1));
			System.out.println("☞ 현재 잔액은 " + charge + "원 입니다.\n");
		}
	}
	
	// 4번 선택 (내 플레이 리스트 확인)
	public void printPlayList() {
		for(int i = 0; i < play.length; i++) {
			System.out.println("====== 4. 내 플레이리스트 확인 ======");
			System.out.println("[" + i+1 + "] " + play[i].title + " - " + play[i].singer + " ♪\n");
			System.out.println();
		}
	}
	
	// 5번 선택 (종료)
	public void printExit() {
		System.out.println("============== 5. 프로그램 종료 =============");
		System.out.println("[ MUSIC IS MY LIFE ] 프로그램이 종료됩니다.");
	}
	
}
