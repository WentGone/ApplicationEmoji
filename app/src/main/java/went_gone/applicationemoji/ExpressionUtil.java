package went_gone.applicationemoji;

/**
 * Describe:表情的工具类
 * Author: Created by Went_Gone on 2016/10/26.
 */

public class ExpressionUtil {
    /**
     * 将unicode转化成String
     * @param unicode
     * @return
     */
    public static String getEmojiStringByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }
}
