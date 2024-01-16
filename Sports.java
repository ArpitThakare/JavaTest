//Write a Java program to create a base class Sports with a method called play(). Create three 
//subclasses: Football, Basketball,
//and Rugby. Override the play() method in each subclass to play a specific statement for each spor



package testt;

//Sports base class
class Sportss {

 public void play() {
     System.out.println("Playing a generic sports");
 }
}

//Football subclass
class Football extends Sportss {
 
 public void play() {
     System.out.println("Playing Football");
 }
}

//Basketball subclass
class Basketball extends Sportss {

 public void play() {
     System.out.println("Playing Basketball");
 }
}

//Rugby subclass
class Rugby extends Sportss {
 
 public void play() {
     System.out.println("Playing Rugby");
 }
}


public class Sports {
 public static void main(String[] args) {
     // Create objects 
	 Football football = new Football();
	 Basketball basketball = new Basketball();
	 Rugby rugby = new Rugby();

     
     football.play();
     basketball.play();
     rugby.play();
 }
}
