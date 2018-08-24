package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Visit;
import abromand.train.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService{
	public Visit save(Visit visit) {
		if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
						|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException( "Invalid Visit" );
		}
		return super.save(visit);
	}
}
