/*
 * Copyright (C) 2021 The Android Open Source Project
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

package com.android.settings.accessibility;

import android.content.Context;

import com.android.settings.R;

/**
 * Preference controller for accessibility button footer.
 */
public class AccessibilityButtonFooterPreferenceController extends
        AccessibilityFooterPreferenceController {

    public AccessibilityButtonFooterPreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    protected String getLabelName() {
        return mContext.getString(R.string.accessibility_button_title);
    }

    @Override
    public CharSequence getSummary() {
        return AccessibilityUtil.isGestureNavigateEnabled(mContext)
                ? mContext.getString(R.string.accessibility_button_gesture_description)
                : mContext.getString(R.string.accessibility_button_description);
    }
}
