# Yoti_test

## Steps to run the test.
```
Please remember to change the C:\ (C drive paths within the codes to match your system accordingly.
```
Paths you will be changing will include:
The Global.properties path within the base class
The file location of the screenshot commands within the testcase classes
## Path of the chromedriver exe file

## This test contains SWITCH TO FRAME METHOD in the AddToWishList Page
'''
    public void add2WishList() throws InterruptedException {

        WomenSection.click();
        Thread.sleep(6500);
        View1stItem.click();

        driver.switchTo().frame(0);
        Thread.sleep(5000);
        AddtoWishList.click();

    }

    public void CloseAdd2WishListBtn() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        closeAddtoWishlistMsg.click();
    }
'''
