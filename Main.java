package edu.nccu.misds.hanoi;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many disks does the hanoi have:");
		HanoiTower hanoi = new HanoiTower(input.nextInt());
		hanoi.start();
		System.out.println("Please enter how many disks does the hanoi have:");
		
		while(input.hasNext()) {
			hanoi.refresh(input.nextInt());
			hanoi.start();
			System.out.println("Please enter how many disks does the hanoi have:");
		}
		
	}
}
