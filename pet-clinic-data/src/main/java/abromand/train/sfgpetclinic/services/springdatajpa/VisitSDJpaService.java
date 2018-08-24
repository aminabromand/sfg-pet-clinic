package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.Visit;
import abromand.train.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile( "springdatajpa" )
public class VisitSDJpaService extends AbstractSDJpaService<Visit, Long> implements VisitService{
}
