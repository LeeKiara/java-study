package game.ch4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; // ArrayList�� ���� ����Ʈ �߰�



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
	
	// ĳ������ ��ǥ ����
	int x, y;
	
	//�ټ��� �̻����� �����ϱ� ���� �迭
	ArrayList<Missile> missileList = new ArrayList();
	
    //�̹����� �ҷ����� ���� ��Ŷ
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	// �̹��� ������
	Image characterImg;     // �� ����� �̹���, f15k.png	
	Image missileImg; 	// �̻��� �̹��� ����
	 
	//Ű���� �Է� ó���� ���� ����
	boolean KeyUp = false; 
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	// �̻��� �߻縦 ���� Ű���� �����̽�Ű �Է��� �߰��մϴ�.
	boolean KeySpace = false;
	

	// ���� ������
	Thread th;		
	/* --------- ������� ���� ���� �� --------- */
	
	
	// ������
	GameFrame(){
		
		init();
		start();
	}		
	
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
		
		// �̹��� �ε�
		characterImg = new ImageIcon(
				this.getClass().getResource("f15k.png")
			).getImage();
		
		missileImg = new ImageIcon(
				this.getClass().getResource("Missile.png")
			).getImage(); 
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
	// JFrame derive Ŭ������ �׸��� �Լ�, ���� ������ ���� �� repaint �ÿ� ����
	public void paint(Graphics g){
		drawCharacter(g);
		drawMissile(g);
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
			case KeyEvent.VK_SPACE : // �����̽�Ű �Է� ó�� �߰�
				KeySpace = true;
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
			case KeyEvent.VK_SPACE : // �����̽�Ű �Է� ó�� �߰�
				KeySpace = false;
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
				// Ű���� �Է�ó���� �Ͽ� x,y ����
				keyProcess();
				// �̻��� ����
				missileProcess();
				// ���ŵ� x,y������ �̹��� ���� �׸���
				repaint(); 
				
				// 20 milli sec �� ������ ������
				Thread.sleep(20); 
				
			}
		} catch (Exception e){
			
		}
	}	
	/* --------- �������̵� �޼��� ���� �� ---------- */

	
	
	/* ---------------- ��������� �޼���  ���� --------------- */
	// Ű �Է��� ��ǥ�� ó��
	public void keyProcess(){
		
		//Ű �Է½ø��� 5��ŭ�� �̵��� ��Ų��.
		if(KeyUp == true)  y -= 5;
		if(KeyDown == true) y += 5;
		if(KeyLeft == true)  x -= 5;
		if(KeyRight == true) x += 5;		
	   
	}
	
	public void missileProcess(){ // �̻��� ó�� �޼ҵ�
		if ( KeySpace ){ // �����̽��� Ű ���°� true ��
			missileList.add(new Missile(x, y));    // �ش� �̻��� �߰�
		}
	}
	
	
	// �� ����� �׸���
	public void drawCharacter(Graphics g) {
		// 0,0 ���� ������ ���� �ػ� ũ�⸸ŭ ȭ���� ����ϴ�.
		g.clearRect(0, 0, f_width, f_height);

		//g.drawString("Hello World", 100, 100);
		//�����ӿ� characterImg�� ����� f15k.png �̹�����  x=100, y=100 ��ǥ�� �׷��ֽ��ϴ�.
		g.drawImage(characterImg, x, y, this);		
	}
	
	// �̻��� �׸���
	public void drawMissile(Graphics g){ 	
		for (int i = 0 ; i < missileList.size()  ; ++i){
			
			Missile ms = (missileList.get(i));
			
			// ���� ��ǥ�� �̻��� �׸���.
			// �̹��� ũ�⸦ ������ �̻��� �߻� ��ǥ�� ������.
			g.drawImage(missileImg, ms.pos.x + 150, ms.pos.y + 30, this); 
			// �׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			ms.move();
			
			// �̻����� ȭ�� ������ ������ �̻��� �����
			if ( ms.pos.x > f_width ){ 
				missileList.remove(i); 
			}
		}		
				
	}	
	
	/* ---------------- ��������� �޼���  �� --------------- */
	
	
	
	
	// �̻��� ��ġ �ľ� �� �̵��� ���� Ŭ���� �߰�
	class Missile{  

		//�̻��� ��ǥ ����
		Point pos; 		 
		
		//�̻��� ��ǥ�� �Է� �޴� ������
		Missile(int x, int y){ 
			pos = new Point(x, y); 
		}
		
		//�̻��� �̵��� ���� �޼ҵ�
		public void move(){
			//x ��ǥ�� 10��ŭ �̻��� �̵�
			pos.x += 10; 
		}
	}	
}