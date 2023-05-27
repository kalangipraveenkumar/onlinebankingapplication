package onlinebankingapplication;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;
import java.sql.*;

public class AccountCreation extends BankMain implements ActionListener 
{
	JFrame fbac;

	JFileChooser uphoto;
	
	JLabel name,account_number,aadhaar,branch;
	
	JLabel namecnd,account_numbercnd, gender,country,pincode,DOB,
			mail,password,confirmpassword,houseno,street,landmark,area_loc,village_t_c,
			district,state,noname,nomobile,noaadhar,noprofession,nocountry,noarea;
	
	JLabel nameErr,account_numberErr,aadhaarErr,genderErr,
	countryErr,pincodeErr,DOBErr,mailErr,confirmpasswordErr,
	housenoErr,streetErr,landmarkErr,area_locErr,village_t_cErr,
	districtErr,stateErr,nonameErr,nomobileErr,noaadharErr,noprofessionErr,nocountryErr,noareaErr
	,datedemo,branchErr;
	
	JTextField tname,taccount_number,taadhaar,tcountry,tpincode,tDOB,
			tmail,tpassword,tconfirmpassword,thouseno,tstreet,tlandmark,tarea_loc,tvillage_t_c,
			tdistrict,tstate,tnoname,tnomobile,tnoaadhar,tnoprofession,tnocountry,tnoarea;
	
	JTextArea taddress;
	
	ButtonGroup bg;
	JRadioButton male,female,other;
	JButton check,submit,reset,uphotobtn,backbtn;
	Font fontcnd,fontArea,fontField,fontError;
	String nameUpper,spass,scpass,ssbranch;
	String sname,saccno,saadno,sDOB,smail,scountry,spin,shouseno,sstreet,sarea_loc,svillage,
			slandmark,sdistrict,sstate;
	String sgender,smale,sfemale,sother,scpassword;
	String snoname,snomobile,snoaadno,sprofession,snocountry,snoarea_loc;
	Integer ipincode;
	Long laccno,laadno,lnomobile,lnoaadno;
	JComboBox branches;
	
	boolean bDOB;  
	AccountCreation()
	{
		fbac = new JFrame("Account Creation");
		/*
		 * User Photo
		 */
		String[] sbranch = {"select state","AndhraPradhesh","Telangana","Tamilnadu","Kerala","Maharashtra","Bihar","Kashmir","Other"};
		branches = new JComboBox(sbranch);branches.setBounds(1000,100,150,30);fbac.add(branches);
		/*
		 * Fonts
		 */
		fontcnd = new Font("POPPINS",Font.BOLD,10);
		fontArea = new Font("POPPINS",Font.BOLD,15);
		fontField = new Font("POPPINS",Font.BOLD,13);
		fontError = new Font("POPPINS",Font.BOLD,11);
		/*
		 * Labels
		 */
		name = new JLabel("Full Name");name.setBounds(10,30,100,30);fbac.add(name);
		
		account_number = new JLabel("Account Number");account_number.setBounds(10,80,100,30);
		fbac.add(account_number);
		
		aadhaar = new JLabel("Aadhaar Number");aadhaar.setBounds(10,140,100,30);fbac.add(aadhaar);
		
		gender = new JLabel("Gender");gender.setBounds(50,185,90,30);fbac.add(gender);
		
		country = new JLabel("Country");country.setBounds(50,330,80,30);fbac.add(country);
		
		pincode = new JLabel("Pincode");pincode.setBounds(295,330,65,30);fbac.add(pincode);
		
		DOB = new JLabel("Date of Birth");DOB.setBounds(10,230,100,30);fbac.add(DOB);
		datedemo = new JLabel("DD-MM-YYYY");datedemo.setBounds(110,260,100,20);fbac.add(datedemo);
		
		mail = new JLabel("Enter your Mail");mail.setBounds(10,280,100,30);fbac.add(mail);
		
		houseno = new JLabel("House Number");houseno.setBounds(10,380,100,30);fbac.add(houseno);
		
		street = new JLabel("Street");street.setBounds(200,380,70,30);fbac.add(street);
		
		area_loc = new JLabel("Area");area_loc.setBounds(530,30,100,30);fbac.add(area_loc);
		
		village_t_c = new JLabel("Village");village_t_c.setBounds(530,80,100,30);
		fbac.add(village_t_c);
		
		landmark = new JLabel("Landmark");landmark.setBounds(530,140,100,30);fbac.add(landmark);
		
		district = new JLabel("District");district.setBounds(530,200,100,30);fbac.add(district);
		
		state = new JLabel("State");state.setBounds(530,260,100,30);fbac.add(state);
		
		branch = new JLabel("Select Branch");branch.setBounds(1000,70,150,30);fbac.add(branch);
		
		/*
		 * Error Labels
		 */
		nameErr = new JLabel();nameErr.setBounds(110,48,300,30);fbac.add(nameErr);
		nameErr.setFont(fontError);nameErr.setForeground(Color.red);
		
		account_numberErr = new JLabel();account_numberErr.setBounds(280,80,250,30);
		fbac.add(account_numberErr);account_numberErr.setFont(fontError);
		account_numberErr.setForeground(Color.red);
		
		aadhaarErr = new JLabel();aadhaarErr.setBounds(110,160,300,30);fbac.add(aadhaarErr);
		aadhaarErr.setFont(fontError);aadhaarErr.setForeground(Color.red);
		
		genderErr = new JLabel();genderErr.setBounds(150,205,250,30);fbac.add(genderErr);
		genderErr.setFont(fontError);genderErr.setForeground(Color.red);
		
		countryErr = new JLabel();countryErr.setBounds(110,350,250,30);fbac.add(countryErr);
		countryErr.setFont(fontError);countryErr.setForeground(Color.red);

		pincodeErr = new JLabel();pincodeErr.setBounds(345,350,200,30);fbac.add(pincodeErr);
		pincodeErr.setFont(fontError);pincodeErr.setForeground(Color.red);
		
		DOBErr = new JLabel();DOBErr.setBounds(220,230,200,30);fbac.add(DOBErr);
		DOBErr.setFont(fontError);DOBErr.setForeground(Color.red);
		
		mailErr = new JLabel();mailErr.setBounds(110,300,300,30);fbac.add(mailErr);
		mailErr.setFont(fontError);mailErr.setForeground(Color.red);
		
		confirmpasswordErr = new JLabel();confirmpasswordErr.setBounds(165,635,200,30);
		confirmpasswordErr.setFont(fontError);confirmpasswordErr.setForeground(Color.red);
		fbac.add(confirmpasswordErr);
		
		housenoErr = new JLabel();housenoErr.setBounds(90,400,200,30);
		housenoErr.setFont(fontError);housenoErr.setForeground(Color.red);fbac.add(housenoErr);
		
		streetErr = new JLabel();streetErr.setBounds(270,400,200,30);
		streetErr.setFont(fontError);streetErr.setForeground(Color.red);fbac.add(streetErr);
		
		
		area_locErr = new JLabel();area_locErr.setBounds(630,50,250,30);
		area_locErr.setFont(fontError);area_locErr.setForeground(Color.red);
		fbac.add(area_locErr);
		
		village_t_cErr = new JLabel();village_t_cErr.setBounds(630,100,250,30);
		village_t_cErr.setFont(fontError);village_t_cErr.setForeground(Color.red);
		fbac.add(village_t_cErr);
		
		landmarkErr = new JLabel();landmarkErr.setBounds (630,160,250,30);
		landmarkErr.setFont(fontError);landmarkErr.setForeground(Color.red);fbac.add(landmarkErr);
		
		districtErr = new JLabel();districtErr.setBounds(630,220,250,30);
		districtErr.setFont(fontError);districtErr.setForeground(Color.red);fbac.add(districtErr);
		
		stateErr = new JLabel();stateErr.setBounds(630,280,250,30);
		stateErr.setFont(fontError);stateErr.setForeground(Color.red);fbac.add(stateErr);
		
		
		branchErr = new JLabel();branchErr.setBounds(1000,130,250,30);
		branchErr.setFont(fontError);branchErr.setForeground(Color.red);fbac.add(branchErr);
		/*
		 * password
		 */
		password = new JLabel("Enter Password");password.setBounds(530,330,100,30);fbac.add(password);
		password.setVisible(false);
		confirmpassword = new JLabel("Confirm Password");confirmpassword.setBounds(530,380,120,30);
		fbac.add(confirmpassword);confirmpassword.setVisible(false);
		/*
		 * Radio Buttons Male,Female,others
		 */
		bg = new ButtonGroup();
		male = new JRadioButton("Male");male.setBounds(150,185,60,30);bg.add(male);fbac.add(male);
		
		female = new JRadioButton("Female");female.setBounds(220,185,70,30);
		bg.add(female);fbac.add(female);
		
		other = new JRadioButton("Other");other.setBounds(290,185,70,30);bg.add(other);fbac.add(other);
		
		/*
		 * Conditions  
		 */
		namecnd = new JLabel();namecnd.setBounds(110,20,300,10);fbac.add(namecnd);
//		namecnd.setText("Enter the Full name in Uppercase *");
		namecnd.setFont(fontcnd);
		
		account_numbercnd = new JLabel();account_numbercnd.setBounds(80,110,450,15);
		fbac.add(account_numbercnd);account_numbercnd.setFont(fontcnd);
//		account_numbercnd.setText("(Enter ur Mobile Number in above Field,your giving Number is your Account Number)*");
		
		/*
		 * TextFields
		 */
		tname = new JTextField();tname.setBounds(110,30,300,30);fbac.add(tname);
		tname.setForeground(Color.black);tname.setFont(fontField);
		
		taccount_number = new JTextField();taccount_number.setBounds(110,80,170,30);
		fbac.add(taccount_number);taccount_number.setForeground(Color.black);taccount_number.setFont(fontField);
		
		taadhaar = new JTextField();taadhaar.setBounds(110,140,200,30);fbac.add(taadhaar);
		taadhaar.setForeground(Color.black);taadhaar.setFont(fontField);
		
		tcountry = new JTextField();tcountry.setBounds(110,330,150,30);fbac.add(tcountry);
		tcountry.setForeground(Color.black);tcountry.setFont(fontField);
		
		tpincode = new JTextField();tpincode.setBounds(365,330,100,30);fbac.add(tpincode);
		tpincode.setForeground(Color.black);tpincode.setFont(fontField);
		
		tDOB = new JTextField();tDOB.setBounds(110,230,100,30);fbac.add(tDOB);
		tDOB.setForeground(Color.black);tDOB.setFont(fontField);
		
		tmail = new JTextField();tmail.setBounds(110,280,300,30);fbac.add(tmail);
		tmail.setForeground(Color.black);tmail.setFont(fontField);
		
		thouseno = new JTextField();thouseno.setBounds(110,380,70,30);fbac.add(thouseno);
		thouseno.setForeground(Color.black);thouseno.setFont(fontField);
		
		tstreet = new JTextField();tstreet.setBounds(270,380,195,30);fbac.add(tstreet);
		tstreet.setForeground(Color.black);tstreet.setFont(fontField);
		
		
		tarea_loc = new JTextField();tarea_loc.setBounds(630,30,300,30);fbac.add(tarea_loc);
		tarea_loc.setForeground(Color.black);tarea_loc.setFont(fontField);
		
		tvillage_t_c = new JTextField();tvillage_t_c.setBounds(630,80,170,30);fbac.add(tvillage_t_c);
		tvillage_t_c.setForeground(Color.black);tvillage_t_c.setFont(fontField);
		
		tlandmark = new JTextField();tlandmark.setBounds(630,140,170,30);fbac.add(tlandmark);
		tlandmark.setForeground(Color.black);tlandmark.setFont(fontField);
		
		tdistrict = new JTextField();tdistrict.setBounds(630,200,150,30);fbac.add(tdistrict);
		tdistrict.setForeground(Color.black);tdistrict.setFont(fontField);
		
		tstate = new JTextField();tstate.setBounds(630,260,100,30);fbac.add(tstate);
		tstate.setForeground(Color.black);tstate.setFont(fontField);
		
		
		/*
		 * Password Field
		 */
		tpassword = new JTextField();tpassword.setBounds(650,330,200,30);
		fbac.add(tpassword);tpassword.setFont(fontField);
		tpassword.setVisible(false);tpassword.setForeground(Color.black);
		
		tconfirmpassword = new JTextField();tconfirmpassword.setBounds(650,380,200,30);
		fbac.add(tconfirmpassword); tconfirmpassword.setVisible(false);
		tconfirmpassword.setForeground(Color.black);tconfirmpassword.setFont(fontField);
		/*
		 * check Button
		 */
		check = new JButton("Check");check.setBounds(650,420,80,25);fbac.add(check);
//		check.setBackground(Color.red);check.setForeground(Color.white);
		check.addActionListener(this);
		/*
		 * Reset Button
		 */
		reset = new JButton("Reset");reset.setBounds(650,420,80,25);fbac.add(reset);
//		reset.setBackground(Color.red);reset.setForeground(Color.white);
		reset.setVisible(false);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String msg = "Are you Resetting ur Data";
				int a = JOptionPane.showConfirmDialog(fbac,msg);
				if(a == JOptionPane.YES_OPTION)
				{
					submit.setVisible(false);
					reset.setVisible(false);
					tname.setEditable(true);
					taccount_number.setEditable(true);
					taadhaar.setEditable(true);
					male.setEnabled(true);
					female.setEnabled(true);
					other.setEnabled(true);
					tcountry.setEditable(true);
					tpincode.setEditable(true);
					tDOB.setEditable(true);
					tmail.setEditable(true);
					thouseno.setEditable(true);
					tstreet.setEditable(true);
					tarea_loc.setEditable(true);
					tvillage_t_c.setEditable(true);
					tlandmark.setEditable(true);
					tdistrict.setEditable(true);
					tstate.setEditable(true);
					
					tpassword.setEditable(true);
					tconfirmpassword.setEditable(true);
					check.setVisible(true);
					branches.setEditable(true);
				}
			}
		});
		/*
		 * Submit Button
		 */
		submit = new JButton("Submit");submit.setBounds(760,420,80,25);fbac.add(submit);
//		submit.setBackground(Color.red);submit.setForeground(Color.white);
		submit.setVisible(false);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try
				{
					
					
					acc_flag = 1;
					String msg = "Your Account is Created Successfully,Thanks for Choosing our Bank";
					JOptionPane.showMessageDialog(fbac,msg);
					fbac.setVisible(false);
				}
				catch(Exception e){System.out.print(e);}	
			}
		});	
		/*
		 * Back Button
		 */
		backbtn = new JButton("Back");backbtn.setBounds(1050,420,80,25);fbac.add(backbtn);
		//backbtn.setBackground(Color.red);backbtn.setForeground(Color.white);/backbtn.setVisible(true);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
//				new BankLogin();
				new BankMain();
				fbac.setVisible(false);
			}
		});
		
		fbac.setBackground(Color.PINK);
		fbac.setSize(1200,550);
		fbac.setLayout(null);
		fbac.setVisible(true);
		fbac.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	}
	/*
	 * Implementing the Check button 
	 */
	public void actionPerformed(ActionEvent ae)
	{
		/*
		 * pattern Matching for Names ,Phone Number,Aadhaar Number and Pincode
		 */
		Pattern names = Pattern.compile("[A-Za-z]+");
		sname = tname.getText();
		Matcher mnames = names.matcher(sname);
		
		Pattern pphn = Pattern.compile("[6-9]{1}[0-9]{9}");
		saccno = taccount_number.getText();
		Matcher maccno = pphn.matcher(saccno);
		   
		Pattern paadno = Pattern.compile("[1-9][0-9]{11}");
		saadno = taadhaar.getText();
		Matcher maddno = paadno.matcher(saadno);
		
		Pattern ppin = Pattern.compile("[1-9][0-9]{5}");
		spin = tpincode.getText();
		Matcher mpin = ppin.matcher(spin);
		
		// checking name field
		if(tname.getText().length() !=0 && mnames.find())
		{
			nameErr.setText("");
			sname = nameUpper = (tname.getText()).toUpperCase();
		
		}
		else{ 	nameErr.setText("please Enter your Name");	}
		// checking Account Number field
		if(taccount_number.getText().length() !=0 && maccno.find() )
		{
			saccno = taccount_number.getText().trim();
			laccno = Long.valueOf(saccno);
			account_numberErr.setText("");
		}
		else{ 	account_numberErr.setText("Please Enter the Valid Mobile Number");	}
		// checking Add Number field
		if(taadhaar.getText().length() !=0 && maddno.find())
		{
			saadno = taadhaar.getText();
			laadno = Long.valueOf(saadno);
			aadhaarErr.setText("");
		}
		else{ 	aadhaarErr.setText("Please Enter the Valid Aadhaar Number");	}
		// checking Gender is Selected or Not
		if(male.isSelected() || female.isSelected() || other.isSelected())
		{
			genderErr.setText("");
			if(male.isSelected())
			{
				sgender = male.getText();
			}
			if(female.isSelected())
			{
				sgender = female.getText();
			}
			if(other.isSelected())
			{
				sgender = other.getText();
			}
		}
		else{ 	genderErr.setText("Please select your Gender");	}
		
		// checking Country name  field
		scountry = tcountry.getText();
		Matcher mcountry = names.matcher(scountry);
		if(tcountry.getText().length() != 0 && mcountry.find())
		{
			countryErr.setText("");	
		}
		else { countryErr.setText("Please Enter Country Name"); }
		// checking  pin  
		if(tpincode.getText().length() == 6 && mpin.find()  )
		{
			spin = tpincode.getText();
			ipincode = Integer.valueOf(spin);
			pincodeErr.setText("");
		}
		else{ 	pincodeErr.setText("Please Enter valid Pincode");	}
		
		// checking  Date of Birth and pattern matching
		Pattern pDOB = Pattern.compile("[0-9]{2}[-][0-9]{2}[-][1-2][0-9]{3}");
		sDOB = tDOB.getText();
		Matcher mDOB = pDOB.matcher(sDOB);
		
		if(tDOB.getText().length() == 10 && mDOB.find())
		{
			bDOB = true;
			sDOB = tDOB.getText();
			DOBErr.setText("");
		}
		else{ 	DOBErr.setText("Please Enter  Valid Date of Birth");	}
		// checking  Mail and Matching the some pattern
		Pattern pmail = Pattern.compile("[a-zA-Z0-9_-]+@[a-z]+[.][a-z]{2,3}");
		Matcher mmail = pmail.matcher(tmail.getText());
		int flag = 0;
		if(tmail.getText().length() !=0 && mmail.find())
		{
			smail = tmail.getText();
			flag = 1;
			mailErr.setText("");
		}
		else{	mailErr.setText("Please Enter Valid Mail");	flag = 0;	}
		//checking House Number
		Pattern houseno = Pattern.compile("[A-Z]*[0-9]+");
		shouseno = thouseno.getText();
		Matcher mhouse = houseno.matcher(shouseno);
		if(thouseno.getText().length() != 0 && mhouse.find())
		{
			housenoErr.setText("");
		}
		else { housenoErr.setText("Please Enter House Number");	}
		//checking Street Name
		sstreet = tstreet.getText();
		Matcher mstreet = names.matcher(sstreet);
		if(tstreet.getText().length() != 0 && mstreet.find())
		{
			streetErr.setText("");
		}
		else { streetErr.setText("Please Enter Street Name");	}
		//checking Area/Locality
		sarea_loc = tarea_loc.getText();
		Matcher marea_loc = names.matcher(sarea_loc);
		if(tarea_loc.getText().length() != 0 && marea_loc.find())
		{
			area_locErr.setText("");
		}
		else { area_locErr.setText("Please Enter Area or Locality Name");	}
		//checking Village/Town/City
		svillage = tvillage_t_c.getText();
		Matcher mvillage = names.matcher(svillage);
		if(tvillage_t_c.getText().length() != 0 && mvillage.find())
		{
			village_t_cErr.setText("");
		}
		else { village_t_cErr.setText("Please Enter Village/Town/City Name");	}
		//checking Landmark
		slandmark = tlandmark.getText();
		Matcher mlandmark = names.matcher(slandmark);
		if(tlandmark.getText().length() != 0 && mlandmark.find())
		{
			landmarkErr.setText("");
		}
		else { landmarkErr.setText("Please Enter Landmark ");	}
		//checking District 
		sdistrict = tdistrict.getText();
		Matcher mdistrict = names.matcher(sdistrict);
		if(tdistrict.getText().length() != 0 && mdistrict.find())
		{
			districtErr.setText("");
		}
		else { districtErr.setText("Please Enter District Name");	}
		//checking State 
		sstate = tstate.getText();
		Matcher mstate = names.matcher(sstate);
		if(tstate.getText().length() != 0 && mstate.find())
		{
			stateErr.setText("");
		}
		else { stateErr.setText("Please Enter State Name");	}
		
		//Branch Selection
		if(branches.getSelectedIndex() != 0)
		{
			branchErr.setText("");
			if(branches.getSelectedIndex() == 1)
				ssbranch = "STUN0000091" ;
			if(branches.getSelectedIndex() == 2)
				ssbranch = "STUN0000093" ;
			if(branches.getSelectedIndex() == 3)
				ssbranch = "STUN0000094" ;
			if(branches.getSelectedIndex() == 4)
				ssbranch = "STUN0000128" ;
			if(branches.getSelectedIndex() == 5)
				ssbranch = "STUN0000129" ;
			if(branches.getSelectedIndex() == 6)
				ssbranch = "STUN0000332" ;
			if(branches.getSelectedIndex() == 7)
				ssbranch = "STUN0000590" ;
			if(branches.getSelectedIndex() == 8)
				ssbranch = "STUN0123456" ;
		}
		else { branchErr.setText("Please Select your Branch ");	}
		
			
		//invoking submit button if all conditions r passed
		if(		(tname.getText().length() !=0)	
			&&	(taccount_number.getText().length() !=0 )
			&&	(taadhaar.getText().length() !=0 )
			&&	(male.isSelected() || female.isSelected() || other.isSelected())
			&&	(tDOB.getText().length() == 10 )
			&& 	(tmail.getText().length() > 10 && flag == 1)
			&& 	(tcountry.getText().length() !=0)	
			&&	(tpincode.getText().length() !=0 )
			&&  (thouseno.getText().length() != 0)
			&& 	(tstreet.getText().length() !=0)	
			&&	(tarea_loc.getText().length() !=0)
			&&  (tvillage_t_c.getText().length() != 0)
			&& 	(tlandmark.getText().length() !=0)	
			&&	(tdistrict.getText().length() !=0)
			&&  (tstate.getText().length() != 0)

			&&  (branches.getSelectedIndex() != 0)
		  )
		{
			password.setVisible(true);
			tpassword.setVisible(true);
			confirmpassword.setVisible(true);
			tconfirmpassword.setVisible(true);
			spass = tpassword.getText();
			scpass = tconfirmpassword.getText();
			mailErr.setText("");
			
			if((spass.length() != 0) && (scpass.length() != 0))
			{
				if(scpass.equals(spass))
				{
					scpassword = scpass.trim();
					String msg = "Are u sure about your giving Data,if u click YES there is no more Editable Option";
					int a = JOptionPane.showConfirmDialog(fbac,msg);
					if(a == JOptionPane.YES_OPTION)
					{
						check.setVisible(false);
						submit.setVisible(true);
						reset.setVisible(true);
						tname.setEditable(false);
						taccount_number.setEditable(false);
						taadhaar.setEditable(false);
						male.setEnabled(false);
						female.setEnabled(false);
						other.setEnabled(false);
						tcountry.setEditable(false);
						tpincode.setEditable(false);
						tDOB.setEditable(false);
						tmail.setEditable(false);
						thouseno.setEditable(false);
						tstreet.setEditable(false);
						tarea_loc.setEditable(false);
						tvillage_t_c.setEditable(false);
						tlandmark.setEditable(false);
						tdistrict.setEditable(false);
						tstate.setEditable(false);
						
						tpassword.setEditable(false);
						tconfirmpassword.setEditable(false);
						
						branches.setEditable(false);
					}
				}
				else 
				{	
					submit.setVisible(false);
					reset.setVisible(false);
					
					JOptionPane.showMessageDialog(fbac,"Password NOT Matching","Alert",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		else
		{
			password.setVisible(false);
			tpassword.setVisible(false);
			confirmpassword.setVisible(false);
			tconfirmpassword.setVisible(false);
		}	
	}
	public static void main(String agrs[])
	{
		new AccountCreation();
	}
}