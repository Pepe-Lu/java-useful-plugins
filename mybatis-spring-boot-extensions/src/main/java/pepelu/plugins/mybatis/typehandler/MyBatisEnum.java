package pepelu.plugins.mybatis.typehandler;

public interface MyBatisEnum {
    int getCode();

    static <E extends Enum<?> & MyBatisEnum> E codeOf(Class<E> enumClass, Integer code) {
        if (code == null) {
            return null;
        }

        E[] enumConstants = enumClass.getEnumConstants();
        for (E e : enumConstants) {
            if (e.getCode() == code) {
                return e;
            }
        }

        return null;
    }

    static <E extends Enum<?> & MyBatisEnum> E codeOf(Class<E> enumClass, Integer code, E defaultValue) {
        E result = codeOf(enumClass, code);

        if (result == null) {
            return defaultValue;
        }

        return result;
    }
}
