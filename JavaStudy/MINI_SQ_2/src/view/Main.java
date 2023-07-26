package view;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

import controller.MbController;
import controller.Mp3;
import controller.UserController;

import javazoom.jl.player.MP3Player;
import model.MbDTO;
import model.UserDAO;
import model.UserDTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MbDTO dto = null;
		MbController con = new MbController();
		UserController ucon = new UserController();
		UserDTO udto = null;

		ArrayList<String> dallist = new ArrayList<String>();

		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("a");
		dallist.add("a");
		dallist.add("a");
		dallist.add("a");

		int z = 0;
		int index = 0;

		MP3Player mp3 = new MP3Player();
		
		Mp3 m = new Mp3();
		
		Random rd = new Random();

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
			m.fx();
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

				// 2. 무궁화 꽃이 피었습니다.

//				String arr[] = new String[19];
//				int cnt = 0;
//				arr[18] = "▣";
//
//				System.out.println("음악이 나오는 동안 g를 눌러 전진/음악이 안나오는 동안 p를 눌러 멈추세요");
//				loop: while (true) {
//					int num = rd.nextInt(5) + 1;
//
//					index = 1;
//
//					try {
//						mp3.play(list.get(index).getPath());
//						Thread.sleep(5000);
//						for (int k = 0; k <= num; k++) {
//
//							String click = sc.next();
//							if (mp3.isPlaying() == false) {
//								// 움직 NO
//								for (int i = 0; i < arr.length - 1; i++) {
//									arr[i] = "□";
//								}
//								if (click.equals("g")) {
//
//									System.out.println("게임오버!! 다시 실행하세요");
//									break breakout;
//
//								}
//
//							} else if (mp3.isPlaying() == true) {
//								// 움직YES
//
//								for (int i = 0; i < arr.length - 1; i++) {
//									arr[i] = "□";
//								}
//
//								if (click.equals("g")) {
//
//									arr[cnt] = "●";
//									for (int i = 0; i < arr.length; i++) {
//										System.out.print(arr[i]);
//									}
//									System.out.println();
//									cnt++;
//
//								}
//								if (cnt == 18) {
//									mp3.stop();
//									System.out.println("성공!!!");
//
//									break loop;
//								}
//
//							}
//						}
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					try {
//						mp3.stop();
//						Thread.sleep(5000);
//
//						String click = sc.next();
//
//						if (mp3.isPlaying() == false) {
//							// 움직 NO
//							for (int i = 0; i < arr.length - 1; i++) {
//								arr[i] = "□";
//							}
//							if (click.equals("g")) {
//
//								System.out.println("게임오버!! 다시 실행하세요");
//								break breakout;
//
//							}
//
//						}
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}

				// 달고나

				System.out.println("다음 달고나를 잘 자르세요. ");
				System.out.println(" ┎─────┒ ");
				System.out.println(" ┃/////┃ ");
				System.out.println(" ┃/////┃ ");
				System.out.println("●┖─────┚ ");
				
				
				
				
				while (true) {

					System.out.println("w(↑),a(←),s(↓),d(→) 방향키를 움직여서 한바퀴 완주하세요 (w 를 눌러 시작");
					String input = sc.next();
					if (input.equals(dallist.get(z))) {

						if (z == 0) {
							System.out.println(".........");
							System.out.println(":┎─────┒:");
							System.out.println(":┃/////┃:");
							System.out.println(":┃/////┃:");
							System.out.println("●┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 1) {
							System.out.println(".........");
							System.out.println(":┎─────┒:");
							System.out.println(":┃/////┃:");
							System.out.println("●┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 2) {
							System.out.println(".........");
							System.out.println(":┎─────┒:");
							System.out.println("●┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 3) {
							System.out.println(".........");
							System.out.println("●┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 4) {
							System.out.println("●........");
							System.out.println(" ┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						}else if (z == 5) {
							System.out.println("  ●......");
							System.out.println(" ┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 6) {
							System.out.println("    ●....");
							System.out.println(" ┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 7) {
							System.out.println("     ●...");
							System.out.println(" ┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 8) {
							System.out.println("      ●..");
							System.out.println(" ┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 9) {
							System.out.println("        ●");
							System.out.println(" ┎─────┒:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 10) {
							System.out.println("         ");
							System.out.println(" ┎─────┒●");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 11) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃●");
							System.out.println(" ┃/////┃:");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 12) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃");
							System.out.println(" ┃/////┃●");
							System.out.println(" ┖─────┚:");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 13) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┖─────┚●");
							System.out.println("¨¨¨¨¨¨¨¨¨");
						} else if (z == 14) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┖─────┚ ");
							System.out.println("¨¨¨¨¨¨¨¨●");
							
							
						} else if (z == 15) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┖─────┚ ");
							System.out.println("¨¨¨¨¨¨●  ");

						} else if (z == 16) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┖─────┚ ");
							System.out.println("¨¨¨¨●  ");


						} else if (z == 17) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┖─────┚ ");
							System.out.println("¨¨●  ");

						} else if (z == 18) {
							System.out.println("         ");
							System.out.println(" ┎─────┒ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┃/////┃ ");
							System.out.println(" ┖─────┚ ");
							System.out.println("●   ");
							System.out.println("성공!");
							break;

						}

					} else {
						System.out.println("잘못입력 탈락");
						break breakout;
					}

					z++;

				}

				// 5. 징검다리

				while (true) {
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
								System.exit(0);
							}
						}
					} else if (ch == 2)
						System.out.println("오징어게임 보고 오세요");
					else {
						System.out.println("올바른 숫자를 입력해주세요");
					}
				}

			} else if (select == 3) {
				// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 선택해 주세요!.");
			}

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