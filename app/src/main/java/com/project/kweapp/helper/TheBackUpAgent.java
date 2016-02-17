package com.project.kweapp.helper;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/**
 * Created by BAHATI on 2/17/2016.
 */
public class TheBackupAgent extends BackupAgentHelper {
    static final String PREFS_CHAT_FILE = "prefsFile";
    static final String PREFS_BACKUP_KEY = "chat";

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferencesBackupHelper helper = new SharedPreferencesBackupHelper(this, PREFS_CHAT_FILE);
        addHelper(PREFS_BACKUP_KEY, helper);
    }
}
