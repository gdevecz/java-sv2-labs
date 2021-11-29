package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void addDogTest() {
        Vet vet = new Vet();

        vet.addDog(new Dog("Buksi",3,Species.BEAGLE));
        assertEquals("Buksi",vet.getDogs().get(0).getName());
        assertEquals(3,vet.getDogs().get(0).getAge());
        assertEquals(Species.BEAGLE,vet.getDogs().get(0).getSpecie());
        assertEquals(0,vet.getDogs().get(0).getCode());
        assertEquals(1,Vet.getCode());

    }
}