package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void playMusic() {
		System.out.println("다운로드해서 음악 재생");
	}
	
	public void playApp() {
		System.out.println("앱실행");
	}

	@Override
	public void execute(String function) {
		if (function.equals("음악")) {
			playMusic();
		}
		if (function.equals("통화")) {
			super.execute(function);
		}
		if (function.equals("앱")) {
			playApp();
		}	
	}

}
