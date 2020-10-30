package eco.android.deviceInfo.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eco.framework.extend.annotation.ModuleEntry;
import eco.android.deviceInfo.module.AppdeviceInfoModule;

@ModuleEntry
public class deviceInfoEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {
        try {
            WXSDKEngine.registerModule("ecoDeviceInfo", AppdeviceInfoModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
