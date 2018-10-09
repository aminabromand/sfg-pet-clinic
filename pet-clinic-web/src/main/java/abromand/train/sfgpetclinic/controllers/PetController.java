package abromand.train.sfgpetclinic.controllers;

import abromand.train.sfgpetclinic.model.Owner;
import abromand.train.sfgpetclinic.model.PetType;
import abromand.train.sfgpetclinic.services.OwnerService;
import abromand.train.sfgpetclinic.services.PetService;
import abromand.train.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/owners/(ownerId)")
public class PetController{

	private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";
	private final PetTypeService petTypeService;
	private final OwnerService ownerService;

	public PetController( PetTypeService petTypeService, OwnerService ownerService ){
		this.petTypeService = petTypeService;
		this.ownerService = ownerService;
	}

	@ModelAttribute("types")
	public Collection<PetType> populatePetTypes() {
		return petTypeService.findAll();
	}

	@ModelAttribute("owner")
	public Owner findOwner(@PathVariable("ownerId") Long ownerId) {
		return ownerService.findById(ownerId);
	}

	@InitBinder("owner")
	public void initOwnerBinder(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}

}