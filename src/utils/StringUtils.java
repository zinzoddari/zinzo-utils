package utils;

import java.text.DecimalFormat;

/**
 * 자주 사용하는 String 관련 util 정의한 class입니다.
 *
 * @author zinzoddari
 */
public class StringUtils {
    /**
     * 값이 비어있지 않은지 확인하는 메소드
     *
     * @param str 비어있지 않은지 확인하고자 하는 param
     * @return 값이 있으면 true. 없으면 false
     */
    public static boolean isNotEmpty(String str) {
        if(!isEmpty(str)) return true;
        return false;
    }

    public static boolean isEmpty(String str) {
        if(str == null || ObjectUtils.isEmpty(str)) return true;
        return false;
    }

    /**
     * 3자리마다 콤마(,)추가
     *
     * @param str
     * @return 333,333,333 형식으로 콤마가 추가되어 리턴
     */
    public static String addComma(String str) {
        DecimalFormat decFormat = new DecimalFormat("###,###");
        return decFormat.format(str);
    }
}