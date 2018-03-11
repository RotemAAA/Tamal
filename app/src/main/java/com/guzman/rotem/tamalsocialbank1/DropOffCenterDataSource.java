package com.guzman.rotem.tamalsocialbank1;

import java.util.ArrayList;

/**
 * Created by Rotem on 10/03/2018.
 */

public class DropOffCenterDataSource {

    public static ArrayList<DropOffCenter> getDate() {
        ArrayList<DropOffCenter> data = new ArrayList<>();

        DropOffCenter d1 = new DropOffCenter("מרכז קהילתי נאות שושנים",
                "רח\' צבי סיגלון 12 חולון",
                "טל: 03-5503977");

        DropOffCenter d2 = new DropOffCenter("מרכז קהילתי ומרכז הספורט בן גוריון",
                "רח\' קרסל 6 חולון",
                "טל: 03-65528490");

        data.add(d1);

        data.add(d2);


        data.add(new DropOffCenter("מרכז קהילתי נווה ארזים",
                "רח\' ישעיהו 16 חולון",
                "טל: 03-5506772"));


        data.add(new DropOffCenter("מרכז קהילתי וולפסון",
                "רח\' צבי ש\"ץ 29 חולון",
                "טל: 03-6519181"));

        data.add(new DropOffCenter("מרכז קהילתי לזרוס",
                "רח\' סנהדרין 27 חולון",
                "טל: 03-5030068"));

        data.add(new DropOffCenter("מרכז קהילתי נאות רחל",
                "רח\' חצרים 2 חולון",
                "טל: 03-5035499"));

        data.add(new DropOffCenter("מרכז קהילתי קליין",
                "רח\' פילדלפיה 16 חולון",
                "טל: 03-5038083"));

        data.add(new DropOffCenter("מקהל\"ת מרכז קהילתי תורני",
                "רח\' פילדלפיה 5 חולון",
                "טל: 03-5015529"));

        data.add(new DropOffCenter("מרכז פסגות",
                "רח\' סרלין 21 חולון",
                "טל: 03-6530300"));

        data.add(new DropOffCenter("מרכז חנקין",
                "רח\' חנקין 109 חולון",
                "טל: 03-6530300"));

        data.add(new DropOffCenter("רעים מרכז למחול ותנועת הגוף",
                "רח\' הופיין 44 חולון",
                "טל: 03-5035299"));

        data.add(new DropOffCenter("מרכז שטיינברג החדש- במה למוסיקה חיה",
                "רח\' גבעת התחמושת 21 חולון",
                "טל: 03-5500012"));

        return data;
    }
}