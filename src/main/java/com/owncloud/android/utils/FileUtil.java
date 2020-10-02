/*
 * Nextcloud Android client application
 *
 * @author Andy Scherzinger
 * Copyright (C) 2020 Andy Scherzinger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.owncloud.android.utils;

import com.owncloud.android.lib.resources.files.FileUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class FileUtil {
    private static final char PATH_SEPARATOR = '/';

    private FileUtil() {
        // utility class -> private constructor
    }

    public static @NonNull String getFilenameFromPathString(@Nullable String filePath) {
        if (filePath != null) {
            return filePath.substring(filePath.lastIndexOf(PATH_SEPARATOR) + 1);
        } else {
            return "";
        }
    }
}
