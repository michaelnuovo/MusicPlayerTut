package com.example.micha.musicplayertut.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import com.example.micha.musicplayertut.MainActivity;
import com.example.micha.musicplayertut.controls.Controls;
import com.example.micha.musicplayertut.service.SongService;
import com.example.micha.musicplayertut.util.PlayerConstants;

public class NotificationBroadcast extends BroadcastReceiver {

	public String ComponentName() {
		return this.getClass().getName();
	}

	@Override
	public void onReceive(Context context, Intent intent) {

		/**
		if (intent.getAction().equals(Intent.ACTION_MEDIA_BUTTON)) {

            KeyEvent keyEvent = (KeyEvent) intent.getExtras().get(Intent.EXTRA_KEY_EVENT);

            if (keyEvent.getAction() != KeyEvent.ACTION_DOWN)
                return;

            switch (keyEvent.getKeyCode()) {
                case KeyEvent.KEYCODE_HEADSETHOOK:
                case KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE:
                	if(!PlayerConstants.SONG_PAUSED){
    					Controls.pauseControl(context);
                	}else{
    					Controls.playControl(context);
                	}
                	break;
                case KeyEvent.KEYCODE_MEDIA_PLAY:
                	break;
                case KeyEvent.KEYCODE_MEDIA_PAUSE:
                	break;
                case KeyEvent.KEYCODE_MEDIA_STOP:
                	break;
                case KeyEvent.KEYCODE_MEDIA_NEXT:
                	Log.d("TAG", "TAG: KEYCODE_MEDIA_NEXT");
                	Controls.nextControl(context);
                	break;
                case KeyEvent.KEYCODE_MEDIA_PREVIOUS:
                	Log.d("TAG", "TAG: KEYCODE_MEDIA_PREVIOUS");
                	Controls.previousControl(context);
                	break;
            }
		}  else{
            	if (intent.getAction().equals(SongService.NOTIFY_PLAY)) {
    				Controls.playControl(context);
        		} else if (intent.getAction().equals(SongService.NOTIFY_PAUSE)) {
    				Controls.pauseControl(context);
        		} else if (intent.getAction().equals(SongService.NOTIFY_NEXT)) {
        			Controls.nextControl(context);
        		} else if (intent.getAction().equals(SongService.NOTIFY_DELETE)) {
					Intent i = new Intent(context, SongService.class);
					context.stopService(i);
					Intent in = new Intent(context, MainActivity.class);
			        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			        context.startActivity(in);
        		}else if (intent.getAction().equals(SongService.NOTIFY_PREVIOUS)) {
    				Controls.previousControl(context);
        		}
		}**/


	}
	

}
