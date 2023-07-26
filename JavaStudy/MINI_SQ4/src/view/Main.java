package view;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

import controller.MbController;
import controller.UserController;

import javazoom.jl.player.MP3Player;
import model.MbDTO;
import model.UserDAO;
import model.UserDTO;
import music.Bgm;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MbDTO dto = null;
		MbController con = new MbController();
		UserController ucon = new UserController();
		UserDTO udto = null;

		ArrayList<Bgm> list = new ArrayList<Bgm>();
		int index = 0;
		MP3Player mp3 = new MP3Player();
		Bgm b1 = new Bgm("와우효과음", ".\\music\\와우효과음.mp3");
		Bgm b2 = new Bgm("No one", ".\\music\\이하이 - NO ONE.mp3");

		list.add(b1);
		list.add(b2);

		// 회원가입 및 로그인
		System.out.println(
				"                                                     ..                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                                                    .@#                                             \r\n"
						+ "                ,##@@@@@@@,     .$@#$.     @@.      .@#  :@*  !@@@@@@@@@#~                          \r\n"
						+ "               ;@@@@@@@@@@,    =@@###@=    @@.      .@#  ;@*  !@@@@@@@@@@@#,                        \r\n"
						+ "              .@@~            $@$;-~:#@$   @@.      .@#  ;@=  !@=,,....,~#@@.                       \r\n"
						+ "              -@#            :@$-,...-$@:  @@.      .@#  ;@=  !@*         =@#                       \r\n"
						+ "              .@@.           @@:....,,~#@  @@.      .@#  ;@=  !@*          @@,                      \r\n"
						+ "               *@@@@@@@@#;  .@#,.,...,.#@. @@.      .@#  ;@=  !@*          =@:                      \r\n"
						+ "                *@@@@@@@@@* .@#,,.;=:,.#@. @@.      ,@#  ;@=  !@*          !@;                      \r\n"
						+ "                        ,@@, @#-..-@$,-#@  @@-      ~@#  ;@=  !@*          $@~                      \r\n"
						+ "                         *@: =@!..,*@;*@=  =@$      $@*  ;@=  !@*         -@@                       \r\n"
						+ "                         $@~ .@@!,.-@#@@.  .@@=    =@@.  ;@=  !@*        -#@!                       \r\n"
						+ "         ===============#@#   ~#@#=*#@@:    ~@@@##@@@-   ;@=  !@#=====$$#@@=                        \r\n"
						+ "         #@@@@@@@@@@@@@@@#.    ,$@@@@##      ,#@@@@$,    ;@=  !@@@@@@@@@@@;                         \r\n"
						+ "         ,,,,,,,,,,,,,,,.         ,, #@!        ,,       .,.  ,-,,---,,,.                           \r\n"
						+ "                                     -@#                                                            \r\n"
						+ "                                      $@!                                                           \r\n"
						+ "                                      ,@@.                                                          \r\n"
						+ "                               ...,...,#@!               ..         .,.  .,,,,,,,,,,,               \r\n"
						+ "                            ~#@@@@@@@@@@@~      =.      ,@@.        =@!  $@@@@@@@@@@@~              \r\n"
						+ "                           !@@@##########      .@!      ,@@=       ,@@!  $@$=========-              \r\n"
						+ "                          ~@@;                 =@@      ,@@#.      $@@!  $#~........,.              \r\n"
						+ "                          #@;                  ##@!     ,@@@=     ,@@@!  $@~..........              \r\n"
						+ "                         ,@#   .......        *@*##.    ,@#@@.    $@$@!  $@~....------------.       \r\n"
						+ "                         ~@$   #@@@@@@!      .@#,*@;    ,@#!@!   ,@#;@!  $@~...,#@@@@@@@@@@@~       \r\n"
						+ "                         ~@$   ######@@      !@!,-##    ,@#.@#.  =@:;@!  $@~...,*****$@##@@@~       \r\n"
						+ "                         .@@.        $@*    .@#,,.*@;   ,@# !@* ,@# ;@!  $#~..........              \r\n"
						+ "                          =@$        ,@@.   ;@*,,,-##   ,@# .@#.=@: ;@!  $#~..........              \r\n"
						+ "                           #@@;-------$@*-, ##-,.,.*#:  ,@#  !@=@#  ;@!  $#!~~~~~~~~:,              \r\n"
						+ "                           .#@@@@@@@@@@@@@#:@*.....~@@  ,@#  .@@@;  ;@!  $@@@@@@@@@@@~              \r\n"
						+ "                             -*@@@@@@@@#@@##@:~~~~~~$@: ,@#   !@@   ;@!  $@@@@@@@@@@@~              \r\n"
						+ "                                       .@@,                                                         \r\n"
						+ "                                        =@=                                                         \r\n"
						+ "                                         @@,                                                        \r\n"
						+ "                                         :!:                                                        ");
		breakout: while (true) {

			System.out.println("====================== 메뉴 ======================");
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			int select = sc.nextInt(); // 사용자가 선택

			if (select == 1) {
				// (insert)
				// 사용자로부터 ID,PW을 입력받아 회원가입

				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				dto = new MbDTO(id, pw);
				con.insert(dto);

			} else if (select == 2) {
				// login

				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				con = new MbController();
				dto = new MbDTO(id, pw);

				// 참가자 등록 (닉네임, 등번호 입력)
				if (con.login(dto) == true) {
					System.out.print("닉네임을 입력해주세요 : ");
					String name = sc.next();
					System.out.print("등번호를 입력해주세요 : ");
					int backnum = sc.nextInt();

					ucon = new UserController();
					udto = new UserDTO(id, name, backnum);
					new UserDAO().user(udto);

				} else {
					break;
				}

				// 게임시작
				System.out.println("게임이 시작 됩니다.");

				// 1. 딱지 치기
				while (true) {

					Random rd = new Random();

					int fail = 0; // 실패했을때 +1 씩 해줄 변수

					while (true) {
						System.out.println("집중을 해서 딱지를 치세요 >> g + enter");
						String ddak = sc.next();
						System.out.println("MIN]=====================[MAX");

						int num = rd.nextInt(10) + 1;
						System.out.println(" 당신의 파워 : " + num);

						if (num > 5) {
							System.out.println("SUCCESS");
							break;
						} else {
							System.out.println("Fail...");
						}

					}
					break;
				}

//				String arr[] = new String[19];
//				int cnt = 0;
//				arr[18] = "▣";
//
//				while (true) {
//
//					index = 1;
//
//					mp3.play(list.get(index).getPath());
//					try {
//						Thread.sleep(8000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//
//					if (mp3.isPlaying() == false) {
//						// 움직 NO
//						System.out.println("false일때");
//
//					} else if (mp3.isPlaying() == true) {
//						// 움직YES
////						System.out.println("●□□□□□□□□□□□□□□□□□▣");
//						System.out.println("true 일때");
//						for (int i = 0; i < arr.length - 1; i++) {
//							arr[i] = "□";
//						}
//						System.out.println("g를 눌러 전진하세요");
//						String click = sc.next();
//						if (click.equals("g")) {
//
//							arr[cnt] = "●";
//							for (int i = 0; i < arr.length; i++) {
//								System.out.print(arr[i]);
//							}
//							cnt++;
//
//						}
//					}
//				}
//					
//						System.out.println("●□□□□□□□□□□□□□□□□□▣");
//						String click = sc.next();
//						if(click.equals("g")) {
//							System.out.println("□●□□□□□□□□□□□□□□□□▣");
//							
//						}
//						
//					}else {
//						// mp3.isPlaying() == false
//						break;
//					}
				// 3 달고나게임

				// 5. 징검다리

				loop: while (true) {
					int index2 = 2;
					int turn = 2;
					int life = 8;
					boolean[][] arr_bool = new boolean[3][2];
					String[][] arr_glass = new String[3][2];
					for (int i = 0; i < arr_bool.length; i++) {
						arr_bool[i][0] = new Random().nextBoolean();
						arr_bool[i][1] = !arr_bool[i][0];
						for (int j = 0; j < arr_bool[i].length; j++) {
							arr_glass[i][j] = "□";
							// System.out.print(arr_bool[i][j]);
						}
						// System.out.println();
					}

					System.out.println("★☆★☆★☆★☆★☆오징어 게임 다리 건너기★☆★☆★☆★☆★☆\n 시도 기회 : 17번");
					System.out.println("1.게임 시작 2.게임 방법");
					int ch = sc.nextInt();
					if (ch == 1) {
						while (true) {
							Main.progress(arr_glass, turn);
							System.out.println(8 - life + "번 도전!");
							System.out.println("당신의 선택은?\n1.왼쪽 2.오른쪽");
							int ch2 = sc.nextInt();
							if (ch2 == 1 || ch2 == 2) {
								try {
									System.out.println("점프중.....");
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								if (arr_bool[index2][ch2 - 1] == true) {
									System.out.println("성공!");
									index2--;
									turn--;
								} else {
									System.out.println("사망!");
									arr_glass[index2][ch2 - 1] = " ";
									index2 = 2;
									turn = 2;
									life--;
								}

							} else
								System.out.println("올바른 숫자를 입력해주세요");
							if (life == 0) {
								System.out.println("게임 오버");
								break;
							}
							if (turn == -1) {
								System.out.println("우승!!!!!!!!!!!");
								break loop;
							}
						}
					} else if (ch == 2)
						System.out.println("오징어게임 보고 오세요");
					else
						System.out.println("올바른 숫자를 입력해주세요");
				}

			} else if (select == 3) {
				// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 선택해 주세요!.");
			}
			break breakout;

		}

	}

	public static void progress(String[][] arr_glass2, int turn2) {
		for (int i = 0; i < arr_glass2.length; i++) {
			System.out.print("│");
			for (int j = 0; j < arr_glass2[i].length; j++) {
				System.out.print("   " + arr_glass2[i][j] + "   ");
			}
			System.out.print("│");
			if (i == turn2 + 1)
				System.out.println("<-------현위치");
			else
				System.out.println();
		}
	}
}
