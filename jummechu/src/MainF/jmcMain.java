package MainF;

import DBF.jmcSQL;
import TypeF.Review2;
import TypeF.lMenu2;
import TypeF.lStore2;

import java.util.Scanner;

public class jmcMain {

    public static void main(String[] args) {

        lMenu2 lmenu2 = new lMenu2();
        lStore2 lstore2 = new lStore2();
        Review2 review2 = new Review2();

        // 메뉴 객체
        lMenu2 menu = new lMenu2();
        // SQL 객체
        jmcSQL sql = new jmcSQL();
        // Scanner 객체
        Scanner sc = new Scanner(System.in);
        // 프로그램 실행을 위한 변수
        boolean run = true;
        boolean run1 = true;
        // 메뉴를 입력받기 위한 변수
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;

        // 키워드리뷰를 입력받기 위한 변수
        String keyword1 = null;
        String keyword2 = null;
        String keyword3 = null;


        String Store = null;
        sql.connect();

        // 메뉴 고르기
        while (run) {
            System.out.println("\n ┌───────────────────────────────────────────────────────────────────┐");
            System.out.println(" │                           Jum Mae Chu !                           │");
            System.out.println(" └───────────────────────────────────────────────────────────────────┘");
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            System.out.println("    1.옵션고르기    |    2.랜덤추천받기    |    3.식당등록    |    4.종료");
            System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
            System.out.print("메뉴 선택 ☞ ");

            menu1 = sc.nextInt();
                switch (menu1) {
                    case 1:
                        System.out.println("\n ┌───────────────────────────────────────────────────────────────────┐");
                        System.out.println(" │                           옵션 고르기 !　　　 　　　　　　　　　　　　　│");
                        System.out.println(" └───────────────────────────────────────────────────────────────────┘");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.println("     1.한식    |   2.일식    |   3.중식    |   4.양식    |   5.처음으로");
                        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
                        System.out.print("메뉴 선택 ☞ ");
                        menu2 = sc.nextInt();

                        switch (menu2) {

                            // 한식랜덤추천
                            case 1:
                                String k = sql.Koption();

                                System.out.println("\n오늘의 추천 메뉴는 [ " + k + " ] 입니다!\n");
                                System.out.println("―――――――――――――――― 추천된 메뉴 식당 리스트 ―――――――――――――――");

                                // 식당정보출력
                                String ss = sql.kResult(k);
                                System.out.println("\n메뉴와 가게가 마음에 드신가요?");
                                System.out.print("마음에 드시면 1번 안드시면 2번을 입력해주세요 ☞ ");

                                int yn1 = sc.nextInt();
                                if (yn1 == 1) {
                                    System.out.println("\n맛있는 식사시간 되세요!");
                                    run = false;
                                } else if (yn1 == 2) {
                                    break;
                                }
                                break;

                            // 일식랜덤추천
                            case 2:
                                String j = sql.Joption();

                                System.out.println("\n오늘의 추천 메뉴는 [ " + j + " ] 입니다!\n");
                                System.out.println("―――――――――――――――― 추천된 메뉴 식당 리스트 ―――――――――――――――");

                                // 식당정보출력
                                String ss2 = sql.jResult(j);
                                System.out.println("\n메뉴와 가게가 마음에 드신가요?");
                                System.out.print("마음에 드시면 1번 안드시면 2번을 입력해주세요 ☞ ");

                                int yn2 = sc.nextInt();
                                if (yn2 == 1) {
                                    System.out.println("\n맛있는 식사시간 되세요!");
                                    run = false;
                                } else if (yn2 == 2) {
                                    break;
                                }
                                break;

                            // 중식랜덤추천
                            case 3:
                                String c = sql.Coption();

                                System.out.println("\n오늘의 추천 메뉴는 [ " + c + " ] 입니다!\n");
                                System.out.println("―――――――――――――――― 추천된 메뉴 식당 리스트 ―――――――――――――――");

                                // 식당정보출력
                                String ss3 = sql.cResult(c);
                                System.out.println("\n메뉴와 가게가 마음에 드신가요?");
                                System.out.print("마음에 드시면 1번 안드시면 2번을 입력해주세요 ☞ ");

                                int yn3 = sc.nextInt();
                                if (yn3 == 1) {
                                    System.out.println("\n맛있는 식사시간 되세요!");
                                    run = false;
                                } else if (yn3 == 2) {
                                    break;
                                }
                                break;

                            // 양식랜덤출력
                            case 4:
                                String w = sql.Woption();

                                System.out.println("\n오늘의 추천 메뉴는 [ " + w + " ] 입니다!\n");
                                System.out.println("―――――――――――――――― 추천된 메뉴 식당 리스트 ―――――――――――――――");

                                // 식당정보출력
                                String ss4 = sql.wResult(w);
                                System.out.println("\n메뉴와 가게가 마음에 드신가요?");
                                System.out.print("마음에 드시면 1번 안드시면 2번을 입력해주세요 ☞ ");

                                int yn4 = sc.nextInt();
                                if (yn4 == 1) {
                                    System.out.println("\n맛있는 식사시간 되세요!");
                                    run = false;
                                } else if (yn4 == 2) {
                                    break;
                                }
                                break;

                            // 첫 화면으로 돌아가기
                            case 5:
                                System.out.println("\n처음 화면으로 돌아갑니다.");
                                continue;

                            default:
                                System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
                                break;
                        }

                break;

                // 모든 메뉴 랜덤추천
                case 2:
                    String r = sql.AllRandom();

                    System.out.println("\n오늘의 추천 메뉴는 [ " + r + " ] 입니다!\n");
                    System.out.println("―――――――――――――――― 추천된 메뉴 식당 리스트 ―――――――――――――――");

                    // 식당정보출력
                    String hyunsoo = sql.rResult(r);
                    System.out.println("\n메뉴와 가게가 마음에 드신가요?");
                    System.out.print("마음에 드시면 1번 안드시면 2번을 입력해주세요 ☞ ");

                    int yn5 = sc.nextInt();
                    if (yn5 == 1) {
                        System.out.println("\n맛있는 식사시간 되세요!");
                        run = false;
                    } else if (yn5 == 2) {
                        break;
                    }
                    break;

                // 식당등록
                case 3:
                    // 메뉴코드 자동생성
                    int mCode2 = sql.lMenu2() + 1;

                    sc.nextLine().trim();

                    System.out.print("\n등록할 식당의 대표메뉴를 입력해주세요 ☞ ");

                    String mName2 = sc.nextLine();
                    lmenu2.setmCode2(mCode2);
                    lmenu2.setmName2(mName2);
                    sql.join(lmenu2);

                    // 가게코드 자동생성
                    int sCode2 = sql.lStore2() + 1;

                    System.out.print("등록할 식당 이름을 입력해주세요 ☞ ");
                    String sName2 = sc.nextLine();




















                    System.out.print("등록할 식당의 전화번호를 입력해주세요 ☞ ");
                    String sTNum2 = sc.nextLine();

                    System.out.print("등록할 식당의 주소를 입력해주세요 ☞ ");
                    String sAddr2 = sc.nextLine();

                    System.out.println("\n1.한식    2.일식    3.중식    4.양식 ");
                    System.out.print("등록할 식당의 음식 종류를 입력해주세요 ☞ ");

                    int fCode2 = sc.nextInt();
                    if(fCode2 == 1){
                        fCode2 = 10;
                    } else if (fCode2 ==2) {
                        fCode2 = 20;
                    } else if (fCode2 ==3) {
                        fCode2 = 30;
                    } else if (fCode2 ==4) {
                        fCode2 = 40;
                    }

                    lstore2.setsCode2(sCode2);
                    lstore2.setsName2(sName2);
                    lstore2.setsTNum2(sTNum2);
                    lstore2.setsAddr2(sAddr2);
                    lstore2.setfCode2(fCode2);
                    lstore2.setmCode2(mCode2);
                    sql.join(lstore2);

                    System.out.println("\n등록할 식당의 키워드리뷰를 선택해주세요!");

                    System.out.println("1.맛있음   2.친절함   3.신선함   4.양많음   5.청결함");
                    System.out.println("6.매장넓음   7.주차편함    8.가성비좋음   9.혼밥하기좋음");

                    System.out.print("\n첫번째 키워드를 선택해주세요 ☞ ");
                    menu3 = sc.nextInt();
                    if(menu3 == 1){
                        keyword1 = "맛있음";
                    } else if (menu3 == 2) {
                        keyword1 = "가성비좋음";
                    }else if (menu3 == 3) {
                        keyword1 = "친절함";
                    }else if (menu3 == 4) {
                        keyword1 = "신선함";
                    }else if (menu3 == 5) {
                        keyword1 = "양많음";
                    }else if (menu3 == 6) {
                        keyword1 = "매장넓음";
                    }else if (menu3 == 7) {
                        keyword1 = "주차편함";
                    }else if (menu3 == 8) {
                        keyword1 = "청결함";
                    }else if (menu3 == 9) {
                        keyword1 = "혼밥하기좋음";
                    }
                    review2.setsKeyword1(keyword1);

                    System.out.print("두번째 키워드를 선택해주세요 ☞ ");
                    menu3 = sc.nextInt();
                    if(menu3 == 1){
                        keyword2 = "맛있음";
                    } else if (menu3 == 2) {
                        keyword2 = "가성비좋음";
                    }else if (menu3 == 3) {
                        keyword2 = "친절함";
                    }else if (menu3 == 4) {
                        keyword2 = "신선함";
                    }else if (menu3 == 5) {
                        keyword2 = "양많음";
                    }else if (menu3 == 6) {
                        keyword2 = "매장넓음";
                    }else if (menu3 == 7) {
                        keyword2 = "주차편함";
                    }else if (menu3 == 8) {
                        keyword2 = "청결함";
                    }else if (menu3 == 9) {
                        keyword2 = "혼밥하기좋음";
                    }
                    review2.setsKeyword2(keyword2);

                    System.out.print("세번째 키워드를 선택해주세요 ☞ ");
                    menu3 = sc.nextInt();
                    if(menu3 == 1){
                        keyword3 = "맛있음";
                    } else if (menu3 == 2) {
                        keyword3 = "가성비좋음";
                    }else if (menu3 == 3) {
                        keyword3 = "친절함";
                    }else if (menu3 == 4) {
                        keyword3 = "신선함";
                    }else if (menu3 == 5) {
                        keyword3 = "양많음";
                    }else if (menu3 == 6) {
                        keyword3 = "매장넓음";
                    }else if (menu3 == 7) {
                        keyword3 = "주차편함";
                    }else if (menu3 == 8) {
                        keyword3 = "청결함";
                    }else if (menu3 == 9) {
                        keyword3 = "혼밥하기좋음";
                    }
                    review2.setsKeyword3(keyword3);
                    review2.setsCode2(sCode2);
                    sql.join(review2);
                    System.out.println("\n―――――――――――――――――― 등록된 식당 정보 ―――――――――――――――――");
                    String  yejin = sql.pResult(mName2);
                    System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                    break;

                case 4:
                    System.out.println("\n이용해 주셔서 감사합니다.");
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
                    break;
            }

        }

    }

}

