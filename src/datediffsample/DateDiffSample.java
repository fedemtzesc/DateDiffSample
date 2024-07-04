/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datediffsample;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author fmartinez
 */
public class DateDiffSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date initDate = new GregorianCalendar(2024, 07, 01).getTime();
        Date endDate = new GregorianCalendar(2024, 07, 04).getTime();

        long diff = DateDiff(initDate, endDate);

        System.out.println("Fecha Inicial: " + initDate.toString());
        System.out.println("Fecha Final: " + endDate.toString());
        System.out.println("Dias de diferencia: " + diff);
    }

    public static long DateDiff(Date initDate, Date endDate) {
        long MILLISECS_PER_DAY = 24 * 60 * 60 * 1000;
        long days = 0l;

        try {
            days = (endDate.getTime() - initDate.getTime()) / MILLISECS_PER_DAY;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return days;
    }
}
