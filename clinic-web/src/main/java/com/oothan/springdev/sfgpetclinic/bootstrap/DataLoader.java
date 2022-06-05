package com.oothan.springdev.sfgpetclinic.bootstrap;

import com.oothan.springdev.sfgpetclinic.models.Owner;
import com.oothan.springdev.sfgpetclinic.models.Vet;
import com.oothan.springdev.sfgpetclinic.services.OwnerService;
import com.oothan.springdev.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Khine");
        owner1.setLastName("Khine");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Hla");
        owner2.setLastName("Hla");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jim");
        vet2.setLastName("Jackie");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
