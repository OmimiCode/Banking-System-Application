package com.bank;

public enum BankCode {
    AccessBank,FidelityBank,StanbicIBTC,AfriBank,FinBank,
    StandardCharteredBank,Citibank,GuarantyTrustBank,SterlingBank,
    DiamondBank,IntercontinentalBank,UnitedBankForAfrica,EcoBank,
    OceanicBank,UnionBank,EquitorialTrustBank,BankPhb,WemaBank,
    FirstBank,SkyeBank,ZenithBank,FCMB,SpringBank,UnityBank;

    public String getBank3DigitCode(){
    return (switch (this){
        case AccessBank -> "044";
        case AfriBank -> "014";
        case BankPhb -> "082";
        case Citibank -> "023";
        case DiamondBank -> "063";
        case EcoBank -> "050";
        case EquitorialTrustBank -> "040";
        case FCMB -> "214";
        case FidelityBank -> "070";
        case FinBank -> "085";
        case FirstBank -> "011";
        case GuarantyTrustBank -> "058";
        case IntercontinentalBank-> "069";
        case OceanicBank -> "056";
        case SkyeBank -> "076";
        case SpringBank -> "084";
        case StanbicIBTC -> "221";
        case StandardCharteredBank -> "068";
        case SterlingBank -> "232";
        case UnionBank -> "032";
        case UnitedBankForAfrica -> "033";
        case UnityBank -> "215";
        case WemaBank -> "035";
        case ZenithBank -> "057";

        default -> throw new IllegalArgumentException(this+" does not exist !!!");

    }
    );
    }
}
