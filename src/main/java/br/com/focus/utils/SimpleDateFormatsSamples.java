/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.focus.utils;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 *
 * @author Marcos Naves
 */
public class SimpleDateFormatsSamples implements Serializable{
    
    public static SimpleDateFormat formateYearMonthDay = new SimpleDateFormat("yyyy_MM_dd");
    public static SimpleDateFormat formateYearMonthDayHH = new SimpleDateFormat("yyyy_MM_dd_'H'HH");
    public static SimpleDateFormat formaterHourMinuteSecondsMileseconds = new SimpleDateFormat("HH_mm_ss_S");
    public static SimpleDateFormat formaterHourMinuteDots = new SimpleDateFormat("HH:mm:ss");
    public static SimpleDateFormat formaterDayMonthYear = new SimpleDateFormat("dd/MM/yyyy");
    
}
