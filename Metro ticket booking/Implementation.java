package Jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Implementation {

		
		ArrayList<Passenger> list = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 Iterator<Passenger> it = list.iterator(); 
		  
		 Passenger obj = new Passenger();
		 String namee ;
		 int z;
		 int space;
		public  void bookTicket() throws Exception {

			
			List <String>queue1= new LinkedList<String>();
			queue1.add("AIRPORT");
			queue1.add("MEENAMBAKAM");
			queue1.add("NANGANALLUR");
			queue1.add("ALANDUR");
			queue1.add("GUINDY");
			queue1.add("LITTLE MOUNT");
			queue1.add("SAIDAPET");
			queue1.add("NANDANAM");
			queue1.add("THOUSAND LIGHTS");
			queue1.add("LIC");
			queue1.add("GOVT.EST");
			queue1.add("CHENNAI CENTRAL");
			queue1.add("HIGHCOURT");
			queue1.add("WASHERMANPET");
			List <String>queue2= new LinkedList<String>();
			queue2.add("ST.THOMAS MOUNT");
			queue2.add("ALANDUR");
			queue2.add("EKKADUTHANGAL");
			queue2.add("VADAPALANI");
			queue2.add("KOYAMBEDU");
			queue2.add("PACHAYAPA'S");
			queue2.add("KILPAK");
			queue2.add("NEHRU PARK");
			queue2.add("EGMORE");
			queue2.add("CHENNAI CENTRAL");
			List <String>queue3= new LinkedList<String>();
			queue3.add("WASHERMANPET");
			queue3.add("HIGHCOURT");
			queue3.add("CHENNAI CENTRAL");
			queue3.add("GOVT.EST");
			queue3.add("LIC");
			queue3.add("THOUSAND LIGHTS");
			queue3.add("NANDANAM");
			queue3.add("SAIDAPET");
			queue3.add("LITTLE MOUNT");
			queue3.add("GUINDY");
			queue3.add("ALANDUR");
			queue3.add("NANGANALLUR");
			queue3.add("MEENAMBAKAM");
			queue3.add("AIRPORT");
			List <String>queue4= new LinkedList<String>();
			queue4.add("CHENNAI CENTRAL");
			queue4.add("EGMORE");
			queue4.add("NEHRU PARK");
			queue4.add("KILPAK");
			queue4.add("PACHAYAPA'S");
			queue4.add("KOYAMBEDU");
			queue4.add("VADAPALANI");
			queue4.add("EKKADUTHANGAL");
			queue4.add("ALANDUR");
			queue4.add("ST.THOMAS MOUNT");
			//CROSSING
			List <String>queue5= new LinkedList<String>();
			queue5.add("AIRPORT");
			queue5.add("MEENAMBAKAM");
			queue5.add("NANGANALLUR");
			queue5.add("ALANDUR");
			queue5.add("EKKADUTHANGAL");
			queue5.add("VADAPALANI");
			queue5.add("KOYAMBEDU");
			queue5.add("PACHAYAPA'S");
			queue5.add("KILPAK");
			queue5.add("NEHRU PARK");
			queue5.add("EGMORE");
			queue5.add("CHENNAI CENTRAL");
			queue5.add("HIGHCOURT");
			queue5.add("WASHERMANPET");

			List <String>queue6= new LinkedList<String>();
			queue6.add("WASHERMANPET");
			queue6.add("HIGHCOURT"); 
			queue6.add("CHENNAI CENTRAL");
			queue6.add("EGMORE");
			queue6.add("NEHRU PARK");
			queue6.add("KILPAK");
			queue6.add("PACHAYAPA'S");
			queue6.add("KOYAMBEDU");
			queue6.add("VADAPALANI");
			queue6.add("EKKADUTHANGAL");
			queue6.add("ALANDUR");
			queue6.add("NANGANALLUR");
			queue6.add("MEENAMBAKAM");
			queue6.add("AIRPORT");

			List <String>queue7= new LinkedList<String>();
			queue7.add("ST.THOMAS MOUNT");
			queue7.add("ALANDUR");
			queue7.add("GUINDY");
			queue7.add("LITTLE MOUNT");
			queue7.add("SAIDAPET");
			queue7.add("NANDANAM");
			queue7.add("THOUSAND LIGHTS");
			queue7.add("LIC");
			queue7.add("GOVT.EST");
			queue7.add("CHENNAI CENTRAL");
			queue7.add("HIGHCOURT");
			queue7.add("WASHERMANPET");

			List <String>queue8= new LinkedList<String>();
			queue8.add("WASHERMANPET");
			queue8.add("HIGHCOURT");
			queue8.add("CHENNAI CENTRAL");
			queue8.add("GOVT.EST");
			queue8.add("LIC");
			queue8.add("THOUSAND LIGHTS");
			queue8.add("NANDANAM");
			queue8.add("SAIDAPET");					
			queue8.add("LITTLE MOUNT");
			queue8.add("GUINDY");
			queue8.add("ALANDUR");
			queue8.add("ST.THOMAS MOUNT");
			
			List <String>queue9= new LinkedList<String>();
			queue9.add("ST.THOMAS MOUNT");
			queue9.add("ALANDUR");
			queue9.add("NANGANALLUR");
			queue9.add("MEENAMBAKAM");
			queue9.add("AIRPORT");
			
			List <String>queue10= new LinkedList<String>();
			queue10.add("AIRPORT");
			queue10.add("MEENAMBAKAM");
			queue10.add("NANGANALLUR");
			queue10.add("ALANDUR");
			queue10.add("ST.THOMAS MOUNT");
			List <String>queue11= new LinkedList<String>();
			queue11.add("WASHERMANPET");
			queue11.add("HIGHCOURT");
			queue11.add("CHENNAI CENTRAL");
			queue11.add("GOVT.EST");
			queue11.add("LIC");
			queue11.add("THOUSAND LIGHTS");
			queue11.add("NANDANAM");
			queue11.add("SAIDAPET");					
			queue11.add("LITTLE MOUNT");
			queue11.add("GUINDY");
			queue11.add("ALANDUR");
			queue11.add("EKKADUTHANGAL");
			queue11.add("VADAPALANI");
			queue11.add("KOYAMBEDU");
			queue11.add("PACHAYAPA'S");
			queue11.add("KILPAK");
			queue11.add("NEHRU PARK");
			queue11.add("EGMORE");
			
			List <String>queue12= new LinkedList<String>();
			queue12.add("EGMORE");
			queue12.add("NEHRU PARK");
			queue12.add("KILPAK");
			queue12.add("PACHAYAPA'S");
			queue12.add("KOYAMBEDU");
			queue12.add("VADAPALANI");
			queue12.add("EKKADUTHANGAL");
			queue12.add("ALANDUR");
			queue12.add("GUINDY");
			queue12.add("LITTLE MOUNT");
			queue12.add("SAIDAPET");
			queue12.add("NANDANAM");
			queue12.add("THOUSAND LIGHTS");
			queue12.add("LIC");
			queue12.add("GOVT.EST");
			queue12.add("CHENNAI CENTRAL");
			queue12.add("HIGHCOURT");
			queue12.add("WASHERMANPET");
			
			ArrayList<String> al = new ArrayList<>();
			al.add("EGMORE");
			al.add("NEHRU PARK");
			al.add("KILPAK");
			al.add("PACHAYAPA'S");
			al.add("KOYAMBEDU");
			al.add("VADAPALANI");
			al.add("EKKADUTHANGAL");
			al.add("ALANDUR");
			al.add("GUINDY");
			al.add("LITTLE MOUNT");
			al.add("SAIDAPET");
			al.add("NANDANAM");
			al.add("THOUSAND LIGHTS");
			al.add("LIC");
			al.add("GOVT.EST");
			al.add("CHENNAI CENTRAL");
			al.add("HIGHCOURT");
			al.add("WASHERMANPET");
			al.add("ST.THOMAS MOUNT");
			al.add("NANGANALLUR");
			al.add("MEENAMBAKAM");
			al.add("AIRPORT");
			Collections.sort(al);
			System.out.println("THESE ARE THE CHENNAI METRO ROUTES : ");
			System.out.println(al.toString());
			System.out.println();
			System.out.print("ENTER YOUR PHONENUMBER:");
			String phoneNumber=sc.nextLine();
			if (!isValidPhoneNumber(phoneNumber)) {
		        System.out.println("❌ Invalid phone number! Must be exactly 10 digits.");
		        return; // Stop execution if phone number is invalid
		    }
			System.out.print("ENTER YOUR NAME : ");
			 namee = sc.next();
			namee+=sc.nextLine();
			System.out.print("ENTER ORIGIN : ");
			String orgin = sc.next(); 
			orgin+=sc.nextLine();
			orgin = orgin.toUpperCase();
			if(orgin.startsWith("GU")) {
				orgin = "GUINDY";
			}
			else if(orgin.startsWith("AI")) {
				orgin = "AIRPORT";
			}
			else if(orgin.startsWith("ME")) {
				orgin = "MEENAMBAKAM";
			}
			else if(orgin.startsWith("NANG")) {
				orgin = "NANGANALLUR";
			}
			else if(orgin.startsWith("AL")|| orgin.startsWith("AA")) {
				orgin = "ALANDUR";
			}
			else if(orgin.startsWith("LIT")) {
				orgin = "LITTLE MOUNT";
			}
			else if(orgin.startsWith("SAI")) {
				orgin = "SAIDAPET";
			}
			else if(orgin.startsWith("NAND")|| orgin.startsWith("NANT")) {
				orgin = "NANDANAM";
			}
			else if(orgin.startsWith("TH")) {
				orgin = "THOUSAND LIGHTS";
			}
			else if(orgin.startsWith("LI")) {
				orgin = "LIC";
			}
			else if(orgin.startsWith("GOV")) {
				orgin = "GOVT.EST";
			}
			else if(orgin.startsWith("CHE")|| orgin.startsWith("CENT")|| orgin.startsWith("MG")) {
				orgin = "CHENNAI CENTRAL";
			}
			else if(orgin.startsWith("HI")) {
				orgin = "HIGHCOURT";
			}
			else if(orgin.startsWith("W")||orgin.startsWith("VAN")) {
				orgin = "WASHERMANPET";
			}
			else if(orgin.startsWith("EG")) {
				orgin = "EGMORE";
			}
			else if(orgin.startsWith("NE")||orgin.startsWith("PARK")) {
				orgin = "NEHRU PARK";
			}
			else if(orgin.startsWith("KI")||orgin.startsWith("KE")) {
				orgin = "KILPAK";
			}
			else if(orgin.startsWith("PAC")) {
				orgin = "PACHAYAPA'S";
			}
			else if(orgin.startsWith("KO")|| orgin.startsWith("CO")) {
				orgin = "KOYAMBEDU";
			}
			else if(orgin.startsWith("VAD")) {
				orgin = "VADAPALANI";
			}
			else if(orgin.startsWith("EK")|| orgin.startsWith("EI")|| orgin.startsWith("IK")|| orgin.startsWith("EE")) {
				orgin = "EKKADUTHANGAL";
			}
			else if(orgin.startsWith("ST")|| orgin.startsWith("THOM")|| orgin.startsWith("MO")|| orgin.startsWith("PARA")) {
				orgin = "ST.THOMAS MOUNT";
			}
			System.out.print("ENTER  DESTINATION : ");
			String destination = sc.next();
			destination+=sc.nextLine();
			destination = destination.toUpperCase();
			if(destination.startsWith("GU")) {
				destination = "GUINDY";
			}
			else if(destination.startsWith("AI")) {
				destination = "AIRPORT";
			}
			else if(destination.startsWith("ME")) {
				destination = "MEENAMBAKAM";
			}
			else if(destination.startsWith("NANG")) {
				destination = "NANGANALLUR";
			}
			else if(destination.startsWith("AL")|| destination.startsWith("AA")) {
				destination = "ALANDUR";
			}
			else if(destination.startsWith("LIT")) {
				destination = "LITTLE MOUNT";
			}
			else if(destination.startsWith("SAI")) {
				 destination= "SAIDAPET";
			}
			else if(destination.startsWith("NAND")|| destination.startsWith("NANT")) {
				destination = "NANDANAM";
			}
			else if(destination.startsWith("TH")) {
				destination = "THOUSAND LIGHTS";
			}
			else if(destination.startsWith("LI")) {
				destination = "LIC";
			}
			else if(destination.startsWith("GOV")) {
				destination = "GOVT.EST";
			}
			else if(destination.startsWith("CHE")|| destination.startsWith("CENT")|| destination.startsWith("MG")) {
				destination = "CHENNAI CENTRAL";
			}
			else if(destination.startsWith("HI")) {
				destination = "HIGHCOURT";
			}
			else if(destination.startsWith("W")||destination.startsWith("VAN")) {
				destination = "WASHERMANPET";
			}
			else if(destination.startsWith("EG")) {
				destination = "EGMORE";
			}
			else if(destination.startsWith("NE")||destination.startsWith("PARK")) {
				destination = "NEHRU PARK";
			}
			else if(destination.startsWith("KI")||destination.startsWith("KE")) {
				destination = "KILPAK";
			}
			else if(destination.startsWith("PAC")) {
				destination = "PACHAYAPA'S";
			}
			else if(destination.startsWith("KO")|| destination.startsWith("CO")) {
				destination = "KOYAMBEDU";
			}
			else if(destination.startsWith("VAD")) {
				destination = "VADAPALANI";
			}
			else if(destination.startsWith("EK")|| destination.startsWith("EI")|| destination.startsWith("IK")|| destination.startsWith("EE")) {
				destination = "EKKADUTHANGAL";
			}
			else if(destination.startsWith("ST")|| destination.startsWith("THOM")|| destination.startsWith("MO")|| destination.startsWith("PARA")) {
				destination = "ST.THOMAS MOUNT";
			}
			System.out.println();
			System.out.println("YOUR ROUTE IS : ");
			System.out.println("-----------------\n");
			list.add(new Passenger(namee,orgin,destination,phoneNumber));
			
			boolean flag = true;
			
			if(queue1.contains(orgin) && queue1.contains(destination) && flag==true) {
			int fst1 = queue1.indexOf(orgin);
			int sec1 = queue1.indexOf(destination);
			System.out.println("QUEUE 1");
			
			if(fst1<sec1) {
			for(int i = fst1; i<=sec1; i++) {
//				if(route == true) {
//				if(queue1.get(i)=="EKKADUTHANGAL" || queue1.get(i)=="EGMORE") {
//					System.out.println("PLATFORM NO  : 2");
//					route = false;
//				}
//			}
				if(i==sec1) {
					System.out.print(queue1.get(i));
					
				}
				else {
					Thread.sleep(400);
				System.out.print(queue1.get(i)+" --> ");
				}
			}
			System.out.println("\nYOUR PLATFORM NUMBER IS : 1 (BLUE LINE)");
			flag=false;
			}
			}
			//
			if(queue2.contains(orgin) && queue2.contains(destination) && flag==true) {
			int fst2 = queue2.indexOf(orgin);
			int sec2 = queue2.indexOf(destination);
			if(fst2<sec2) {
				System.out.println("QUEUE 2");
			for(int i = fst2; i<=sec2; i++) {
				if(i==sec2) {
					System.out.print(queue2.get(i));
					break;
				}
				else {
					Thread.sleep(400);
				System.out.print(queue2.get(i)+" --> ");
				}
			}
			System.out.println("\n \nYOUR PLATFORM NUMBER IS : 1 (GREEN LINE)");
			flag=false;
			}
			}
			//
			if(queue3.contains(orgin) && queue3.contains(destination) && flag==true) {
				int fst3 = queue3.indexOf(orgin);
				int sec3 = queue3.indexOf(destination);
				if(fst3<sec3) {
				System.out.println("QUEUE 3");
				for(int i = fst3; i<=sec3; i++) {
					if(i==sec3) {
						System.out.print(queue3.get(i));
						break;
					}
					else {
						Thread.sleep(400);
					System.out.print(queue3.get(i)+" --> ");
					}
				}
				flag=false;
				}
				}
			//
			if(queue4.contains(orgin) && queue4.contains(destination) && flag==true) {
				int fst4 = queue4.indexOf(orgin);
				int sec4 = queue4.indexOf(destination);
				if(fst4<sec4) {
				System.out.println("QUEUE 4");
				for(int i = fst4; i<=sec4; i++) {
					if(i==sec4) {
						System.out.print(queue4.get(i));
						break;
					}
					else {
						Thread.sleep(400);
					System.out.print(queue4.get(i)+" --> ");
					}
				}
				flag=false;
				}
				}
			//
			if(queue5.contains(orgin) && queue5.contains(destination) && flag==true) {
				int fst5 = queue5.indexOf(orgin);
				int sec5 = queue5.indexOf(destination);
				if(fst5<sec5) {
				System.out.println("QUEUE 5");
				for(int i = fst5; i<=sec5; i++) {
					
					if(queue5.get(i)=="EKKADUTHANGAL") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue5.get(i));
						if(destination.equals(queue5.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}																	// CHANGES
					else if(i==sec5 && queue5.get(i)!="EKKADUTHANGAL") {
						Thread.sleep(400);
						System.out.print(queue5.get(i));
						break;
					}
					
					else {
						String letter = queue5.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue5.get(i)+" --> ");
					}
					
//					if(i==sec5) {
//						System.out.print(queue5.get(i));
//						break;
//						 
//					}
//					if(queue5.get(i)=="EKKADUTHANGAL") {
//						
//						System.out.println();
//						System.out.println("                                                       |");
//						Thread.sleep(700);
//						System.out.println("                                                       |");
//						Thread.sleep(700);
//						System.out.print("				                       ---> "+queue5.get(i)+" --> ");
//					}
//					else {
//						Thread.sleep(400);
//					System.out.print(queue5.get(i)+" --> ");
//					}
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (BLUE LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 4 (GREEN LINE) ]");
				space = 0;
				flag=false;
				}
			}
			//
			if(queue6.contains(orgin) && queue6.contains(destination) && flag==true) {
				int fst6 = queue6.indexOf(orgin);
				int sec6 = queue6.indexOf(destination);
				if(fst6<sec6) {
				System.out.println("QUEUE 6");
				for(int i = fst6; i<=sec6; i++) {
					
					if(queue6.get(i)=="EGMORE") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue6.get(i));
						if(destination.equals(queue6.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}																	// CHANGES
					else if(i==sec6 && queue6.get(i)!="EGMORE") {
						Thread.sleep(400);
						System.out.print(queue6.get(i));
						break;
					}
					
					else {
						String letter = queue6.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue6.get(i)+" --> ");
					}
					
//					if(i==sec6) {
//						System.out.print(queue6.get(i));
//						break;
//					}
//					if(queue6.get(i)=="EGMORE") {
//						
//						System.out.println();
//						System.out.println("                                                  |");
//						Thread.sleep(700);
//						System.out.println("                                                  |");
//						Thread.sleep(700);
//						System.out.print("				                  ---> "+queue6.get(i)+" --> ");
//					}
//					else {
//						Thread.sleep(400);
//					System.out.print(queue6.get(i)+" --> ");
//					}
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (BLUE LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT CENTRAL ON PLATFORM NUMBER : 1 (GREEN LINE) ]");
				space = 0;
				flag=false;
				}
				}
			//
			if(queue7.contains(orgin) && queue7.contains(destination) && flag==true) {
				int fst7 = queue7.indexOf(orgin);
				int sec7 = queue7.indexOf(destination);
				if(fst7<sec7) {
				System.out.println("QUEUE 7");
				 space = 0;
				for(int i = fst7; i<=sec7; i++) {
					
//					if(queue7.get(i)=="GUINDY") {
//						
//						System.out.println();
//						System.out.println("                               |");
//						Thread.sleep(700);
//						System.out.println("                               |");
//						Thread.sleep(700);
//						System.out.print("		               ---> "+queue7.get(i)+" --> ");
//					}
					if(queue7.get(i)=="GUINDY") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue7.get(i));
						if(destination.equals(queue7.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}																	// CHANGES
					else if(i==sec7 && queue7.get(i)!="GUINDY") {
						Thread.sleep(400);
						System.out.print(queue7.get(i));
						break;
					}
					
					else {
						String letter = queue7.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue7.get(i)+" --> ");
					}
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (GREEN LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 2 (BLUE LINE) ]");
				space = 0;
				flag=false;
				}
				}
			if(queue8.contains(orgin) && queue8.contains(destination) && flag==true) {
				int fst8 = queue8.indexOf(orgin);
				int sec8 = queue8.indexOf(destination);
				if(fst8<sec8) {
				System.out.println("QUEUE 8");
				int space = 0;
				for(int i = fst8; i<=sec8; i++) {
					
					if(i==sec8) {
						//System.out.print(queue8.get(i));
						//break;
					}
//					if(queue8.get(i)=="ST.THOMAS MOUNT") {
//						
//						System.out.println();
//						System.out.println("                                                                            									            |");
//						Thread.sleep(700);
//						System.out.println("                                                                              									   	    |");
//						Thread.sleep(700);
//						System.out.print("		                                                                 								            ---> "+queue8.get(i));
//						break;
//					}
					if(queue8.get(i)=="ST.THOMAS MOUNT") {
						System.out.println();
						int z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(400);
						System.out.print("---> "+queue8.get(i));
						break;
					}
					if(i==sec8) {
						Thread.sleep(400);
						System.out.print("---> "+queue8.get(i));
						break;
					}
					else {
						String letter = queue8.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						//System.out.println("SPACE : "+space);
						Thread.sleep(400);
					System.out.print(queue8.get(i)+" --> ");
					}
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (BLUE LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 3 (GREEN LINE) ]");
				space = 0;
				flag=false;
				}
				}
			if(queue9.contains(orgin) && queue9.contains(destination) && flag==true) {
				int fst9 = queue9.indexOf(orgin);
				int sec9 = queue9.indexOf(destination);
				if(fst9<sec9) {
					System.out.println("QUEUE 9");
				for(int i = fst9; i<=sec9; i++) {
					
					if(queue9.get(i)=="NANGANALLUR") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue9.get(i));
						if(destination.equals(queue9.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}						 											// CHANGES
					else if(i==sec9 && queue9.get(i)!="NANGANALLUR") {
						Thread.sleep(400);
						System.out.print(queue9.get(i));
						break;
					}
					
					else {
						String letter = queue9.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue9.get(i)+" --> ");
					}
					
//					if(i==sec9) {
//						System.out.print(queue9.get(i));
//						break;
//					}
//					else {
//					System.out.print(queue9.get(i)+" --> ");
//					}
					
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (GREEN LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 1 (BLUE LINE) ]");
				space = 0;
				flag=false;
				}
				}
			if(queue10.contains(orgin) && queue10.contains(destination) && flag==true) {
				int fst10 = queue10.indexOf(orgin);
				int sec10 = queue10.indexOf(destination);
				if(fst10<sec10) {
					System.out.println("QUEUE 10");
				for(int i = fst10; i<=sec10; i++) {
//					if(i==sec10) {
//						System.out.print(queue10.get(i));
//						break;
//					}
//					else {
//					System.out.print(queue10.get(i)+" --> ");
//					}
					
					if(queue10.get(i)=="ST.THOMAS MOUNT") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue10.get(i));
						if(destination.equals(queue10.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}						 											// CHANGES
					else if(i==sec10 && queue10.get(i)!="ST.THOMAS MOUNT") {
						Thread.sleep(400);
						System.out.print(queue10.get(i));
						break;
					}
					
					else {
						String letter = queue10.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue10.get(i)+" --> ");
					}
					
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (BLUE LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 3 (GREEN LINE) ]");
				space = 0;
				flag=false;
				}
				}
			if(queue11.contains(orgin) && queue11.contains(destination) && flag==true) {
				int fst11 = queue11.indexOf(orgin);
				int sec11 = queue11.indexOf(destination);
				if(fst11<sec11) {
					System.out.println("QUEUE 11");
				for(int i = fst11; i<=sec11; i++) {
//					if(i==sec11) {
//						System.out.print(queue11.get(i));
//						break;
//					}
//					else {
//					System.out.print(queue11.get(i)+" --> ");
//					}
					
					if(queue11.get(i)=="EKKADUTHANGAL") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue11.get(i));
						if(destination.equals(queue11.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}						 											// CHANGES
					else if(i==sec11 && queue11.get(i)!="EKKADUTHANGAL") {
						Thread.sleep(400);
						System.out.print(queue11.get(i));
						break;
					}
					
					else {
						String letter = queue11.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue11.get(i)+" --> ");
					}

					
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (BLUE LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 4 (GREEN LINE) ]");
				space = 0;
				flag=false;
				}
				}
			if(queue12.contains(orgin) && queue12.contains(destination) && flag==true) {
				int fst12 = queue12.indexOf(orgin);
				int sec12 = queue12.indexOf(destination);
				if(fst12<sec12) {
					System.out.println("QUEUE 12");
				for(int i = fst12; i<=sec12; i++) {
//					if(i==sec12) {
//						System.out.print(queue12.get(i));
//						break;
//					}
//					else {
//					System.out.print(queue12.get(i)+" --> ");
//					}
					
					if(queue12.get(i)=="GUINDY") {
						System.out.println();
						 z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(700);
						System.out.print("|\n");
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						Thread.sleep(700);
						System.out.print("|\n");
						z = 0;
						while(z<space-1) {
							System.out.print(" ");
							z++;
						}
						z = 0;
						Thread.sleep(400);
						System.out.print("---> "+queue12.get(i));
						if(destination.equals(queue12.get(i))) {
							break;
						}
						else {
							System.out.print(" --> ");
						}
						
					}						 											// CHANGES
					else if(i==sec12 && queue12.get(i)!="GUINDY") {
						Thread.sleep(400);
						System.out.print(queue12.get(i));
						break;
					}
					
					else {
						String letter = queue12.get(i);
						for(int k = 0; k<letter.length(); k++) {
							space++;
						}
						space=space+5;
						Thread.sleep(400);
					System.out.print(queue12.get(i)+" --> ");
					}

					
				}
				System.out.println();
				System.out.println("\n[ YOUR PLATFORM NUMBER IS :  1 (GREEN LINE)");
				System.out.println("* YOU NEED TO CHANGE THE TRAIN AT ALANDUR ON PLATFORM NUMBER : 2 (BLUE LINE) ]");
				space = 0;
				flag=false;
				}
				}
			
//			while(its.hasNext()) {
//				String strr = its.next();
//				
//					System.out.print(strr+"-->");
//				
//			}
			
			queue1 = null;
			queue2 = null;
			queue3 = null;
			queue4 = null;
			queue5 = null;
			queue6 = null;
			queue7 = null;
			queue8 = null;
			queue9 = null;
			queue10 = null;
			System.gc();
		
			System.out.println();
			saveTravelHistory(namee, orgin, destination,phoneNumber);
			System.out.println("TICKET BOOKED SUCCESFULLY !");

		}
		
		Iterator<Passenger> its = list.iterator();
		
		public void disply() {
			it = list.iterator();
			while(it.hasNext()) {
				Passenger p = it.next();
				System.out.println(p);
			}
		}
		public void seeRoute() {
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("--*AIRPORT--*MEENAMPAKAM--*NANGANALLUR--*GUINDY--*LITTLE MOUNT--*SAIDAPET--*NANDANAM--*THOUSAND LIGHTS--*LIC--*GOVT.EST--*HIGH COURT--*WASHERMANPET");
			System.out.println("                              	      |  										| ");
			System.out.println("                                  *ALANDUR								   	 CHENNAI CENTRAL");
			System.out.println("			              |											|");
			System.out.println("		   --*ST.THOMAS MOUNT--*EKKADUTHANGAL--*VADAPALANI--*KOYAMBEDU--*PACHAYAPA'S--*KILPAK--*NEHRU PARK--*EGMORE");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		public boolean isValidPhoneNumber(String phoneNumber) {
		    return phoneNumber.matches("\\d{10}");  // Ensures exactly 10 digits
		}


		public void saveTravelHistory(String name, String origin, String destination,String phoneNumber) {
			 
			String query = "INSERT INTO TravelHistory (name, origin, destination,phone_number) VALUES (?, ?, ?,?)";
		    
		    try (Connection conn = Database.getConnection();
		         PreparedStatement stmt = conn.prepareStatement(query)) {
		        stmt.setString(1, name);
		        stmt.setString(2, origin);
		        stmt.setString(3, destination);
		        stmt.setString(4, phoneNumber);
		        stmt.executeUpdate();
		        System.out.println("Travel history saved!");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}


		public void getTravelHistory(String phoneNumber) {
		    String query = "SELECT * FROM TravelHistory WHERE phone_number = ?";

		    try (Connection conn = Database.getConnection();
		         PreparedStatement stmt = conn.prepareStatement(query)) {
		         
		        stmt.setString(1, phoneNumber);
		        ResultSet rs = stmt.executeQuery();

		        if (!rs.isBeforeFirst()) {  // No records found
		            System.out.println("No travel history found for this phone number.");
		            return;
		        }

		        System.out.println("Travel History for Phone Number: " + phoneNumber);
		        while (rs.next()) {
		            System.out.println(
		                               "Name: " + rs.getString("name") +
		                               ", Origin: " + rs.getString("origin") +
		                               ", Destination: " + rs.getString("destination") +
		                               ", Travel Time: " + rs.getTimestamp("travel_time"));
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

}

//		public void delete() {
//			System.out.print("ENTER USER NAME TO DELETE : ");
//			String name = sc.next();
//			its = list.iterator();
//			while(its.hasNext()) {
//				Passenger p = its.next();
//				if(namee==name){
//					its.remove();
//					}
//			}
//		}
		
	









