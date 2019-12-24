import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFistName_withThreeCharacter_withFirstCapitalLetter_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkFirstName("Sam"));
    }

    @Test
    public void whenGivenFistName_withoutThreeCharacter_withFirstCapitalLetter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("Sa"));
    }

    @Test
    public void whenGivenFistName_withThreeCharacter_withoutFirstCapitalLetter_shouldReturnFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("san"));
    }

}
