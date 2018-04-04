package com.github.chengbin.core.util;


import com.github.chengbin.core.constant.BasketBallContants;
import com.github.chengbin.core.constant.FootballContants;
import com.github.chengbin.core.constant.PlayTypeNames;

/**
 * 投注类型适配器
 *
 * @author zhangcb
 * @created 2017-07-28 10:07.
 */
public class BetTypeUtils {

    //    足球混合投注{
//        "3":"主胜","1":"平","0":"客胜",
//            "403":"让球主胜","401":"让球平","400":"让球客胜",
//
//            "210":"1:0","220":"2:0","221":"2:1","230":"3:0","231":"3:1","232":"3:2","240":"4:0",
//            "241":"4:1","242":"4:2","250":"5:0","251":"5:1","252":"5:2","290":"胜其他",
//            "200":"0:0","211":"1:1","222":"2:2","233":"3:3","299":"平其他",
//            "201":"0:1","202":"0:2","212":"1:2","203":"0:3","213":"1:3","223":"2:3","204":"0:4",
//            "214":"1:4","224":"2:4","205":"0:5","215":"1:5","225":"2:5","209":"负其他",
//
//            "100":"0球","101":"1球","102":"2球","103":"3球","104":"4球","105":"5球","106":"6球","107":"7+球",
//
//            "333":"胜胜","331":"胜平","330":"胜负",
//            "313":"平胜","311":"平平","310":"平负",
//            "303":"负胜","301":"负平","300":"负负"
//    }
/*篮球混合投注{
    3:胜,0：负,
        103：让球胜,100：让球负,
        202：大分,201：小分,
        301：胜分差客1-5,302：6-10,303:11-15,304:16-20,305:21-25,306:26+,311:1-5,312:6-10,313:11-15,314:16-20,315:21-25,316:26+
}*/
    public static Integer betTypeAdapter(Integer code, Integer betType) {
        if (betType == PlayTypeNames.JC_FOOTBALL_HUNHE_POLY_CODE) {       //足球混投
            if (code < 100) {
                return FootballContants.TYPE_SPF;
            } else if (code < 200) {
                return FootballContants.TYPE_ZJQ;
            } else if (code < 300) {
                return FootballContants.TYPE_BF;
            } else if (code < 400) {
                return FootballContants.TYPE_BQC;
            } else if (code < 500) {
                return FootballContants.TYPE_RQSPF;
            }
        } else if (betType == PlayTypeNames.JC_BASKETBALL_HUNHE_POLY_CODE) {        //篮球混投
            if (code < 100) {
                return BasketBallContants.TYPE_SF;
            } else if (code < 200) {
                return BasketBallContants.TYPE_RFSF;
            } else if (code < 300) {
                return BasketBallContants.TYPE_DXF;
            } else if (code < 400) {
                return BasketBallContants.TYPE_SFC;
            }
        } else {           //单个玩法
            switch (betType) {
                case PlayTypeNames.FOOTBALL_SPF_POLY_CODE:
                    return FootballContants.TYPE_SPF;
                case PlayTypeNames.FOOTBALL_ZJQS_POLY_CODE:
                    return FootballContants.TYPE_ZJQ;
                case PlayTypeNames.FOOTBALL_BQC_POLY_CODE:
                    return FootballContants.TYPE_BQC;
                case PlayTypeNames.FOOTBALL_BF_POLY_CODE:
                    return FootballContants.TYPE_BF;
                case PlayTypeNames.FOOTBALL_RQSPF_POLY_CODE:
                    return FootballContants.TYPE_RQSPF;
                case PlayTypeNames.BASKETBALL_SF_POLY_CODE:
                    return BasketBallContants.TYPE_SF;
                case PlayTypeNames.BASKETBALL_DXF_POLY_CODE:
                    return BasketBallContants.TYPE_DXF;
                case PlayTypeNames.BASKETBALL_FSC_POLY_CODE:
                    return BasketBallContants.TYPE_SFC;
                case PlayTypeNames.BASKETBALL_RFSF_POLY_CODE:
                    return BasketBallContants.TYPE_RFSF;
            }
        }
        return -1;
    }


    public static Integer betTypeAdapter(Integer betType) {
        switch (betType) {
            case PlayTypeNames.BASKETBALL_SF_POLY_CODE:
                return BasketBallContants.TYPE_SF;
            case PlayTypeNames.BASKETBALL_DXF_POLY_CODE:
                return BasketBallContants.TYPE_DXF;
            case PlayTypeNames.BASKETBALL_FSC_POLY_CODE:
                return BasketBallContants.TYPE_SFC;
            case PlayTypeNames.BASKETBALL_RFSF_POLY_CODE:
                return BasketBallContants.TYPE_RFSF;
            case PlayTypeNames.JC_BASKETBALL_HUNHE_POLY_CODE:
                return BasketBallContants.TYPE_HHTZ;
            case PlayTypeNames.FOOTBALL_SPF_POLY_CODE:
                return FootballContants.TYPE_SPF;
            case PlayTypeNames.FOOTBALL_ZJQS_POLY_CODE:
                return FootballContants.TYPE_ZJQ;
            case PlayTypeNames.FOOTBALL_BQC_POLY_CODE:
                return FootballContants.TYPE_BQC;
            case PlayTypeNames.FOOTBALL_BF_POLY_CODE:
                return FootballContants.TYPE_BF;
            case PlayTypeNames.FOOTBALL_RQSPF_POLY_CODE:
                return FootballContants.TYPE_RQSPF;
            case PlayTypeNames.JC_FOOTBALL_HUNHE_POLY_CODE:
                return FootballContants.TYPE_HHTZ;
        }
        return -1;
    }
}
