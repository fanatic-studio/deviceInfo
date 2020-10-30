package vd.android.deviceInfo.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.vd.framework.extend.annotation.ModuleEntry;
import vd.android.deviceInfo.module.AppdeviceInfoModule;

@ModuleEntry
public class deviceInfoEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {
        try {
            WXSDKEngine.registerModule("vdDeviceInfo", AppdeviceInfoModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
