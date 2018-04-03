package pepelu.demo.plugins.mybatis.model;

import pepelu.plugins.mybatis.typehandler.MyBatisEnum;

/**
 * @author Pepe Lu
 */
public enum Color implements MyBatisEnum {
    RED(1),
    GREEN(2),
    BLUE(3),;

    private int code;

    Color(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
