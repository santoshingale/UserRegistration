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

}
