/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Mata.Uang.Konversi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */

@Controller
public class ProjectController {
    
    @RequestMapping("/usdtoidr")
    @ResponseBody
    public String usdtoidr() {
        int usd = 1;
        int idr = 14148;
        int usdidr = usd * idr;
        int convert = usdidr;

        return "hasil konversi USD to IDR dari " +usd+ " USD adalah Rp." +convert+ ".";
    }

    @RequestMapping("/yentoidr")
    @ResponseBody
    public String yentoidr(){
        double idr = 123;
        double yen = 1;
        double convert = idr * yen;

        return "hasil konversi yen to idr dari " +yen+ " yen adalah Rp." +convert+ ".";
    }

    @RequestMapping("/myrtoidr")
    @ResponseBody
    public String myrtoidr(){
        int myr = 1;
        int idr = 3424;
        int myridr = myr * idr;
        int convert = myridr;

        return "hasil konversi MYR to IDR dari " +myr+ " MYR adalah Rp. " +convert; 
    }
}
