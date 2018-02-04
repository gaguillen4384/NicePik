/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class cashSystem extends javax.swing.JFrame {
	double totalBurger;
	double totalPizza;
	double totalDrinks;
	double total;
	double[] sumPizza = new double[30];
	double[] sumDrinks = new double[8];
	int pizzaQty1 = 0;
	double subSum1 = 0;
	double subSum2 = 0;
	double subSum3 = 0;
	double subSum4 = 0;
	double subSum5 = 0;
	double subSum6 = 0;
	double subSum7 = 0;
	double subSum8 = 0;
	double subSum9 = 0;
	double subSum10 = 0;
	double subSum11 = 0;
	double subSum12 = 0;
	int qty = 0;
	int qty1 = 0;
	int qty2 = 0;
	int qty3 = 0;
	int qty4 = 0;
	int qty5 = 0;
	int qty6 = 0;
	int qty7 = 0;
	int qty8 = 0;
	int qty9 = 0;
	int qty10 = 0;
	int qty11 = 0;
	public static double paidAmount = 0;

	/**
	 * Creates new form cashSystem
	 */
	public cashSystem() {
		initComponents();
		imageRescaling();

	}

	public void total() {
		total = totalBurger + totalPizza + totalDrinks;
		totalPayableLabel.setText(String.valueOf(total));
	}

	public void imageRescaling() {
		ImageIcon burger1 = new ImageIcon(getClass().getResource("/Images/hamburger.png"));
		Image img1 = burger1.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_1.setIcon(new ImageIcon(img1));

		ImageIcon burger2 = new ImageIcon(getClass().getResource("/Images/bacon-burger.png"));
		Image img2 = burger2.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_2.setIcon(new ImageIcon(img2));

		ImageIcon burger3 = new ImageIcon(getClass().getResource("/Images/BbqChickenSandwich.png"));
		Image img3 = burger3.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_3.setIcon(new ImageIcon(img3));

		ImageIcon burger4 = new ImageIcon(getClass().getResource("/Images/bbqPulledPork.png"));
		Image img4 = burger4.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_4.setIcon(new ImageIcon(img4));

		ImageIcon burger5 = new ImageIcon(getClass().getResource("/Images/chicken&Fish.png"));
		Image img5 = burger5.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_5.setIcon(new ImageIcon(img5));

		ImageIcon burger6 = new ImageIcon(getClass().getResource("/Images/bigMac.png"));
		Image img6 = burger6.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_6.setIcon(new ImageIcon(img6));

		ImageIcon burger7 = new ImageIcon(getClass().getResource("/Images/grilledChickenSandwich.png"));
		Image img7 = burger7.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_7.setIcon(new ImageIcon(img7));

		ImageIcon burger8 = new ImageIcon(getClass().getResource("/Images/grilledVege.png"));
		Image img8 = burger8.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_8.setIcon(new ImageIcon(img8));

		ImageIcon burger9 = new ImageIcon(getClass().getResource("/Images/opener-burger.png"));
		Image img9 = burger9.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_9.setIcon(new ImageIcon(img9));

		ImageIcon burger10 = new ImageIcon(getClass().getResource("/Images/premiumCrispyChicken.png"));
		Image img10 = burger10.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_10.setIcon(new ImageIcon(img10));

		ImageIcon burger11 = new ImageIcon(getClass().getResource("/Images/rustlersFlameGrilledChickenSandwich.png"));
		Image img11 = burger11.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_11.setIcon(new ImageIcon(img11));

		ImageIcon burger12 = new ImageIcon(getClass().getResource("/Images/chikenBurger.png"));
		Image img12 = burger12.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		burger_12.setIcon(new ImageIcon(img12));

		ImageIcon pizz1 = new ImageIcon(getClass().getResource("/Images/margaritaPizza.png"));
		Image pizImg1 = pizz1.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza1.setIcon(new ImageIcon(pizImg1));

		ImageIcon pizz2 = new ImageIcon(getClass().getResource("/Images/tikaBoti.png"));
		Image pizImg2 = pizz2.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza2.setIcon(new ImageIcon(pizImg2));

		ImageIcon pizz3 = new ImageIcon(getClass().getResource("/Images/cheesePizza.png"));
		Image pizImg3 = pizz3.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza3.setIcon(new ImageIcon(pizImg3));

		ImageIcon pizz4 = new ImageIcon(getClass().getResource("/Images/pizza_PNG7149.png"));
		Image pizImg4 = pizz4.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza4.setIcon(new ImageIcon(pizImg4));

		ImageIcon pizz5 = new ImageIcon(getClass().getResource("/Images/pizza_PNG7151.png"));
		Image pizImg5 = pizz5.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza5.setIcon(new ImageIcon(pizImg5));

		ImageIcon pizz6 = new ImageIcon(getClass().getResource("/Images/pizza2.png"));
		Image pizImg6 = pizz6.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza6.setIcon(new ImageIcon(pizImg6));

		ImageIcon pizz7 = new ImageIcon(getClass().getResource("/Images/pizza3.png"));
		Image pizImg7 = pizz7.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza7.setIcon(new ImageIcon(pizImg7));

		ImageIcon pizz8 = new ImageIcon(getClass().getResource("/Images/pizza4.png"));
		Image pizImg8 = pizz8.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza8.setIcon(new ImageIcon(pizImg8));

		ImageIcon pizz9 = new ImageIcon(getClass().getResource("/Images/pizza5.png"));
		Image pizImg9 = pizz9.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza9.setIcon(new ImageIcon(pizImg9));

		ImageIcon pizz10 = new ImageIcon(getClass().getResource("/Images/pizza6.png"));
		Image pizImg10 = pizz10.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		pizza10.setIcon(new ImageIcon(pizImg10));

		ImageIcon cocaCola = new ImageIcon(getClass().getResource("/Images/coca-cola-logo-png-22.png"));
		Image cocaImg = cocaCola.getImage().getScaledInstance(270, 130, Image.SCALE_SMOOTH);
		jLabel21.setIcon(new ImageIcon(cocaImg));

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		burger400 = new javax.swing.JCheckBox();
		burger_1 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jSpinner1 = new javax.swing.JSpinner();
		jLabel7 = new javax.swing.JLabel();
		burger_2 = new javax.swing.JLabel();
		burger450 = new javax.swing.JCheckBox();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jSpinner2 = new javax.swing.JSpinner();
		burger_3 = new javax.swing.JLabel();
		burger500 = new javax.swing.JCheckBox();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jSpinner3 = new javax.swing.JSpinner();
		burger_4 = new javax.swing.JLabel();
		burger350 = new javax.swing.JCheckBox();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jSpinner4 = new javax.swing.JSpinner();
		burger_5 = new javax.swing.JLabel();
		burger300 = new javax.swing.JCheckBox();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jSpinner5 = new javax.swing.JSpinner();
		burger_6 = new javax.swing.JLabel();
		burger425 = new javax.swing.JCheckBox();
		jLabel22 = new javax.swing.JLabel();
		jSpinner6 = new javax.swing.JSpinner();
		jLabel23 = new javax.swing.JLabel();
		burger475 = new javax.swing.JCheckBox();
		burger_7 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jSpinner7 = new javax.swing.JSpinner();
		burger600 = new javax.swing.JCheckBox();
		burger_8 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jSpinner8 = new javax.swing.JSpinner();
		burger525 = new javax.swing.JCheckBox();
		burger_9 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jSpinner9 = new javax.swing.JSpinner();
		burger550 = new javax.swing.JCheckBox();
		burger_10 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jSpinner10 = new javax.swing.JSpinner();
		burger510 = new javax.swing.JCheckBox();
		burger_11 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jSpinner11 = new javax.swing.JSpinner();
		burger540 = new javax.swing.JCheckBox();
		burger_12 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jSpinner12 = new javax.swing.JSpinner();
		jSeparator1 = new javax.swing.JSeparator();
		jPanel5 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		subSumLabel = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		checkPizza800 = new javax.swing.JCheckBox();
		pizza1 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		s800 = new javax.swing.JSpinner();
		m800 = new javax.swing.JSpinner();
		l800 = new javax.swing.JSpinner();
		checkPizza750 = new javax.swing.JCheckBox();
		pizza2 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		s750 = new javax.swing.JSpinner();
		m750 = new javax.swing.JSpinner();
		jLabel27 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		l750 = new javax.swing.JSpinner();
		checkPizza850 = new javax.swing.JCheckBox();
		pizza3 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		s850 = new javax.swing.JSpinner();
		m850 = new javax.swing.JSpinner();
		jLabel39 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		l850 = new javax.swing.JSpinner();
		checkPizza670 = new javax.swing.JCheckBox();
		pizza4 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		s670 = new javax.swing.JSpinner();
		m670 = new javax.swing.JSpinner();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		l670 = new javax.swing.JSpinner();
		checkPizza700 = new javax.swing.JCheckBox();
		pizza5 = new javax.swing.JLabel();
		jLabel48 = new javax.swing.JLabel();
		s700 = new javax.swing.JSpinner();
		m700 = new javax.swing.JSpinner();
		jLabel49 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		l700 = new javax.swing.JSpinner();
		jLabel52 = new javax.swing.JLabel();
		pizza6 = new javax.swing.JLabel();
		s650 = new javax.swing.JSpinner();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		checkPizza650 = new javax.swing.JCheckBox();
		l650 = new javax.swing.JSpinner();
		m650 = new javax.swing.JSpinner();
		checkPizza830 = new javax.swing.JCheckBox();
		pizza7 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		s830 = new javax.swing.JSpinner();
		m830 = new javax.swing.JSpinner();
		jLabel57 = new javax.swing.JLabel();
		jLabel58 = new javax.swing.JLabel();
		l830 = new javax.swing.JSpinner();
		checkPizza950 = new javax.swing.JCheckBox();
		pizza8 = new javax.swing.JLabel();
		jLabel60 = new javax.swing.JLabel();
		s950 = new javax.swing.JSpinner();
		m950 = new javax.swing.JSpinner();
		jLabel61 = new javax.swing.JLabel();
		jLabel62 = new javax.swing.JLabel();
		l950 = new javax.swing.JSpinner();
		checkPizza900 = new javax.swing.JCheckBox();
		pizza9 = new javax.swing.JLabel();
		jLabel64 = new javax.swing.JLabel();
		s900 = new javax.swing.JSpinner();
		m900 = new javax.swing.JSpinner();
		jLabel65 = new javax.swing.JLabel();
		jLabel66 = new javax.swing.JLabel();
		l900 = new javax.swing.JSpinner();
		checkPizza930 = new javax.swing.JCheckBox();
		pizza10 = new javax.swing.JLabel();
		jLabel68 = new javax.swing.JLabel();
		s930 = new javax.swing.JSpinner();
		m930 = new javax.swing.JSpinner();
		jLabel69 = new javax.swing.JLabel();
		jLabel70 = new javax.swing.JLabel();
		l930 = new javax.swing.JSpinner();
		jSeparator2 = new javax.swing.JSeparator();
		jPanel6 = new javax.swing.JPanel();
		jLabel71 = new javax.swing.JLabel();
		totalPizzaLabel = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		amountPaidField = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		noteLabel = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		totalPayableLabel = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		changeLabel = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jCheckBox1 = new javax.swing.JCheckBox();
		cokeRegular = new javax.swing.JSpinner();
		jCheckBox2 = new javax.swing.JCheckBox();
		pepsiRegular = new javax.swing.JSpinner();
		jCheckBox3 = new javax.swing.JCheckBox();
		spriteRegular = new javax.swing.JSpinner();
		jCheckBox4 = new javax.swing.JCheckBox();
		stringRegular = new javax.swing.JSpinner();
		jCheckBox5 = new javax.swing.JCheckBox();
		coke1500 = new javax.swing.JSpinner();
		jCheckBox6 = new javax.swing.JCheckBox();
		pepsi1500 = new javax.swing.JSpinner();
		jCheckBox7 = new javax.swing.JCheckBox();
		sprite1500 = new javax.swing.JSpinner();
		jCheckBox8 = new javax.swing.JCheckBox();
		cups = new javax.swing.JSpinner();
		jLabel21 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jLabel47 = new javax.swing.JLabel();
		totalDrinksLabel = new javax.swing.JLabel();
		
		
		// For the customer you just need to make the [0]
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		GraphicsDevice[] gs = ge.getScreenDevices();
		
		GraphicsDevice gd = gs[0];
		GraphicsConfiguration[] gc = gd.getConfigurations();
		Rectangle gcBounds = gc[0].getBounds();
		int xoffs = gcBounds.x;
		int yoffs = gcBounds.y;
		
		this.setLocation(( 350) + xoffs, ( 200) + yoffs);
		
		

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

		burger400.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger400ActionPerformed(evt);
			}
		});

		burger_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bigMac.png"))); // NOI18N
		burger_1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				burger_1MouseClicked(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("Grand Angus");

		jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner1.setEnabled(false);
		jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner1StateChanged(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel7.setText("QTY:");

		burger450.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger450ActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("Bacon Burger");

		jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel11.setText("QTY:");

		jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner2.setEnabled(false);
		jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner2StateChanged(evt);
			}
		});

		burger500.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger500ActionPerformed(evt);
			}
		});

		jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("BBQ Veggie");

		jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel14.setText("QTY:");

		jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner3.setEnabled(false);
		jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner3StateChanged(evt);
			}
		});

		burger350.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger350ActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("Grilled Chicken Rs.500");

		jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel17.setText("QTY:");

		jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner4.setEnabled(false);
		jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner4StateChanged(evt);
			}
		});

		burger300.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger300ActionPerformed(evt);
			}
		});

		jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel19.setText("Chicken Veggie");

		jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel20.setText("QTY:");

		jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner5.setEnabled(false);
		jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner5StateChanged(evt);
			}
		});

		burger425.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger425ActionPerformed(evt);
			}
		});

		jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel22.setText("Double Stack");

		jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner6.setEnabled(false);
		jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner6StateChanged(evt);
			}
		});

		jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel23.setText("QTY:");

		burger475.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger475ActionPerformed(evt);
			}
		});

		jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel25.setText("Big Fish");

		jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel26.setText("QTY:");

		jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner7.setEnabled(false);
		jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner7StateChanged(evt);
			}
		});

		burger600.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger600ActionPerformed(evt);
			}
		});

		jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel28.setText("Double Stack");

		jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel29.setText("QTY:");

		jSpinner8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner8.setEnabled(false);
		jSpinner8.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner8StateChanged(evt);
			}
		});

		burger525.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger525ActionPerformed(evt);
			}
		});

		jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel31.setText("Hawaiian");

		jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel32.setText("QTY:");

		jSpinner9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner9.setEnabled(false);
		jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner9StateChanged(evt);
			}
		});

		burger550.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger550ActionPerformed(evt);
			}
		});

		jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel34.setText("Double BBQ");

		jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel35.setText("QTY:");

		jSpinner10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner10.setEnabled(false);
		jSpinner10.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner10StateChanged(evt);
			}
		});

		burger510.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger510ActionPerformed(evt);
			}
		});

		jLabel37.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel37.setText("Hash & Cheese");

		jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel38.setText("QTY:");

		jSpinner11.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner11.setEnabled(false);
		jSpinner11.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner11StateChanged(evt);
			}
		});

		burger540.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				burger540ActionPerformed(evt);
			}
		});

		jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel40.setText("Grilled Chicken Rs.500");

		jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
		jLabel41.setText("QTY:");

		jSpinner12.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		jSpinner12.setEnabled(false);
		jSpinner12.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSpinner12StateChanged(evt);
			}
		});

		jPanel5.setBackground(new Color(255, 99, 71));

		jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("SUB-TOTAL");

		subSumLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
		subSumLabel.setForeground(new java.awt.Color(255, 255, 255));
		subSumLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		subSumLabel.setText("0.0");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(subSumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(subSumLabel))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jSeparator1)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger400)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_1, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel7)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger475)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_7, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel26)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45,
										Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger450)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_2, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel11)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger600)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_8, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel29)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(58, 58, 58)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger500)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_3, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel14)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger525)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_9, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel32)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(77, 77, 77)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger350)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_4, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel17)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger550)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_10, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel35)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(72, 72, 72)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger300)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_5, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel20)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger510)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_11, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel38)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(82, 82, 82)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger425)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_6, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel23)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(burger540)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(burger_12, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel41)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(24, 24, 24))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout.createSequentialGroup().addContainerGap()
										.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { jSpinner1, jSpinner10, jSpinner11, jSpinner12, jSpinner2, jSpinner3,
						jSpinner4, jSpinner5, jSpinner6, jSpinner7, jSpinner8, jSpinner9 });

		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(burger_6, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
												.addComponent(burger425)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel22)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel23)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(burger_5, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
												.addComponent(burger300)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel19)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel20)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(burger_4, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
												.addComponent(burger350)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel16)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel17)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(burger_3, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
												.addComponent(burger500)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel13)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel14)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(burger_2, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
												.addComponent(burger450)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel10)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel11)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(burger_1, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
												.addComponent(burger400)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel9)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel7))))
						.addGap(48, 48, 48)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(burger_12, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(35, 35, 35)
														.addComponent(burger540)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel40)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel41))
										.addGap(25, 25, 25))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(burger_11, javax.swing.GroupLayout.PREFERRED_SIZE,
																95, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGap(35, 35, 35).addComponent(burger510)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel37)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jSpinner11,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel38)))
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(burger_10, javax.swing.GroupLayout.PREFERRED_SIZE,
																95, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGap(35, 35, 35).addComponent(burger550)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel34)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jSpinner10,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel35)))
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(burger_9, javax.swing.GroupLayout.PREFERRED_SIZE,
																95, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGap(35, 35, 35).addComponent(burger525)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel31)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jSpinner9,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel32)))
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(burger_8, javax.swing.GroupLayout.PREFERRED_SIZE,
																95, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGap(35, 35, 35).addComponent(burger600)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel28)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jSpinner8,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel29)))
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(burger_7, javax.swing.GroupLayout.PREFERRED_SIZE,
																95, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGap(35, 35, 35).addComponent(burger475)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel25)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jSpinner7,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel26))))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(10, 10, 10)));

		jTabbedPane1.addTab("Burgers", jPanel2);

		checkPizza800.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza800ActionPerformed(evt);
			}
		});

		pizza1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fajita.jpg"))); // NOI18N

		jLabel12.setText("S:");

		jLabel15.setText("M:");

		jLabel18.setText("L:");

		s800.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s800.setEnabled(false);
		s800.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s800StateChanged(evt);
			}
		});

		m800.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m800.setEnabled(false);
		m800.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m800StateChanged(evt);
			}
		});

		l800.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l800.setEnabled(false);
		l800.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l800StateChanged(evt);
			}
		});

		checkPizza750.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza750ActionPerformed(evt);
			}
		});

		jLabel24.setText("S:");

		s750.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s750.setEnabled(false);
		s750.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s750StateChanged(evt);
			}
		});

		m750.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m750.setEnabled(false);
		m750.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m750StateChanged(evt);
			}
		});

		jLabel27.setText("M:");

		jLabel30.setText("L:");

		l750.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l750.setEnabled(false);
		l750.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l750StateChanged(evt);
			}
		});

		checkPizza850.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza850ActionPerformed(evt);
			}
		});

		pizza3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fajita.jpg"))); // NOI18N

		jLabel36.setText("S:");

		s850.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s850.setEnabled(false);
		s850.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s850StateChanged(evt);
			}
		});

		m850.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m850.setEnabled(false);
		m850.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m850StateChanged(evt);
			}
		});

		jLabel39.setText("M:");

		jLabel42.setText("L:");

		l850.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l850.setEnabled(false);
		l850.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l850StateChanged(evt);
			}
		});

		checkPizza670.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza670ActionPerformed(evt);
			}
		});

		pizza4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cheesePizza.png"))); // NOI18N

		jLabel44.setText("S:");

		s670.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s670.setEnabled(false);
		s670.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s670StateChanged(evt);
			}
		});

		m670.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m670.setEnabled(false);
		m670.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m670StateChanged(evt);
			}
		});

		jLabel45.setText("M:");

		jLabel46.setText("L:");

		l670.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l670.setEnabled(false);
		l670.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l670StateChanged(evt);
			}
		});

		checkPizza700.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza700ActionPerformed(evt);
			}
		});

		jLabel48.setText("S:");

		s700.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s700.setEnabled(false);
		s700.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s700StateChanged(evt);
			}
		});

		m700.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m700.setEnabled(false);
		m700.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m700StateChanged(evt);
			}
		});

		jLabel49.setText("M:");

		jLabel50.setText("L:");

		l700.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l700.setEnabled(false);
		l700.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l700StateChanged(evt);
			}
		});

		jLabel52.setText("S:");

		s650.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s650.setEnabled(false);
		s650.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s650StateChanged(evt);
			}
		});

		jLabel53.setText("M:");

		jLabel54.setText("L:");

		checkPizza650.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza650ActionPerformed(evt);
			}
		});

		l650.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l650.setEnabled(false);
		l650.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l650StateChanged(evt);
			}
		});

		m650.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m650.setEnabled(false);
		m650.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m650StateChanged(evt);
			}
		});

		checkPizza830.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza830ActionPerformed(evt);
			}
		});

		jLabel56.setText("S:");

		s830.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s830.setEnabled(false);
		s830.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s830StateChanged(evt);
			}
		});

		m830.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m830.setEnabled(false);
		m830.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m830StateChanged(evt);
			}
		});

		jLabel57.setText("M:");

		jLabel58.setText("L:");

		l830.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l830.setEnabled(false);
		l830.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l830StateChanged(evt);
			}
		});

		checkPizza950.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza950ActionPerformed(evt);
			}
		});

		jLabel60.setText("S:");

		s950.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s950.setEnabled(false);
		s950.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s950StateChanged(evt);
			}
		});

		m950.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m950.setEnabled(false);
		m950.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m950StateChanged(evt);
			}
		});

		jLabel61.setText("M:");

		jLabel62.setText("L:");

		l950.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l950.setEnabled(false);
		l950.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l950StateChanged(evt);
			}
		});

		checkPizza900.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza900ActionPerformed(evt);
			}
		});

		jLabel64.setText("S:");

		s900.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s900.setEnabled(false);
		s900.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s900StateChanged(evt);
			}
		});

		m900.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m900.setEnabled(false);
		m900.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m900StateChanged(evt);
			}
		});

		jLabel65.setText("M:");

		jLabel66.setText("L:");

		l900.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l900.setEnabled(false);
		l900.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l900StateChanged(evt);
			}
		});

		checkPizza930.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkPizza930ActionPerformed(evt);
			}
		});

		jLabel68.setText("S:");

		s930.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		s930.setEnabled(false);
		s930.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				s930StateChanged(evt);
			}
		});

		m930.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		m930.setEnabled(false);
		m930.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				m930StateChanged(evt);
			}
		});

		jLabel69.setText("M:");

		jLabel70.setText("L:");

		l930.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
		l930.setEnabled(false);
		l930.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				l930StateChanged(evt);
			}
		});

		jPanel6.setBackground(new java.awt.Color(204, 0, 204));

		jLabel71.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
		jLabel71.setForeground(new java.awt.Color(255, 255, 255));
		jLabel71.setText("SUB-TOTAL");

		totalPizzaLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
		totalPizzaLabel.setForeground(new java.awt.Color(255, 255, 255));
		totalPizzaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		totalPizzaLabel.setText("0.0");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel71)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(totalPizzaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel6Layout.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE)
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel71).addComponent(totalPizzaLabel))
								.addContainerGap()));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator2)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addGap(32, 32, 32)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
										.createSequentialGroup().addComponent(checkPizza650)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza6, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel53)
												.addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(m650, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(l650, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(s650, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
										.createSequentialGroup().addComponent(checkPizza800)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
														.createSequentialGroup()
														.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE,
																13, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(s800, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
														.createSequentialGroup()
														.addGroup(jPanel3Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel15).addComponent(jLabel18,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel3Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(l800,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(m800,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout.createSequentialGroup().addComponent(checkPizza750)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza2, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel27)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m750, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel30,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l750,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel24,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s750,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
										.createSequentialGroup().addComponent(checkPizza830)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza7, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel57)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m830, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel58,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l830,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel56,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s830,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addGap(69, 69, 69)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(checkPizza850)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza3, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel39)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m850, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel42,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l850,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel36,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s850,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(checkPizza950)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza8, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel61)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m950, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel62,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l950,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel60,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s950,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addGap(81, 81, 81)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(checkPizza670)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza4, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel45)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m670, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel46,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l670,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel44,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s670,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(checkPizza900)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza9, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel65)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m900, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel66,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l900,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel64,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s900,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addGap(61, 61, 61)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(checkPizza700)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza5, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel49)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m700, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel50,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l700,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel48,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s700,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(checkPizza930)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pizza10, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel69)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(m930, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel70,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(l930,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel68,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 19,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(s930,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 40,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addGap(41, 41, 41))
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jPanel6,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { pizza1, pizza10,
				pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9 });

		jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { l650, l670, l700, l750, l800, l830, l850, l900, l930, l950, m650, m670, m700,
						m750, m800, m830, m850, m900, m930, m950, s650, s670, s700, s750, s800, s830, s850, s900, s930,
						s950 });

		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(41, 41, 41).addComponent(checkPizza800))
						.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(pizza2,
										javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel24).addComponent(s750,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(m750, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel27))
										.addGap(12, 12, 12)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel30).addComponent(l750,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30)
										.addComponent(checkPizza750))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel12)
												.addComponent(s800, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(m800, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel15))
										.addGap(12, 12, 12)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel18).addComponent(l800,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(pizza3,
										javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel36)
												.addComponent(s850, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(m850, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel39))
										.addGap(12, 12, 12)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel42).addComponent(l850,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30)
										.addComponent(checkPizza850))
								.addComponent(pizza1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(pizza4,
										javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel44).addComponent(s670,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(m670, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel45))
										.addGap(12, 12, 12)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel46).addComponent(l670,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30)
										.addComponent(checkPizza670))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(pizza5,
										javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel48)
												.addComponent(s700, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(m700, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel49))
										.addGap(12, 12, 12)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel50).addComponent(l700,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30)
										.addComponent(checkPizza700)))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
						.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(53, 53, 53)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(pizza6,
										javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30)
										.addComponent(checkPizza650))
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4)
														.addComponent(pizza7, javax.swing.GroupLayout.PREFERRED_SIZE,
																74, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30)
														.addComponent(checkPizza830))
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(jPanel3Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel3Layout.createSequentialGroup()
																		.addGap(4, 4, 4).addComponent(pizza8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				74,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel3Layout.createSequentialGroup()
																		.addGap(30, 30, 30).addComponent(checkPizza950))
																.addGroup(jPanel3Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(jPanel3Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(jPanel3Layout
																						.createSequentialGroup()
																						.addGap(4, 4, 4)
																						.addComponent(pizza9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								74,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(jPanel3Layout
																						.createSequentialGroup()
																						.addGap(30, 30, 30)
																						.addComponent(checkPizza900))
																				.addGroup(jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(jPanel3Layout
																								.createParallelGroup(
																										javax.swing.GroupLayout.Alignment.LEADING)
																								.addGroup(jPanel3Layout
																										.createSequentialGroup()
																										.addGap(4, 4, 4)
																										.addComponent(
																												pizza10,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												74,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGroup(jPanel3Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel68)
																														.addComponent(
																																s930,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																m930,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel69))
																										.addGap(12, 12,
																												12)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel70)
																														.addComponent(
																																l930,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																								.addGroup(jPanel3Layout
																										.createSequentialGroup()
																										.addGap(30, 30,
																												30)
																										.addComponent(
																												checkPizza930)))
																						.addGroup(jPanel3Layout
																								.createSequentialGroup()
																								.addGroup(jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jLabel64)
																										.addComponent(
																												s900,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addGroup(jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												m900,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jLabel65))
																								.addGap(12, 12, 12)
																								.addGroup(jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jLabel66)
																										.addComponent(
																												l900,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
																		.addGroup(jPanel3Layout.createSequentialGroup()
																				.addGroup(jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel60)
																						.addComponent(s950,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addGroup(jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(m950,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel61))
																				.addGap(12, 12, 12)
																				.addGroup(jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel62)
																						.addComponent(l950,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addGroup(jPanel3Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(jLabel56).addComponent(s830,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel3Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(m830,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jLabel57))
																.addGap(12, 12, 12)
																.addGroup(jPanel3Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(jLabel58).addComponent(l830,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel52).addComponent(s650,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(m650, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel53))
												.addGap(12, 12, 12)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel54).addComponent(l650,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGap(49, 49, 49)
						.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { pizza1, pizza10, pizza2,
				pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9 });

		jTabbedPane1.addTab("Pizza", jPanel3);

		jLabel5.setIcon(new ImageIcon(cashSystem.class.getResource("/Images/letscruise.png"))); // NOI18N

		jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
		jLabel8.setText("Amount Paid");

		amountPaidField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
		amountPaidField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		amountPaidField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
				java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.white,
				java.awt.Color.white));

		jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		jButton1.setText("Charge");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		noteLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
		noteLabel.setForeground(new java.awt.Color(255, 0, 51));
		noteLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel4Layout.createSequentialGroup()
												.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(amountPaidField, javax.swing.GroupLayout.PREFERRED_SIZE,
														200, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(noteLabel, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 424,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(amountPaidField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)));

		jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { amountPaidField, jButton1, jLabel8 });

		jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		totalPayableLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		totalPayableLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		totalPayableLabel.setText("0.0");

		jLabel33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		jLabel33.setText("Total Payable");

		jLabel43.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		jLabel43.setText("Change");

		changeLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		changeLabel.setText("0.0");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel33).addComponent(jLabel43))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(totalPayableLabel, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 101,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(changeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
						.addGap(22, 22, 22)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(totalPayableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("SansSerif", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
		jPanel9.setForeground(new java.awt.Color(102, 102, 102));

		jCheckBox1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox1.setText("Coke(Regular)");
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

		cokeRegular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		cokeRegular.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		cokeRegular.setEnabled(false);
		cokeRegular.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cokeRegularStateChanged(evt);
			}
		});

		jCheckBox2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox2.setText("Pepsi(Regular)");
		jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox2ActionPerformed(evt);
			}
		});

		pepsiRegular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		pepsiRegular.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		pepsiRegular.setEnabled(false);
		pepsiRegular.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				pepsiRegularStateChanged(evt);
			}
		});

		jCheckBox3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox3.setText("Sprite(Regular)");
		jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox3ActionPerformed(evt);
			}
		});

		spriteRegular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		spriteRegular.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		spriteRegular.setEnabled(false);
		spriteRegular.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spriteRegularStateChanged(evt);
			}
		});

		jCheckBox4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox4.setText("String(Regular)");
		jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox4ActionPerformed(evt);
			}
		});

		stringRegular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		stringRegular.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		stringRegular.setEnabled(false);
		stringRegular.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				stringRegularStateChanged(evt);
			}
		});

		jCheckBox5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox5.setText("Coke(1.5 LTR)");
		jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox5ActionPerformed(evt);
			}
		});

		coke1500.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		coke1500.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		coke1500.setEnabled(false);
		coke1500.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				coke1500StateChanged(evt);
			}
		});

		jCheckBox6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox6.setText("Pepsi(1.5 LTR)");
		jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox6ActionPerformed(evt);
			}
		});

		pepsi1500.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		pepsi1500.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		pepsi1500.setEnabled(false);
		pepsi1500.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				pepsi1500StateChanged(evt);
			}
		});

		jCheckBox7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox7.setText("Sprite(1.5 LTR)");
		jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox7ActionPerformed(evt);
			}
		});

		sprite1500.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		sprite1500.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		sprite1500.setEnabled(false);
		sprite1500.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				sprite1500StateChanged(evt);
			}
		});

		jCheckBox8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jCheckBox8.setText("Cups");
		jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox8ActionPerformed(evt);
			}
		});

		cups.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		cups.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
		cups.setEnabled(false);
		cups.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cupsStateChanged(evt);
			}
		});

		jPanel8.setBackground(new Color(255, 99, 71));

		jLabel47.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
		jLabel47.setForeground(new java.awt.Color(255, 255, 255));
		jLabel47.setText("SUB-TOTAL");

		totalDrinksLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
		totalDrinksLabel.setForeground(new java.awt.Color(255, 255, 255));
		totalDrinksLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		totalDrinksLabel.setText("0.0");

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jLabel47)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(totalDrinksLabel).addContainerGap()));

		jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { jLabel47, totalDrinksLabel });

		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel8Layout.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE)
								.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel47).addComponent(totalDrinksLabel))
								.addContainerGap()));

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel9Layout.createSequentialGroup()
								.addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(19, 19, 19))
				.addGroup(jPanel9Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel9Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCheckBox6).addGap(18, 18, 18)
								.addComponent(pepsi1500, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCheckBox3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(spriteRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCheckBox4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(stringRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCheckBox5)
										.addGap(18, 18, 18).addComponent(coke1500,
												javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel9Layout.createSequentialGroup()
								.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jCheckBox1).addComponent(jCheckBox2))
								.addGap(18, 18, 18)
								.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(cokeRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(pepsiRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCheckBox8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cups, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCheckBox7)
										.addGap(18, 18, 18).addComponent(sprite1500,
												javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(jPanel8,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { jCheckBox1, jCheckBox2,
				jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6, jCheckBox7, jCheckBox8 });

		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox1).addComponent(cokeRegular,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox2).addComponent(pepsiRegular,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox3).addComponent(spriteRegular,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox4).addComponent(stringRegular,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox5).addComponent(coke1500, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox6).addComponent(pepsi1500,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox7).addComponent(sprite1500,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox8).addComponent(cups, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
								.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void burger_1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_burger_1MouseClicked
		// TODO add your handling code here:
	}// GEN-LAST:event_burger_1MouseClicked

	private void burger400ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger400ActionPerformed
		// TODO add your handling code here:
		if (burger400.isSelected()) {
			jSpinner1.setEnabled(true);
			subSum1 = subSum1 + 400;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner1.setEnabled(false);
			jSpinner1.setValue(1);
			subSum1 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));

		}
		total();
	}// GEN-LAST:event_burger400ActionPerformed

	private void burger450ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger450ActionPerformed
		// TODO add your handling code here:
		if (burger450.isSelected()) {
			jSpinner2.setEnabled(true);
			subSum2 = subSum2 + 450;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner2.setEnabled(false);
			jSpinner2.setValue(1);
			subSum2 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));

		}
		total();
	}// GEN-LAST:event_burger450ActionPerformed

	private void burger500ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger500ActionPerformed
		// TODO add your handling code here:
		if (burger500.isSelected()) {
			jSpinner3.setEnabled(true);
			subSum3 = subSum3 + 500;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner3.setEnabled(false);
			jSpinner3.setValue(1);
			subSum3 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger500ActionPerformed

	private void burger350ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger350ActionPerformed
		// TODO add your handling code here:
		if (burger350.isSelected()) {
			jSpinner4.setEnabled(true);
			subSum4 = subSum4 + 350;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner4.setEnabled(false);
			jSpinner4.setValue(1);
			subSum4 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger350ActionPerformed

	private void burger300ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger300ActionPerformed
		// TODO add your handling code here:
		if (burger300.isSelected()) {
			jSpinner5.setEnabled(true);
			subSum5 = subSum5 + 300;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner5.setEnabled(false);
			jSpinner5.setValue(1);
			subSum5 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger300ActionPerformed

	private void burger425ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger425ActionPerformed
		// TODO add your handling code here:
		if (burger425.isSelected()) {
			jSpinner6.setEnabled(true);
			subSum6 = subSum6 + 425;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner6.setEnabled(false);
			jSpinner6.setValue(1);
			subSum6 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger425ActionPerformed

	private void burger475ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger475ActionPerformed
		// TODO add your handling code here:
		if (burger475.isSelected()) {
			jSpinner7.setEnabled(true);
			subSum7 = subSum7 + 475;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner7.setEnabled(false);
			jSpinner7.setValue(1);
			subSum7 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger475ActionPerformed

	private void burger600ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger600ActionPerformed
		// TODO add your handling code here:
		if (burger600.isSelected()) {
			jSpinner8.setEnabled(true);
			subSum8 = subSum8 + 600;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner8.setEnabled(false);
			jSpinner8.setValue(1);
			subSum8 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger600ActionPerformed

	private void burger525ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger525ActionPerformed
		// TODO add your handling code here:
		if (burger525.isSelected()) {
			jSpinner9.setEnabled(true);
			subSum9 = subSum9 + 525;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner9.setEnabled(false);
			jSpinner9.setValue(1);
			subSum9 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger525ActionPerformed

	private void burger550ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger550ActionPerformed
		// TODO add your handling code here:
		if (burger550.isSelected()) {
			jSpinner10.setEnabled(true);
			subSum10 = subSum10 + 550;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner10.setEnabled(false);
			jSpinner10.setValue(1);
			subSum10 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger550ActionPerformed

	private void burger510ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger510ActionPerformed
		// TODO add your handling code here:
		if (burger510.isSelected()) {
			jSpinner11.setEnabled(true);
			subSum11 = subSum11 + 510;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner11.setEnabled(false);
			jSpinner11.setValue(1);
			subSum11 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger510ActionPerformed

	private void burger540ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_burger540ActionPerformed
		// TODO add your handling code here:
		if (burger540.isSelected()) {
			jSpinner12.setEnabled(true);
			subSum12 = subSum12 + 540;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		} else {
			jSpinner12.setEnabled(false);
			jSpinner12.setValue(1);
			subSum12 = 0;
			totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
					+ subSum10 + subSum11 + subSum12;
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_burger540ActionPerformed

	private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner1StateChanged
		// TODO add your handling code here:
		double spinRate1 = 400;
		if (burger400.isSelected()) {
			int preQty;
			preQty = (Integer) jSpinner1.getValue();
			if (preQty > qty) {
				qty = preQty;
				subSum1 = spinRate1 * preQty;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty <= qty) {
				qty = preQty;
				subSum1 = spinRate1 * preQty;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
			total();
		}
		total();
	}// GEN-LAST:event_jSpinner1StateChanged

	private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner2StateChanged
		// TODO add your handling code here:
		double spinRate2 = 450;
		if (burger450.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner2.getValue();
			if (preQty1 > qty1) {
				qty1 = preQty1;
				subSum2 = spinRate2 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty1) {
				qty1 = preQty1;
				subSum2 = spinRate2 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner2StateChanged

	private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner3StateChanged
		// TODO add your handling code here:
		double spinRate3 = 500;
		if (burger500.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner3.getValue();
			if (preQty1 > qty2) {
				qty2 = preQty1;
				subSum3 = spinRate3 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty2) {
				qty2 = preQty1;
				subSum3 = spinRate3 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner3StateChanged

	private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner4StateChanged
		// TODO add your handling code here:
		double spinRate4 = 350;
		if (burger350.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner4.getValue();
			if (preQty1 > qty3) {
				qty3 = preQty1;
				subSum4 = spinRate4 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty3) {
				qty3 = preQty1;
				subSum4 = spinRate4 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner4StateChanged

	private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner5StateChanged
		// TODO add your handling code here:
		double spinRate5 = 300;
		if (burger300.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner5.getValue();
			if (preQty1 > qty4) {
				qty4 = preQty1;
				subSum5 = spinRate5 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty4) {
				qty4 = preQty1;
				subSum5 = spinRate5 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner5StateChanged

	private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner6StateChanged
		// TODO add your handling code here:
		double spinRate6 = 425;
		if (burger425.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner6.getValue();
			if (preQty1 > qty5) {
				qty5 = preQty1;
				subSum6 = spinRate6 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty5) {
				qty5 = preQty1;
				subSum6 = spinRate6 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner6StateChanged

	private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner7StateChanged
		// TODO add your handling code here:
		double spinRate7 = 475;
		if (burger475.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner7.getValue();
			if (preQty1 > qty6) {
				qty6 = preQty1;
				subSum7 = spinRate7 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty6) {
				qty6 = preQty1;
				subSum7 = spinRate7 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner7StateChanged

	private void jSpinner8StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner8StateChanged
		// TODO add your handling code here:
		double spinRate8 = 600;
		if (burger600.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner8.getValue();
			if (preQty1 > qty7) {
				qty7 = preQty1;
				subSum8 = spinRate8 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty7) {
				qty7 = preQty1;
				subSum8 = spinRate8 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner8StateChanged

	private void jSpinner9StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner9StateChanged
		// TODO add your handling code here:
		double spinRate9 = 525;
		if (burger525.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner9.getValue();
			if (preQty1 > qty8) {
				qty8 = preQty1;
				subSum9 = spinRate9 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty8) {
				qty8 = preQty1;
				subSum9 = spinRate9 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner9StateChanged

	private void jSpinner10StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner10StateChanged
		// TODO add your handling code here:
		double spinRate10 = 550;
		if (burger550.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner10.getValue();
			if (preQty1 > qty9) {
				qty9 = preQty1;
				subSum10 = spinRate10 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty9) {
				qty9 = preQty1;
				subSum10 = spinRate10 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner10StateChanged

	private void jSpinner11StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner11StateChanged
		// TODO add your handling code here:
		double spinRate11 = 510;
		if (burger510.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner11.getValue();
			if (preQty1 > qty10) {
				qty10 = preQty1;
				subSum11 = spinRate11 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty10) {
				qty10 = preQty1;
				subSum11 = spinRate11 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner11StateChanged

	private void jSpinner12StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner12StateChanged
		// TODO add your handling code here:
		double spinRate12 = 540;
		if (burger540.isSelected()) {
			int preQty1;
			preQty1 = (Integer) jSpinner12.getValue();
			if (preQty1 > qty11) {
				qty11 = preQty1;
				subSum12 = spinRate12 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			} else if (preQty1 <= qty11) {
				qty11 = preQty1;
				subSum12 = spinRate12 * preQty1;
				totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9
						+ subSum10 + subSum11 + subSum12;
			}
			subSumLabel.setText(String.valueOf(totalBurger));
		}
		total();
	}// GEN-LAST:event_jSpinner12StateChanged

	private void checkPizza800ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza800ActionPerformed
		// TODO add your handling code here:
		if (checkPizza800.isSelected()) {
			s800.setEnabled(true);
			m800.setEnabled(true);
			l800.setEnabled(true);
		} else {
			s800.setEnabled(false);
			s800.setValue(0);
			m800.setEnabled(false);
			m800.setValue(0);
			l800.setEnabled(false);
			l800.setValue(0);
			sumPizza[0] = 0;
			totalPizzaLabel.setText(String.valueOf(totalPizza));
		}
		total();
	}// GEN-LAST:event_checkPizza800ActionPerformed

	private void checkPizza750ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza750ActionPerformed
		// TODO add your handling code here:
		if (checkPizza750.isSelected()) {
			s750.setEnabled(true);
			m750.setEnabled(true);
			l750.setEnabled(true);
		} else {
			s750.setEnabled(false);
			s750.setValue(0);
			m750.setEnabled(false);
			m750.setValue(0);
			l750.setEnabled(false);
			l750.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza750ActionPerformed

	private void checkPizza850ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza850ActionPerformed
		// TODO add your handling code here:
		if (checkPizza850.isSelected()) {
			s850.setEnabled(true);
			m850.setEnabled(true);
			l850.setEnabled(true);
		} else {
			s850.setEnabled(false);
			s850.setValue(0);
			m850.setEnabled(false);
			m850.setValue(0);
			l850.setEnabled(false);
			l850.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza850ActionPerformed

	private void checkPizza670ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza670ActionPerformed
		// TODO add your handling code here:
		if (checkPizza670.isSelected()) {
			s670.setEnabled(true);
			m670.setEnabled(true);
			l670.setEnabled(true);
		} else {
			s670.setEnabled(false);
			s670.setValue(0);
			m670.setEnabled(false);
			m670.setValue(0);
			l670.setEnabled(false);
			l670.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza670ActionPerformed

	private void checkPizza700ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza700ActionPerformed
		// TODO add your handling code here:
		if (checkPizza700.isSelected()) {
			s700.setEnabled(true);
			m700.setEnabled(true);
			l700.setEnabled(true);
		} else {
			s700.setEnabled(false);
			s700.setValue(0);
			m700.setEnabled(false);
			m700.setValue(0);
			l700.setEnabled(false);
			l700.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza700ActionPerformed

	private void checkPizza650ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza650ActionPerformed
		// TODO add your handling code here:
		if (checkPizza650.isSelected()) {
			s650.setEnabled(true);
			m650.setEnabled(true);
			l650.setEnabled(true);
		} else {
			s650.setEnabled(false);
			s650.setValue(0);
			m650.setEnabled(false);
			m650.setValue(0);
			l650.setEnabled(false);
			l650.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza650ActionPerformed

	private void checkPizza830ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza830ActionPerformed
		// TODO add your handling code here:
		if (checkPizza830.isSelected()) {
			s830.setEnabled(true);
			m830.setEnabled(true);
			l830.setEnabled(true);
		} else {
			s830.setEnabled(false);
			s830.setValue(0);
			m830.setEnabled(false);
			m830.setValue(0);
			l830.setEnabled(false);
			l830.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza830ActionPerformed

	private void checkPizza950ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza950ActionPerformed
		// TODO add your handling code here:
		if (checkPizza950.isSelected()) {
			s950.setEnabled(true);
			m950.setEnabled(true);
			l950.setEnabled(true);
		} else {
			s950.setEnabled(false);
			s950.setValue(0);
			m950.setEnabled(false);
			m950.setValue(0);
			l950.setEnabled(false);
			l950.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza950ActionPerformed

	private void checkPizza900ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza900ActionPerformed
		// TODO add your handling code here:
		if (checkPizza900.isSelected()) {
			s900.setEnabled(true);
			m900.setEnabled(true);
			l900.setEnabled(true);
		} else {
			s900.setEnabled(false);
			s900.setValue(0);
			m900.setEnabled(false);
			m900.setValue(0);
			l900.setEnabled(false);
			l900.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza900ActionPerformed

	private void checkPizza930ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkPizza930ActionPerformed
		// TODO add your handling code here:
		if (checkPizza930.isSelected()) {
			s930.setEnabled(true);
			m930.setEnabled(true);
			l930.setEnabled(true);
		} else {
			s930.setEnabled(false);
			s930.setValue(0);
			m930.setEnabled(false);
			m930.setValue(0);
			l930.setEnabled(false);
			l930.setValue(0);
		}
		total();
	}// GEN-LAST:event_checkPizza930ActionPerformed

	private void s800StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s800StateChanged
		// TODO add your handling code here:
		double sPrice1 = 800;
		int preQty;
		preQty = (Integer) s800.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[0] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[0] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s800StateChanged

	private void m800StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m800StateChanged
		// TODO add your handling code here:
		double mPrice1 = 1000;
		int preQty;
		preQty = (Integer) m800.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[1] = mPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[1] = mPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m800StateChanged

	private void l800StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l800StateChanged
		// TODO add your handling code here:
		double lPrice1 = 1300;
		int preQty;
		preQty = (Integer) l800.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[2] = lPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[2] = lPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l800StateChanged

	private void s750StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s750StateChanged
		// TODO add your handling code here:
		double sPrice1 = 750;
		int preQty;
		preQty = (Integer) s750.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[3] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[3] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s750StateChanged

	private void m750StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m750StateChanged
		// TODO add your handling code here:
		double sPrice1 = 950;
		int preQty;
		preQty = (Integer) m750.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[4] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[4] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m750StateChanged

	private void l750StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l750StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1200;
		int preQty;
		preQty = (Integer) l750.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[5] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[5] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l750StateChanged

	private void s850StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s850StateChanged
		// TODO add your handling code here:
		double sPrice1 = 850;
		int preQty;
		preQty = (Integer) s850.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[6] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[6] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s850StateChanged

	private void m850StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m850StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1100;
		int preQty;
		preQty = (Integer) m850.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[7] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[7] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m850StateChanged

	private void l850StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l850StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1400;
		int preQty;
		preQty = (Integer) l850.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[8] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[8] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l850StateChanged

	private void s670StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s670StateChanged
		// TODO add your handling code here:
		double sPrice1 = 670;
		int preQty;
		preQty = (Integer) s670.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[9] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[9] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s670StateChanged

	private void m670StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m670StateChanged
		// TODO add your handling code here:
		double sPrice1 = 800;
		int preQty;
		preQty = (Integer) m670.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[10] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[10] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m670StateChanged

	private void l670StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l670StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1000;
		int preQty;
		preQty = (Integer) l670.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[11] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[11] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l670StateChanged

	private void s700StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s700StateChanged
		// TODO add your handling code here:
		double sPrice1 = 700;
		int preQty;
		preQty = (Integer) s700.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[12] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[12] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s700StateChanged

	private void m700StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m700StateChanged
		// TODO add your handling code here:
		double sPrice1 = 900;
		int preQty;
		preQty = (Integer) m700.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[13] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[13] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m700StateChanged

	private void l700StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l700StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1050;
		int preQty;
		preQty = (Integer) l700.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[14] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[14] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l700StateChanged

	private void s650StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s650StateChanged
		// TODO add your handling code here:
		double sPrice1 = 650;
		int preQty;
		preQty = (Integer) s650.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[15] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[15] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s650StateChanged

	private void m650StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m650StateChanged
		// TODO add your handling code here:
		double sPrice1 = 800;
		int preQty;
		preQty = (Integer) m650.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[16] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[16] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m650StateChanged

	private void l650StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l650StateChanged
		// TODO add your handling code here:
		double sPrice1 = 900;
		int preQty;
		preQty = (Integer) l650.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[17] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[17] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l650StateChanged

	private void s830StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s830StateChanged
		// TODO add your handling code here:
		double sPrice1 = 830;
		int preQty;
		preQty = (Integer) s830.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[18] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[18] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s830StateChanged

	private void m830StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m830StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1030;
		int preQty;
		preQty = (Integer) m830.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[19] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[19] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m830StateChanged

	private void l830StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l830StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1250;
		int preQty;
		preQty = (Integer) l830.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[20] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[20] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l830StateChanged

	private void s950StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s950StateChanged
		// TODO add your handling code here:
		double sPrice1 = 950;
		int preQty;
		preQty = (Integer) s950.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[21] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[21] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s950StateChanged

	private void m950StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m950StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1150;
		int preQty;
		preQty = (Integer) m950.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[22] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[22] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m950StateChanged

	private void l950StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l950StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1500;
		int preQty;
		preQty = (Integer) l950.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[23] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[23] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l950StateChanged

	private void s900StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s900StateChanged
		// TODO add your handling code here:
		double sPrice1 = 900;
		int preQty;
		preQty = (Integer) s900.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[24] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[24] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s900StateChanged

	private void m900StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m900StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1200;
		int preQty;
		preQty = (Integer) m900.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[25] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[25] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m900StateChanged

	private void l900StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l900StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1600;
		int preQty;
		preQty = (Integer) l900.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[26] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[26] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l900StateChanged

	private void s930StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_s930StateChanged
		// TODO add your handling code here:
		double sPrice1 = 930;
		int preQty;
		preQty = (Integer) s930.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[27] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[27] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_s930StateChanged

	private void m930StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_m930StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1150;
		int preQty;
		preQty = (Integer) m930.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[28] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[28] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_m930StateChanged

	private void l930StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_l930StateChanged
		// TODO add your handling code here:
		double sPrice1 = 1340;
		int preQty;
		preQty = (Integer) l930.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[29] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumPizza[29] = sPrice1 * pizzaQty1;
			totalPizza = sumPizza[0] + sumPizza[1] + sumPizza[2] + sumPizza[3] + sumPizza[4] + sumPizza[5] + sumPizza[6]
					+ sumPizza[7] + sumPizza[8] + sumPizza[9] + sumPizza[10] + sumPizza[11] + sumPizza[12]
					+ sumPizza[13] + sumPizza[14] + sumPizza[15] + sumPizza[16] + sumPizza[17] + sumPizza[18]
					+ sumPizza[19] + sumPizza[20] + sumPizza[21] + sumPizza[22] + sumPizza[23] + sumPizza[24]
					+ sumPizza[25] + sumPizza[26] + sumPizza[27] + sumPizza[28] + sumPizza[29];
		}
		totalPizzaLabel.setText(String.valueOf(totalPizza));
		total();
	}// GEN-LAST:event_l930StateChanged

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		if(amountPaidField.getText().length()>0) {
			String amount = amountPaidField.getText();
			paidAmount = Double.parseDouble(amount);
		}else {
			paidAmount = 0;
		}
		//
		//if (paidAmount < total) {
		//	noteLabel.setText("Note: Paid amount can't be less than TOTAL PAYABLE!!!");
		//} else {
			//try {
			//	changeLabel.setText(String.valueOf(paidAmount - total));
			//	noteLabel.setText("");
			//}catch(Exception e) {
			//	System.out.println("fuck");
			//}
			PicTaker pic = new PicTaker();
			pic.pictureTaker();
		}
	
	// GEN-LAST:event_jButton1ActionPerformed

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox1.isSelected()) {
			cokeRegular.setEnabled(true);
			sumDrinks[0] = sumDrinks[0] + 25;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
			totalDrinksLabel.setText(String.valueOf(totalDrinks));
			total();
		} else {
			cokeRegular.setEnabled(false);
			cokeRegular.setValue(1);
			sumDrinks[0] = 0;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
			totalDrinksLabel.setText(String.valueOf(totalDrinks));
			total();
		}
	}// GEN-LAST:event_jCheckBox1ActionPerformed

	private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox2ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox2.isSelected()) {
			pepsiRegular.setEnabled(true);
		} else {
			pepsiRegular.setEnabled(false);
			pepsiRegular.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox2ActionPerformed

	private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox3ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox3.isSelected()) {
			spriteRegular.setEnabled(true);
		} else {
			spriteRegular.setEnabled(false);
			spriteRegular.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox3ActionPerformed

	private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox4ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox4.isSelected()) {
			stringRegular.setEnabled(true);
		} else {
			stringRegular.setEnabled(false);
			stringRegular.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox4ActionPerformed

	private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox5ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox5.isSelected()) {
			coke1500.setEnabled(true);
		} else {
			coke1500.setEnabled(false);
			coke1500.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox5ActionPerformed

	private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox6ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox6.isSelected()) {
			pepsi1500.setEnabled(true);
		} else {
			pepsi1500.setEnabled(false);
			pepsi1500.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox6ActionPerformed

	private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox7ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox7.isSelected()) {
			sprite1500.setEnabled(true);
		} else {
			sprite1500.setEnabled(false);
			sprite1500.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox7ActionPerformed

	private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox8ActionPerformed
		// TODO add your handling code here:
		if (jCheckBox8.isSelected()) {
			cups.setEnabled(true);
		} else {
			cups.setEnabled(false);
			cups.setValue(1);
			total();
		}
	}// GEN-LAST:event_jCheckBox8ActionPerformed

	private void cokeRegularStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_cokeRegularStateChanged
		// TODO add your handling code here:
		double sPrice1 = 25;
		int preQty;
		preQty = (Integer) cokeRegular.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[0] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[0] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_cokeRegularStateChanged

	private void pepsiRegularStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_pepsiRegularStateChanged
		// TODO add your handling code here:
		double sPrice1 = 25;
		int preQty;
		preQty = (Integer) pepsiRegular.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[1] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[1] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_pepsiRegularStateChanged

	private void spriteRegularStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spriteRegularStateChanged
		// TODO add your handling code here:
		double sPrice1 = 25;
		int preQty;
		preQty = (Integer) spriteRegular.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[2] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[2] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_spriteRegularStateChanged

	private void stringRegularStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_stringRegularStateChanged
		// TODO add your handling code here:
		double sPrice1 = 25;
		int preQty;
		preQty = (Integer) stringRegular.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[3] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[3] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_stringRegularStateChanged

	private void coke1500StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_coke1500StateChanged
		// TODO add your handling code here:
		double sPrice1 = 75;
		int preQty;
		preQty = (Integer) coke1500.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[4] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[4] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_coke1500StateChanged

	private void pepsi1500StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_pepsi1500StateChanged
		// TODO add your handling code here:
		double sPrice1 = 70;
		int preQty;
		preQty = (Integer) pepsi1500.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[5] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[5] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_pepsi1500StateChanged

	private void sprite1500StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_sprite1500StateChanged
		// TODO add your handling code here:
		double sPrice1 = 70;
		int preQty;
		preQty = (Integer) sprite1500.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[6] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[6] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_sprite1500StateChanged

	private void cupsStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_cupsStateChanged
		// TODO add your handling code here:
		double sPrice1 = 5;
		int preQty;
		preQty = (Integer) cups.getValue();
		if (preQty > pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[7] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		} else if (preQty <= pizzaQty1) {
			pizzaQty1 = preQty;
			sumDrinks[7] = sPrice1 * pizzaQty1;
			totalDrinks = sumDrinks[0] + sumDrinks[1] + sumDrinks[2] + sumDrinks[3] + sumDrinks[4] + sumDrinks[5]
					+ sumDrinks[6] + sumDrinks[7];
		}
		totalDrinksLabel.setText(String.valueOf(totalDrinks));
		total();
	}// GEN-LAST:event_cupsStateChanged

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
//		/* Set the Nimbus look and feel */
//		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
//		// (optional) ">
//		/*
//		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
//		 * look and feel. For details see
//		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//		 */
////		try {
////			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////				if ("Nimbus".equals(info.getName())) {
////					javax.swing.UIManager.setLookAndFeel(info.getClassName());
////					break;
////				}
////			}
////		} catch (ClassNotFoundException ex) {
////			java.util.logging.Logger.getLogger(cashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,
////					ex);
////		} catch (InstantiationException ex) {
////			java.util.logging.Logger.getLogger(cashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,
////					ex);
////		} catch (IllegalAccessException ex) {
////			java.util.logging.Logger.getLogger(cashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,
////					ex);
////		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
////			java.util.logging.Logger.getLogger(cashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,
////					ex);
////		}
////		// </editor-fold>
//
//		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				 
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField amountPaidField;
	private javax.swing.JCheckBox burger300;
	private javax.swing.JCheckBox burger350;
	private javax.swing.JCheckBox burger400;
	private javax.swing.JCheckBox burger425;
	private javax.swing.JCheckBox burger450;
	private javax.swing.JCheckBox burger475;
	private javax.swing.JCheckBox burger500;
	private javax.swing.JCheckBox burger510;
	private javax.swing.JCheckBox burger525;
	private javax.swing.JCheckBox burger540;
	private javax.swing.JCheckBox burger550;
	private javax.swing.JCheckBox burger600;
	private javax.swing.JLabel burger_1;
	private javax.swing.JLabel burger_10;
	private javax.swing.JLabel burger_11;
	private javax.swing.JLabel burger_12;
	private javax.swing.JLabel burger_2;
	private javax.swing.JLabel burger_3;
	private javax.swing.JLabel burger_4;
	private javax.swing.JLabel burger_5;
	private javax.swing.JLabel burger_6;
	private javax.swing.JLabel burger_7;
	private javax.swing.JLabel burger_8;
	private javax.swing.JLabel burger_9;
	private javax.swing.JLabel changeLabel;
	private javax.swing.JCheckBox checkPizza650;
	private javax.swing.JCheckBox checkPizza670;
	private javax.swing.JCheckBox checkPizza700;
	private javax.swing.JCheckBox checkPizza750;
	private javax.swing.JCheckBox checkPizza800;
	private javax.swing.JCheckBox checkPizza830;
	private javax.swing.JCheckBox checkPizza850;
	private javax.swing.JCheckBox checkPizza900;
	private javax.swing.JCheckBox checkPizza930;
	private javax.swing.JCheckBox checkPizza950;
	private javax.swing.JSpinner coke1500;
	private javax.swing.JSpinner cokeRegular;
	private javax.swing.JSpinner cups;
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JCheckBox jCheckBox4;
	private javax.swing.JCheckBox jCheckBox5;
	private javax.swing.JCheckBox jCheckBox6;
	private javax.swing.JCheckBox jCheckBox7;
	private javax.swing.JCheckBox jCheckBox8;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel61;
	private javax.swing.JLabel jLabel62;
	private javax.swing.JLabel jLabel64;
	private javax.swing.JLabel jLabel65;
	private javax.swing.JLabel jLabel66;
	private javax.swing.JLabel jLabel68;
	private javax.swing.JLabel jLabel69;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel70;
	private javax.swing.JLabel jLabel71;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSpinner jSpinner1;
	private javax.swing.JSpinner jSpinner10;
	private javax.swing.JSpinner jSpinner11;
	private javax.swing.JSpinner jSpinner12;
	private javax.swing.JSpinner jSpinner2;
	private javax.swing.JSpinner jSpinner3;
	private javax.swing.JSpinner jSpinner4;
	private javax.swing.JSpinner jSpinner5;
	private javax.swing.JSpinner jSpinner6;
	private javax.swing.JSpinner jSpinner7;
	private javax.swing.JSpinner jSpinner8;
	private javax.swing.JSpinner jSpinner9;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JSpinner l650;
	private javax.swing.JSpinner l670;
	private javax.swing.JSpinner l700;
	private javax.swing.JSpinner l750;
	private javax.swing.JSpinner l800;
	private javax.swing.JSpinner l830;
	private javax.swing.JSpinner l850;
	private javax.swing.JSpinner l900;
	private javax.swing.JSpinner l930;
	private javax.swing.JSpinner l950;
	private javax.swing.JSpinner m650;
	private javax.swing.JSpinner m670;
	private javax.swing.JSpinner m700;
	private javax.swing.JSpinner m750;
	private javax.swing.JSpinner m800;
	private javax.swing.JSpinner m830;
	private javax.swing.JSpinner m850;
	private javax.swing.JSpinner m900;
	private javax.swing.JSpinner m930;
	private javax.swing.JSpinner m950;
	private javax.swing.JLabel noteLabel;
	private javax.swing.JSpinner pepsi1500;
	private javax.swing.JSpinner pepsiRegular;
	private javax.swing.JLabel pizza1;
	private javax.swing.JLabel pizza10;
	private javax.swing.JLabel pizza2;
	private javax.swing.JLabel pizza3;
	private javax.swing.JLabel pizza4;
	private javax.swing.JLabel pizza5;
	private javax.swing.JLabel pizza6;
	private javax.swing.JLabel pizza7;
	private javax.swing.JLabel pizza8;
	private javax.swing.JLabel pizza9;
	private javax.swing.JSpinner s650;
	private javax.swing.JSpinner s670;
	private javax.swing.JSpinner s700;
	private javax.swing.JSpinner s750;
	private javax.swing.JSpinner s800;
	private javax.swing.JSpinner s830;
	private javax.swing.JSpinner s850;
	private javax.swing.JSpinner s900;
	private javax.swing.JSpinner s930;
	private javax.swing.JSpinner s950;
	private javax.swing.JSpinner sprite1500;
	private javax.swing.JSpinner spriteRegular;
	private javax.swing.JSpinner stringRegular;
	private javax.swing.JLabel subSumLabel;
	private javax.swing.JLabel totalDrinksLabel;
	private javax.swing.JLabel totalPayableLabel;
	private javax.swing.JLabel totalPizzaLabel;
	private javax.swing.JFrame frame;
	// End of variables declaration//GEN-END:variables
}
