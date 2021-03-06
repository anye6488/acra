/*
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acra.interaction;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.config.CoreConfiguration;
import org.acra.plugins.Plugin;

import java.io.File;

/**
 * A user interaction before reports are sent
 *
 * @author F43nd1r
 * @since 02.06.2017
 */
public interface ReportInteraction extends Plugin {

    /**
     * Perform interaction synchronously
     *
     * @param context    a context
     * @param config     the configuration
     * @param reportFile the file with the report content
     * @return if reports should be sent instantly
     */
    boolean performInteraction(@NonNull Context context, @NonNull CoreConfiguration config, @NonNull File reportFile);
}
