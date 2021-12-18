package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("Desktop is currently noy available");
	}
	public static void main(String[] args) {
		Desktop com=new Desktop();
		com.computerModel();
		com.desktopSize();
	}

}
