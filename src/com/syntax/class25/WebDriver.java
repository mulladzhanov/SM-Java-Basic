package com.syntax.class25;

public interface WebDriver {
	
	void open();
	void close();
	String getTitle();

}

interface TakeScreenshot {
	
	void takeScreenshot();
	
}

interface RemoteWebDriver extends WebDriver,TakeScreenshot {
	
	void navigate();

}
class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public String getTitle() {
		return null;
	}

	@Override
	public void takeScreenshot() {
	
	}

	@Override
	public void navigate() {
	
	}
		
}

class FireFoxDriver implements WebDriver,TakeScreenshot {

	@Override
	public void takeScreenshot() {
		
		
	}

	@Override
	public void open() {
		
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public String getTitle() {
	
		return null;
	}
	
}

class SafariDriver implements WebDriver,TakeScreenshot {

	@Override
	public void takeScreenshot() {
		
		
	}

	@Override
	public void open() {
		
		
	}

	@Override
	public void close() {
		
		
	}

	@Override
	public String getTitle() {
		
		return null;
	}
	
}