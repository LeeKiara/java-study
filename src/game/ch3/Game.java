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

	/* --------- ������� ���� ���� ���� --------- */
	// âũ��
	int f_width = 800;
	int f_height = 600;
	
    //�̹����� �ҷ����� ���� ��Ŷ
	Toolkit tk = Toolkit.getDefaultToolkit();
	
    // f15k.png ��� �̹����� �ҷ��ɴϴ�.	
	Image me_img = new ImageIcon(
						this.getClass().getResource("f15k.png")
					).getImage();	
	
	// ĳ������ ��ǥ ����
	int x, y; 
	 
	//Ű���� �Է� ó���� ���� ����
	boolean KeyUp = false; 
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	
	// ���� ������ ����
	Thread th; 
	/* --------- ������� ���� ���� �� --------- */
	
	
	// ������
	GameFrame(){
		
		init();
		start();
	}
 			
	
	/* ��������� �޼��� */
	// ����â �ʱ�ȭ
	public void init(){
		setTitle("���� ���� �����"); // ���� Ÿ��Ʋ
		setSize(f_width, f_height); //����ũ��
	  
		// ��ũ�� ������� âũ�⸦ ����Ͽ� �߾ӿ� ������ ��.
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
		//Ű���� �̺�Ʈ ����
		addKeyListener(this);
		
		// ���� â�� ������ ����
		th = new Thread(this);  
		th.start();  
	}	
	
	
	
	/* --------- �������̵� �޼��� ���� ���� ---------- */
	// JFrame derive Ŭ������ �׸��� �Լ�
	public void paint(Graphics g){
		// 0,0 ���� ������ ���� �ػ� ũ�⸸ŭ ȭ���� ����ϴ�.
		g.clearRect(0, 0, f_width, f_height);

		//g.drawString("Hello World", 100, 100);
		//�����ӿ� me_img�� ����� f15k.png �̹�����  x=100, y=100 ��ǥ�� �׷��ֽ��ϴ�.
		g.drawImage(me_img, x, y, this);
	}
	
	// KeyListener Implement Ŭ������ �⺻ �޼ҵ� ��
	// Ű���尡 ���������� �̺�Ʈ ó���ϴ� �� 
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
	
	// Ű���尡 �������ٰ� ���������� �̺�Ʈ ó���ϴ� ��
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
	
	// Ű���尡 Ÿ���� �ɶ� �̺�Ʈ ó���ϴ� ��
	public void keyTyped(KeyEvent e){}
	
	// Runnable Implement Ŭ������ ������ ���࿵�� 
	public void run(){ 
		// ���ܿɼ� �������� ���� ����
		try{
			// �����尡 ���� ������ �κ�
			while(true){ // while ������ ���� ���� ��Ű��
				KeyProcess(); // Ű���� �Է�ó���� �Ͽ� x,y ����
				repaint(); // ���ŵ� x,y������ �̹��� ���� �׸���
				Thread.sleep(20); // 20 milli sec �� ������ ������ 
			}
		} catch (Exception e){
			
		}
	}	
	/* --------- �������̵� �޼��� ���� �� ---------- */
	
	
	
	// Ű �Է��� ��ǥ�� ó��
	public void KeyProcess(){
		
		//Ű �Է½ø��� 5��ŭ�� �̵��� ��Ų��.
		if(KeyUp == true)  y -= 5;
		if(KeyDown == true) y += 5;
		if(KeyLeft == true)  x -= 5;
		if(KeyRight == true) x += 5;
	   
	}	
}