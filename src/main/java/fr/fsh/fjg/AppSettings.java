package fr.fsh.fjg;

import restx.config.Settings;
import restx.config.SettingsKey;

/**
 * @author fcamblor
 */
@Settings
public interface AppSettings {
    @SettingsKey(key = "firebase.secret")
    String firebaseSecret();
}
