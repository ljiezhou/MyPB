package com.example.zhou.mypowerbee.common;

import com.example.zhou.mypowerbee.sdk.netlog.NetConfigFile;

/**
 * Created by zhou on 17-2-27.
 */

public class Constants {
    private static final String TEST_HOST = "http://" + NetConfigFile.SERVER_HTTP_IP + ":" + NetConfigFile.SERVER_HTTP_PORT + "/";
    public static final String BASE_URL = TEST_HOST;
    public static final int SUCCESS_CODE = 0;
}
