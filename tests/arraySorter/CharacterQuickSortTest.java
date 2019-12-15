package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;

/**
 * Tests bubble sort for character arrays.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class CharacterQuickSortTest extends QuickSortTest<Character> {
    @Override
    ArrayGenerator<Character> getGenerator() {
        return new CharacterArrayGenerator();
    }
}
