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
	
	// �ʱ�ȭ
	int money = 0;		// �����ݾ�
	int purchase = 0;	// �������űݾ�
	int pay = 0;		// �����ݾ�
	int charge = 0;		// �ܾ�
	
	public MusicFunction() {
		musics = new Music[1];	// �ʱ�ȭ (�޴� �ݺ� Ƚ��)

	}
	
	// �޼ҵ�� �Է�.
	
	// �⺻ȭ�� (�޴� ���)
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("====== [�� MUSIC IS MY LIFE, ���� ���� ���α׷� ��] ======");
		System.out.println("1. ĳ������");
		System.out.println("2. ��������");
		System.out.println("3. ĳ���ܾ� Ȯ��");
		System.out.println("4. �� �÷��̸���Ʈ Ȯ��");
		System.out.println("5. ���α׷� ����\n");
		System.out.print("�� �޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	// 1�� ���� (ĳ�� ���� �޼ҵ�)
	public void inputMoney() {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i< musics.length; i++) {
			
			System.out.println("================= 1. ĳ�� ���� =====================================");
			System.out.print("������ �ݾ��� �Է����ּ��� (�� 1ȸ �����ݾ��� 1,000�� �̻� �����մϴ�.)\n");
			System.out.print(" : ");
			int money = sc.nextInt();

			if (money >= 1000) {
				musics[i] = new Music();
				musics[i].setMoney(money);
				System.out.println();
				System.out.println("*^^* ĳ�� " + money + "���� �����Ǿ����ϴ� *^^* \n");
				
			} else {
				System.out.println("�� 1ȸ �����ݾ��� 1,000�� �̻� �����մϴ�.\n");
				i--;
				
			}
		}
	}
	
	
	// 2�� ����(���� ����Ʈ �� ����)
	public void MusicPurchase() {
		
		Scanner sc = new Scanner(System.in);
		purchase = 700;
		
		System.out.println("================= 2. �������� =================================================");
		System.out.println("[---------------------------------- Music List ------------------- -------------]");
		System.out.println(" �� ����� ���� - ����     �� Hype boy - NewJeans(������)   �� ���� - ����(ZICO)");
		System.out.println(" �� After LIKE - IVE(���̺�)  �� Nxde - (����)���̵�          �� �׶��̼� - 10CM");
		System.out.println(" �� Pink Venom - BLACPINK    �� Attention - NewJeans(������)   �� Rush Hour - Crush");
		System.out.println(" �� Antifragile - LE SSERAFIM(��������)    �� LOVE DIVE - IVE(���̺�)");
		System.out.println("[-------------------------------------------------- ----------------------------]\n");

		
		System.out.println("�� ������ ������ �Է����ּ���");
		System.out.print("���� >> ");
		String title = sc.nextLine();
		System.out.print("���� >> ");
		String singer = sc.nextLine();
		System.out.println();

		for(int i = 0; i < play.length; i++) {
			
			play[i] = new Play(title, singer);
			
		}
		
		for(int i = 0; i < play.length; i++) {

			System.out.println("'"+play[i].singer+"'" + "�� " + "'"+play[i].title+"'" + "�� �����ϼ̽��ϴ�.");
			pay = purchase*(i+1);
			
		}
		System.out.println("�� ���� �ݾ��� " + pay + "���Դϴ�.\n");
		
		System.out.println("��");
		System.out.println("��");
		System.out.println("��");
		System.out.println(".");
		System.out.println(".");
		System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
	}
	
	
	// 3�� ���� (�ܾ� Ȯ��)
	public void printCharge() {
		for(int i = 0; i < musics.length; i++) {
			
			System.out.println("======= 3. ĳ���ܾ� Ȯ�� =======");
			charge = musics[i].getMoney() - (700*(i+1));
			System.out.println("�� ���� �ܾ��� " + charge + "�� �Դϴ�.\n");
		}
	}
	
	// 4�� ���� (�� �÷��� ����Ʈ Ȯ��)
	public void printPlayList() {
		for(int i = 0; i < play.length; i++) {
			System.out.println("====== 4. �� �÷��̸���Ʈ Ȯ�� ======");
			System.out.println("[" + i+1 + "] " + play[i].title + " - " + play[i].singer + " ��\n");
			System.out.println();
		}
	}
	
	// 5�� ���� (����)
	public void printExit() {
		System.out.println("============== 5. ���α׷� ���� =============");
		System.out.println("[ MUSIC IS MY LIFE ] ���α׷��� ����˴ϴ�.");
	}
	
}
