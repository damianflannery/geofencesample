/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.bsu.android.apps.geofence.utils;

/**
 * This class defines constants used by location sample apps.
 */
public final class GeofenceUtils {

	// Used to track what type of geofence removal request was made.
	public enum REMOVE_TYPE {
		INTENT, LIST
	}

	// Used to track what type of request is in process
	public enum REQUEST_TYPE {
		ADD, REMOVE
	}

	/*
	 * A log tag for the application
	 */
	public static final String APPTAG = "Geofence Detection";

	// Intent actions
	public static final String ACTION_CONNECTION_ERROR = "edu.bsu.android.apps.geofence.ACTION_CONNECTION_ERROR";
	public static final String ACTION_CONNECTION_SUCCESS = "edu.bsu.android.apps.geofence.ACTION_CONNECTION_SUCCESS";
	public static final String ACTION_GEOFENCES_ADDED = "edu.bsu.android.apps.geofence.ACTION_GEOFENCES_ADDED";
	public static final String ACTION_GEOFENCES_REMOVED = "edu.bsu.android.apps.geofence.ACTION_GEOFENCES_DELETED";
	public static final String ACTION_GEOFENCE_ERROR = "edu.bsu.android.apps.geofence.ACTION_GEOFENCES_ERROR";
	public static final String ACTION_GEOFENCE_TRANSITION = "edu.bsu.android.apps.geofence.ACTION_GEOFENCE_TRANSITION";
	public static final String ACTION_GEOFENCE_TRANSITION_ERROR = "edu.bsu.android.apps.geofence.ACTION_GEOFENCE_TRANSITION_ERROR";
	// The Intent category used by all Location Services sample apps
	public static final String CATEGORY_LOCATION_SERVICES = "edu.bsu.android.apps.geofence.CATEGORY_LOCATION_SERVICES";
	// Keys for extended data in Intents
	//public static final String EXTRA_CONNECTION_CODE = "edu.bsu.android.apps.EXTRA_CONNECTION_CODE";
	public static final String EXTRA_CONNECTION_ERROR_CODE = "edu.bsu.android.apps.geofence.EXTRA_CONNECTION_ERROR_CODE";
	//public static final String EXTRA_CONNECTION_ERROR_MESSAGE = "edu.bsu.android.apps.geofence.EXTRA_CONNECTION_ERROR_MESSAGE";
	public static final String EXTRA_GEOFENCE_STATUS = "edu.bsu.android.apps.geofence.EXTRA_GEOFENCE_STATUS";

	/*
	 * Keys for flattened geofences stored in SharedPreferences
	 */
	/*public static final String KEY_LATITUDE = "edu.bsu.android.apps.geofence.KEY_LATITUDE";
	public static final String KEY_LONGITUDE = "edu.bsu.android.apps.geofence.KEY_LONGITUDE";
	public static final String KEY_RADIUS = "edu.bsu.android.apps.geofence.KEY_RADIUS";
	public static final String KEY_EXPIRATION_DURATION = "edu.bsu.android.apps.geofence.KEY_EXPIRATION_DURATION";
	public static final String KEY_TRANSITION_TYPE = "edu.bsu.android.apps.geofence.KEY_TRANSITION_TYPE";
*/
	// The prefix for flattened geofence keys
	//public static final String KEY_PREFIX = "edu.bsu.android.apps.geofence.KEY";
	// Invalid values, used to test geofence storage when retrieving geofences
	//public static final long INVALID_LONG_VALUE = -999l;
	//public static final float INVALID_FLOAT_VALUE = -999.0f;
	//public static final int INVALID_INT_VALUE = -999;

	/*
	 * Constants used in verifying the correctness of input values
	 */
	public static final double MAX_LATITUDE = 90.d;

	public static final double MIN_LATITUDE = -90.d;

	public static final double MAX_LONGITUDE = 180.d;

	public static final double MIN_LONGITUDE = -180.d;

	public static final float MIN_RADIUS = 1f;

	/*
	 * Define a request code to send to Google Play services This code is returned in Activity.onActivityResult
	 */
	public final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;

	// A string of length 0, used to clear out input fields
	//public static final String EMPTY_STRING = new String();

	public static final CharSequence GEOFENCE_ID_DELIMITER = ",";

}
