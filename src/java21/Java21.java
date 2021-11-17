package java21;

import java.util.Scanner;
public class Java21{ 
	static  int player1[]=new int[3];
	static  int player2[]=new int[3];
	static int player3[]=new int[3];
        static int player4[]=new int[3];
	static int total1;
	static int total2;
	static int total3;
        static int total4;
	static String answer2, name, name2, name3, name4;
	public static void main(String[] args) {/*The main Method combines all different versions of the code*/
		Scanner Dylan=new Scanner(System.in);
		String answer, answer2;
		System.out.println("********************");
		System.out.println("*      Welcome     *");
		System.out.println("*        To        *");
		System.out.println("*      Java 21     *");
		System.out.println("********************");
		System.out.println("Welcome to Java 21, Would you like to play?");
		answer=Dylan.next();
		if(answer.equalsIgnoreCase("yes")){
                    
		System.out.println("This game supports up to four players. How many players would like to play.");
                int pn=Dylan.nextInt();
                if(pn==3){
                    
                
                    do{
                    
                                PlN();                            
				Pl1();
				System.out.println(" ");
				Pl2();
				System.out.println(" ");
				Pl3();
				if (total1==21){
					System.out.println(name+" you are the winner!!!");
					System.exit(0);
                                        
                                        
				}
				else if (total2==21){
                                        System.out.println(name2+" you are the winner!!!");
                                        System.exit(0);
				}
				else if (total3==21) {
					System.out.println(name3+" you are the winner!!!");
                                        System.exit(0);
				}
                                else if(total1==21&&total2==21){
                                    System.out.println(name+" and "+name2+" you are both winners!!!");
                                    System.exit(0);
                                }
                                 else if(total1==21&&total3==21){
                                    System.out.println(name+" and "+name3+" you are both winners!!!");
                                    System.exit(0);
                                 }
                                  else if(total3==21&&total2==21){
                                    System.out.println(name2+" and "+name3+" you are both winners!!!");
                                    System.exit(0);
                                  }
                                  
				else {
				Pl4();
				Pl5();
				
                                }
                                System.out.println("\nWould you like to play again.");
				answer2=Dylan.next();
			}while(answer2.equalsIgnoreCase("yes"));
                        System.out.println("Thank you for playing!!!");
                        System.exit(0);
                }
                else if(pn==2){
                    do{
                    Pln2();
                    Pl1();
                    System.out.println(" ");
                    Pl2();
                    if (total1==21){
					System.out.println(name+" you are the winner!!!");
					System.exit(0);
				}
				else if (total2==21){
                                        System.out.println(name2+" you are the winner!!!");
                                        System.exit(0);
				}
                                 else if(total1==21&&total2==21){
                                    System.out.println(name+" and "+name2+" you are both winners!!!");
                                    System.exit(0);
                                 }
                                else{
                    P145();
                    Pl5();
                  
                                }
                    System.out.println("\nWould you like to play again.");
				answer2=Dylan.next();
                     }while(answer2.equalsIgnoreCase("yes"));
                        System.out.println("Thank you for playing!!!");
                        System.exit(0);
                }
                else if (pn==4){
                    do{
                    PLN3();
                    Pl1();
                    System.out.println(" ");
                    Pl2();
                    System.out.println(" ");
		    Pl3();
                    System.out.println(" ");
		    Pl35();
                    if (total1==21){
					System.out.println(name+" you are the winner!!!");
					System.exit(0);
				}
				else if (total2==21){
                                        System.out.println(name2+" you are the winner!!!");
                                        System.exit(0);
				}
				else if (total3==21) {
					System.out.println(name3+" you are the winner!!!");
                                        System.exit(0);
				}
                                else if(total4==21){
                                    System.out.println(name4+" you are the winner!!!");
                                    System.exit(0);
                                }
                                else if(total3<=21&&total3==total1&&total3>total2&&total3>total4){
                                System.out.println(name3+" and "+name+" you are both winners!!!");
                                System.exit(0);
                                }
		                else if(total2<=21&&total2==total3&&total2>total1&&total2>total4){
			        System.out.println(name3+" and "+name2+" you are both winners!!!");
                                System.exit(0);
		                 }
		                else if(total1<=21&&total1==total2&&total1>total3&&total1>total4){
			        System.out.println(name2+" and "+name+" you are both winners!!!");
                                System.exit(0);
		                 }
                                else if(total4<=21&&total4==total1&&total4>total2&&total4>total3){
                                System.out.println(name+" and "+name4+" you are both winners!!!");
                                System.exit(0);
                                }
                                else if(total4<=21&&total4==total2&&total4>total1&&total4>total3){
                                System.out.println(name2+" and "+name4+" you are both winners!!!");
                                System.exit(0);
                                }
                             else if(total4<=21&&total4==total3&&total4>total2&&total4>total1){
                            System.out.println(name3+" and "+name4+" you are both winners!!!");
                            System.exit(0);
                }
                    else{
                    Pl36();
                    Pl5();
                }
                    System.out.println("\nWould you like to play again.");
				answer2=Dylan.next();
                     }while(answer2.equalsIgnoreCase("yes"));
                        System.out.println("Thank you for playing!!!");
                        System.exit(0);
                }
                else{
                System.out.println("That answer is not compatable.");
                
                }
                } 
		else{
			System.out.println("Thank You for considering my program.");
			System.exit(0);
		
		}
                
	}
        public static void PlN(){/*PLN1-3 ask for the players usernames.*/
            Scanner Dylan=new Scanner(System.in);
            System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            System.out.println("Player two please enter your name or username.");
            name2=Dylan.next();
            System.out.println("Player three please enter your name or username");
            name3=Dylan.next();
           if (name3.equalsIgnoreCase(name2)&&name3.equalsIgnoreCase(name)){
                System.out.println("You cant have three of the same username please enter a different name.");
               
                System.out.println("Player two please enter your name or username");
            name2=Dylan.next();
                
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
            else if(name.equalsIgnoreCase(name2)){
                System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
            else if(name.equalsIgnoreCase(name3)){
             System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
            else if(name3.equalsIgnoreCase(name2)){
              System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player two please enter your name or username");
            name2=Dylan.next();
            }
            
        }
        public static void Pln2(){
          Scanner Dylan=new Scanner(System.in);
            System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            System.out.println("Player two please enter your name or username.");
            name2=Dylan.next();
            if(name.equalsIgnoreCase(name2)){
                System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
        }
        public static void PLN3(){
            Scanner Dylan=new Scanner(System.in);
            System.out.println("Player one please enter your name or username.");
            name=Dylan.next();
            System.out.println("Player two please enter your name or username.");
            name2=Dylan.next();
            System.out.println("Player three please enter your name or username.");
            name3=Dylan.next();
            System.out.println("Player four please enter your username.");
            name4=Dylan.next();
           if (name3.equalsIgnoreCase(name2)&&name3.equalsIgnoreCase(name)&&name3.equalsIgnoreCase(name4)){
                System.out.println("You cant have three of the same username please enter a different name.");
               
                System.out.println("Player two please enter your name or username");
            name2=Dylan.next();
                
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
            else if(name.equalsIgnoreCase(name2)){
                System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
            else if(name.equalsIgnoreCase(name3)){
             System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player one please enter your name or username");
            name=Dylan.next();
            }
            else if(name3.equalsIgnoreCase(name2)){
             System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player two please enter your name or username");
            name2=Dylan.next();
            }
           else if(name4.equalsIgnoreCase(name)){
              System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player four please enter your name or username");
            name4=Dylan.next(); 
           }
            else if(name4.equalsIgnoreCase(name2)){
              System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player four please enter your name or username");
            name4=Dylan.next(); 
           }
            else if(name4.equalsIgnoreCase(name3)){
              System.out.println("");
             System.out.println("You cant have two of the same username please enter a different name.");
               
                System.out.println("Player four please enter your name or username");
            name4=Dylan.next(); 
           }
        }
	public static void Pl1(){/*PL1-3 all generate the random numbers and add up a total*/
		player1[0]=(int) (Math.random()*13+1);
		player1[1]=(int) (Math.random()*13+1);
		System.out.println(name+" your Random numbers are "+player1[0]+(" and ")+player1[1]);
		total1=player1[1]+player1[0];
		System.out.println(total1+" is your total");
	}
	public static void Pl2(){
		player2[0]=(int) (Math.random()*13+1);
		player2[1]=(int) (Math.random()*13+1);
		System.out.println(name2+" your Random numbers are "+player2[0]+(" and ")+player2[1]);
		total2=player2[0]+player2[1];
		System.out.println(total2+" is your total");
	}
	public static void Pl3(){
		player3[0]=(int) (Math.random()*13+1);
		player3[1]=(int) (Math.random()*13+1);
		System.out.println(name3+" your Random numbers are "+player3[0]+(" and ")+player3[1]);
		total3=player3[0]+player3[1];
		System.out.println(total3+" is your total");
	}
        public static void Pl35(){
            player4[0]=(int) (Math.random()*13+1);
		player4[1]=(int) (Math.random()*13+1);
		System.out.println(name4+" your Random numbers are "+player4[0]+(" and ")+player4[1]);
		total4=player4[0]+player4[1];
		System.out.println(total4+" is your total");
        }
        public static void Pl36(){/*PL36, 4, 45 ask the players if they want a hit or not.*/
		do{
			Scanner Dylan=new Scanner(System.in);
			System.out.println("\ndo any players want a hit?");
			String answer1=Dylan.next();
			if(answer1.equalsIgnoreCase(name)){
				player1[2]=(int) (Math.random()*13+1);
				total1=total1+player1[2];
			}
			else if(answer1.equalsIgnoreCase(name2)){
				player2[2]=(int) (Math.random()*13+1); 
				total2=total2+player2[2];
			}
			else if(answer1.equalsIgnoreCase(name3)){
				player3[2]=(int) (Math.random()*13+1); 
				total3=total3+player3[2];
			}
                        else if(answer1.equalsIgnoreCase(name4)){
				player4[2]=(int) (Math.random()*13+1); 
				total4=total4+player4[2];
			}
                        else if(answer1.equalsIgnoreCase("exit")){
                             System.out.println("Thank you for playing!!!");
                        System.exit(0);
                        }
                        
			System.out.println("Would another player want a hit.");
			answer2=Dylan.next();
		}while(answer2.equalsIgnoreCase("yes"));
		System.out.println(name+" your new total is "+total1);
		System.out.println(" ");
		System.out.println(name2+" your new total is "+total2);
		System.out.println(" ");
		System.out.println(name3+" your new total is "+total3);
                System.out.println(" ");
                System.out.println(name4+" your new total is "+total4);
	}
	public static void Pl4(){
		do{
			Scanner Dylan=new Scanner(System.in);
			System.out.println("\ndo any players want a hit?");
			String answer1=Dylan.next();
			if(answer1.equalsIgnoreCase(name)){
				player1[2]=(int) (Math.random()*13+1);
				total1=total1+player1[2];
			}
			else if(answer1.equalsIgnoreCase(name2)){
				player2[2]=(int) (Math.random()*13+1); 
				total2=total2+player2[2];
			}
			else if(answer1.equalsIgnoreCase(name3)){
				player3[2]=(int) (Math.random()*13+1); 
				total3=total3+player3[2];
			}
                        else if(answer1.equalsIgnoreCase("exit")){
                             System.out.println("Thank you for playing!!!");
                        System.exit(0);
                        }
                            
			System.out.println("\nWould another player want a hit?");
			answer2=Dylan.next();
		}while(answer2.equalsIgnoreCase("yes"));
		System.out.println(name+" your new total is "+total1);
		System.out.println(" ");
		System.out.println(name2+" your new total is "+total2);
		System.out.println(" ");
		System.out.println(name3+" your new total is "+total3);
	}
        public static void P145(){
         do{
			Scanner Dylan=new Scanner(System.in);
			System.out.println("do any players want a hit?");
			String answer1=Dylan.next();
			if(answer1.equalsIgnoreCase(name)){
				player1[2]=(int) (Math.random()*13+1);
				total1=total1+player1[2];
			}
			else if(answer1.equalsIgnoreCase(name2)){
				player2[2]=(int) (Math.random()*13+1); 
				total2=total2+player2[2];
			}
                        else if(answer1.equalsIgnoreCase("exit")){
                             System.out.println("Thank you for playing!!!");
                        System.exit(0);
                        }
                        System.out.println("Would another player want to add a card.");
			answer2=Dylan.next();
		}while(answer2.equalsIgnoreCase("yes"));
		System.out.println(name+" your new total is "+total1);
		System.out.println(" ");
		System.out.println(name2+" your new total is "+total2);
		System.out.println(" ");
}
	public static void Pl5(){/*PL5 all the victory criteria*/
		if(total1<=21&&total1>total2&&total1>total3&&total1>total4){
			System.out.println(name+" you are the winner!!!");
		}
		else if(total2<=21&&total2>total1&&total2>total3&&total2>total4){
			System.out.println(name2+" you are the winner!!!");
		}
                else if(total4<=21&&total4>total1&&total4>total2&&total4>total3){
                    System.out.println(name4+" you are the winner!!!");
                }
		else if(total3<=21&&total3>total1&&total3>total2&&total3>total4){
			System.out.println(name3+" you are the winner!!!");
		}
		else if(total3<=21&&total3==total1&&total3>total2&&total3>total4){
			System.out.println(name3+" and "+name+" you are both winners!!!");
		}
		else if(total2<=21&&total2==total3&&total2>total1&&total2>total4){
			System.out.println(name3+" and "+name2+" you are both winners!!!");
		}
		else if(total1<=21&&total1==total2&&total1>total3&&total1>total4){
			System.out.println(name2+" and "+name+" you are both winners!!!");
		}
                else if(total4<=21&&total4==total1&&total4>total2&&total4>total3){
                    System.out.println(name+" and "+name4+" you are both winners!!!");
                }
                else if(total4<=21&&total4==total2&&total4>total1&&total4>total3){
                    System.out.println(name2+" and "+name4+" you are both winners!!!");
                }
                else if(total4<=21&&total4==total3&&total4>total2&&total4>total1){
                    System.out.println(name3+" and "+name4+" you are both winners!!!");
                }
		else if(total1<=21&&total2>21&&total3>21&&total4>21){
			System.out.println(name+" is the winner!!!");    
		}
		else if(total2<=21&&total1>21&&total3>21&&total4>21){
			System.out.println(name2+" is the winner!!!");  
		}
		else if(total3<=21&&total2>21&&total1>21&&total4>21){
			System.out.println(name3+" is the winner!!!"); 
		}
                else if(total4<=21&&total1>21&&total2>21&&total3>21){
                    System.out.println(name4+" you are the winner!!!");
                }
		else if(total1<=21&&total1>total2&&total3>21&&total1>total4){
			System.out.println(name+" you are the winner!!!");    
		}
		else if(total1<=21&&total1>total3&&total2>21&&total1>total4){
			System.out.println(name+" you are the winner!!!"); 
		}
                else if(total1<=21&&total1>total2&&total4>21&&total1>total3){
                    System.out.println(name+" you are the winner!!!"); 
                }
		else if(total2<=21&&total2>total1&&total3>21&&total2>total4){
			System.out.println(name2+" you are the winner!!!"); 
		}
		else if(total2<=21&&total2>total3&&total1>21&&total2>total4){
			System.out.println(name2+" you are the winner!!!"); 
		}
                else if(total2<=21&&total2>total3&&total4>21&&total2>total3){
                    System.out.println(name2+" you are the winner!!!");
                }
		else if(total3<=21&&total3>total2&&total1>21&&total3>total4){
			System.out.println(name3+" you are the winner!!!"); 
		}
		else if(total3<=21&&total3>total1&&total2>21&&total3>total4){
			System.out.println(name3+" you are the winner!!!"); 
		}
                else if(total3<=21&&total3>total1&&total4>21&&total3>total2){
                   System.out.println(name3+" you are the winner!!!");  
                }
                else if(total4<=21&&total4>total1&&total2>21&&total4>total3){
			System.out.println(name4+" you are the winner!!!"); 
                }
                else if(total4<=21&&total4>total2&&total1>21&&total4>total3){
			System.out.println(name4+" you are the winner!!!"); 
                }
                else if(total4<=21&&total4>total1&&total3>21&&total4>total2){
			System.out.println(name4+" you are the winner!!!"); 
                }
                 else if(total4<=21&&total4>total1&&total3>21&&total2>21){
			System.out.println(name4+" you are the winner!!!"); 
                 }
                 else if(total4<=21&&total4>total2&&total3>21&&total1>21){
			System.out.println(name4+" you are the winner!!!"); 
                 }
                 else if(total4<=21&&total4>total3&&total1>21&&total2>21){
			System.out.println(name4+" you are the winner!!!"); 
                 }
                 else if(total3<=21&&total3>total1&&total2>21&&total4>21){
			System.out.println(name3+" you are the winner!!!"); 
                 }
                else if(total3<=21&&total3>total2&&total1>21&&total4>21){
			System.out.println(name3+" you are the winner!!!"); 
                 }
                else if(total3<=21&&total3>total4&&total2>21&&total1>21){
			System.out.println(name3+" you are the winner!!!"); 
                 }
                else if(total2<=21&&total2>total1&&total3>21&&total4>21){
			System.out.println(name2+" you are the winner!!!"); 
                 }
                 else if(total2<=21&&total2>total3&&total1>21&&total4>21){
			System.out.println(name2+" you are the winner!!!"); 
                 }
                 else if(total2<=21&&total2>total4&&total1>21&&total3>21){
			System.out.println(name2+" you are the winner!!!"); 
                 }
                 else if(total1<=21&&total1>total2&&total3>21&&total4>21){
			System.out.println(name+" you are the winner!!!"); 
                 }
                else if(total1<=21&&total1>total3&&total2>21&&total4>21){
			System.out.println(name+" you are the winner!!!"); 
                 }
                else if(total1<=21&&total1>total4&&total2>21&&total3>21){
			System.out.println(name+" you are the winner!!!"); 
                 }
	}
}
