package by.epam.jwd.testingApp.service.validationService.componentValidator;

import by.epam.jwd.testingApp.service.errorMsg.ErrorMsgSupplier;
import by.epam.jwd.testingApp.service.errorMsg.ErrorMsgProvider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements AbstractStringValidator {

    public static final String INVALID_EMAIL = "email.invalid";
    public static final String LONG_EMAIL = "email.long";

    public static final int MAX_LENGTH = 30;

    public static final String EMAIL_VALIDATOR = "^[\\w!#$%&'*+/=?`{|}~^-]" +
            "+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)" +
            "*@(?:[a-zA-Z0-9-]+\\.)" +
            "+[a-zA-Z]{2,6}$";

    private boolean patternMatch(String string,String validator){
        if(string == null || validator == null) return false;

        Pattern pattern = Pattern.compile(validator, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        return matcher.find();
    }

    @Override
    public boolean validate(String entity, String locale, StringBuilder errorMsgAccumulator) {
        if(entity == null || locale == null || errorMsgAccumulator == null) return false;

        if(!patternMatch(entity.trim(),EMAIL_VALIDATOR)){
            errorMsgAccumulator.append(ErrorMsgProvider.newInstance().getManagerByLocale(locale)
                    .getValueByName(INVALID_EMAIL)).append('\n');
            return false;
        }
        if(entity.trim().length() > MAX_LENGTH){
            errorMsgAccumulator.append(ErrorMsgProvider.newInstance().getManagerByLocale(locale)
                    .getValueByName(LONG_EMAIL)).append('\n');
            return false;
        }

        return true;
    }
}