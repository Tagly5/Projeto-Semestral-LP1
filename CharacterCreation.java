import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CharacterCreation extends JFrame implements ActionListener{
    
    JPanel namePanel = new JPanel();
	JTextField nameTextfield;

    JPanel classPanel = new JPanel();
    JButton knightClassButton, heraldClassButton, thiefClassButton, sorcererClassButton, clericClassButton;

	ArrayList<JPanel> subPanelsArrayList = new ArrayList<JPanel>();
    
	ArrayList<JButton> charButtons = new ArrayList<JButton>();

    ArrayList<JButton> classesButtons =  new ArrayList<JButton>();
    

	JButton charNameButton, charGenderButton, charClassButton, charFacesButton, charBuildButton;
    
    

    CharacterCreation()
    {
        super("Character Creation");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280, 720);
		this.setLayout(null);

        // Image Setter
        JLabel charImage = new JLabel();
        charImage.setLayout(new FlowLayout());
        charImage.setBounds(1000, -100, 1000, 1000);
        charImage.setIcon(new ImageIcon("charImage.png"));
        charImage.setVisible(true);
        
        JLabel helmImage = new JLabel();
        helmImage.setLayout(new FlowLayout());
        helmImage.setBounds(1004, -196, 1000, 1000);
        helmImage.setIcon(new ImageIcon("helmImage.png"));
        helmImage.setVisible(true);

        JLabel swordImage = new JLabel();
        swordImage.setLayout(null);
        swordImage.setBounds(856, 140, 500, 500);
        swordImage.setIcon(new ImageIcon("swordImage.png"));
        swordImage.setVisible(true);

        charNameButton = new JButton("Name");
        charClassButton = new JButton("Class");
        charGenderButton = new JButton("Gender");
        charFacesButton = new JButton("Faces Presets");
        charBuildButton = new JButton("Build");
        
        charButtons.add(charNameButton);
        charButtons.add(charGenderButton);
        charButtons.add(charClassButton);
        charButtons.add(charFacesButton);
        
        for(int i = 0; i < charButtons.size(); i++)
        {
            charButtons.get(i).setBounds(50,0 + (i*60),200,50);
        }

        for (JButton jButton : charButtons) {
            jButton.addActionListener(this);
			jButton.setFont(new Font("Jet Brains Mono", Font.PLAIN, 15));
			jButton.setFocusable(false);
        }
        JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBounds(50, 150, 300, 500);
        buttonsPanel.setBackground(Color.BLACK);
		buttonsPanel.setLayout(null);

        namePanelHandler();
        classPanelHandler();
        
        
        for(int i = 0; i < charButtons.size(); i++)
        {
            buttonsPanel.add(charButtons.get(i));
        }

        subPanelsArrayList.add(namePanel);
        subPanelsArrayList.add(classPanel);
        
        this.add(helmImage);
        this.add(swordImage);
        this.add(charImage);
        this.add(buttonsPanel);
        this.add(namePanel);
        this.add(classPanel);
		this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == charNameButton)
        {
            for (JPanel panel : subPanelsArrayList) {
                if(panel == namePanel)
                {
                    panel.setVisible(true);
                }
                else panel.setVisible(false);
            }
        }
        else if(e.getSource() == charClassButton)
        {
            for (JPanel panel : subPanelsArrayList) {
                if(panel == classPanel)
                {
                    panel.setVisible(true);
                }
                else panel.setVisible(false);
            }
        }
    }
    public void classPanelHandler()
    {
        knightClassButton = new JButton("Knight");
        heraldClassButton = new JButton("Herald");
        thiefClassButton = new JButton("Thief");
        sorcererClassButton = new JButton("Sorcerer");
        clericClassButton = new JButton("Cleric");


        classesButtons.add(knightClassButton);
        classesButtons.add(heraldClassButton);
        classesButtons.add(thiefClassButton);
        classesButtons.add(sorcererClassButton);
        classesButtons.add(clericClassButton);
        
        classPanel = new JPanel();
		classPanel.setBounds(400, 150, 300, 500);
        classPanel.setBackground(Color.BLUE);
        classPanel.setLayout(null);

        for (JButton jButton : classesButtons) {
            classPanel.add(jButton);
        }
        classPanel.setVisible(false);
        
        for(int i = 0; i < classesButtons.size(); i++)
        {
            classesButtons.get(i).setBounds(50,100 + (i*60),200,50);
        }
    }
    public void namePanelHandler()
    {

        nameTextfield = new JTextField();
        nameTextfield.setBounds(25,10,250,40);
        nameTextfield.setFont(new Font("Jet Brains Mono", Font.PLAIN, 30));
        nameTextfield.setHorizontalAlignment(JTextField.CENTER);
        nameTextfield.setEditable(false);
        nameTextfield.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                    nameTextfield.setEditable(true);
            }});
        nameTextfield.setVisible(true);


        namePanel = new JPanel();
		namePanel.setBounds(400, 150, 300, 500);
        namePanel.setBackground(Color.ORANGE);
        namePanel.setLayout(null);
        namePanel.add(nameTextfield);
        namePanel.setVisible(false);

    }
}