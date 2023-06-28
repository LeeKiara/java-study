package game.ch2;

import javax.swing.*;
import java.awt.*;

public class Game extends java.applet.Applet {
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
	
    // f15k.png ��� �̹����� �ҷ��ɴϴ�.	
	Image me_img = new ImageIcon(
						this.getClass().getResource("f15k.png")
					).getImage();	
	
	// �ʱ�ȭ ������
	GameFrame(){
		
		init();
		start();
	}
 		
	/* ��������� �޼��� */
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
	
	
	// �������̵� �޼���
	public void paint(Graphics g){
		// 0,0 ���� ������ ���� �ػ� ũ�⸸ŭ ȭ���� ����ϴ�.
		g.clearRect(0, 0, f_width, f_height);

		//g.drawString("Hello World", 100, 100);
		//�����ӿ� me_img�� ����� f15k.png �̹�����  x=100, y=100 ��ǥ�� �׷��ֽ��ϴ�.
		g.drawImage(me_img, 100, 100, this);
	}
	
}




