package went_gone.applicationemoji;

/**
 * Describe: 表情的实体类
 * Author: Created by Went_Gone on 2016/10/26.
 */

public class EmojiBean {
    private int id;
    private int unicodeInt;

    public String getEmojiString() {
        return ExpressionUtil.getEmojiStringByUnicode(unicodeInt);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnicodeInt() {
        return unicodeInt;
    }

    public void setUnicodeInt(int unicodeInt) {
        this.unicodeInt = unicodeInt;
    }
}
