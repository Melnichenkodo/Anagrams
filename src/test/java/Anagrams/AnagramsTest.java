package Anagrams;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Anagrams.Anagrams.anagram;

public class AnagramsTest {

    @DataProvider(name = "test")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"мама мыла раму", "амам алым умар"},
                {"алкоголики это наш профиль", "икилогокла отэ шан ьлифорп"},
                {"мау", "уам"},
                {"тра-та-та-та-та", "ат-ат-ат-ат-арт"},
        };
    }


    @Test(dataProvider = "test")
    public static void testAnagrams(String phrase, String expectedPhrase) {
        Assert.assertEquals(expectedPhrase, anagram(phrase));
    }
}
