package game.ch1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
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
	
	
	// 생성자
	GameFrame(){
		init(); // 윈도창 초기화
		start(); // 게임 시작
	}
 	
	
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
}