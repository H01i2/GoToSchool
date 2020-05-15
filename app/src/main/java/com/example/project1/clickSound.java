package com.example.project1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.SoundPool;

public class clickSound  {
    private static clickSound soundPoolUtil;
    private SoundPool soundPool;

    @SuppressLint("NewApi")
    public clickSound(Context context) {
        soundPool = new SoundPool.Builder().build();
        //加载音频文件
        soundPool.load(context, R.raw.click_01, 1);
        soundPool.load(context, R.raw.events, 2);
        soundPool.load(context, R.raw.ui, 3);
    }

    public static clickSound getInstance(Context context) {
        if (soundPoolUtil == null)
            soundPoolUtil = new clickSound(context);
        return soundPoolUtil;
    }

    public void play(int number) {
        //播放音频
        soundPool.play(number, 1, 1, 0, 0, 1);
    }

}
