import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFistName_withThreeOrMoreCharacter_withFirstCapitalLetter_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkFirstName("Santosh"));
    }

    @Test
    public void whenGivenFistName_lessThanThreeCharacter_withFirstCapitalLetter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("Sa"));
    }

    @Test
    public void whenGivenFistName_withThreeOrMoreCharacter_withoutFirstCapitalLetter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("santosh"));
    }

    @Test
    public void whenGivenLastName_withThreeOrMoreCharacter_withFirstCapitalLetter_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkLastName("Ingale"));
    }

    @Test
    public void whenGivenLastName_lessThanThreeCharacter_withFirstCapitalLetter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkLastName("In"));
    }

    @Test
    public void whenGivenLastName_withThreeOrMoreCharacter_withoutFirstCapitalLetter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkLastName("ingale"));
    }

    @Test
    public void whenGivenEmailAddress_withProperFormat_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkEmailAddress("santosingale@gmail.com.in"));
    }

    @Test
    public void whenGivenMobileNumber_withCountryCode_followedBySpace_tenDigitNumber_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkMobileNumber("91 9029992063"));
    }

    @Test
    public void whenGivenMobileNumber_withoutCountry_Code_followedBySpace_tenDigitNumber_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkMobileNumber("9029992063"));
    }

    @Test
    public void whenGivenMobileNumber_withCountryCode_notFollowedBySpace_tenDigitNumber_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkMobileNumber("919029992063"));
    }

    @Test
    public void whenGivenMobileNumber_withCountryCode_followedBySpace_notExactTenNumber_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkMobileNumber("91 902999206322"));
    }

    @Test
    public void whenGivenPassword_with8Length_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkPassword("Santosh@123"));
    }

    @Test
    public void whenGivenPassword_lengthLessThan8_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkPassword("Santosh"));
    }
}
