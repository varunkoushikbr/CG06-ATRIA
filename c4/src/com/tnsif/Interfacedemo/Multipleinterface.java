package com.tnsif.Interfacedemo;

interface Camera{
	void takephoto();
}
interface Musicplayer{
	void playmusic();
}
class Smartphone implements Camera,Musicplayer{

	@Override
	public void playmusic() {
		System.out.println("Taking a photo with the Smartphone");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Playmusic on the smartphone:");
		
	}
	
}

public class Multipleinterface {
	public static void main(String[] args) {
		Smartphone s= new Smartphone();
		s.takephoto();
		s.playmusic();
	}

}
