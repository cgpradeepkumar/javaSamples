package sample.java.date.util;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

/**
 * Created by pkumar on 25/10/17.
 */
public class PhoneNumberValidator {

    private boolean validate(String number, String region) {
        boolean result = false;
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber phoneNumber = phoneNumberUtil.parseAndKeepRawInput(number, region);
            result = phoneNumberUtil.isValidNumber(phoneNumber);
        } catch (NumberParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        System.out.println(phoneNumberValidator.validate("0663155190", "ZA"));
        System.out.println(phoneNumberValidator.validate("0653241751", "ZA"));
    }
}
