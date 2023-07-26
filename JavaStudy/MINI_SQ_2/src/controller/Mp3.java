package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import music.Bgm;

public class Mp3 {

	MP3Player mp3 = new MP3Player();

	ArrayList<Bgm> mlist = new ArrayList<Bgm>();

	public Mp3() {

		Bgm b1 = new Bgm("와우효과음", ".\\music\\와우효과음.mp3");
		Bgm b2 = new Bgm("No one", ".\\music\\이하이 - NO ONE.mp3");
		Bgm b3 = new Bgm("메인브금", ".\\music\\메인브금.mp3");

		mlist.add(b1);
		mlist.add(b2);
		mlist.add(b3);
	}

	public Bgm fx() {
		if (mp3.isPlaying()) {// 노래 멈추기
			mp3.stop();
		}
		// 브금 재생
		mp3.play(mlist.get(0).getPath());

		return mlist.get(0);
	}

	public void bgm() {
		// 노래 멈추기
		// 브금 재생

	}

	public void main() {
		// 노래 멈추기
		// 브금 재생

	}

}
