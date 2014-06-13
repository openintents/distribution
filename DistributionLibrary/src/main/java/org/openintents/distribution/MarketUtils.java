package org.openintents.distribution;

import org.openintents.util.IntentUtils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;

/**
 * @author Peli
 * @author Karl Ostmo
 */
public class MarketUtils {
    
	/**
	 * URI prefix to a package name to bring up the download page on the Android Market
	 */
    public static final String MARKET_PACKAGE_DETAILS_PREFIX = "market://details?id=";
    

	public static boolean isMarketAvailable(Context context, String packageName) {
		return IntentUtils.isIntentAvailable(context, getMarketDownloadIntent(packageName));
	}
	

    public static Intent getMarketDownloadIntent(String packageName) {
        Uri marketUri = Uri.parse(MARKET_PACKAGE_DETAILS_PREFIX + packageName);
        return new Intent(Intent.ACTION_VIEW, marketUri);
    }


	public static boolean hideMarketLink(Context context) {
		try {
			return context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, PackageManager.GET_META_DATA).metaData.getBoolean("hideMarketLink");
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}
}
