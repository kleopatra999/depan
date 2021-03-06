/*
 * Copyright 2007 The Depan Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.devtools.depan.eclipse.preferences;

import com.google.devtools.depan.eclipse.preferences.NodePreferencesIds.NodeColors;
import com.google.devtools.depan.eclipse.preferences.NodePreferencesIds.NodeShape;
import com.google.devtools.depan.eclipse.preferences.NodePreferencesIds.NodeSize;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

/**
 * Default values for node rendering preferences.
 *
 * @author ycoppel@google.com (Yohann Coppel)
 */
public class NodePreferencesInitializer extends AbstractPreferenceInitializer {

  @Override
  public void initializeDefaultPreferences() {
    IEclipsePreferences defaults = PreferencesIds.getDefaultNode();

    defaults.putBoolean(NodePreferencesIds.NODE_COLOR_ON, true);
    defaults.put(NodePreferencesIds.NODE_COLOR,
        NodeColors.getDefault().toString());

    defaults.putBoolean(NodePreferencesIds.NODE_SHAPE_ON, true);
    defaults.put(NodePreferencesIds.NODE_SHAPE,
        NodeShape.getDefault().toString());

    defaults.putBoolean(NodePreferencesIds.NODE_SIZE_ON, false);
    defaults.put(NodePreferencesIds.NODE_SIZE,
        NodeSize.getDefault().toString());

    defaults.putBoolean(NodePreferencesIds.NODE_RATIO_ON, false);
    defaults.putBoolean(NodePreferencesIds.NODE_ROOT_HIGHLIGHT_ON, false);
    defaults.putBoolean(NodePreferencesIds.NODE_STROKE_HIGHLIGHT_ON, false);
  }
}
