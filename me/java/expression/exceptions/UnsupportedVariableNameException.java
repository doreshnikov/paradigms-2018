package java.expression.exceptions;

/**
 * Created by isuca in paradigms catalogue
 *
 * @date 30-Mar-18
 * @time 16:52
 */

public class UnsupportedVariableNameException extends GrammarException {

    public UnsupportedVariableNameException(String msg, int position) {
        super(msg, position);
    }

}
