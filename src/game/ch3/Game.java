package game.ch3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
	public static void main(String[] ar){
		GameFrame fms = new GameFrame();
	}
}

class GameFrame extends JFrame implements KeyListener, Runnable{

	/* --------- 멤버변수 선언 영역 시작 --------- */
	// 창크기
	int f_width = 800;
	int f_height = 600;
	
    //이미지를 불러오기 위한 툴킷
	Toolkit tk = Toolkit.getDefaultToolkit();
	
    // f15k.png 라는 이미지를 불러옵니다.	
	Image me_img = new ImageIcon(
						this.getClass().getResource("f15k.png")
					).getImage();	
	
	// 캐릭터의 좌표 변수
	int x, y; 
	 
	//키보드 입력 처리를 위한 변수
	boolean KeyUp = false; 
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	
	// 실행 스레드 생성
	Thread th; 
	/* --------- 멤버변수 선언 영역 끝 --------- */
	
	
	// 생성자
	GameFrame(){
		
		init();
		start();
	}
 			
	
	/* 사용자정의 메서드 */
	// 윈도창 초기화
	public void init(){
		setTitle("슈팅 게임 만들기"); // 윈도 타이틀
		setSize(f_width, f_height); //윈도크기
	  
		// 스크린 사이즈와 창크기를 계산하여 중앙에 오도록 함.
		Dimension screen = tk.getScreenSize();
	
		int f_xpos = (int)(screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int)(screen.getHeight() / 2 - f_height / 2);
		
		setLocation(f_xpos, f_ypos);
		setResizable(false);
		setVisible(true);
		
		//프레임 오른쪽 위에 X버튼을 눌렀을때 
		//프로그램이 정상적으로 종료하게 만들어 줍니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	// 게임 시작
	public void start(){
		//키보드 이벤트 실행
		addKeyListener(this);
		
		// 현재 창의 스레드 생성
		th = new Thread(this);  
		th.start();  
	}	
	
	
	
	/* --------- 오버라이드 메서드 영역 시작 ---------- */
	// JFrame derive 클래스의 그리기 함수
	public void paint(Graphics g){
		// 0,0 에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
		g.clearRect(0, 0, f_width, f_height);

		//g.drawString("Hello World", 100, 100);
		//프레임에 me_img에 저장된 f15k.png 이미지를  x=100, y=100 좌표로 그려넣습니다.
		g.drawImage(me_img, x, y, this);
	}
	
	// KeyListener Implement 클래스의 기본 메소드 들
	// 키보드가 눌러졌을때 이벤트 처리하는 곳 
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP :
				KeyUp = true;
				break;
			case KeyEvent.VK_DOWN :
				KeyDown = true;
				break;
			case KeyEvent.VK_LEFT :
				KeyLeft = true;
				break;
			case KeyEvent.VK_RIGHT :
				KeyRight = true;
				break;
		}
	}
	
	// 키보드가 눌러졌다가 때어졌을때 이벤트 처리하는 곳
	public void keyReleased(KeyEvent e){	  
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP :
				KeyUp = false;
				break;
			case KeyEvent.VK_DOWN :
				KeyDown = false;
				break;
			case KeyEvent.VK_LEFT :
				KeyLeft = false;
				break;
			case KeyEvent.VK_RIGHT :
				KeyRight = false;
				break;
		}
	}
	
	// 키보드가 타이핑 될때 이벤트 처리하는 곳
	public void keyTyped(KeyEvent e){}
	
	// Runnable Implement 클래스의 스레드 실행영역 
	public void run(){ 
		// 예외옵션 설정으로 에러 방지
		try{
			// 스레드가 무한 루프될 부분
			while(true){ // while 문으로 무한 루프 시키기
				KeyProcess(); // 키보드 입력처리를 하여 x,y 갱신
				repaint(); // 갱신된 x,y값으로 이미지 새로 그리기
				Thread.sleep(20); // 20 milli sec 로 스레드 돌리기 
			}
		} catch (Exception e){
			
		}
	}	
	/* --------- 오버라이드 메서드 영역 끝 ---------- */
	
	
	
	// 키 입력후 좌표값 처리
	public void KeyProcess(){
		
		//키 입력시마다 5만큼의 이동을 시킨다.
		if(KeyUp == true)  y -= 5;
		if(KeyDown == true) y += 5;
		if(KeyLeft == true)  x -= 5;
		if(KeyRight == true) x += 5;
	   
	}	
}