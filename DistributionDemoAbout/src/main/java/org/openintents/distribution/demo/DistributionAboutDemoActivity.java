package org.openintents.distribution.demo;

import org.openintents.distribution.DistributionLibraryActivity;
import org.openintents.distribution.DownloadOIAppDialog;
import org.openintents.distribution.EulaOrNewVersion;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.View;

// Extend your activity from DistributionLibraryActivity
// or from DistributionLibraryListActivity.
public class DistributionAboutDemoActivity extends DistributionLibraryActivity {

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    // Optionally override onCreateOptionsMenu()
 	@Override
 	public boolean onCreateOptionsMenu(Menu menu) {
 		super.onCreateOptionsMenu(menu);
 		
 		// Add other menu items here....
 		
 		// Add distribution menu items last.
 		mDistribution.onCreateOptionsMenu(menu);
 		
 		return true;
 	}
}