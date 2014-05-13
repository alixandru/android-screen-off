package android.screenoff;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * Generic class which receives various events and dispatches them to the
 * appropriate listeners.
 */
public class ScreenOffEventReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		TelephonyManager telephony = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		telephony.listen(new ScreenOffPhoneListener(context),
				PhoneStateListener.LISTEN_CALL_STATE);

	}

}
