package utils;

import io.appium.java_client.remote.MobileCapabilityType;

public interface MobileCapabilityEx extends MobileCapabilityType {

    String APP_PACKAGE = "appPackage";
    String APP_ACTIVITY = "appActivity";
    String AUTOGRANTPERMISSION = "autoGrantPermissions";
}
