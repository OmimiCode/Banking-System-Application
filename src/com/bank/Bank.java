package com.bank;

public enum Bank {
    AccessBank,FidelityBank,StanbicIBTC221,AfriBank,Finbank,
    StandardCharteredBank068,Citibank,GuarantyTrustBank,SterlingBank232,
    DiamondBank,IntercontinentalBank,UnitedBankforAfrica033,Ecobank,
    OceanicBank,UnionBank032,EquitorialTrustBank,BankPhb,Wemabank035,
    FirstBank,SkyeBank076,ZenithBank057,FCMB,SpringBank084,Unitybank215;

    public String getBank3DigitCode(){
    return (switch (this){
        case AccessBank -> "044";
        case AfriBank -> "014";
        case BankPhb -> "082";
        case Citibank -> "023";
        case DiamondBank -> "063";
        case Ecobank -> "050";
        case EquitorialTrustBank -> "040";
        case FCMB -> "214";
        case FidelityBank -> "070";
        case Finbank -> "085";
        case FirstBank -> "011";
        case GuarantyTrustBank -> "058";
        case IntercontinentalBank-> "069";
        case OceanicBank -> "056";


        default -> throw new IllegalArgumentException(this+" does not exist !!!");

    }
    );
    }
}
