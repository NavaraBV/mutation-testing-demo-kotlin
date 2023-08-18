package nl.navara.mutationtesting.demo

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * PIT Mutators: https://pitest.org/quickstart/mutators/
 */
class AdditionsTest {

    private lateinit var additions: Additions

    @BeforeEach
    fun setUp() {
        additions = Additions()
    }

    /**
     * Quick and dirty test, in the real world you should split this into 4 tests or use a parameterized test.
     * Besides that, there is some refactoring that could also make the code & tests better.
     */
    @Test
    fun isPositive() {
        assertTrue(additions.additionIsPositive(2, 1))// Negate conditional: > -> <=
        assertTrue(additions.additionIsPositive(1, 2)) // Replaced integer addition with subtraction: + -> -
        assertFalse(additions.additionIsPositive(-2, 1)) // replaced boolean return with true
        assertFalse(additions.additionIsPositive(-2, 2)) // changed conditional boundary > -> >=
    }
}
