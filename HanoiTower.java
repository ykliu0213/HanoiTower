package edu.nccu.misds.hanoi;

public class HanoiTower {
	private MyStack<Integer> rodA;
	private MyStack<Integer> rodB;
	private MyStack<Integer> rodC;
	private int times = 0;
	private int numOfDisks = 0;

	public HanoiTower(int numOfDisks){
		refresh(numOfDisks);
	}

	/**
	 * @TODO Initialize hanoi tower with some disks (numOfDisks). A disk is
	 *       represent by an integer number. Bigger number stand for bigger
	 *       disk. Also, the smallest disk will be represented by 1, not 0.
	 * 
	 *       In this method, you will be given a parameter "numOfDisks" which
	 *       describes how many disks are there in this hanoi tower. Please put
	 *       those disks into rodA in order; bigger disks should be put first.
	 * 
	 * @HINT: You have to reassign appropriate value/instances to the following fields:
	 * @this.numOfDisks
	 * @this.times
	 * @this.rodA
	 * @this.rodB
	 * @this.rodC
	 */
	public void refresh(int numOfDisks) {
		this.numOfDisks = numOfDisks;
		this.times = 0;
		this.rodA = new MyStack<Integer>() {
			public String toString() {
				return "A";
			}
		};
		this.rodB = new MyStack<>();
		this.rodC = new MyStack<>();
		
		//put all the disk into rodA in order
		for(int i = numOfDisks ; i > 0 ; i--) {
			this.rodA.push(i);
		}
		this.printHanoiTower();
	}
	
	//call this function to start execute
	public void start() {
		execute(this.numOfDisks, rodA, rodC, rodB);
	}

	/**
	 * @TODO: This method should be called recursively. Move disk "n" from "src"
	 *        (source rod) to "dest" (destination rod), and "spare" (temporary
	 *        rod) will act as you temporary space to put disks. Call printHanoiTower() when you do a moving.
	 */
	private void execute(int n, MyStack<Integer> src, MyStack<Integer> dest,
			MyStack<Integer> spare) {
		if(n==1) {
			this.move(src, dest);
		}else {
			this.execute(n-1,src,spare,dest);
			this.move(src, dest);
			this.execute(n-1, spare, dest, src);
		}
	}
	/**
	 * @TODO: You may use move function to help the moving between two stacks
	 */ 
	private void move(MyStack<Integer> a, MyStack<Integer> b) {
		this.times++;	//count how many moves
		b.push(a.pop());	//add the top one of a to b  &  remove the top one of a
		this.printHanoiTower();
	}

	/**
	 * @TODO: return an integer that represent how many steps we need to
	 *        complete this hanoi tower.
	 */
	public int getTimes() {
		return this.times;
	}

	public void printHanoiTower() {
		System.out.println("Current state: " + this.times);
		rodA.printStack();
		rodB.printStack();
		rodC.printStack();
		System.out.println("--------------");
	}

	
	
	//----------------
	public MyStack<Integer> getRodA() {
		return rodA;
	}

	public void setRodA(MyStack<Integer> rodA) {
		this.rodA = rodA;
	}

	public MyStack<Integer> getRodB() {
		return rodB;
	}

	public void setRodB(MyStack<Integer> rodB) {
		this.rodB = rodB;
	}

	public MyStack<Integer> getRodC() {
		return rodC;
	}

	public void setRodC(MyStack<Integer> rodC) {
		this.rodC = rodC;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getNumOfDisks() {
		return numOfDisks;
	}

	public void setNumOfDisks(int numOfDisks) {
		this.numOfDisks = numOfDisks;
	}
}
