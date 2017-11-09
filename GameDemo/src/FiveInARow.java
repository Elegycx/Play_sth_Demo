import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FiveInARow extends JFrame{
	public void CreateJFrame(String title){
		JFrame jf=new JFrame(title);
		jf.setLayout(null);//窗口内自由摆设
		Container container=jf.getContentPane();
		container.setBackground(Color.gray);
		jf.setVisible(true);
		jf.setSize(1018,1045);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton b[]=new JButton[400];
		int x[]=new int[400];
		int y[]=new int[400];
		int xk=0;
		int yk=0;
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				x[xk]=50*i;
				xk++;
			}
		}
		for(int p=0;p<20;p++){
			for(int q=0;q<20;q++){
				y[yk]=50*q;
				yk++;
			}
		}
		for(int m=0;m<400;m++){
			b[m]=new JButton("");
			b[m].setBounds(x[m], y[m], 50, 50);
			jf.add(b[m]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FiveInARow().CreateJFrame("五子棋");
	}

}
