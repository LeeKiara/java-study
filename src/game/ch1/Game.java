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

	// âũ��
	int f_width = 800;
	int f_height = 600;
		
    // �̹����� �ҷ����� ���� ��Ŷ
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	
	// ������
	GameFrame(){
		init(); // ����â �ʱ�ȭ
		start(); // ���� ����
	}
 	
	
	// ����â �ʱ�ȭ
	public void init(){
		setTitle("���� ���� �����"); // ���� Ÿ��Ʋ
		setSize(f_width, f_height); //����ũ��
	  
		Dimension screen = tk.getScreenSize();
	
		int f_xpos = (int)(screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int)(screen.getHeight() / 2 - f_height / 2);
		
		setLocation(f_xpos, f_ypos);
		setResizable(false);
		setVisible(true);
		
		//������ ������ ���� X��ư�� �������� 
		//���α׷��� ���������� �����ϰ� ����� �ݴϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// ���� ����
	public void start(){

	}
}