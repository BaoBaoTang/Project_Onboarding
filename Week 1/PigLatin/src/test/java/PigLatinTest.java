import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zimi Li
 */
class PigLatinTest {

    PigLatin pig = new PigLatin();

    @org.junit.jupiter.api.Test
    void pigLatin() {
        assertEquals("Atscay areway reatgay etspay.", pig.pigLatin("Cats are great pets."));
        assertEquals("Omtay otgay away mallsay iecepay ofway iepay.", pig.pigLatin("Tom got a small piece of pie."));
        assertEquals("Ehay oldtay usway away eryvay excitingway aletay.", pig.pigLatin("He told us a very exciting tale."));
        assertEquals("Away ogday. Ohway", pig.pigLatin("A dog. Oh"));
        assertEquals("Atscay areway reatgay etspay. Ehay oldtay usway away eryvay excitingway aletay.", pig.pigLatin("Cats are great pets. He told us a very exciting tale."));
    }
}