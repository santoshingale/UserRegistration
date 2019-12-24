import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFistName_withThreeCharacter_withFirstCapitalLetter_shouldReturnValid() {
        Assert.assertTrue(UserRegistration.checkFirstName("Sam"));
    }

    @Test
    public void whenGivenFistName_withoutThreeCharacter_withFirstCapitalLetter_shouldReturnInvalid() {
        Assert.assertTrue(UserRegistration.checkFirstName("Sa"));
    }

    @Test
    public void whenGivenFistName_withThreeCharacter_withoutFirstCapitalLetter_shouldReturnInvalid() {
        Assert.assertTrue(UserRegistration.checkFirstName("san"));
    }
}
