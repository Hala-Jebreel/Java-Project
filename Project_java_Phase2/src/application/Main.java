package application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//Hala Jebreel
//1210606
//lab section 5
//section 3 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	static PizzaOrder a ;
	@Override
	public void start(Stage primaryStage) {
		ArrayList<PizzaOrder> orders =new ArrayList<>();
	      //array lest called orders
			VBox root = new VBox ();
			root.setPadding(new Insets(10,10,10,10));
			root.setAlignment(Pos.CENTER);
			
			Label l = new Label("Customer Name");//Creat a label customer name
			TextField coustmname = new TextField();//text field to enter customer name
			coustmname.setAlignment(Pos.CENTER);//set customer name at the center of the textfield
			l.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
			
			Label l2 = new Label("Order Type");//Creat a label order type
			l2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
			ComboBox<String> ordertype=new ComboBox<>();//Creat a combo box 
			ordertype.getItems().addAll("To Go" ,"Deleviary" ,"seated");//elements in the combo box
			ordertype.setValue("To Go");//defult value for combo box is To go
		
			
			Label l3 = new Label ("Pizza Size");//pizza size label
			l3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
			RadioButton s = new RadioButton("SMALL"); //creat a radio button SMALL
			RadioButton m = new RadioButton("MEDIUM "); //creat a radio button MEDIUM
			RadioButton la = new RadioButton("LARGE ");//creat a radio button LARGE
			HBox size = new HBox(s,m,la); // put them in HBox
			size.setPadding(new Insets(10,10,10,10));
			size.setAlignment(Pos.CENTER);// put the Hbox at the center
			
			ToggleGroup tg = new ToggleGroup();// toggel Group 
			s.setSelected(true);//the defult value for the radio button
			m.setToggleGroup(tg);
			la.setToggleGroup(tg);
			s.setToggleGroup(tg);
			
			
			Label l4 = new Label(" Toppings ");//toppings label
			l4.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
			CheckBox toping1 = new CheckBox("Onions");//check box onions
			CheckBox toping2 = new CheckBox("Olives");//check box Olives
			CheckBox toping3 = new CheckBox("Green Peppers");//check box Green Peppers
			
			HBox top = new HBox(toping1,toping2,toping3);// put onions,Olives,Green Peppers in HBox
			top.setPadding(new Insets(10,10,10,10));
			top.setAlignment(Pos.CENTER);//put the HBox at the center
			
			Label l5 = new Label ("Topping Price");// topping price label
			l5.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
		    TextField topprice = new TextField("10");//defult value for topprice textfield
		    topprice.setAlignment(Pos.CENTER);// put topprice at the center
		    
		    Label l6 = new Label ("Order Price");
		    l6.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
		    TextField orderprice = new TextField("0.0");
		    orderprice.setAlignment(Pos.CENTER);
		    
		    Button ProcessOrder  = new Button("ProcessOrder");//ProcessOrder button
		    Button PrintOrders  = new Button("PrintOrders");//PrintOrders button
		    Button Reset  = new Button("Reset");//Reset Button
		    
		    HBox bottom = new HBox( ProcessOrder,PrintOrders,Reset); 
		    bottom.setPadding(new Insets(10,10,10,10));
		    bottom.setSpacing(10);
		    bottom.setAlignment(Pos.CENTER);
		    
			Label delivLable = new Label("Trip Rate");
			TextField delivatx = new TextField();
			Label zonelable = new Label("Zone");
			TextField zonetf = new TextField();
			Label serviLable = new Label("service Charge");
			TextField servChargtf = new TextField();
			Label numberOfPeopleLable = new Label("Number Of People");
			TextField  numberOfPeopletx= new TextField();
			
			Stage po = new Stage();
			//a new stage po
			
			delivLable.setVisible(false);
			delivatx.setVisible(false);
			zonelable.setVisible(false);
			zonetf.setVisible(false);
			serviLable.setVisible(false);
			servChargtf.setVisible(false);
			numberOfPeopleLable.setVisible(false);
			numberOfPeopletx.setVisible(false);
			// hid (delivLable ,zonelable,serviLable,numberOfPeopleLable)label 
			ordertype.setOnAction (e->{
				// when user press ordertype combobox
				if(ordertype.getSelectionModel().getSelectedIndex()==1) {//if user chosse 1 index from combo box
				delivLable.setVisible(true);//show (delivLable,zonelable,delivatx,zonetf)
				delivatx.setVisible(true);
				zonelable.setVisible(true);
				zonetf.setVisible(true);
				serviLable.setVisible(false);//hide serviLable ,servChargtf,numberOfPeopleLable,numberOfPeopletx
				servChargtf.setVisible(false);
				numberOfPeopleLable.setVisible(false);
				numberOfPeopletx.setVisible(false);
				
				}
				
				else if (ordertype.getSelectionModel().getSelectedIndex()==2) {//if user chosse 2 index from combo box 
				 serviLable.setVisible(true);// show (serviLable,servChargtf,numberOfPeopleLable,numberOfPeopletx) 
				 servChargtf.setVisible(true);
				numberOfPeopleLable.setVisible(true);
				numberOfPeopletx.setVisible(true);
				delivLable.setVisible(false);//hide(delivLable,delivatx,zonelable,zonetf)
				delivatx.setVisible(false);
				zonelable.setVisible(false);
				zonetf.setVisible(false);
				}
				else if (ordertype.getSelectionModel().getSelectedIndex()==0) {
				delivLable.setVisible(false);// hide (delivLable,delivatx,zonelable,zonetf,serviLable,servChargtf,numberOfPeopleLable,numberOfPeopletx) 
				delivatx.setVisible(false);
				zonelable.setVisible(false);
				zonetf.setVisible(false);
				serviLable.setVisible(false);
				servChargtf.setVisible(false);
				numberOfPeopleLable.setVisible(false);
				numberOfPeopletx.setVisible(false);
				}
	    	
	    	});
		    
		    
		  ProcessOrder.setOnAction (new EventHandler<ActionEvent>(){//when user press on ProcessOrder button do this acction 
		  	@Override
		    	public void handle (ActionEvent actionEvent) {
	    	
	    		double toopprice = 0;
	    		
	    		
	    		
		    		String customer = coustmname.getText();//get the customer name 
		    		String orderType = (String)ordertype.getValue();//get the order type
	                  int pzzsize = 0 ;
		    		if(s.isSelected()) 
		    			 pzzsize = 1;//the type is small
		    		else if(m.isSelected())
		    			 pzzsize = 2;//the type is medium
		    		else if (la.isSelected())
		    			 pzzsize = 3;//the type is large
		    		int numberOfToppingOptions = 0;
		    		
		    		if (toping1.isSelected())
		    			numberOfToppingOptions++;
		    		if(toping2.isSelected())
		    			numberOfToppingOptions++;
		    		if(toping3.isSelected())
		    			numberOfToppingOptions++;
		    		
		    		
		    		if(topprice.getText()== null) {
		    			toopprice = 10;//if the top price is null but  the defult value is 10
		    		}
		    		else {
		    		 toopprice=Double.parseDouble(topprice.getText()) ;//get the topprice
		    		}
		    		
		    	    double servivechargeRate=0;
		    		int numOfPepol=0;
		    		
		    		System.out.println(customer);
		    		System.out.println(orderType);
		    		System.out.println(pzzsize);
		    		System.out.println(numberOfToppingOptions);
		    		System.out.println(servivechargeRate);
		    		System.out.println(numOfPepol);
		    		
		    		if (orderType == ("Deleviary")) {
		    			
		    			 a = new Delivary( customer,pzzsize, numberOfToppingOptions, toopprice ,
		    					 servivechargeRate,numOfPepol);
		    		}
		    		else if (orderType==("To Go")) {
		    			 a =new ToGo(customer,pzzsize,numberOfToppingOptions,toopprice);
		    		}
		    		else {
		    			 a = new Seated(customer,pzzsize, numberOfToppingOptions,toopprice,
		    					 servivechargeRate,numOfPepol);
		    		}
		    		
		    		orderprice.setText(String.valueOf(a.calculateOrderPrice()));
		    		orders.add(a);//add to array list(orders)
		    	}
		    });
		    
		  Reset.setOnAction(new EventHandler<ActionEvent>() {
		    	@Override
		    	//when user press Reset buttum do this acction 
		    	public void handle (ActionEvent e) {
		    		coustmname.clear();//clear the name
		    		ordertype.setValue("To Go");//defult value for order type
		    		orderprice.setText("0");//defult value for order price
			        topprice.setText("10");// defult value for topic price
			        s.setSelected(true);//select small radio button (defult value)
			        m.setSelected(false);
			        la.setSelected(false);
			        toping1.setSelected(false);
			        toping2.setSelected(false);
			        toping3.setSelected(false);
			        orders.clear();//clear all items in array list
			        zonetf.clear();
			        servChargtf.clear();
			        po.close();//close stage po 
		    	}
		    });
		  
		  PrintOrders.setOnAction(new EventHandler<ActionEvent>() {
		    	@Override
		    	public void handle (ActionEvent e) {
		    		//sort the array list
		    		Dreviar.sortOrders(orders);
		    		VBox printorder = new VBox();//printorder VBox  
		    		printorder.setPadding(new Insets(10,10,10,10));
		    		for(int i=0 ;i<orders.size();i++) {
		    			HBox  printorde = new HBox(new Label (orders.get(i).getCustomerName(),new Label(String.valueOf(orders.get(i).calculateOrderPrice()))));
		    			 printorde.setPadding(new Insets(10,10,10,10));
		    			 printorder.getChildren().add(printorde);
		    		}
		    		Scene scene1 = new Scene(printorder,400,400);
		    		po.setScene(scene1);//put the scene1 in po stage
		    		po.show();  // show po stage
		    	}
		    });
		    
			root.getChildren().addAll(l,coustmname,l2,ordertype,l3,size,l4,top,l5, topprice,l6,orderprice,delivLable,delivatx,zonelable,zonetf,serviLable,servChargtf,numberOfPeopleLable,numberOfPeopletx,bottom);
			Scene scene = new Scene(root,600,600);
			primaryStage.setScene(scene);//put scene in stage
			primaryStage.show();//show the stage 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
