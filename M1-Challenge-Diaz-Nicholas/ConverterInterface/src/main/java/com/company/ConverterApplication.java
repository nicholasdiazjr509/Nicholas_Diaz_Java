package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication implements Converter {
//   QuickNote: Class 'ConverterApplication' must either be declared abstract
//    or implement abstract method 'convertMonth(int)' in 'Converter'

    public static void main(String[] args) {
//        ConverterIf and ConverterSwitch used in main method.
        ConverterIf converterIf = new ConverterIf();
        System.out.println(converterIf.convertDay(7));
        System.out.println(converterIf.convertMonth(12));

        ConverterSwitch converterSwitch = new ConverterSwitch();
        System.out.println(converterSwitch.convertMonth(15));
        System.out.println(converterSwitch.convertDay(1));
    }

    @Override
    public String convertMonth(int monthNumber) {
        return null;
    }

    @Override
    public String convertDay(int dayNumber) {
        return null;
    }
}
/**************************************************************************************************/
/**Thanks to Yi and classmates with this and of course, Dan! I used my in class project for this.**/