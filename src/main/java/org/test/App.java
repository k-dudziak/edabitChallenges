package org.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // SevenBoom challenge
        SevenBoom sevenBoomObject = new SevenBoom();
        int[] boomArray = {123,244,312,10,63232,6};
        String sevenBoomResult = sevenBoomObject.sevenBoom(boomArray);
        System.out.println("SevenBoom result: "+sevenBoomResult);

        //Area of a triangle challenge
        AreaOfATriangle triangleAreaObject = new AreaOfATriangle();
        int a = 2;
        int b = 3;
        int area = triangleAreaObject.triArea(a,b);
        System.out.println("Triangle area: "+area);

        //Find the discount challenge
        System.out.println("Price after discount: "+FindTheDiscount.discount(100,10));

        //Pronic numbers challenge
        System.out.println("Pronic number: "+PronicNumber.isHeteromecic(1260));

        //Complete the word challenge
    }

}
