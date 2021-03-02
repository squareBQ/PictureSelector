package com.luck.picture.lib.camera;

/**
 * @author：luck
 * @date：2020-01-04 13:41
 * @describe：自定义相机View
 */
public class CustomCameraView {
    /**
     * 只能拍照
     */
    public static final int BUTTON_STATE_ONLY_CAPTURE = 0x101;
    /**
     * 只能录像
     */
    public static final int BUTTON_STATE_ONLY_RECORDER = 0x102;
    /**
     * 两者都可以
     */
    public static final int BUTTON_STATE_BOTH = 0x103;
    /**
     * 闪关灯状态
     */
    private static final int TYPE_FLASH_AUTO = 0x021;
    private static final int TYPE_FLASH_ON = 0x022;
    private static final int TYPE_FLASH_OFF = 0x023;
    private int type_flash = TYPE_FLASH_OFF;
}
