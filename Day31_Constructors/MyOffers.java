package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon Inc","SDET",110000,true,true,true,true);
        System.out.println(offer1);

        Offer offer2=new Offer();
        offer2.setInfo("CA","Sony","QA",120000,true,true,true,true);

        Offer offer3=new Offer();
        offer3.setInfo("FL","Apple","QA",128000,true,true,true,true);

        Offer offer4=new Offer();
        offer4.setInfo("WA","Bank","QA",140000,true,true,false,true);

        Offer offer5=new Offer();
        offer5.setInfo("tx","Trendyol","QA",160000,true,false,false,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTimesOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimesOffers.removeIf(p-> !p.isFullTime);
        System.out.println("fullTimesOffers = " + fullTimesOffers.size());

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.contains("tx"));
        System.out.println("localOffers = " + localOffers);

        ArrayList<Offer> QaOffers=new ArrayList<>(Arrays.asList(myOffers));
        QaOffers.removeIf(p-> !p.jobTitle.contains("QA")&&p.salary<119000);
        System.out.println("QaOffers = " + QaOffers);





    }
}
/*
Offer Task:
		1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object
					2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */