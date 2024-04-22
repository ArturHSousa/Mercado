package Utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    static NumberFormat NumberFormat = new DecimalFormat("R$ #,##0.00" , new DecimalFormatSymbols(new Locale("pt" , "BR"))); //Formata valor


    public static String DoubleToString(Double value){
        return NumberFormat.format(value); //recebe o valor Double e formata ele para String "R$ #,##0.00"
    }
}
