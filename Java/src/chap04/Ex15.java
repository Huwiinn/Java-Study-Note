package chap04;

public class Ex15 {

	public static void main(String[] args) {
//	중첩 do-while문으로 변경
//		int num = 0;
//		while (num <= 9) {
//			int dan = 2;
//			while (dan <= 9) {
//				if (num == 0) {
//					System.out.print("[" + dan + "단]\t"); // \t 칸 간격 벌림
//				} else {
//					System.out.print(dan + "*" + num + "=" + dan * num + "\t");
//				}
//				dan++;
//			}
//			System.out.println();
//			num++;
//		}
		
		int num = 0, dan = 2;
		
		do {
			System.out.println();
			num++;
			dan = 2;
			do {
				if (num == 0) {
					System.out.print("[" + dan + "단]\t"); // \t 칸 간격 벌림
				} else {
					System.out.print(dan + "*" + num + "=" + dan * num + "\t");
				}
				dan++;
			} while(dan <= 9);
		} while(num <= 9);
		
	}

}