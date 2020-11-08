package AH;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlateauTest {

/* Lines */

    @Test
    public void line_empty_return_false() {
        // given
        Plateau plateau = new Plateau(3);
        // when
        boolean result = plateau.troisEnligne();
        // then
        assertFalse(result);
    }

    @Test
    public void line_uncomplete_return_false() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.CROIX;
        plateau.getPions()[0][1] = Pion.CROIX;
        // when
        boolean result = plateau.troisEnligne();
        // then
        assertFalse(result);
    }

    @Test
    public void line_upper_croix_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.CROIX;
        plateau.getPions()[0][1] = Pion.CROIX;
        plateau.getPions()[0][2] = Pion.CROIX;
        // when
        boolean result = plateau.troisEnligne();
        // then
        assertTrue(result);
    }

    @Test
    public void line_upper_rond_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.ROND;
        plateau.getPions()[0][1] = Pion.ROND;
        plateau.getPions()[0][2] = Pion.ROND;
        // when
        boolean result = plateau.troisEnligne();
        // then
        assertTrue(result);
    }

    @Test
    public void line_lower_croix_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[1][0] = Pion.CROIX;
        plateau.getPions()[1][1] = Pion.CROIX;
        plateau.getPions()[1][2] = Pion.CROIX;
        // when
        boolean result = plateau.troisEnligne();
        // then
        assertTrue(result);
    }

    /* Columns */

    @Test
    public void column_empty_return_false() {
        // given
        Plateau plateau = new Plateau(3);
        // when
        boolean result = plateau.troisALaVerticale();
        // then
        assertFalse(result);
    }

    @Test
    public void column_uncomplete_return_false() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.CROIX;
        plateau.getPions()[1][0] = Pion.CROIX;
        // when
        boolean result = plateau.troisALaVerticale();
        // then
        assertFalse(result);
    }

    @Test
    public void column_left_croix_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.CROIX;
        plateau.getPions()[1][0] = Pion.CROIX;
        plateau.getPions()[2][0] = Pion.CROIX;
        // when
        boolean result = plateau.troisALaVerticale();
        // then
        assertTrue(result);
    }

    @Test
    public void column_left_rond_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.ROND;
        plateau.getPions()[1][0] = Pion.ROND;
        plateau.getPions()[2][0] = Pion.ROND;
        // when
        boolean result = plateau.troisALaVerticale();
        // then
        assertTrue(result);
    }

    @Test
    public void column_middle_croix_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][1] = Pion.CROIX;
        plateau.getPions()[1][1] = Pion.CROIX;
        plateau.getPions()[2][1] = Pion.CROIX;
        // when
        boolean result = plateau.troisALaVerticale();
        // then
        assertTrue(result);
    }

    /* Diagonals */

    @Test
    public void diagonal_left_empty_return_false() {
        // given
        Plateau plateau = new Plateau(3);
        // when
        boolean result = plateau.troisEnDiagonale();
        // then
        assertFalse(result);
    }

    @Test
    public void diagonal_left_uncomplete_return_false() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.CROIX;
        plateau.getPions()[1][1] = Pion.CROIX;
        // when
        boolean result = plateau.troisEnDiagonale();
        // then
        assertFalse(result);
    }

    @Test
    public void diagonal_left_croix_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.CROIX;
        plateau.getPions()[1][1] = Pion.CROIX;
        plateau.getPions()[2][2] = Pion.CROIX;
        // when
        boolean result = plateau.troisEnDiagonale();
        // then
        assertTrue(result);
    }

    @Test
    public void diagonal_left_rond_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][0] = Pion.ROND;
        plateau.getPions()[1][1] = Pion.ROND;
        plateau.getPions()[2][2] = Pion.ROND;
        // when
        boolean result = plateau.troisEnDiagonale();
        // then
        assertTrue(result);
    }

    @Test
    public void diagonal_right_croix_return_true() {
        // given
        Plateau plateau = new Plateau(3);
        plateau.getPions()[0][2] = Pion.CROIX;
        plateau.getPions()[1][1] = Pion.CROIX;
        plateau.getPions()[2][0] = Pion.CROIX;
        // when
        boolean result = plateau.troisEnDiagonale();
        // then
        assertTrue(result);
    }
}
