package game.ch2;

import javax.swing.*;
import java.awt.*;

public class Game extends java.applet.Applet {
	public static void main(String[] ar){
		GameFrame fms = new GameFrame();
	}
}

class GameFrame extends JFrame{

	// 창크기
	int f_width = 800;
	int f_height = 600;
		
    // 이미지를 불러오기 위한 툴킷
	Toolkit tk = Toolkit.getDefaultToolkit();
	
    // f15k.png 라는 이미지를 불러옵니다.	
	Image me_img = new ImageIcon(
						this.getClass().getResource("f15k.png")
					).getImage();	
	
	// 초기화 생성자
	GameFrame(){
		
		init();
		start();
	}
 		
	/* 사용자정의 메서드 */
	// 윈도창 초기화
	public void init(){
		setTitle("슈팅 게임 만들기"); // 윈도 타이틀
		setSize(f_width, f_height); //윈도크기
	  
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
	}
	
	
	// 오버라이드 메서드
	public void paint(Graphics g){
		// 0,0 에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
		g.clearRect(0, 0, f_width, f_height);

		//g.drawString("Hello World", 100, 100);
		//프레임에 me_img에 저장된 f15k.png 이미지를  x=100, y=100 좌표로 그려넣습니다.
		g.drawImage(me_img, 100, 100, this);
	}
	
}




